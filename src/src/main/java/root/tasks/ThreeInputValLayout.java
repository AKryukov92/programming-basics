package root.tasks;

import java.io.PrintStream;

public abstract class ThreeInputValLayout extends LayoutMaker {
    protected abstract void logic(String firstValue, String secondValue, String thirdValue);

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String thirdVal, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='3'>Исходные данные</th>");
        writer.println("<th rowspan='2'>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>");
        writer.println(firstVal);
        writer.println("</th>");
        writer.println("<th>");
        writer.println(secondVal);
        writer.println("</th>");
        writer.println("<th>");
        writer.println(thirdVal);
        writer.println("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String thirdVal) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='3'>Исходные данные</th>");
        writer.println("<th rowspan='2'>Результат</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<th>");
        writer.println(firstVal);
        writer.println("</th>");
        writer.println("<th>");
        writer.println(secondVal);
        writer.println("</th>");
        writer.println("<th>");
        writer.println(thirdVal);
        writer.println("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String firstVal, String secondVal, String thirdVal) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.println("<td>");
        writer.println(firstVal);
        writer.println("</td>");
        writer.println("<td>");
        writer.println(secondVal);
        writer.println("</td>");
        writer.println("<td>");
        writer.println(thirdVal);
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, secondVal, thirdVal);
        System.setOut(oldOut);
        writer.println("</td>");
        writer.println("</tr>");
    }


}
