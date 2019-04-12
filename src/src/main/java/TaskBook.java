import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Александр on 14.02.2019.
 */
public class TaskBook {
    private String theme;
    private int labIndex;
    private String sourceDirectory;
    private String langAbbreviation;
    private List<TaskGroup> groups = new ArrayList<>();
    private String themeNav;
    private List<Manual> manuals = new ArrayList<>();
    private Set<Integer> taskIds = new HashSet<>();

    private String lastGroupName = null;
    private List<LabFragment> fragmentsOfLastGroup = new ArrayList<>();

    public TaskBook withSourceDirectory(String directory) {
        this.sourceDirectory = directory;
        return this;
    }

    public TaskBook withTheme(String theme) {
        this.theme = theme;
        return this;
    }

    public TaskBook withIndex(int index) {
        this.labIndex = index;
        return this;
    }

    public TaskBook withLangAbbreviation(String langAbbreviation) {
        this.langAbbreviation = langAbbreviation;
        return this;
    }

    public TaskBook withGroup(String groupName) {
        if (lastGroupName == null) {
            lastGroupName = groupName;
        } else {
            finalizeLastGroup();
            lastGroupName = groupName;
        }
        return this;
    }

    public TaskBook addCitation(String citationId) {
        BookCitation citation = new BookCitation(getSourceDirectory(), citationId)
                .withLangAbbreviation(langAbbreviation);
        fragmentsOfLastGroup.add(citation);
        return this;
    }
    private void checkIfAlreadyPresent(int id){
        if (taskIds.contains(id)){
            throw new IllegalStateException("Task " + id + " already present in taskbook");
        }
        taskIds.add(id);
    }

    public TaskBook addTask(int id) {
        checkIfAlreadyPresent(id);
        LabTask task = new LabTask(id, getSourceDirectory(), false)
                .withLangAbbreviation(langAbbreviation);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    public TaskBook addExample(int id) {
        checkIfAlreadyPresent(id);
        LabTask task = new LabTask(id, getSourceDirectory(), true)
                .withLangAbbreviation(langAbbreviation);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    public TaskBook addExampleWithManual(int taskId) {
        LabTask task = new LabTask(taskId, getSourceDirectory(), true)
                .withLangAbbreviation(langAbbreviation)
                .withManual();
        fragmentsOfLastGroup.add(task);
        Manual man = Manual.builder()
                .withDirectory(getSourceDirectory())
                .forTask(taskId)
                .withLangAbbreviation(langAbbreviation);
        manuals.add(man);
        return this;
    }

    private void finalizeLastGroup() {
        groups.add(new TaskGroup(lastGroupName, sourceDirectory, fragmentsOfLastGroup));
        fragmentsOfLastGroup = new ArrayList<>();
    }

    public TaskBook withThemeNav(String nav) {
        this.themeNav = nav;
        return this;
    }

    public String getFilenameForLink() {
        return "Задания к " + labIndex + " практической работе.html";
    }

    public String getResultFilename() {
        return getTargetDirectory() + "//" + getFilenameForLink();
    }

    public String getTargetDirectory() { return "..//" + langAbbreviation; }

    public String getSourceDirectory() {
        return sourceDirectory;
    }

    private String makePageTop(String css) {
        return String.format("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='utf-8'/>" +
                "<title>%d %s</title>" +
                "<style>%s</style>" +
                "</head>" +
                "<body class='section'>", labIndex, theme, css);
    }

    public static TaskBook builder() {
        return new TaskBook();
    }

    public void delete(File f) throws IOException {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null) {
                for (File c : files) {
                    delete(c);
                }
            }
        }
        if (!f.delete()) {
            throw new FileNotFoundException("Failed to delete file" + f);
        }
    }

    public void prepareTargetDirectory() throws IOException {
        File targetDirectory = new File(getTargetDirectory());
        System.out.println("Checking target directory " + targetDirectory.getAbsolutePath());
        if (targetDirectory.exists()) {
            File[] listFiles = targetDirectory.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                System.out.println("Target directory exists and is not empty. Cleaning up");
                delete(targetDirectory);
            }
        }
        System.out.println("Creating fresh target directory");
        if (!targetDirectory.mkdirs()) {
            throw new RuntimeException("Failed to create target directory " + targetDirectory.getAbsolutePath());
        }
    }

    public void make(String css) throws IOException {
        finalizeLastGroup();
        File result = new File(getResultFilename());
        System.out.println("Making taskbook file with name: " + result.getAbsolutePath());
        PrintWriter writer = new PrintWriter(result);
        writer.write(makePageTop(css));
        writer.write(makeHeading());
        writer.write(themeNav);
        writer.write(makeTaskNav());
        for (TaskGroup group : groups) {
            group.appendContentTo(writer);
            group.copyRequiredFiles(Paths.get(getTargetDirectory()).toAbsolutePath().toString());
        }
        writer.write("</body></html>");
        writer.close();
        for (Manual man : manuals) {
            man.make(css);
        }
    }

    private String makeHeading() {
        return String.format("<a name='heading'><h1>%s</h1></a>", theme);
    }

    private String makeTaskNav() {
        int leftAmount = 1, rightAmount = 0;
        for (int endIndex = groups.size() - 1, beginIndex = 0; beginIndex <= endIndex; ) {
            if (leftAmount <= rightAmount) {
                leftAmount += groups.get(beginIndex).navLength();
                beginIndex++;
            } else {
                rightAmount += groups.get(endIndex).navLength();
                endIndex--;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<div class='nav'><ul>");
        sb.append("<li><a href='#heading'>^</a></li>");
        int index = 1;
        for (TaskGroup group : groups) {
            index = group.addToNav(sb, index);
            if (index == leftAmount) {
                sb.append("</ul><ul>");
            }
        }
        sb.append("</ul></div>");
        return sb.toString();
    }
}
