package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava1606 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {

    }

    private static class Range {
        private double left;
        private double right;

        public static boolean contains(Range range, double x) {
            if (range.left > range.right) {
                throw new IllegalArgumentException("Некорректный интервал");
            }
            return range.left <= x && x < range.right;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Прочитайте условие задачи (как в задаче " + linkToTask(7040) + ")");
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
                "Он принимает в качестве аргумента 1 экземпляр класса Range, 1 действительное число и возвращает логическое значение.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В папке для юнит-тестов создайте класс RangeSuite.",
                "В классе RangeSuite создайте юнит-тест doublesContainDoubleTest."
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
