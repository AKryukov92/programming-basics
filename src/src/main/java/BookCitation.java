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
 * Created by Александр on 11.02.2019.
 */
public class BookCitation extends LabFragment {
    private String id;

    BookCitation(String srcDirectory, String id) {
        super(srcDirectory);
        this.id = id;
        this.srcDirectory = srcDirectory;
    }

    @Override
    public void appendContentTo(PrintWriter writer) throws IOException {
        writer.write(getContent());
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        return Optional.empty();
    }

    @Override
    protected String getSrcFilename() {
        String langSpecificPath = String.format("%s/%s.html", srcDirectory, id);
        if (Files.exists(Paths.get(langSpecificPath))) {
            return langSpecificPath;
        } else {
            return String.format("%s/%s.html", srcDirectory, id);
        }
    }
}
