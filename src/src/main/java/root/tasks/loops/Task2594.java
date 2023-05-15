package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task2594 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        System.out.print("\"");
        int i = 0;
        while (i < 7) {
            System.out.print(value);
            i++;
        }
        System.out.print("\"");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит строку (X). Вывести эту строку 7 раз в строчку. Написать кавычки слева и справа от результата.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("#");
        appendCheckValuesRow("a");
        appendCheckValuesRow("w");
        appendCheckValuesRow("bp");
        appendCheckValuesRow("qq");
        appendCheckValuesFooter();
        appendFooter();
    }
}
