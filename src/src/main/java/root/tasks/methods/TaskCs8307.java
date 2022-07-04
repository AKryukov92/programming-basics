package root.tasks.methods;

import root.tasks.OneInputValLayout;

public class TaskCs8307 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        System.out.println("Мы стремимся к " + value);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(1860));
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод task1860.",
                "Он принимает в качестве аргумента 1 строку.",
                "В теле метода task1860 напечатайте в консоль решение задачи, используя значение аргумента в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                "В методе main класса Program вызовите метод task1860 класса Methods.",
                "В качестве аргумента передайте ему строковый литерал \"знаниям\"",
                "Вызовите метод task1860 еще раз и передайте ему строковый литерал \"цели\".",
                "Вызовите метод task1860 третий раз с аргументом \"результату\"",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"

        );
        appendCheckSingle(wrapLogic("знаниям") + wrapLogic("цели") + wrapLogic("результату"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs8307());
    }
}
