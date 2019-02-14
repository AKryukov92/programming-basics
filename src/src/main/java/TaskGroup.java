import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * Created by Александр on 11.02.2019.
 */
public class TaskGroup {
    private final LabFragment[] fragments;
    private final String name;

    public TaskGroup(String name, LabFragment... fragments) {
        this.fragments = fragments;
        this.name = name;
    }

    public int length() {
        return fragments.length;
    }

    public int navLength() {
        int result = 0;
        for (int i = 0; i < fragments.length; i++) {
            if (fragments[i].makeNavItem("").isPresent()) {
                result++;
            }
        }
        return result;
    }

    public void appendContentTo(PrintWriter writer) throws IOException {
        for (int i = 0; i < fragments.length; i++) {
            fragments[i].appendContentTo(writer);
        }
    }

    public int addToNav(StringBuilder sb, int beginIndex) {
        int index = beginIndex;
        for (int i = 0; i < fragments.length; i++) {
            Optional<String> navItem = fragments[i].makeNavItem("№ " + index);
            if (navItem.isPresent()) {
                sb.append(navItem.get());
                index++;
            }
        }
        return index;
    }
}
