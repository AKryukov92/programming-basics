package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

import java.io.PrintStream;

public class Task2429 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана строка A. Нужно вывести ее на экран, дописать слова \"Программирование это \" перед началом и \"!\"(восклицательный знак) в конце этой строки.");
        appendCheckValuesHeader("A", "C");
        appendCheckValuesRow("просто");
        appendCheckValuesRow("интересно");
        appendCheckValuesRow("перспективно");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value, PrintStream out) {
        out.print("Программирование это ");
        out.print(value);
        out.print("!");
    }
}
