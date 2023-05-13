package root.tasks.filltemplate;

import root.tasks.TwoInputValLayout;

public class Task7271 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $X на введенное значение x. $Y на введенное значение y.");
        appendCheckSingleNonEscaped("INSERT INTO points (x, y) VALUES ('$X', '$Y');");
        appendCheckValuesHeader("x", "y");
        appendCheckValuesRow("5", "7");
        appendCheckValuesRow("-1", "1000");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String x, String y) {
        System.out.printf("INSERT INTO points (x, y) VALUES ('%s', '%s');", x, y);
    }
}
