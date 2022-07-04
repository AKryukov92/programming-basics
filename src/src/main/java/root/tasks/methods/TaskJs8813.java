package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskJs8813 extends TwoInputValLayout {
    @Override
    protected void logic(String firstName, String lastName) {
        System.out.println("Меня зовут " + lastName + ", " + firstName + " " + lastName);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(4140));
        appendOrdered(
                "В файле для исходного кода реализуйте функцию task4140.",
                "В качестве аргументов ей будут передавать 2 строки.",
                "В теле функции task4140 напечатайте в консоль решение задачи, используя значения аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательного файла");
        appendOrdered(
                "В корне директории создайте файл Runner4140.html. Подключите в нем файл с кодом \"src/lab12.js\".",
                "Первым аргументом передайте ей строковый литерал \"Джеймс\". Вторым аргументом передайте строковый литерал \"Бонд\"",
                "Вызовите функцию task4140 еще раз и передайте ей строковые литералы \"капитан\" и \"Джек Воробей\".",
                "Вызовите функцию task4140 третий раз с аргументами \"Александр\" \"Крюков\"",
                "При открытии файла Runner4140.html, в консоли должен появиться текст:"
        );
        appendCheckSingle(wrapLogic("Джеймс", "Бонд") + wrapLogic("капитан", "Джек Воробей") + wrapLogic("Александр", "Крюков"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJs8813().getContent());
    }
}
