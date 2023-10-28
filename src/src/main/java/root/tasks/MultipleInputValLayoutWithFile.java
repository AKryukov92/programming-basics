package root.tasks;

import java.io.PrintStream;

public abstract class MultipleInputValLayoutWithFile extends LayoutMaker {
    private int testCounter = 0;
    private int headerCount;
    protected abstract void logic(String filename, String... args);
    protected void appendCheckValuesHeader(String fileHeader, String... headers) {
        tableOpened = true;
        headerCount = headers.length;
        writer.println("<table class='check_values_v2'>");
        writer.print("<tr>");
        writer.print("<th rowspan='2'>Номер теста</th>");
        writer.print("<th colspan='" + headers.length + "'>Исходные данные</th>");
        writer.print("<th rowspan='2'>Результат</th>");
        writer.println("</tr>");
        writer.print("<tr>");
        writer.print("<th>");
        writer.print(fileHeader);
        writer.print("</th>");
        for (String header : headers) {
            writer.print("<th>");
            writer.print(header);
            writer.print("</th>");
        }
        writer.println("</tr>");
    }

    protected void appendCheckValuesRowWithFile(String filename, String... values) {
        if (values.length != headerCount) {
            throw new RuntimeException("Количество аргументов не совпадает с количеством ");
        }
        writer.println("<tr>");
        testCounter++;
        writer.print("<td>" + testCounter + "</td>");
        writer.print("<td>");
        writer.print(linkToFile(filename));
        writer.print("</td>");
        for (String value : values) {
            writer.print("<td>");
            writer.print(value);
            writer.print("</td>");
        }
        writer.print("<td class='preformatted'>");
        PrintStream oldOut = System.out;
        System.setOut(writer);
        logic(filename, values);
        System.setOut(oldOut);
        writer.print("</td>");
        writer.println("</tr>");
    }
}
