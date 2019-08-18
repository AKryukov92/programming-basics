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
public abstract class LabFragment {
    protected String srcDirectory;
    protected String langAbbreviation;
    private String content = null;

    LabFragment(String srcDirectory) {
        this.srcDirectory = srcDirectory;
    }

    public abstract void appendContentTo(PrintWriter writer) throws IOException;

    public abstract Optional<String> makeNavItem(String navTitle);

    public void copyRequiredFilesTo(String targetDirectory) throws IOException {
        String content = getContent();
        Pattern p = Pattern.compile("<img src=\"(.*?)\"");
        Matcher imageMatcher = p.matcher(content);
        while (imageMatcher.find()) {
            String imageName = imageMatcher.group(1);
            System.out.println(getSrcFilename() + " links to image " + imageName);
            copyFileTo(imageName, srcDirectory, targetDirectory);
        }
    }

    protected abstract String getSrcFilename();

    public static void copyFileTo(String filename, String sourceDirectory, String targetDirectory) throws IOException {
        Path from = Paths.get(sourceDirectory + "\\" + filename).toAbsolutePath();
        Path to = Paths.get(targetDirectory + "\\" + filename).toAbsolutePath();
        System.out.println("Copy " + from.toString() + " to " + to.toString());
        if (!Files.exists(to.getParent())) {
            System.out.println("Missing directory in target path. Creating.");
            if (!to.getParent().toFile().mkdirs()) {
                throw new RuntimeException("Failed to make parent directory");
            }
        }
        Files.copy(from, to);
    }

    protected String getContent() throws IOException {
        if (content == null) {
            Path p = Paths.get(getSrcFilename());
            System.out.println("Reading content from '" + p.toAbsolutePath().toString());
            content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
        }
        return content;
    }

    protected void updateContent(String newContent) {
        this.content = newContent;
    }
}
