package root.tasks;

import java.io.PrintStream;

public abstract class OneInputValLayout extends LayoutMaker {
    protected abstract void logic(String value);

    protected void appendCheckValuesHeader(String valName, String resultName) {
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Исходные данные (" + valName + ")</th>");
        writer.println("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String valName) {
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Исходные данные (" + valName + ")</th>");
        writer.println("<th>Результат</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String a) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.print("<td>");
        writer.print(a);
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(a);
        System.setOut(oldOut);
        writer.println("</td>");
        writer.println("</tr>");
    }
}
