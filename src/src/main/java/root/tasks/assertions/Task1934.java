package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task1934 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Вычислить результат по формуле <formula>a<sqrt><val>-7b</val></sqrt></formula>");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("-3", "-7");
        appendCheckValuesRow("0", "-50");
        appendCheckValuesRow("13", "0");
        appendCheckValuesRow("6047", "-6011");
        appendCheckValuesRow("13", "17");
        appendCheckValuesRow("6221", "6373");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double a = Double.parseDouble(firstValue);
        double b = Double.parseDouble(secondValue);
        if (b > 0) {
            System.out.println("Значение B должно быть не положительным");
        }
        if (b <= 0) {
            double result = a * Math.sqrt(-7 * b);
            System.out.printf("Результат вычисления %.4f", result);
        }
    }
}
