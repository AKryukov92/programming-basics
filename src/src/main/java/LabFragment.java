import java.io.PrintWriter;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public interface LabFragment {
    String loadText();
    void appendTextTo(PrintWriter writer);
    Optional<String> makeNavItem(String navTitle);
}
