package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskJs3246 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingle("let a, b, c;\n" +
                "c = \"успех\";\n" +
                "b = \"провал\";\n" +
                "c = b;\n" +
                "a = b;\n" +
                "b = c;\n" +
                "out.innerHTML = 'Задача 3246 ' + a;");
        appendFooter();
    }
}