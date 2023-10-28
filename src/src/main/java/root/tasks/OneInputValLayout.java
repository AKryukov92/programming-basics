package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public abstract class OneInputValLayout extends LayoutMaker {
    private int testCounter = 0;

    protected abstract void logic(String value);

    protected void appendCheckValuesHeader(String valName, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные (" + valName + ")</th>");
        writer.print("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String valName) {
        tableOpened = true;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th>Номер теста</th>");
        writer.print("<th>Исходные данные (" + valName + ")</th>");
        writer.print("<th>Результат</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String a) {
        writer.print("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(a);
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(a);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowWithFile(String filename) {
        writer.print("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(linkToFile(filename));
        writer.print("</td>");
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(filename);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected String wrapLogic(String a) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream tempStream = new PrintStream(baos, true, utf8);
            PrintStream oldOut = System.out;
            System.setOut(tempStream);
            logic(a);
            System.setOut(oldOut);
            tempStream.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    protected void appendCheckSingleWithFile(String filename) {
        writer.println(linkToFile(filename));
        writer.print("<div class='check_single preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(filename);
        System.setOut(oldOut);
        writer.println("</div>");
    }
}
