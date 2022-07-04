package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public abstract class TwoInputValLayout extends LayoutMaker {
    protected abstract void logic(String firstValue, String secondValue);

    protected void appendCheckValuesHeader(String firstVal, String secondVal, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='2'>Исходные данные</th>");
        writer.println("<th rowspan='2'>Результат (" + resultName + ")</th>");
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

    protected void appendCheckValuesHeader(String firstVal, String secondVal) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='2'>Исходные данные</th>");
        writer.println("<th rowspan='2'>Результат</th>");
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
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, secondVal);
        System.setOut(oldOut);
        writer.println("</td>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowWithFile(String firstVal, String filename) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.println("<td>");
        writer.println(firstVal);
        writer.println("</td>");
        writer.println("<td>");
        writer.println("<a href=\"" + filename + "\" target=\"_blank\">открыть в новой вкладке</a>");
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(firstVal, filename);
        System.setOut(oldOut);
        writer.println("</td>");
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
