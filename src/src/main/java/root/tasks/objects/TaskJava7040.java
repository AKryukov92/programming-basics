package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava7040 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        try {
            boolean result = Range.contains(
                    Double.parseDouble(args[0]),
                    Double.parseDouble(args[1]),
                    Double.parseDouble(args[2])
            );
            if (result){
                System.out.println("Интервал содержит число");
            } else {
                System.out.println("Число за пределами интервала");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Некорректный интервал");
        }
    }

    private static class Range {
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
        appendSubheading("Реализуйте статический метод для решения задачи");
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
                "В теле метода doublesContainDoubleTest вызовите метод contains класса Range.",
                "Убедитесь, что метод contains возвращает true если передать ему в качестве аргументов 5, 10, 7",
                "Проверьте, что при передаче значений 20, 30, 3 метод contains возвращает false.",
                "Объявите переменную actual и запишите в неё результат вызова метода contains с аргументами 100, 200, 300.",
                "Проверьте, что переменная actual содержит false.",
                "Проверьте, что метод contains выбрасывает исключение если передать ему 999, 1, 100"
                );
        appendFooter();
    }
}
