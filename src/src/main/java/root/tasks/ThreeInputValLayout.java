package root.tasks;

import java.io.PrintStream;

public abstract class ThreeInputValLayout extends LayoutMaker {
    private int testCounter = 0;
    protected abstract void logic(String firstValue, String secondValue, String thirdValue);

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String thirdVal, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='3'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
        writer.print("<tr>");
        writer.print("<th>");
        writer.print(firstVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(secondVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(thirdVal);
        writer.print("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String thirdVal) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='3'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат</th>");
        writer.println("</tr>");
        writer.print("<tr>");
        writer.print("<th>");
        writer.print(firstVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(secondVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(thirdVal);
        writer.print("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String firstVal, String secondVal, String thirdVal) {
        writer.println("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(firstVal);
        writer.print("</td>");
        writer.print("<td>");
        writer.print(secondVal);
        writer.print("</td>");
        writer.print("<td>");
        writer.print(thirdVal);
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, secondVal, thirdVal);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }


}
