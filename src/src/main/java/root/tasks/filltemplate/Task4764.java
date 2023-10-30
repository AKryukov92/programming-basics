package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task4764 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит слово (problem). Нужно вывести это слово на экран и дописать слова \"нас не остановят\" в конце.");
        appendCheckValuesHeader("problem");
        appendCheckValuesRow("трудности");
        appendCheckValuesRow("загадки");
        appendCheckValuesRow("сложные задачи");
        appendCheckValuesFooter();
        --сказать про инициализацию и объявление
        appendFooter();
    }

    @Override
    protected void logic(String a) {
        System.out.println(a + " нас не остановят!");
    }
}

