package root.tasks.unit_testing;

import root.tasks.LayoutMaker;

public class Task4930 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(4411));
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод Task4411.",
                "Он принимает в качестве аргумента 1 действительное число и возвращает действительное число.",
                "В теле метода верните результат решения задачи, используя значение аргумента в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной програмы");
        appendOrderedEscaped(
                "В методе main класса Program объявите переменную result для хранения действительных чисел.",
                "Вызовите статический метод Task4411 класса Library.",
                "Передайте ему в качестве аргументов значение 11.13",
                "Результат вызова метода запишите в переменную result.",
                "Напечатайте в консоль значение переменной result с точностью 4 знака после запятой.",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped("");
        appendFooter();
    }
}
