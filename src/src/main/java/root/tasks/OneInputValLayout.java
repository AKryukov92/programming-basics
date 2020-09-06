package root.tasks;

import java.io.PrintStream;

public abstract class OneInputValLayout extends LayoutMaker {
    protected abstract void logic(String value, PrintStream out);

    protected void appendCheckValuesHeader(String valName, String resultName) {
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Вводимые данные (" + valName + ")</th>");
        if (resultName.isEmpty()) {
            writer.println("<th>Результат</th>");
        } else {
            writer.println("<th>Результат (" + resultName + ")</th>");
        }
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String a) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.print("<td>");
        writer.print(a);
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        logic(a, writer);
        writer.println("</td>");
        writer.println("</tr>");
    }
}
