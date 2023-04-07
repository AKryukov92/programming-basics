package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task4411 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Вычислить результат по формуле x + 7, где x вводится с клавиатуры.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("11.13");
        appendCheckValuesRow("-7919");
        appendCheckValuesRow("0");
        appendCheckValuesRow("6.00006");
        appendCheckValuesRow("9.00004");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        double result;
        result = x + 7;
        System.out.printf("Результат равен %.4f", result);
    }
}
