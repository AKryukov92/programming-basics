package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskCs8813 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит фамилию и имя. Нужно оформить фразу по шаблону:");
        appendCheckSingleNonEscaped("Меня зовут $lastName, $firstName $lastName.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод task8813.",
                "Он принимает в качестве аргумента 2 строки.",
                "В теле метода task8813 напечатайте в консоль решение задачи, используя значения аргументов в качестве исходных данных."
        );
        appendTaskDescEscaped("Вызовите метод task8813 в методе main класса Program с различными аргументами:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic("", ""));
        appendFooter();
    }

    @Override
    protected void logic(String s1, String s2) {
        Library.task8813("Джеймс", "Бонд");
        Library.task8813("капитан", "Джек Воробей");
        String firstName = "Александр";
        Library.task8813(firstName, "Крюков");
    }

    protected static class Library {
        public static void task8813(String firstName, String lastName) {
            System.out.printf("Меня зовут %s, %s %s\n", lastName, firstName, lastName);
        }
    }


    public static void main(String[] args) {
        System.out.println(new TaskCs8813().getContent());
    }
}
