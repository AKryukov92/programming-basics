package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava1606 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        Range rng = new Range();
        rng.left = Double.parseDouble(args[0]);
        rng.right = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        try {
            boolean result = TaskJava7040.Range.contains(rng.left, rng.right, x);
            if (result) {
                System.out.printf("Интервал [%f,%f) содержит число %f", rng.left, rng.right, x);
            } else {
                System.out.printf("Число %f за пределами интервала [%f,%f)", x, rng.left, rng.right);
            }
        } catch (IllegalArgumentException ex) {
            System.out.printf("Некорректный интервал [%f,%f)", rng.left, rng.right);
        }
    }

    public static class Range {
        public double left;
        public double right;

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
        appendSubheading("Прочитайте условие задачи. Оно совпадает с условием в задаче " + linkToTask(7040) + "");
        appendTaskDesc(
                "Даны три числа. Первые два обозначают левую и правую границы интервала." +
                " Нужно проверить, попадает ли третье число в описанный интервал." +
                " Левая граница включительно, правая - исключительно."
        );
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
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В папке для юнит-тестов создайте класс RangeSuite.",
                "В классе RangeSuite создайте юнит-тест rangeContainsDoubleTest. Далее действия нужно выполнять в теле этого метода.",
                "Объявите переменную actual для хранения логических значений.",
                "Объявите переменную r типа Range",
                "Запишите в поле left переменной r значение 5.",
                "Запишите в поле right переменной r значение 10",
                "Вызовите метод contains класса Range.",
                "Передайте переменную r и значение 7 в качестве аргументов метода contains.",
                "Результат вызова метода contains запишите в переменную actual.",
                "Проверьте, что переменная actual содержит true.",
                "Проверьте, что вызов метода contains для интервала 20, 30 и числа 3 возвращает false.",
                "Заполните поля left и right переменной r значениями 100 и 200 соответственно.",
                "Запишите в переменную actual результат вызова метода contains с аргументами r и 300.",
                "Проверьте, что переменная actual содержит значение false",
                "Проверьте, что метод contains выбросит исключение, если передать ему интервал 999, 1 и любое значение x"
        );
        appendFooter();
    }
}
