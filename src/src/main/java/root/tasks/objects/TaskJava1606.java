package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava1606 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        Range rng = new Range();
        rng.from = Double.parseDouble(args[0]);
        rng.to = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);
        try {
            boolean result = TaskJava7040.Range.contains(rng.from, rng.to, x);
            if (result) {
                System.out.printf("Интервал [%f,%f) содержит число %f", rng.from, rng.to, x);
            } else {
                System.out.printf("Число %f за пределами интервала [%f,%f)", x, rng.from, rng.to);
            }
        } catch (IllegalArgumentException ex) {
            System.out.printf("Некорректный интервал [%f,%f)", rng.from, rng.to);
        }
    }

    public static class Range {
        public double from;
        public double to;

        public static boolean contains(Range range, double x) {
            if (range.from > range.to) {
                throw new IllegalArgumentException("Некорректный интервал");
            }
            return range.from <= x && x < range.to;
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
        appendCheckValuesRow("10", "5", "7");
        appendCheckValuesRow("30", "20", "3");
        appendCheckValuesFooter();
        appendSubheading("Реализуйте статический метод с двумя аргументами");
        appendOrdered(
                "В папке с исходным кодом создайте класс Range.",
                "Объявите в классе Range поля \"from\" и \"to\" для целых чисел.",
                "В классе Range реализуйте публичный статический метод contains.",
                "Он принимает в качестве аргумента 1 экземпляр класса Range, 1 действительное число и возвращает логическое значение.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных.",
                "Если поле from больше поля to, то метод contains должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendSubheading("Проверьте корректность работы метода с помощью юнит-теста");
        appendOrdered(
                "В папке для юнит-тестов создайте класс RangeSuite.",
                "В классе RangeSuite создайте юнит-тест rangeContainsDoubleTest. Далее действия нужно выполнять в теле этого метода.",
                "Объявите переменную actual для хранения логических значений.",
                "Объявите переменную r типа Range",
                "Инициализируйте переменную r экземпляра класса Range",
                "Запишите в поле from переменной r значение 5.",
                "Запишите в поле to переменной r значение 10.",
                "Вызовите метод contains класса Range.",
                "Передайте переменную r и значение 7 в качестве аргументов метода contains.",
                "Результат вызова метода contains запишите в переменную actual.",
                "Проверьте, что переменная actual содержит true.",
                "Проверьте, что вызов метода contains для интервала 20, 30 и числа 3 возвращает false.",
                "Заполните поля from и to переменной r значениями 100 и 200 соответственно.",
                "Запишите в переменную actual результат вызова метода contains с аргументами r и 300.",
                "Проверьте, что переменная actual содержит значение false",
                "Проверьте, что метод contains выбросит исключение, если передать ему интервал 999, 1 и любое значение x"
        );
        appendFooter();
    }
}
