package root.tasks.objects;

import root.tasks.LayoutMaker;

public class TaskJava6011 extends LayoutMaker {
    protected void logic() {
        Point src;
        Point dest;
        src = new Point();
        dest = new Point();
        src.x = 1;
        src.y = 1;
        dest.x = 3;
        dest.y = 4;
        double actual = Point.distanceBetween(src, dest);
        if (Math.abs(actual - 3.6056) < 0.0001) {
            System.out.println("Результат корректный");
        } else {
            System.out.println("Ожидалось 3.6056, а получилось " + actual);
        }
    }

    private static class Point {
        public double x;
        public double y;
        public static double distanceBetween(Point a, Point b) {
            return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте статический метод для решения задачи " + linkToTask(5789) + "используя экземпляры класса");
        appendOrdered(
                "Объявите у класса Point поля для действительных значений \"x\" и \"y\".",
                "В классе Point реализуйте еще один публичный статический метод distanceBetween.",
                "Новый метод distanceBetween принимает в качестве аргументов 2 экземпляра класса Point и возвращает действительное число.",
                "В теле метода верните результат решения задачи. Для его вычисления используйте поля \"x\" и \"y\" экземпляров класса Point, которые были переданы в качестве аргументов."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В классе PointSuite создайте юнит-тест distanceBetweenPointsTest.",
                "В теле метода distanceBetweenPointsTest объявите переменные src и dest типа Point.",
                //простая формулировка заполнения
                "Создайте экземпляр класса класса Point и запишите его в переменную src.",
                //другая формулировка того же самого
                "Инициализируйте переменную dest экземпляром класса Point.",
                //Проверяем тесты из оригинальной задачи по одному потому что сложность задачи в оформлении,
                //а не в написании формулы. К тому же формулу проверили в первой задаче этой лабораторной
                //сначала заполняем поля явно, по одному
                "Инициализируйте поле \"x\" переменной dest значением 3.",
                "Инициализируйте поле \"y\" переменной dest значением 4.",
                //когда по одному получилось, тогда можно обобщенную фразу
                "Инициализируйте поле \"x\" и \"y\" переменной src значениями 1.",
                "Вызовите статический метод distanceBetween класса Point и передайте ему в качестве аргументов значения переменных src и dest.",
                "Проверьте, что результат вызова метода distanceBetween равен 3.6056 с точностью 0.0001.",
                "После запуска тестового метода, он должен быть отмечен зеленым знаком в списке методов."
        );
        appendFooter();
    }
}
