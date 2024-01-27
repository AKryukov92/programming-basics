package root.tasks.calculations;

import root.tasks.MultipleInputValLayout;

public class Task4913 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Даны координаты aX и aY исходной точки, горизонтальное п<b>р</b>оложение между точками (длина линии, distance) и дирекционный угол angle, выраженный в градусах. Решите прямую геодезическую задачу - определите координаты другого конца отрезка.");
        appendOrderedNonEscaped(
                "Приращение координаты x по формуле <formula>dX = distance * cos(angleRad)</formula>",
                "Приращение координаты y по формуле <formula>dY = distance * sin(angleRad)</formula>",
                "Координату X<sub>b</sub> другой точки по формуле <formula>bx = ax + dX</formula>.",
                "Координату Y<sub>b</sub> другой точки по формуле <formula>by = ay + dY</formula>"
        );
        appendTaskDescNonEscaped("Выведите на экран приращение координат dx и dy, а также координаты X<sub>b</sub> и Y<sub>b</sub> другой точки с точностью 4 знака после запятой по шаблону.");
        appendCheckSingleNonEscaped("Приращение координат: dX = $dx; dY = $dy\n" +
                "Координаты второй точки ($bx;$by)");
        appendCheckValuesHeader("ax", "ay", "distance", "angleDeg");
        appendCheckValuesRow("1", "2", "5", "30");
        appendCheckValuesRow("7", "11", "13", "110");
        appendCheckValuesRow("17", "19", "23", "230");
        appendCheckValuesRow("29", "31", "3", "290");
        appendCheckValuesRow("33", "37", "10", "90");
        appendCheckValuesRow("33", "37", "10", "180");
        appendCheckValuesRow("33", "37", "10", "270");
        appendCheckValuesRow("33", "37", "10", "360");
        appendCheckValuesRow("1", "2", "10", "0");
        appendCheckValuesRow("1", "2", "-5", "45");
        appendCheckValuesRow("1", "2", "0", "45");
        appendCheckValuesRow("1", "2", "10", "-5");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double ax = Double.parseDouble(args[0]);
        double ay = Double.parseDouble(args[1]);
        double distance = Double.parseDouble(args[2]);
        double angleDeg = Double.parseDouble(args[3]);
        if (distance <= 0) {
            System.out.println("Горизонтальное проложение линии должно быть положительно");
        }
        if (angleDeg < 0) {
            System.out.println("Угол должен быть неотрицательным");
        }
        if (distance > 0) {
            if (angleDeg >= 0) {
                double dx = distance * Math.cos(Math.toRadians(angleDeg));
                double dy = distance * Math.sin(Math.toRadians(angleDeg));
                System.out.print("Приращение координат:");
                System.out.printf(" dX = %.4f dY = %.4f\n", dx, dy);
                double destX = ax + dx;
                double destY = ay + dy;
                System.out.printf("Координаты второй точки (%.4f;%.4f)\n", destX, destY);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4913());
    }
}
