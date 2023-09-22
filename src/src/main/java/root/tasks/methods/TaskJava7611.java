package root.tasks.methods;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;

public class TaskJava7611 extends LayoutMaker implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(4411));
        appendOrderedNonEscaped(
                implementStatic("Library", "Task4411"),
                itAccepts("1 действительное число"),
                "Он возвращает действительное число",
                "В теле метода верните результат решения задачи, используя значение аргумента в качестве исходных данных"
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "Вызовите статический метод Task4411 класса Library.",
                "Передайте ему в качестве аргумента число 11.13",
                "Результат вызова запишите в переменную result",
                "Напечатайте в консоль значение переменной result",
                "Вызовите метод Task4411 и передайте ему число -7919",
                "Напечатайте в консоль результат второго вызова метода",
                "Напечатайте в консоль результат вызова метода Task4411 с аргументом 0",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped("18.13\n-7912\n7");
        appendFooter();
    }
}