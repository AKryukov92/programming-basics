package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskCs8813 extends TwoInputValLayout {
    @Override
    protected void logic(String firstName, String lastName) {
        System.out.println("Меня зовут " + lastName + ", " + firstName + " " + lastName);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(4140));
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод task4140.",
                "Он принимает в качестве аргумента 2 строки.",
                "В теле метода task4140 напечатайте в консоль решение задачи, используя значения аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrderedNonEscaped(
                "В методе main класса Program вызовите метод task4140 класса Library.",
                "Первым аргументом передайте ему строковый литерал \"Джеймс\". Вторым аргументом передайте строковый литерал \"Бонд\"",
                "Вызовите метод task4140 еще раз и передайте ему строковые литералы \"капитан\" и \"Джек Воробей\".",
                "Вызовите метод task4140 третий раз с аргументами \"Александр\" \"Крюков\"",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingleNonEscaped(wrapLogic("Джеймс", "Бонд") + wrapLogic("капитан", "Джек Воробей") + wrapLogic("Александр", "Крюков"));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs8813().getContent());
    }
}
