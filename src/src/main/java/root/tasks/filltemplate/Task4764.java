package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task4764 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дана строка A. Нужно вывести её на экран и дописать слова \"нас не остановят\" в конце.");
        appendCheckValuesHeader("A", "C");
        appendCheckValuesRow("трудности");
        appendCheckValuesRow("загадки");
        appendCheckValuesRow("сложные задачи");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String a) {
        System.out.println(a + " нас не остановят!");
    }
}

