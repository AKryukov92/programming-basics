package root.tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;

public abstract class LayoutMaker {
    private static final String utf8 = StandardCharsets.UTF_8.name();
    PrintStream writer = System.out;

    public int getId() {
        String className = this.getClass().getName();
        return Integer.parseInt(className.substring(className.length() - 4));
    }

    public String getContent() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            this.writer = new PrintStream(baos, true, utf8);
            makeLayout();
            this.writer.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void makeLayout();

    protected void appendHeader() {
        writer.println("<div id='task" + getId() + "' class='task_block'>");
        writer.println("<div class='task_id'>" + getId() + "</div>");
        writer.println("<h3>Задача</h3>");
    }

    protected void appendTaskDesc(String taskDescription) {
        writer.println("<div class='task_desc'>");
        writer.println(taskDescription);
        writer.println("</div>");
    }

    protected void appendCheckSingle(String text) {
        writer.print("<div class='check_single preformatted'>");
        writer.println(text);
        writer.println("</div>");
    }

    protected void appendCheckValuesFooter() {
        writer.println("</table>");
    }

    protected void appendFooter() {
        writer.println("</div>");
    }
}
