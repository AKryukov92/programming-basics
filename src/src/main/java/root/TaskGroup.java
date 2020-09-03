package root;

import root.tasks.LabFragment;

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
    private final String srcDirectory;

    public TaskGroup(String name, String srcDirectory, List<LabFragment> fragments) {
        this.fragments = fragments;
        this.srcDirectory = srcDirectory;
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

    public void appendContentTo(PrintWriter writer) {
        for (LabFragment fragment : fragments) {
            fragment.appendContentTo(writer);
        }
    }

    public void copyRequiredFiles(String targetDirectory) throws IOException {
        for (LabFragment fragment : fragments) {
            fragment.copyRequiredFilesTo(targetDirectory);
        }
    }

    public int addToNav(StringBuilder sb, int beginIndex) {
        int index = beginIndex;
        for (LabFragment fragment : fragments) {
            Optional<String> navItem = fragment.makeNavItem(String.valueOf(index));
            if (navItem.isPresent()) {
                sb.append(navItem.get());
                index++;
            }
        }
        return index;
    }
}
