package root.tasks.methods;

import root.tasks.MultipleInputValLayout;

public class TaskJava5823 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        System.out.printf("&lt;circle cx=\"%s\" cy=\"%s\" r=\"%s\" fill=\"%s\"/&gt;\n", args[0], args[1], args[2], args[3]);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(2632));
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод task2632.",
                "Он принимает в качестве аргументов 3 целых числа и 1 строку",
                "В теле метода task2632 напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                "В методе main класса Program 3 раза вызовите метод task2632 класса Methods.",
                "При каждом вызове метода task2632 в качестве аргументов передайте значения из разных тестов, описанных в задаче.",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingle("" +
                wrapLogic("50", "50", "40", "yellow") +
                wrapLogic("400", "300", "200", "green") +
                wrapLogic("254", "356", "100", "#cc6600")
        );
        appendFooter();
    }
}
