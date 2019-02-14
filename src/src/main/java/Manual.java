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
    private LabTask task;

    public LabTask getTask(){
        return task;
    }

    public Manual forTask(LabTask task){
        this.task = task;
        task.hasManual();
        return this;
    }

    public Manual withLangAbbreviation(String abbreviation){
        this.langAbbreviation = abbreviation;
        return this;
    }

    public Manual withDirectory(String directory){
        this.directory = directory;
        return this;
    }

    public static Manual builder(){
        return new Manual();
    }

    public String getFilename(){
        return "../конспекты/pre" + task.getId() + ".html";
    }

    String makePageTop(String css) {
        return String.format("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='utf-8'/>" +
                "<title>Рук-во к %s</title>" +
                "<style>%s</style>" +
                "</head>" +
                "<body class='section'>", task.getId(), css);
    }

    public void make(String css) throws IOException {
        File result = new File(getFilename());
        PrintWriter writer = new PrintWriter(result);
        writer.write(makePageTop(css));

        String path = String.format("%s/pre%4d%s.html", directory, task.getId(), langAbbreviation);
        Path p = Paths.get(path);
        System.out.println("Reading manual content from '" + p.toAbsolutePath().toString());
        writer.write(new String(Files.readAllBytes(p), StandardCharsets.UTF_8));
        writer.write("</body></html>");
        writer.close();
    }
}
