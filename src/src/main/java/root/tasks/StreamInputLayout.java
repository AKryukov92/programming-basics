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
        List<ListPrintStream.Either> elements = lstPrinter.outputs();
        testCounter++;
        int i = 0;
        while (i < elements.size()) {
            ListPrintStream.Either either = elements.get(i);
            if (i > 0) {
                writer.print("<tr><td>");
            } else {
                writer.print("<tr class='test_row'><td rowspan='" + elements.size() + "'>" + testCounter + "</td><td>");
            }
            if (either.isLeft()) {
                writer.print(either);
                writer.println("</td><td>");
            } else {
                writer.print("</td><td class='preformatted'>");
                writer.print(either);
            }
            writer.println("</td></tr>");
            i++;
        }
    }

}
