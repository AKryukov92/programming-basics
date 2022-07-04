package root.tasks.methods;

import root.tasks.OneInputValLayout;

public class TaskJs8307  extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте функцию для решения задачи " + linkToTask(1860));
        appendOrdered(
                "В файле для исходного кода реализуйте функцию task1860.",
                "В качестве аргументов ей будут передавать 1 строку.",
                "В теле функции task1860 нужно напечатать в консоль решение задачи, используя значение аргумента в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы функции с помощью вспомогательного файла");
        appendOrdered(
                "В корне директории создайте файл Runner1860.html. Подключите в нем файл с кодом \"src/lab12.js\".",
                "В скриптах на странице Runner1860.html вызовите функцию task1860.",
                "В качестве аргумента передайте ему строковый литерал \"знаниям\"",
                "Вызовите функцию task1860 еще раз и передайте ей строковый литерал \"цели\".",
                "Вызовите функцию task1860 третий раз с аргументом \"результату\"",
                "При открытии файла Runner1860.html, в консоли должен появиться текст:"

        );
        appendCheckSingle(wrapLogic("знаниям") + wrapLogic("цели") + wrapLogic("результату"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8307());
    }
}
