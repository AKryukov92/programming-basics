package root.tasks.filltemplate;

import root.tasks.CodedTask;

import java.io.PrintWriter;

public class Task2429 extends CodedTask {

    public Task2429(int id, String srcDirectory, boolean isExample) {
        super(id, srcDirectory, isExample);
    }

    @Override
    protected String getContent() {
        appendHeader();
        appendTaskDesc("Дана строка A. Нужно вывести ее на экран, дописать слова \"Программирование это \" перед началом и \"!\"(восклицательный знак) в конце этой строки.");
        appendCheckValuesHeader("A", "C");
        appendCheckValuesRow("просто");
        appendCheckValuesRow("интересно");
        appendCheckValuesRow("перспективно");
        appendCheckValuesFooter();
        appendFooter();
        return collectLayout();
    }

    @Override
    protected void logic(String value, PrintWriter out) {
        out.print("Программирование это ");
        out.print(value);
        out.print("!");
    }
}
