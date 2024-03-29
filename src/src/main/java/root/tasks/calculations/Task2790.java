package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task2790 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле. Значение угла дано в градусах.");
        appendTaskDescNonEscaped("<formula>\n" +
                "\t\t<sqrt><val>\n" +
                "\t\t\t1-sin<sup>2</sup>(xRad)\n" +
                "\t\t</val></sqrt>\n" +
                "\t</formula>");
        appendCheckValuesHeader("xDeg");
        appendCheckValuesRow("6997");
        appendCheckValuesRow("31");
        appendCheckValuesRow("90");
        appendCheckValuesRow("0");
        appendCheckValuesRow("180");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        double sin = Math.sin(x * Math.PI / 180.0);
        System.out.printf("%.4f", Math.sqrt(1.0 - sin * sin));
    }
}
