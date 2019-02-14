import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class LabTask implements LabFragment {
    private int id;
    private String directory;
    private boolean isExample;
    private boolean hasManual = false;

    LabTask(int id, String directory, boolean isExample) {
        if (id < 1000 || 9999 < id) {
            throw new IllegalArgumentException("Идентификатор задачи должен состоять из 4 цифр");
        }
        this.id = id;
        this.directory = directory;
        this.isExample = isExample;
    }

    public int getId() {
        return id;
    }

    public boolean hasManual() {
        return hasManual;
    }

    public LabTask withManual() {
        this.hasManual = true;
        return this;
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        if (isExample) {
            return Optional.of(String.format("<li><a href='#task%d' class='example'>%s</a>", id, navTitle));
        } else {
            return Optional.of(String.format("<li><a href='#task%d'>%s</a>", id, navTitle));
        }
    }

    @Override
    public void appendContentTo(PrintWriter writer) throws IOException {
        //TODO: учесть возможность наличия специальных задач для определенных языков
        String path = String.format("%s/task%4d.html", directory, id);
        Path p = Paths.get(path);
        System.out.println("Reading task content from '" + p.toAbsolutePath().toString());
        writer.write(new String(Files.readAllBytes(p), StandardCharsets.UTF_8));
        if (hasManual) {
            writer.write(String.format("<div>" +
                    "Руководство по самостоятельному выполнению задачи " +
                    "<a href='конспекты/pre%4d.html' target='_blank'>(открыть в новом файле)</a>" +
                    "</div>", id));
        }
    }

    public static LabTask makeExample(String directory, int id) {
        return new LabTask(id, directory, true);
    }

    public static LabTask make(String directory, int id) {
        return new LabTask(id, directory, false);
    }
}
