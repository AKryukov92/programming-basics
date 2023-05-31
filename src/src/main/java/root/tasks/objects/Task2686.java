package root.tasks.objects;

import root.tasks.TwoInputValLayout;

public class Task2686 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для печати координат точки на экран");
        appendOrderedNonEscaped(
                "В папке для исходного кода создайте класс Point.",
                "Объявите у класса Point поля для действительных значений \"x\" и \"y\".",
                "В классе Point реализуйте публичный статический метод print.",
                "Он принимает в качестве аргумента 1 экземпляр класса Point.",
                "Метод ничего не возвращает.",
                "В теле метода напечатайте на экран фразу \"Координаты точки: ($x $y)\"",
                "Вместо $x подставьте поле x класса Point. Вместо $y - поле y класса Point."
        );
        appendCheckValuesHeader("x", "y");
        appendCheckValuesRow("1", "1");
        appendCheckValuesRow("3", "4");
        appendCheckValuesRow("0", "0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        Point p = new Point();
        p.x = Double.parseDouble(firstValue);
        p.y = Double.parseDouble(secondValue);
        Point.print(p);
    }

    public static class Point {
        public double x;
        public double y;

        public static void print(Point p) {
            System.out.println("Координаты точки: (" + p.x + "," + p.y + ")");
        }
    }
}
