package root.tasks.objects;

import root.tasks.MultipleInputValLayout;
import root.tasks.assertions.Task1058;

public class Task5789 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для решения задачи " + linkToTask(Task1058.class.getSimpleName()));
        appendOrderedNonEscaped(
                "В папке для исходного кода создайте класс Point.",
                "В классе Point реализуйте публичный статический метод distanceBetween.",
                "Он принимает в качестве аргумента 4 действительных числа.",
                "Метод возвращает действительное число."
        );
        appendCheckValuesHeader("ax", "ay", "bx", "by");
        appendCheckValuesRow("1", "1", "3", "4");
        appendCheckValuesRow("-2", "4", "8", "-10");
        appendCheckValuesRow("0", "0", "-5", "-7");
        appendCheckValuesRow("0", "0", "0", "0");
        appendCheckValuesRow("-1", "-3", "2", "9");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int ax = Integer.parseInt(args[0]);
        int ay = Integer.parseInt(args[1]);
        int bx = Integer.parseInt(args[2]);
        int by = Integer.parseInt(args[3]);
        System.out.printf("Координаты точки (%d,%d)\n", ax, ay);
        System.out.printf("Координаты точки (%d,%d)\n", bx, by);
        System.out.printf("Расстояние между точками равно " + Point.distanceBetween(ax, ay, bx, by));
    }

    private static class Point {
        public static double distanceBetween(int ax, int ay, int bx, int by) {
            return Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        }
    }
}
