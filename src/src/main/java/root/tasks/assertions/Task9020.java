package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task9020 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDesc("Сообщение об ошибке должно быть написано так, чтобы пользователь мог понять какие значения или действия от него ожидались." +
                " В некоторых случаях к сообщению добавляют код ошибки."
        );
        appendTaskHeader();
        appendNonEscaped("Вычислить результат по формуле <formula>3<sqrt><val>61-x</val></sqrt></formula>");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-9");
        appendCheckValuesRow("60");
        appendCheckValuesRow("61");
        appendCheckValuesRow("62");
        appendCheckValuesRow("7573");
        appendCheckValuesRow("75");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        if (x > 61) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        }
        if (x <= 61) {
            double result = 3 * Math.sqrt(61 - x);
            System.out.printf("Результат вычисления %.4f", result);
        }
    }
}
