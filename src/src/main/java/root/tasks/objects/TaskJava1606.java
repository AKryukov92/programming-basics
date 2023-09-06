package root.tasks.objects;

import root.tasks.MultipleInputValLayout;

public class TaskJava1606 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Прочитайте условие задачи. Оно совпадает с условием в задаче " + linkToTask(7040));
        appendTaskDescEscaped(
                "Даны три числа. Первые два обозначают левую и правую границы интервала." +
                        " Нужно проверить, попадает ли третье число в описанный интервал." +
                        " Левая граница включительно, правая - исключительно."
        );
        appendCheckValuesHeader("range.from", "range.to", "x");
        appendCheckValuesRow("5", "10", "7");
        appendCheckValuesRow("20", "30", "3");
        appendCheckValuesRow("100", "200", "300");
        appendCheckValuesRow("10", "15", "10");
        appendCheckValuesRow("10", "15", "15");
        appendCheckValuesRow("10", "5", "7");
        appendCheckValuesRow("30", "20", "3");
        appendCheckValuesFooter();
        appendSubheading("Реализуйте статический метод с двумя аргументами");
        appendOrderedNonEscaped(
                "В папке с исходным кодом создайте класс Range.",
                "Объявите в классе Range поля \"from\" и \"to\" для целых чисел.",
                "В классе Range реализуйте публичный статический метод contains.",
                "Он принимает в качестве аргумента 1 экземпляр класса Range, 1 действительное число и возвращает логическое значение.",
                "Метод должен возвращать результат задачи",
                "Если поле from больше поля to, то метод contains должен выбросить исключение IllegalArgumentException, содержащий текст ошибки из задачи."
        );
        appendFooter();
    }

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
}
