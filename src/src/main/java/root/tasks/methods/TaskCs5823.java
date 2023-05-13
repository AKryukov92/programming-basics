package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.MultipleInputValLayout;

public class TaskCs5823 extends MultipleInputValLayout implements MethodsDictationHelper {
    @Override
    protected void logic(String... args) {
        System.out.printf("&lt;circle cx=\"%s\" cy=\"%s\" r=\"%s\" fill=\"yellow\"/&gt;\n", args[0], args[1], args[2]);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(2632));
        appendOrderedNonEscaped(
                implementStatic("Library", "task2632"),
                "Он принимает в качестве аргументов 3 целых числа и 1 строку",
                "В теле метода task2632 напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "В методе main класса Program 3 раза вызовите метод task2632 класса Library.",
                "При каждом вызове метода task2632 в качестве аргументов передайте значения из разных тестов, описанных в задаче.",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped("" +
                wrapLogic("50", "50", "40", "yellow") +
                wrapLogic("400", "300", "200", "green") +
                wrapLogic("254", "356", "100", "#cc6600")
        );
        appendFooter();
    }
}
