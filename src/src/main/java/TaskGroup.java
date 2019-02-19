import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class TaskGroup {
    private final List<LabFragment> fragments;
    private final String name;

    public TaskGroup(String name, List<LabFragment> fragments) {
        this.fragments = fragments;
        this.name = name;
    }

    public int navLength() {
        int result = 0;
        for (LabFragment fragment : fragments) {
            if (fragment.makeNavItem("").isPresent()) {
                result++;
            }
        }
        return result;
    }

    public void appendContentTo(PrintWriter writer) throws IOException {
        for (LabFragment fragment : fragments) {
            fragment.appendContentTo(writer);
        }
    }

    public int addToNav(StringBuilder sb, int beginIndex) {
        int index = beginIndex;
        for (LabFragment fragment : fragments) {
            Optional<String> navItem = fragment.makeNavItem("№ " + index);
            if (navItem.isPresent()) {
                sb.append(navItem.get());
                index++;
            }
        }
        return index;
    }
}
