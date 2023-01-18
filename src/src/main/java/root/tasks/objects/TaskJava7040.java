package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava7040 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        double left = Double.parseDouble(args[0]);
        double right = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        try {
            boolean result = Range.contains(left, right, x);
            if (result) {
                System.out.printf("Интервал [%f,%f) содержит число %f", left, right, x);
            } else {
                System.out.printf("Число %f за пределами интервала [%f,%f)", x, left, right);
            }
        } catch (IllegalArgumentException ex) {
            System.out.printf("Некорректный интервал [%f,%f)", left, right);
        }
    }

    public static class Range {
        public static boolean contains(double left, double right, double x) {
            if (left > right) {
                throw new IllegalArgumentException("Некорректный интервал");
            }
            return left <= x && x < right;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Прочитайте условие задачи");
        appendTaskDesc("Даны три числа. Первые два обозначают левую и правую границы интервала." +
                " Нужно проверить, попадает ли третье число в описанный интервал." +
                " Левая граница включительно, правая - исключительно.");
        appendCheckValuesHeader("left", "right", "x");
        appendCheckValuesRow("5", "10", "7");
        appendCheckValuesRow("20", "30", "3");
        appendCheckValuesRow("100", "200", "300");
        appendCheckValuesRow("10", "15", "10");
        appendCheckValuesRow("10", "15", "15");
        appendCheckValuesRow("999", "1", "100");
        appendCheckValuesFooter();
        appendSubheading("Реализуйте статический метод с тремя аргументами");
        appendOrdered(
                "В папке с исходным кодом создайте класс Range",
                "В классе Range реализуйте публичный статический метод contains",
                "Он принимает в качестве аргумента 3 действительных числа и возвращает логическое значение.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В папке для юнит-тестов создайте класс RangeSuite.",
                "В классе RangeSuite создайте юнит-тест doublesContainDoubleTest.",
                "Объявите переменную actual и запишите в неё результат вызова метода contains с аргументами 100, 200, 300.",
                "Проверьте, что переменная actual содержит false.",
                "Убедитесь, что метод contains возвращает true если передать ему в качестве аргументов 5, 10, 7",
                "Проверьте, что при передаче значений 20, 30, 3 метод contains возвращает false.",
                "Проверьте, что метод contains выбрасывает исключение если передать ему 999, 1, 100"
        );
        appendFooter();
    }
}
