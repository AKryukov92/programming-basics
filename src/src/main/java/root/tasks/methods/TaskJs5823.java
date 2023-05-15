package root.tasks.methods;

import root.tasks.MultipleInputValLayout;

public class TaskJs5823 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        System.out.printf("&lt;circle cx=\"%s\" cy=\"%s\" r=\"%s\" fill=\"yellow\"/&gt;\n", args[0], args[1], args[2]);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте функции для решения задачи " + linkToTask(2632));
        appendOrderedNonEscaped(
                "В файле для исходного кода реализуйте функцию task2632.",
                "В качестве аргументов ей будут передавать 3 числа и 1 строку.",
                "В теле функции нужно напечатать в консоль решение задачи, используя значение аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы функции с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "В корне директории создайте файл Runner2632.html. Подключите в нем файл с кодом \"src/lab12.js\".",
                "В скриптах на странице Runner2632.html вызовите 3 раза фукнцию task2632.",
                "При каждом вызове функции task2632 в качестве аргументов нужно передавать значения из разных тестов, описанных в задаче.",
                "При открытии файла Runner2632.html, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped("" +
                wrapLogic("50", "50", "40", "yellow") +
                wrapLogic("400", "300", "200", "green") +
                wrapLogic("254", "356", "100", "#cc6600")
        );
        appendFooter();
    }
}
