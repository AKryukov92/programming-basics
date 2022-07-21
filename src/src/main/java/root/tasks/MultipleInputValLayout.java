package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public abstract class MultipleInputValLayout extends LayoutMaker {
    private int headerCount;
    protected abstract void logic(String... args);
    protected void appendCheckValuesHeader(String... headers) {
        tableOpened = true;
        headerCount = headers.length;
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th rowspan='2'>Номер теста</th>");
        writer.println("<th colspan='" + headers.length + "'>Исходные данные</th>");
        writer.println("<th rowspan='2'>Результат</th>");
        writer.println("</tr>");
        writer.println("<tr>");
        for (String header : headers) {
            writer.println("<th>");
            writer.println(header);
            writer.println("</th>");
        }
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String... values) {
        if (values.length != headerCount) {
            throw new RuntimeException("Количество аргументов не совпадает с количеством ");
        }
        writer.println("<tr>");
        writer.println("<td></td>");
        for(String value: values) {
            writer.println("<td>");
            writer.println(value);
            writer.println("</td>");
        }
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(values);
        System.setOut(oldOut);
        writer.println("</td>");
        writer.println("</tr>");
    }

    protected String wrapLogic(String... values) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream tempStream = new PrintStream(baos, true, utf8);
            PrintStream oldOut = System.out;
            System.setOut(tempStream);
            logic(values);
            System.setOut(oldOut);
            tempStream.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
