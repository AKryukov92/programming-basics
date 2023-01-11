package root.tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;

public abstract class LayoutMaker {
    protected static final String utf8 = StandardCharsets.UTF_8.name();
    protected boolean headerOpened = false;
    protected boolean tableOpened = false;
    PrintStream writer = System.out;
    private int nextOrderedIndex = 1;

    public int getId() {
        String className = this.getClass().getName();
        return Integer.parseInt(className.substring(className.length() - 4));
    }

    public String getContent() {
        if (tableOpened) {
            throw new RuntimeException("Заголовок таблицы не закрыт. Вызовите метод appendCheckValuesFooter. Задача " + this.getClass().getName());
        }
        if (headerOpened) {
            throw new RuntimeException("Тэг задания не закрыт. Вызовите метод appendFooter. Задача " + this.getClass().getName());
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            this.writer = new PrintStream(baos, true, utf8);
            makeLayout();
            if (tableOpened && !headerOpened) {
                throw new RuntimeException("Заголовок таблицы не закрыт. Вызовите метод appendCheckValuesFooter. Задача " + this.getClass().getName());
            }
            if (tableOpened) {
                appendCheckValuesFooter();
            }
            if (headerOpened) {
                appendFooter();
            }
            this.writer.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void makeLayout();

    protected void appendHeader() {
        appendTaskId();
        appendTaskHeader();
    }

    protected void appendTaskId() {
        headerOpened = true;
        writer.println("<div id='task" + getId() + "' class='task_block'>");
    }

    protected void appendTaskHeader() {
        writer.println("<div class='task_id'>" + getId() + "</div>");
        writer.println("<h3>Задача</h3>");
    }

    protected void appendSubheading(String headerText) {
        writer.print("<h4>");
        writer.print(headerText);
        writer.println("</h4>");
    }

    protected void appendOrdered(String... elements) {
        writer.print("<ol start='" + nextOrderedIndex + "'>");
        for (String element : elements) {
            writer.print("<li>");
            writer.print(element);
            writer.print("</li>");
            nextOrderedIndex++;
        }
        writer.print("</ol>");
    }

    protected void resetOrdered() {
        nextOrderedIndex = 1;
    }

    protected void appendTaskDesc(String taskDescription) {
        String escaped = taskDescription
                .replace("<", "&lt;")
                .replace(">", "&gt;");
        appendTaskDescWithHtml(escaped);
    }

    protected void appendTaskDescWithHtml(String taskDescription) {
        writer.println("<div class='task_desc'>");
        writer.println(taskDescription);
        writer.println("</div>");
    }

    protected void appendNonEscaped(String taskDescription) {
        writer.println("<div class='task_desc'>");
        writer.println(taskDescription);
        writer.println("</div>");
    }

    protected void appendCheckSingleFormatted(String text) {
        writer.print("<div class='check_single'>");
        writer.print(text);
        writer.println("</div>");
    }

    protected void appendCheckSingle(String text) {
        writer.print("<div class='check_single preformatted'>");
        writer.print(text);
        writer.println("</div>");
    }

    protected void appendCheckValuesFooter() {
        tableOpened = false;
        writer.println("</table>");
    }

    protected void appendFooter() {
        headerOpened = false;
        writer.println("</div>");
    }

    protected static String linkToTask(int id) {
        return "<a href=\"#task" + id + "\" target=\"_blank\">ЛР#" + id + "(открыть в новой вкладке)</a>";
    }

    @Override
    public String toString() {
        return getContent();
    }
}
