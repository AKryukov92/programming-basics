import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Александр on 14.02.2019.
 */
public class TaskBook {
    private String theme;
    private int labIndex;
    private TaskGroup[] groups;
    private String themeNav;

    public TaskBook withTheme(String theme) {
        this.theme = theme;
        return this;
    }
    public TaskBook withIndex(int index) {
        this.labIndex = index;
        return this;
    }

    public TaskBook withGroups(TaskGroup... groups) {
        this.groups = groups;
        return this;
    }

    public TaskBook withThemeNav(String nav) {
        this.themeNav = nav;
        return this;
    }

    public String getFilename(){
        return "Задания к " + labIndex + " практической работе.html";
    }

    private String makePageTop(String css) {
        return String.format("<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset='utf-8'/>" +
                "<title>%d %s</title>" +
                "<style>%s</style>" +
                "</head>" +
                "<body class='section'>",labIndex, theme, css);
    }

    public static TaskBook builder(){
        return new TaskBook();
    }

    public void make(String css) throws IOException {
        File result = new File(getFilename());
        PrintWriter writer = new PrintWriter(result);
        writer.write(makePageTop(css));
        writer.write(makeHeading());
        writer.write(themeNav);
        writer.write(makeTaskNav());
        for (int i = 0; i < groups.length; i++) {
            groups[i].appendContentTo(writer);
        }
        writer.write("</body></html>");
        writer.close();
    }

    private String makeHeading() {
        return String.format("<a name='heading'><h1>%s</h1></a>", theme);
    }

    private String makeTaskNav() {
        int leftAmount = 1, rightAmount = 0;
        for (int l = groups.length - 1, i = 0; i <= l; ) {
            if (leftAmount <= rightAmount) {
                leftAmount += groups[i].navLength();
                i++;
            } else {
                rightAmount += groups[l].navLength();
                l--;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<div class='nav'><ul>");
        sb.append("<li><a href='#heading'>^</a></li>");
        int index = 1;
        for (int i = 0; i < groups.length; i++) {
            index = groups[i].addToNav(sb, index);
            if (index == leftAmount) {
                sb.append("</ul><ul>");
            }
        }
        sb.append("</ul></div>");
        return sb.toString();
    }
}
