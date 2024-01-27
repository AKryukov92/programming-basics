package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class TaskJava7465 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Перенесите код в свою среду разработки:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В java есть две команды для вывода текста:");
        appendOrderedEscaped(
                "System.out.println(\"текст\"); //выводит текст на экран и переносит курсор на следующую строку (как будто нажали Enter). Следующий текст будет выведен строкой ниже.",
                "System.out.print(\"текст\"); //выводит текст на экран. Следующий текст будет выведен в продолжение этой строки."
        );
        appendTaskDescEscaped("Замените print на println так, чтобы получился следующий текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    public static class Verbose {
    protected void logic() {
        System.out.println("первая строка");
        System.out.println("вторая строка");
        System.out.println(" с продолжением");
        System.out.println("третья");
        System.out.print(" строка");
        System.out.print("четвертая");
        System.out.println(" строка");
        System.out.print(" с продолжением");
        System.out.println("пятая");
        System.out.println(" строка");
    }
    }

    @Override
    protected void logic(String value) {
        System.out.println("первая строка");//оставить
        System.out.print("вторая строка");//просто убрать ln
        System.out.println(" с продолжением");//оставить
        System.out.print("третья");//убрать ln
        System.out.println(" строка");//добавить ln
        System.out.print("четвертая");//оставить как есть
        System.out.print(" строка");//убрать ln
        System.out.println(" с продолжением");//добавить ln
        System.out.print("пятая");//убрать ln
        System.out.println(" строка");//не важно что делать
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava7465());
    }
}
