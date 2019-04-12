import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Александр on 14.02.2019.
 */
public class Manual {
    private String directory;
    private String langAbbreviation;
    private int taskId;

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

    public void make(String css) throws IOException {
        File result = new File(getResultFilename());
        System.out.println("Making manual file with name: " + result.getAbsolutePath());
        Path p = Paths.get(getSrcFilename());
        if (Files.exists(p)) {
            if (!result.getParentFile().exists() && result.getParentFile().mkdirs()) {
                PrintWriter writer = new PrintWriter(result);
                writer.write(makePageTop(css));
                System.out.println("Reading manual content from '" + p.toAbsolutePath().toString());
                writer.write(new String(Files.readAllBytes(p), StandardCharsets.UTF_8));
                writer.write("</body></html>");
                writer.close();
            }
        } else {
            System.out.println("Manual with name " + p.toAbsolutePath().toString() + " not found");
        }
    }
}
