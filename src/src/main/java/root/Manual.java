package root;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Александр on 14.02.2019.
 */
public class Manual {
    private String directory;
    private String langAbbreviation;
    private int taskId;
    private String content = null;

    public Manual forTask(int taskId) {
        this.taskId = taskId;
        return this;
    }

    public Manual withLangAbbreviation(String abbreviation) {
        this.langAbbreviation = abbreviation;
        return this;
    }

    public Manual withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    public static Manual builder() {
        return new Manual();
    }

    private String getResultFilename() {
        return String.format("../%s/конспекты/pre%02d.html", langAbbreviation, taskId);
    }

    private String getSrcFilename() {
        String langSpecificPath = String.format("%s/pre%4d%s.html", directory, taskId, langAbbreviation);
        if (Files.exists(Paths.get(langSpecificPath))) {
            return langSpecificPath;
        } else {
            return String.format("%s/pre%4d.html", directory, taskId);
        }
    }

    private String makePageTop(String css) {
        return String.format("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='utf-8'/>" +
                "<title>Рук-во к %s</title>" +
                "<style>%s</style>" +
                "</head>" +
                "<body class='section'>", taskId, css);
    }

    protected String getContent() {
        if (content == null) {
            Path p = Paths.get(getSrcFilename());
            System.out.println("Reading content from '" + p.toAbsolutePath().toString());
            try {
                content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                System.out.println("Failed to read content from '" + p.toAbsolutePath().toString() + "'");
                throw new RuntimeException(ex);
            }
        }
        return content;
    }

    protected void updateContent(String newContent) {
        this.content = newContent;
    }

    protected void updateReferenceLinks(TaskBookFinder finder) {
        String content = getContent();
        StringBuffer newContent = new StringBuffer();
        Pattern referencePattern = Pattern.compile("<a href=\"(.*?)#task(\\d{4})\" target=\"_blank\">(.*?)</a>");
        Matcher referenceMatcher = referencePattern.matcher(content);
        while (referenceMatcher.find()) {
            String labId = referenceMatcher.group(1);
            String referenceId = referenceMatcher.group(2);
            String referenceName = referenceMatcher.group(3);

            System.out.println("Fragment " + getSrcFilename() + " has reference to " + referenceId + " " + referenceName);
            Optional<TaskBook> value = finder.getFirstTaskbookFilenameWithTask(referenceId);
            if (value.isPresent()) {
                String linkTitle = "ЛР" + value.get().getLabIndex() + "#" + referenceId + "(открыть в новой вкладке)";
                referenceMatcher.appendReplacement(newContent, "<a href=\"..\\\\" + value.get().getFilenameForLink() + "#task$2\" target=\"_blank\">" + linkTitle + "</a>");
            } else {
                System.out.println("Failed to find task " + referenceId + " in other taskbooks");
            }
        }
        referenceMatcher.appendTail(newContent);
        updateContent(newContent.toString());
    }

    public void make(String css) throws IOException {
        File result = new File(getResultFilename());
        System.out.println("Making manual file with name: " + result.getAbsolutePath());
        Path p = Paths.get(getSrcFilename());
        if (Files.exists(p)) {
            if (!result.getParentFile().exists()) {
                if (!result.getParentFile().mkdirs()) {
                    throw new IllegalStateException("Failed to create parent directory for manual " + this.taskId);
                }
            }
            PrintWriter writer = new PrintWriter(result);
            writer.write(makePageTop(css));
            writer.write(getContent());
            writer.write("</body></html>");
            writer.close();
        } else {
            System.out.println("root.Manual with name " + p.toAbsolutePath().toString() + " not found");
        }
    }
}
