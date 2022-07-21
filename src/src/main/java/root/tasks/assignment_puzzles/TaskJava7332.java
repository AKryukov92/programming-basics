package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskJava7332 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingle("System.out.println(\"Задача 7332\");" +
                "String a, b, c;\n" +
                "c = \"успех\";\n" +
                "b = \"тоже провал\";\n" +
                "a = \"провал\";\n" +
                "c = b;\n" +
                "b = c;\n" +
                "b = a;\n" +
                "a = b;\n" +
                "System.out.println(a);");
        appendFooter();
    }
}
