package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task2801 extends TwoInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано два числа: делимое и делитель. Найти частное и остаток от деления. Все значения округлить до целого. Вывести ответ по шаблону:");
        appendCheckSingleNonEscaped("Делимое $dividend, делитель $divider, частное $quotient, остаток $remainder");
        appendCheckValuesHeader("dividend", "divider");
        appendCheckValuesRow("1234", "11");
        appendCheckValuesRow("5", "13");
        appendCheckValuesRow("17", "17");
        appendCheckValuesRow("0", "23");
        appendCheckValuesRow("4", "0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int dividend = Integer.parseInt(firstValue);
        int divider = Integer.parseInt(secondValue);
        if (divider == 0) {
            System.out.println("Делитель не может быть равен 0");
        }
        if (divider != 0) {
            System.out.printf("Делимое %d, делитель %d, частное %d, остаток %d\n", dividend, divider, dividend / divider, dividend % divider);
        }

    }
}
