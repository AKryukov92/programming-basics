package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskCs9781 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("Console.WriteLine(\"Задача 9781\");\n" +
                "String a, b, c, d;\n" +
                "c = \"успех\";\n" +
                "a = \"тоже провал\";\n" +
                "b = \"провал\";\n" +
                "c = b;\n" +
                "d = b;\n" +
                "b = d;\n" +
                "d = c;\n" +
                "a = b;\n" +
                "Console.WriteLine(a);");
        appendFooter();
    }
}
