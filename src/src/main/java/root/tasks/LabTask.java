package root.tasks;

import root.TaskBook;
import root.TaskBookFinder;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Александр on 11.02.2019.
 */
public class LabTask extends LabFragment {
    private int id;
    private boolean isExample;
    private boolean hasManual = false;

    public LabTask(int id, String srcDirectory, boolean isExample) {
        super(srcDirectory);
        if (id < 1000 || 9999 < id) {
            throw new IllegalArgumentException("Идентификатор задачи должен состоять из 4 цифр");
        }
        this.id = id;
        this.isExample = isExample;
    }

    public int getId() {
        return id;
    }

    public LabTask withManual() {
        this.hasManual = true;
        return this;
    }

    public LabTask withLangAbbreviation(String langAbbreviation) {
        this.langAbbreviation = langAbbreviation;
        return this;
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        if (isExample) {
            return Optional.of(String.format("<li><a href='#task%d' class='example'>%s*</a>", id, navTitle));
        } else {
            return Optional.of(String.format("<li><a href='#task%d'>%s</a>", id, navTitle));
        }
    }

    @Override
    protected String getSrcFilename() {
        String langSpecificPath = String.format("%s/task%s%4d.html", srcDirectory, langAbbreviation, id);
        if (Files.exists(Paths.get(langSpecificPath))) {
            System.out.println("Task " + id + " has language-specific file");
            return langSpecificPath;
        } else {
            return String.format("%s/task%4d.html", srcDirectory, id);
        }
    }

    @Override
    public void updateReferenceLinks(TaskBookFinder finder) {
        String content = getContent();
        StringBuffer newContent = new StringBuffer();
        Pattern referencePattern = Pattern.compile("<a href=\"(.*?)#task(\\d{4})\" target=\"_blank\">(.*?)</a>");
        Matcher referenceMatcher = referencePattern.matcher(content);
        while (referenceMatcher.find()) {
            String labId = referenceMatcher.group(1);
            String referenceId = referenceMatcher.group(2);
            String referenceName = referenceMatcher.group(3);

            //TODO: correctly resolve link destination
            if (this instanceof CodedTask) {
                System.out.println("Coded task " + getId() + " has reference to " + referenceId + " " + referenceName);
            } else {
                System.out.println("Fragment " + getSrcFilename() + " has reference to " + referenceId + " " + referenceName);
            }

            Optional<TaskBook> value = finder.getFirstTaskbookFilenameWithTask(referenceId);
            if (value.isPresent()) {
                String linkTitle = "ЛР" + value.get().getLabIndex() + "#" + referenceId + "(открыть в новой вкладке)";
                referenceMatcher.appendReplacement(newContent, "<a href=\"" + value.get().getFilenameForLink() + "#task$2\" target=\"_blank\">" + linkTitle + "</a>");
            } else {
                System.out.println("Failed to find task " + referenceId + " in other taskbooks");
            }
        }
        referenceMatcher.appendTail(newContent);
        updateContent(newContent.toString());
    }

    @Override
    public void copyRequiredFilesTo(String targetDirectory) throws IOException {
        super.copyRequiredFilesTo(targetDirectory);
        String content = getContent();
        Matcher dataMatcher = Pattern.compile("<a href=\"files(.*?)\" target=\"_blank\">").matcher(content);
        List<String> requiredFiles = new ArrayList<>();
        while (dataMatcher.find()) {
            String dataName = dataMatcher.group(1);
            if (!dataName.contains(String.valueOf(id))) {
                throw new IllegalArgumentException("Task " + id + " links to data file of other task");
            }
            System.out.println("Task " + id + " links to data file '" + dataName + "'");
            requiredFiles.add(dataName);
        }
        System.out.println("Copy distinct files of task " + id + ".");
        List<String> distinctFiles = requiredFiles.stream().distinct().collect(Collectors.toList());
        for (String dataName : distinctFiles) {
            Path src = Paths.get("files\\" + dataName).toAbsolutePath();
            if (Files.exists(src)) {
                copyFileTo(dataName, "files", targetDirectory + "\\files");
            } else {
                System.out.println("File " + src.toAbsolutePath() + " not found. Consider it as no-file-test.");
            }
        }
    }

    @Override
    public void appendContentTo(PrintWriter writer) {
        writer.write(getContent());
        if (hasManual) {
            writer.write(String.format("<div>" +
                    "Руководство по самостоятельному выполнению задачи " +
                    "<a href='конспекты/pre%4d.html#initial' target='_blank'>(открыть в новом файле)</a>" +
                    "</div>", id));
        }
    }
}
