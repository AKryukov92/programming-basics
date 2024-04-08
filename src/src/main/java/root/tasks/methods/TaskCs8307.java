package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs8307 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит слово (goal). Нужно напечатать на экран фразу \"Мы стремимся к \" и затем слово от пользователя.");
        appendOrderedNonEscaped(
                "В классе Program реализуйте публичный статический метод task8307.",
                "Метод принимает в качестве аргумента 1 строку.",
                "Метод возвращает текст, который нужно напечатать на экран.",
                "В теле метода task8307 напечатайте в консоль решение задачи, используя значение аргумента в качестве исходных данных."
        );
        appendTaskDescEscaped("Код метода будет выглядеть так:");
        appendCheckSingleNonEscaped(methodExample());
        appendTaskDescEscaped("Метод - блок кода, содержащий ряд инструкций. Программа инициирует выполнение инструкций вызывая метод и указывая все аргументы, необходимые для этого метода.");
        appendTaskDescEscaped("Сигнатура метода - части метода, которые нужны для его объявления. На данном этапе обучения будут использоваться следующие элементы:");
        resetOrdered();
        appendOrderedNonEscaped(
                "public - ключевое слово, необязательное. Модификатор доступа. На данном этапе обучения его наличие или отсутствие ни на что не повлияет.",
                "static - ключевое слово. На данном этапе обучения обязательно. Объявление методов без него будет рассмотрено в будущих практических.",
                "void - ключевое слово. На данном этапе обучения обязательно. Объявление методов с альтернативами этому слову будет рассмотрено в будущах практических.",
                "Имя метода - произвольный текст. Подчиняется правилам именования переменных.",
                "Параметры (аргументы) метода - заключаются в круглые скобки, выглядят как объявление переменных через запятую. Метод без параметра оформляется с пустыми скобками."
        );
        appendTaskDescNonEscaped("Источник - <a href='https://learn.microsoft.com/ru-ru/dotnet/csharp/methods'>Статья на Microsoft Learn</a>, <a href='https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html'>Oracle java documentation</a>");
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска программы, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected String methodExample() {
        return "class Program {\n" +
                "    public static void task8307(String value) {//сигнатура метода\n" +
                "        String res;\n" +
                "        res = \"Мы стремимся к \" + value;\n" +
                "        Console.WriteLine(res);\n" +
                "    }\n" +
                "    static void Main(string[] args) {\n" +
                "        String temp = Console.ReadLine();\n" +
                "        task8307(temp);\n" +
                "    }\n" +
                "}";
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
