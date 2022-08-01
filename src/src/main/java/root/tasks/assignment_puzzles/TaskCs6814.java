package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskCs6814 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingle("Console.WriteLine(\"Задача 6814\");" +
                "String a, b, c, d;\n" +
                "c = \"успех\";\n" +
                "a = \"тоже провал\";\n" +
                "b = \"провал\";\n" +
                "d = b;\n" +
                "b = c;\n" +
                "b = d;\n" +
                "d = c;\n" +
                "a = d;\n" +
                "a = b;\n" +
                "Console.WriteLine(a);");
        appendFooter();
    }
}