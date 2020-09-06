package root.tasks;

import java.io.PrintStream;

public abstract class TwoInputValLayout extends LayoutMaker {
    protected abstract void logic(String firstValue, String secondValue, PrintStream out);

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String resultName) {
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='2'>Вводимые данные</th>");
        if (resultName.isEmpty()) {
            writer.println("<th rowspan='2'>Результат</th>");
        } else {
            writer.println("<th rowspan='2'>Результат (" + resultName + ")</th>");
        }
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>");
        writer.println(firstVal);
        writer.println("</th>");
        writer.println("<th>");
        writer.println(secondVal);
        writer.println("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String firstVal, String secondVal) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.println("<td>");
        writer.println(firstVal);
        writer.println("</td>");
        writer.println("<td>");
        writer.println(secondVal);
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        logic(firstVal, secondVal, writer);
        writer.println("</td>");
        writer.println("</tr>");
    }
}
