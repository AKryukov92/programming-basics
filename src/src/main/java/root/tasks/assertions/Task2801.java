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
        appendTaskDescNonEscaped("Для вычисления остатка от деления нужно применить оператор <zoom>%</zoom>. Слева от оператора делимое, справа - делитель.");
        appendCheckSingleNonEscaped("remainder = dividend % divider;");
        appendTaskDescNonEscaped("Чтобы проверить, что в переменной содержится 0, нужно применить оператор сравнения <zoom>==</zoom>. Для противоположного условия нужно написать <zoom>!=</zoom>");
        appendCheckSingleNonEscaped("if (divider == 0) {");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double dividend = Integer.parseInt(firstValue);
        double divider = Integer.parseInt(secondValue);
        if (divider == 0) {
            System.out.println("Делитель не может быть равен 0");
        }
        if (divider != 0) {
            System.out.printf("Делимое %.0f, делитель %.0f, частное %.0f, остаток %.0f\n", dividend, divider, dividend / divider, dividend % divider);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2801());
    }
}
