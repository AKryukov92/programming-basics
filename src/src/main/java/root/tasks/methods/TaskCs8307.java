package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs8307 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит слово (goal). Нужно напечатать на экран фразу \"Мы стремимся к \" и затем слово от пользователя.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод task8307.",
                "Метод принимает в качестве аргумента 1 строку.",
                "Метод возвращает текст, который нужно напечатать на экран.",
                "В теле метода task8307 напечатайте в консоль решение задачи, используя значение аргумента в качестве исходных данных."
        );
        appendTaskDescEscaped("Код метода будет выглядеть так:");
        appendCheckSingleNonEscaped("public class Library {\n" +
                "    public static void task8307(String value) {\n" +
                "        String res;\n" +
                "        res = \"Мы стремимся к \" + value;\n" +
                "        return res;\n" +
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
        String result;
        //вызов метода task8307 из класса Library
        result = Library.task8307("знаниям");//литерал "знаниям" передан в качестве аргумента
        //результат вызова метода был записан в переменную result
        Console.WriteLine(result);
        String goal = "цели";
        //значение переменной goal передано в качестве аргумента
        result = Library.task8307(goal);//внутри метода это значение будет доступно под именем value
        Console.WriteLine(result);
        String result1 = Library.task8307("результату");
        Console.WriteLine(result1);
    }

    protected static class Library {
        public static String task8307(String value) {
            String res;
            res = "Мы стремимся к " + value;
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs8307());
    }
}
