import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class BookCitation implements LabFragment {
    private String id;
    private String directory;

    public BookCitation(String directory, String id) {
        this.id = id;
        this.directory = directory;
    }

    @Override
    public void appendContentTo(PrintWriter writer) throws IOException {
        String path = String.format("%s/link_%s.html", directory, id);
        Path p = Paths.get(path);
        System.out.println("Reading citation content from '" + p.toAbsolutePath().toString());
        writer.write(new String(Files.readAllBytes(p), StandardCharsets.UTF_8));
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        return Optional.empty();
    }

    @Override
    public void copyRequiredFilesTo(String targetDirectory) throws IOException {

    }

}
