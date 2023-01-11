package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

public class Task9164 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        double aDeg = Double.parseDouble(firstValue);
        double bDeg = Double.parseDouble(secondValue);
        double aRad = Math.toRadians(aDeg);
        double bRad = Math.toRadians(bDeg);
        double result = Math.sin(aRad) * Math.cos(bRad) + Math.cos(aRad) * Math.sin(bRad);
        System.out.printf("%.4f", result);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Вычислить результат по формуле. Значение угла дано в градусах. <formula>sin(aRad)cos(bRad)+cos(aRad)sin(bRad)</formula>");
        appendCheckValuesHeader("aDeg", "bDeg");
        appendCheckValuesRow("90","90");
        appendCheckValuesRow("90", "0");
        appendCheckValuesRow("7559", "7549");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task9164().getContent());
    }
}
