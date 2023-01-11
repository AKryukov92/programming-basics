package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task3943 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Вычислить результат по формуле <formula>-5<sqrt><val>x+<sqrt><val>y</val></sqrt></val></sqrt></formula>");
        appendCheckValuesHeader("x", "y");
        appendCheckValuesRow("-5", "81");
        appendCheckValuesRow("13", "36");
        appendCheckValuesRow("-20", "36");
        appendCheckValuesRow("20", "-50");
        appendCheckValuesRow("7507", "7499");
        appendCheckValuesRow("7489", "-7487");
        appendCheckValuesRow("-7481", "7477");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double x = Double.parseDouble(firstValue);
        double y = Double.parseDouble(secondValue);
        if (y < 0) {
            System.out.println("Значение y должно быть неотрицательным");
        }
        if (x + Math.sqrt(y) < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        }
        if (x + Math.sqrt(y) >= 0) {
            double result = -5 * Math.sqrt(x + Math.sqrt(y));
            System.out.printf("Результат вычислений %.4f", result);
        }
    }
}
