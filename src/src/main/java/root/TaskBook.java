package root;

import root.tasks.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Александр on 14.02.2019.
 */
public class TaskBook {
    private String theme;
    private int labIndex;
    private String sourceDirectory;
    private String langAbbreviation;
    private List<String> resources = new ArrayList<>();
    private List<TaskGroup> groups = new ArrayList<>();
    private String themeNav;
    private List<Manual> manuals = new ArrayList<>();

    private String lastGroupName = null;
    private List<LabFragment> fragmentsOfLastGroup = new ArrayList<>();
    private Map<Integer, LabTask> taskById = new HashMap<>();

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

    public int getLabIndex() {
        return this.labIndex;
    }

    public TaskBook withLangAbbreviation(String langAbbreviation) {
        this.langAbbreviation = langAbbreviation;
        return this;
    }

    public String getLangAbbreviation() {
        return this.langAbbreviation;
    }

    public boolean isJava() {
        return this.langAbbreviation.equals("java");
    }

    public boolean isCsharp() {
        return this.langAbbreviation.equals("cs");
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

    public boolean hasTask(int id) {
        return taskById.containsKey(id);
    }

    private void checkIfAlreadyPresent(int id) {
        if (taskById.containsKey(id)) {
            throw new IllegalStateException("Task " + id + " already present in taskbook");
        }
    }

    public TaskBook addTask(int id) {
        checkIfAlreadyPresent(id);
        LabTask task = new LabTask(id, getSourceDirectory(), false)
                .withLangAbbreviation(langAbbreviation);
        taskById.put(id, task);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    public TaskBook addTask(LayoutMaker layoutMaker) {
        CodedTask task = new CodedTask(layoutMaker, getSourceDirectory(), false);
        checkIfAlreadyPresent(task.getId());
        taskById.put(task.getId(), task);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    public TaskBook addExample(int id) {
        checkIfAlreadyPresent(id);
        LabTask task = new LabTask(id, getSourceDirectory(), true)
                .withLangAbbreviation(langAbbreviation);
        taskById.put(id, task);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    public TaskBook addExample(LayoutMaker layoutMaker) {
        CodedTask task = new CodedTask(layoutMaker, getSourceDirectory(), true);
        checkIfAlreadyPresent(task.getId());
        taskById.put(task.getId(), task);
        fragmentsOfLastGroup.add(task);
        return this;
    }

    private void finalizeLastGroup() {
        groups.add(new TaskGroup(lastGroupName, sourceDirectory, fragmentsOfLastGroup));
        fragmentsOfLastGroup = new ArrayList<>();
    }

    public void withThemeNav(String nav) {
        this.themeNav = nav;
    }

    public TaskBook addResource(String filename) {
        this.resources.add(filename);
        return this;
    }

    public String getFilenameForLink() {
        return "tasks " + labIndex + ".html";
    }

    public String getResultFilename() {
        return getTargetDirectory() + "//" + getFilenameForLink();
    }

    public String getTargetDirectory() {
        return "..//" + langAbbreviation;
    }

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
                "<meta name=\"author\" content=\"Подборка задач, выбор порядка подачи и подготовка тестовых данных - Крюков Александр, Омск 2013-2019\"/>" +
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
        Files.createDirectory(targetDirectory.toPath());
    }

    public void make(String css, String gitHash) throws IOException {
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
        writer.write("Версия ");
        writer.write(gitHash);
        writer.write(". Подборка задач, выбор порядка подачи и подготовка тестовых данных - Крюков Александр, Омск 2013-2023. <a href='https://github.com/AKryukov92/programming-basics'>Основной репозиторий</a>");
        writer.write("</body></html>");
        writer.close();
        System.out.println("Taskbook file with name " + result.getAbsolutePath() + " has been made.");
        for (Manual man : manuals) {
            man.make(css);
        }
        System.out.println("Copying files ");
        for (String filename : resources) {
            LabFragment.copyFileTo(filename, getSourceDirectory(), getTargetDirectory());
        }
    }

    private String makeHeading() {
        return String.format("<a name='heading'><h1>%s</h1></a>", theme);
    }

    private String makeTaskNav() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='nav'><ul>");
        sb.append("<li><a href='#heading'>^</a></li>");
        int sum = 0;
        for (TaskGroup group : groups) {
            sum += group.navLength();
        }
        if (sum > 15) {
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

            int index = 1;
            for (TaskGroup group : groups) {
                index = group.addToNav(sb, index);
                if (index == leftAmount) {
                    sb.append("</ul><ul>");
                }
            }
        } else {
            int index = 1;
            for (TaskGroup group : groups) {
                index = group.addToNav(sb, index);
            }
        }
        sb.append("</ul></div>");
        return sb.toString();
    }

    public void updateReferenceLinks(TaskBookFinder finder) {
        for (Map.Entry<Integer, LabTask> entry : taskById.entrySet()) {
            LabTask task = entry.getValue();
            task.updateReferenceLinks(finder);
        }
        for (Manual manual : manuals) {
            manual.updateReferenceLinks(finder);
        }
    }

    public boolean containsTaskWithId(int id) {
        return taskById.containsKey(id);
    }
}
