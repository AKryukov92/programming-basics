package root.tasks.assertions;

import root.tasks.MultipleInputValLayout;

public class Task6924 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendCheckValuesHeader("ax", "ay", "bx", "by");
        appendCheckValuesRow("-50", "-86.6025", "60", "0");
        appendCheckValuesRow("10", "0", "0", "10");
        appendCheckValuesRow("11", "13", "7", "17");
        appendCheckValuesRow("-70.7106", "50", "60", "0");
        appendCheckValuesRow("-86.6025", "50", "60", "0");
        appendCheckValuesRow("3", "4", "4", "3");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double ax = Double.parseDouble(args[0]);
        double ay = Double.parseDouble(args[1]);
        double bx = Double.parseDouble(args[2]);
        double by = Double.parseDouble(args[3]);

        System.out.println(ax + " " + ay + " " + bx + " " + by);
        double aModule = Math.sqrt(ax * ax + ay * ay);
        double bModule = Math.sqrt(bx * bx + by * by);
        System.out.printf("Модуль вектора a = %.4f\n", aModule);
        System.out.printf("Модуль вектора b = %.4f\n", bModule);
        double scalarProduct = ax * bx + ay * by;
        System.out.printf("Скалярное произведение векторов равно %.4f\n", scalarProduct);
        double angleRad = Math.acos(scalarProduct / aModule / bModule);
        double angleDeg = angleRad * 180 / Math.PI;
        System.out.printf("Угол между векторами составляет %.4f градусов", angleDeg);
    }
}
