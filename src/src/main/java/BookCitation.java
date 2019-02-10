import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class BookCitation implements LabFragment {
    private String id;

    public BookCitation(String id) {
        this.id = id;
    }

    @Override
    public String loadText() {
        return "";
    }

    @Override
    public Optional<String> makeNavItem(String navTitle) {
        return Optional.empty();
    }
}
