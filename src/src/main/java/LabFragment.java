import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public interface LabFragment {
    void appendContentTo(PrintWriter writer) throws IOException;
    Optional<String> makeNavItem(String navTitle);
    void copyRequiredFilesTo(String targetDirectory) throws IOException;
}
