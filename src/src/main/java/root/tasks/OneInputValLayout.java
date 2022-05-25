package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public abstract class OneInputValLayout extends LayoutMaker {
    protected abstract void logic(String value);

    protected void appendCheckValuesHeader(String valName, String resultName) {
        tableOpened = true;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер теста</th>");
        writer.println("<th>Исходные данные (" + valName + ")</th>");
        writer.println("<th>Результат (" + resultName + ")</th>");
        writer.println("</tr>");
    }

    protected void appendCheckValuesHeader(String valName) {
        tableOpened = true;
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

    protected String linkToFile(String filename, String description) {
        return "<a href=\"" + filename + "\" target=\"_blank\">открыть " + description + " в новой вкладке</a>";
    }

    protected void appendCheckSingleWithFile(String filename) {
        writer.println(linkToFile(filename, ""));
        writer.print("<div class='check_single preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(filename);
        System.setOut(oldOut);
        writer.println("</div>");
    }
}
