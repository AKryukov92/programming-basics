package root.tasks;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;

public abstract class StreamInputLayout extends LayoutMaker {
    protected abstract void logic(Iterator<String> source);

    protected void appendCheckValuesHeader(String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Исходные данные</th>");
        writer.println("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader() {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Исходные данные</th>");
        writer.println("<th>Результат</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String... a) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.print("<td>");
        writer.print(String.join("<br>",a));
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(Arrays.stream(a).iterator());
        System.setOut(oldOut);
        writer.println("</td>");
        writer.println("</tr>");
    }

}
