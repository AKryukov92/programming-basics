package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskJava8813 extends TwoInputValLayout {
    @Override
    protected void logic(String firstName, String lastName) {
        System.out.println("Меня зовут " + lastName + ", " + firstName + " " + lastName);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(4140));
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод task4140.",
                "Он принимает в качестве аргумента 1 строку.",
                "В теле метода task4140 напечатайте в консоль решение задачи, используя значения аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                "В методе main класса Program вызовите метод task4140 класса Methods.",
                "Первым аргументом передайте ему строковый литерал \"Джеймс\". Вторым аргументом передайте строковый литерал \"Бонд\"",
                "Вызовите метод task4140 еще раз и передайте ему строковые литералы \"капитан\" и \"Джек Воробей\".",
                "Вызовите метод task4140 третий раз с аргументами \"Александр\" \"Крюков\"",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingle(wrapLogic("Джеймс", "Бонд") + wrapLogic("капитан", "Джек Воробей") + wrapLogic("Александр", "Крюков"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8813().getContent());
    }
}
