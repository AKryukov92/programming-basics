package root.tasks;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public abstract class MultipleInputValLayout extends LayoutMaker {
    private int testCounter = 0;
    private int headerCount;
    protected abstract void logic(String... args) throws SQLException;

    protected void rethrowAsRuntime(String... args) {
        try {
            logic(args);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    protected void appendCheckValuesHeader(String... headers) {
        tableOpened = true;
        headerCount = headers.length;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='" + headers.length + "'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат</th>");
        writer.println("</tr>");
        writer.print("<tr>");
        for (String header : headers) {
            writer.print("<th>");
            writer.print(header);
            writer.print("</th>");
        }
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String... values) {
        if (values.length != headerCount) {
            throw new RuntimeException("Количество аргументов не совпадает с количеством полученных данных");
        }
        writer.print("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        for(String value: values) {
            writer.print("<td>");
            writer.print(value);
            writer.print("</td>");
        }
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        rethrowAsRuntime(values);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }

    protected String wrapLogic(String... values) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream tempStream = new PrintStream(baos, true, utf8);
            PrintStream oldOut = System.out;
            System.setOut(tempStream);
            rethrowAsRuntime(values);
            System.setOut(oldOut);
            tempStream.close();
            return baos.toString(utf8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
