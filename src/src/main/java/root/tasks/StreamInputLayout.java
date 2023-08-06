package root.tasks;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;

public abstract class StreamInputLayout extends LayoutMaker {
    private int testCounter = 0;
    protected abstract void logic(Iterator<String> source);

    protected void appendCheckValuesHeader(String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные</th>");
        writer.print("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader() {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные</th>");
        writer.print("<th>Результат</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String... a) {
        writer.println("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(String.join("<br>",a));
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(Arrays.stream(a).iterator());
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

}
