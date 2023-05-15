package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava8347 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Прочитайте условие задачи");
        appendTaskDescEscaped(
                "Даны координаты двух точек: start, end." +
                " Они обозначают границы отрезка." +
                " Нужно найти координаты середины отрезка." +
                " Координата x середины отрезка вычисляется по формуле (startX + endX)/2." +
                " Координата y середины отрезка вычисляется по формуле (startY + endY)/2."
        );

        appendCheckValuesHeader("startX", "startY", "endX", "endY");
        appendCheckValuesRow("0", "0", "0", "10");
        appendCheckValuesRow("0", "0", "20", "0");
        appendCheckValuesRow("0", "30", "0", "0");
        appendCheckValuesRow("40", "0", "0", "0");
        appendCheckValuesRow("11", "13", "89", "61");
        appendCheckValuesRow("50", "50", "50", "50");
        appendCheckValuesFooter();
        appendSubheading("Реализуйте статический метод для решения задачи");
        appendOrderedNonEscaped(
                "Убедитесь, что у класса Point объявлены поля для действительных значений \"x\" и \"y\".",
                "В классе Point реализуйте публичный статический метод getMiddleOfSegment.",
                "Он принимает в качестве аргумента 2 экземпляра класса Point и возвращает экземпляр класса Point.",
                "Вычислите значения mx и my середины отрезка используя значения из аргументов в качестве исходных данных.",
                "В теле метода создайте экземпляр класса Point, запишите в его поля вычисленные значения mx и my.",
                "Верните полученный экземпляр класса Point как результат вызова метода."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrderedNonEscaped(
                "В классе PointSuite создайте тест middleOfSegmentTest.",
                "Объявите две переменные типа Point: src и dest.",
                "Заполните переменные src и dest значениями (0;0) и (0;10).",
                "Передайте src и dest как аргументы метода getMiddleOfSegment.",
                "Найдите какой результат ожидается для этих исходных данных.",
                "Объявите переменную expected типа Point. Запишите в её поля ожидаемый результат.",
                "Сравните содержимое переменной expected с фактическим результатом",
                "Повторите эти действия для значений src и dest равными (0;0) и (20;0)",
                "Повторите эти действия для значений src и dest равными (0;30) и (0;0)",
                "Повторите эти действия для значений src и dest равными (40;0) и (0;0)",
                "Повторите эти действия для значений src и dest равными (11;13) и (89;81)"
        );
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        Point start = new Point();
        start.x = Double.parseDouble(args[0]);
        start.y = Double.parseDouble(args[1]);
        Point end = new Point();
        end.x = Double.parseDouble(args[2]);
        end.y = Double.parseDouble(args[3]);
        Point result = Point.getMiddleOfSegment(start, end);
        System.out.printf("У отрезка %s %s середина находится в точке %s", start, end, result);
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8347().getContent());
    }

    private static class Point {
        double x;
        double y;

        public static Point getMiddleOfSegment(Point start, Point end) {
            Point result = new Point();
            result.x = (start.x + end.x) / 2;
            result.y = (start.y + end.y) / 2;
            return result;
        }

        @Override
        public String toString() {
            return String.format("(%.2f;%.2f)", x, y);
        }
    }
}
