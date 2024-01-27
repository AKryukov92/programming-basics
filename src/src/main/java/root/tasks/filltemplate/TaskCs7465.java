package root.tasks.filltemplate;

import root.Console;

public class TaskCs7465 extends TaskJava7465 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Перенесите код в свою среду разработки:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В C# есть две команды для вывода текста:");
        appendOrderedEscaped(
                "Console.WriteLine(\"текст\"); //выводит текст на экран и переносит курсор на следующую строку (как будто нажали Enter). Следующий текст будет выведен строкой ниже",
                "Console.Write(\"текст\"); //выводит текст на экран. Следующий текст будет выведен в продолжение этой строки."
        );
        appendTaskDescEscaped("Замените Write на WriteLine так, чтобы получился следующий текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }
    public static class Verbose {
    protected void logic() {
        Console.WriteLine("первая строка");
        Console.WriteLine("вторая строка");
        Console.WriteLine(" с продолжением");
        Console.WriteLine("третья");
        Console.Write(" строка");
        Console.Write("четвертая");
        Console.WriteLine(" строка");
        Console.Write(" с продолжением");
        Console.WriteLine("пятая");
        Console.WriteLine(" строка");
    }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs7465());
    }
}
