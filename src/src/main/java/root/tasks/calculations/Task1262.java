package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task1262 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить результат по формуле <formula>5cos(yRad)</formula>. Значение угла дано в градусах.");
        appendCheckValuesHeader("yDeg");
        appendCheckValuesRow("200");
        appendCheckValuesRow("360");
        appendCheckValuesRow("90");
        appendCheckValuesRow("-50");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double yDeg = Double.parseDouble(value);
        double yRad = yDeg * Math.PI / 180;
        System.out.printf("%.4f градусов это %.4f радиан\n", yDeg, yRad);
        double result = 5 * Math.cos(yRad);
        System.out.printf("результат вычисления %.4f", result);
    }

    public static void main(String[] args) {
        System.out.println(new Task1262());
    }
}
