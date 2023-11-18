package root.tasks.methods;

import root.tasks.OneInputValLayout;

public class TaskCs8307 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит слово (goal). Нужно напечатать на экран фразу \"Мы стремимся к \" и затем слово от пользователя.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод task1860.",
                "Он принимает в качестве аргумента 1 строку.",
                "В теле метода task1860 напечатайте в консоль решение задачи, используя значение аргумента в качестве исходных данных."
        );
        appendTaskDescEscaped("Код метода будет выглядеть так:");
        appendCheckSingleNonEscaped("public class Library {\n" +
                "    public static void task1860(String value) {\n" +
                "        System.out.println(\"Мы стремимся к \" + value);\n" +
                "    }\n" +
                "}");
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        //вызов метода task1860 из класса Library
        Library.task1860("знаниям");//литерал "знаниям" передан в качестве аргумента
        String goal = "цели";
        //значение переменной goal передано в качестве аргумента
        Library.task1860(goal);//внутри метода это значение будет доступно под именем value
        Library.task1860("результату");
    }

    protected static class Library {
        public static void task1860(String value) {
            System.out.println("Мы стремимся к " + value);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs8307());
    }
}
