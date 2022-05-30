package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskJs9781 extends LayoutMaker {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingle("let a, b, c, d;\n" +
                "c = \"успех\";\n" +
                "a = \"тоже провал\";\n" +
                "b = \"провал\";\n" +
                "c = b;\n" +
                "d = b;\n" +
                "b = d;\n" +
                "d = c;\n" +
                "a = b;\n" +
                "out.innerHTML = 'Задача 9781 ' + a;");
        appendFooter();
    }
}
