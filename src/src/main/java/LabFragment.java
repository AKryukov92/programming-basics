import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public interface LabFragment {
    String loadText();
    Optional<String> makeNavItem(String navTitle);
}
