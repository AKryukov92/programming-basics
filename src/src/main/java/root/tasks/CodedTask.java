package root.tasks;

import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class CodedTask extends LabTask {
    private StringWriter out = new StringWriter();
    private PrintWriter writer = new PrintWriter(out);

    public CodedTask(int id, String srcDirectory, boolean isExample) {
        super(id, srcDirectory, isExample);
    }

    protected void appendHeader() {
        writer.println("<div id='task" + getId() + "' class='task_block'>");
        writer.println("<div class='task_id'>" + getId() + "</div>");
        writer.println("<h3>Задача</h3>");
    }

    protected void appendTaskDesc(String taskDescription) {
        writer.println("<div class='task_desc'>");
        writer.println(taskDescription);
        writer.println("</div>");
    }

    protected void appendCheckSingle(String text) {
        writer.print("<div class='check_single preformatted'>");
        writer.println(text);
        writer.println("</div>");
    }

    protected void appendCheckValuesHeader(String valName, String resultName) {
        writer.println("<table class='check_values'>");
        writer.println("<tr>");
        writer.println("<th>Номер тесте</th>");
        writer.println("<th>Вводимые данные (" + valName + ")</th>");
        if (resultName.isEmpty()) {
            writer.println("<th>Результат</th>");
        } else {
            writer.println("<th>Результат (" + resultName + ")</th>");
        }
        writer.println("</tr>");
    }

    protected void appendCheckValuesRow(String a) {
        writer.println("<tr>");
        writer.println("<td></td>");
        writer.print("<td>");
        writer.print(a);
        writer.println("</td>");
        writer.print("<td class='preformatted'>");
        logic(a, writer);
        writer.println("</td>");
    }

    protected void appendCheckValuesFooter() {
        writer.println("</table>");
    }

    protected void appendFooter() {
        writer.println("</table>");
        writer.println("</div>");
    }

    protected abstract void logic(String value, PrintWriter out);

    protected String collectLayout() {
        String result = out.toString();
        out = new StringWriter();
        writer = new PrintWriter(out);
        return result;
    }
}
