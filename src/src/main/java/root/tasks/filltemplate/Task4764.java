package root.tasks.filltemplate;

import root.tasks.CodedTask;

import java.io.PrintWriter;

public class Task4764 extends CodedTask {

    public Task4764(int id, String srcDirectory, boolean isExample) {
        super(id, srcDirectory, isExample);
    }

    @Override
    protected String getContent() {
        appendHeader();
        appendTaskDesc("Дана строка A. Нужно вывести её на экран и дописать слова \"нас не остановят\" в конце.");
        appendCheckValuesHeader("A", "C");
        appendCheckValuesRow("трудности");
        appendCheckValuesRow("загадки");
        appendCheckValuesRow("сложные задачи");
        appendCheckValuesFooter();
        appendFooter();
        return collectLayout();
    }

    @Override
    protected void logic(String a, PrintWriter out) {
        out.println(a + " нас не остановят!");
    }
}

