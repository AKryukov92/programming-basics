package root.tasks;

import root.ListPrintStream;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public abstract class StreamInputLayout extends LayoutMaker {
    private int testCounter = 0;

    protected abstract void logic(Readable stream);

    protected void appendCheckValuesHeader(String resultName) {
        tableOpened = true;
        writer.println("<table class='stream_values'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные</th>");
        writer.print("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader() {
        tableOpened = true;
        writer.println("<table class='stream_values'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные</th>");
        writer.print("<th>Результат</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String... a) {
        ListPrintStream lstPrinter = new ListPrintStream(writer, Arrays.stream(a).iterator());
        PrintStream oldOut = System.out;
        System.setOut(lstPrinter);
        logic(lstPrinter);
        System.setOut(oldOut);
        List<String> elements = lstPrinter.outputs();
        writer.print("<tr class='test_row'>");
        testCounter++;
        writer.print("<td rowspan='" + (a.length + elements.size()) + "'>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(a[0]);
        writer.println("</td><td></td></tr>");
        if (!elements.isEmpty()) {
            writer.print("<tr><td></td><td class='preformatted'>");
            writer.print(elements.get(0));
            writer.println("</td></tr>");
        }
        int i = 1;
        while (i < elements.size() && i < a.length) {
            writer.print("<tr><td>");
            writer.print(a[i]);
            writer.println("</td><td></td></tr>");
            writer.print("<tr><td></td><td class='preformatted'>");
            writer.print(elements.get(i));
            writer.println("</td></tr>");
            i++;
        }
        while (i < elements.size()) {
            writer.print("<tr><td></td><td class='preformatted'>");
            writer.print(elements.get(i));
            writer.println("</td></tr>");
            i++;
        }
        while(i < a.length) {
            writer.print("<tr><td></td><td></td></tr>");
            i++;
        }
    }

}
