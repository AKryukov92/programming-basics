package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

public class Task3558 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Вычислить результат по формуле. Значение угла дано в градусах. <formula>3sin(2*aRad)cos(3*bRad)</formula>");
        appendCheckValuesHeader("aDeg", "bDeg");
        appendCheckValuesRow("45", "90");
        appendCheckValuesRow("200", "45");
        appendCheckValuesRow("-70", "20");
        appendCheckValuesRow("100", "-135");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double aRad = Double.parseDouble(firstValue) * Math.PI / 180;
        double bRad = Double.parseDouble(secondValue) * Math.PI / 180;
        double result = 3 * Math.sin(2 * aRad) * Math.cos(3 * bRad);
        System.out.printf("%.4f", result);
    }

    public static void main(String[] args) {
        System.out.println(new Task3558());
    }
}
