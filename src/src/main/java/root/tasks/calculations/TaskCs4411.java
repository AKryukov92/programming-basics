package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class TaskCs4411 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры.");
        appendTaskDescEscaped("Команда для решения этой задачи выглядит так:");
        appendCheckSingleNonEscaped("Console.WriteLine(\"Меня зовут {0}, {1} {0}\", lastName, firstName);");
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
