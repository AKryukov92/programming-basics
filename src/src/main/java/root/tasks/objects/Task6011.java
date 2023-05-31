package root.tasks.objects;

import root.tasks.MethodsDictationHelper;
import root.tasks.MultipleInputValLayout;


public class Task6011 extends MultipleInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для решения задачи " + linkToTask(1058) + "используя экземпляры класса");
        appendOrderedNonEscaped(
                "Объявите у класса Point поля для действительных значений \"x\" и \"y\".",
                implementStatic("Point", "distanceBetween"),
                "Новый метод distanceBetween принимает в качестве аргументов 2 экземпляра класса Point.",
                "Метод возвращает действительное число.",
                "Для вычисления результата используйте поля \"x\" и \"y\" экземпляров класса Point, которые были переданы в качестве аргументов."
        );
        appendCheckValuesHeader("a.x", "a.y", "b.x", "b.y");
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
        Point a = new Point(), b = new Point();
        a.x = Integer.parseInt(args[0]);
        a.y = Integer.parseInt(args[1]);
        b.x = Integer.parseInt(args[2]);
        b.y = Integer.parseInt(args[3]);
        System.out.printf("Координаты точки A(%.4f,%.4f)\n", a.x, a.y);
        System.out.printf("Координаты точки B(%.4f%.4f)\n", b.x, b.y);
        System.out.printf("Расстояние между точками равно " + Point.distanceBetween(a, b));
    }

    private static class Point {
        public double x;
        public double y;

        public static double distanceBetween(Point a, Point b) {
            return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        }
    }
}
