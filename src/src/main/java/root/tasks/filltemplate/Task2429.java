package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task2429 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит слово (adjective). Нужно вывести его на экран, дописать слова \"Программирование это \" перед началом и \"!\"(восклицательный знак) в конце этой строки.");
        appendCheckValuesHeader("adjective");
        appendCheckValuesRow("просто");
        appendCheckValuesRow("интересно");
        appendCheckValuesRow("перспективно");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.print("Программирование это ");
        System.out.print(value);
        System.out.print("!");
    }
}
