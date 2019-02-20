import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Александр on 11.02.2019.
 */
public class LabTask implements LabFragment {
    private int id;
    private String srcDirectory;
    private boolean isExample;
    private String langAbbreviation;
    private boolean hasManual = false;
    private String taskContent = null;

    LabTask(int id, String srcDirectory, boolean isExample) {
        if (id < 1000 || 9999 < id) {
            throw new IllegalArgumentException("Идентификатор задачи должен состоять из 4 цифр");
        }
        this.id = id;
        this.srcDirectory = srcDirectory;
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

    private String getSrcFilename() {
        String langSpecificPath = String.format("%s/task%4d%s.html", srcDirectory, id, langAbbreviation);
        if (Files.exists(Paths.get(langSpecificPath))) {
            return langSpecificPath;
        } else {
            return String.format("%s/task%4d.html", srcDirectory, id);
        }
    }

    private String getTaskContent() throws IOException {
        if (taskContent == null) {
            Path p = Paths.get(getSrcFilename());
            System.out.println("Reading task content from '" + p.toAbsolutePath().toString());
            taskContent = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
        }
        return taskContent;
    }

    public List<String> getRequiredImages() throws IOException {
        String content = getTaskContent();
        Pattern pattern = Pattern.compile("<img src=\"(.*)\"/>");
        Matcher matcher = pattern.matcher(content);
        List<String> imageLinks = new ArrayList<>();
        while (matcher.find()) {
            String imageName = matcher.group(1);
            System.out.println("Task " + id + " links to image " + imageName);
            imageLinks.add(imageName);
        }
        return imageLinks;
    }

    private void copyImageTo(String filename, String targetDirectory) throws IOException {
        Path from = Paths.get(srcDirectory + "\\" + filename).toAbsolutePath();
        Path to = Paths.get(targetDirectory + "\\" + filename).toAbsolutePath();
        System.out.println("Copy " + from.toString() + " to " + to.toString());
        if (!Files.exists(to.getParent())) {
            System.out.println("Missing directory in target path. Creating.");
            if (!to.getParent().toFile().mkdirs()){
                throw new RuntimeException("Failed to make parent directory");
            }
        }
        Files.copy(from, to);
    }

    @Override
    public void copyRequiredFilesTo(String targetDirectory) throws IOException {
        String content = getTaskContent();
        Pattern pattern = Pattern.compile("<img src=\"(.*)\"/>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String imageName = matcher.group(1);
            System.out.println("Task " + id + " links to image " + imageName);
            copyImageTo(imageName, targetDirectory);
        }
    }

    @Override
    public void appendContentTo(PrintWriter writer) throws IOException {
        writer.write(getTaskContent());
        if (hasManual) {
            writer.write(String.format("<div>" +
                    "Руководство по самостоятельному выполнению задачи " +
                    "<a href='конспекты/pre%4d.html' target='_blank'>(открыть в новом файле)</a>" +
                    "</div>", id));
        }
    }
}
