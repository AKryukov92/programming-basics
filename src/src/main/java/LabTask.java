import java.io.PrintWriter;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class LabTask implements LabFragment {
    private int id;
    private boolean isExample;

    public LabTask(int id, boolean isExample) {
        this.id = id;
        this.isExample = isExample;
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
    public String loadText() {
        return "";
    }

    @Override
    public void appendTextTo(PrintWriter writer) {
        writer.write("<div>" + id + "</div>");
    }

    public static LabTask makeExample(int id) {
        return new LabTask(id, true);
    }

    public static LabTask make(int id) {
        return new LabTask(id, false);
    }
}
