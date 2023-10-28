package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public abstract class TwoInputValLayout extends LayoutMaker {
    private int testCounter = 0;

    protected abstract void logic(String firstValue, String secondValue);

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='2'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
        writer.print("<tr>");
        writer.print("<th>");
        writer.print(firstVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(secondVal);
        writer.print("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String firstVal, String secondVal) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='2'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат</th>");
        writer.print("</tr>");
        writer.println("<tr>");
        writer.print("<th>");
        writer.print(firstVal);
        writer.print("</th>");
        writer.print("<th>");
        writer.print(secondVal);
        writer.print("</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String firstVal, String secondVal) {
        writer.println("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(firstVal);
        writer.print("</td>");
        writer.print("<td>");
        writer.print(secondVal);
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, secondVal);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowEscaped(String firstVal, String secondVal) {
        writer.println("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(escapeHtmlSymbols(firstVal));
        writer.print("</td>");
        writer.print("<td>");
        writer.print(escapeHtmlSymbols(secondVal));
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, secondVal);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowNoLogic(String firstVal, String secondVal, String result){
        writer.print("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(firstVal);
        writer.print("</td>");
        writer.print("<td>");
        writer.print(secondVal);
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        writer.print(result);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowWithFile(String firstVal, String filename) {
        writer.print("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(firstVal);
        writer.print("</td>");
        writer.print("<td>");
        writer.print(linkToFile(filename));
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, filename);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected String wrapLogic(String a, String b) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream tempStream = new PrintStream(baos, true, utf8);
            PrintStream oldOut = System.out;
            System.setOut(tempStream);
            logic(a, b);
            System.setOut(oldOut);
            tempStream.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
