package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskJs3246 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("let a, b, c;\n" +
                "c = \"успех\";//Записываем в c значение \"успех\"\n" +
                "b = \"провал\";//Записываем в b значение \"провал\"\n" +
                "c = b;//Читаем из b, записываем в c\n" +
                "a = b;//Читаем из b, записываем в a\n" +
                "b = c;//Читаем из c, записываем в b\n" +
                "out.innerHTML = 'Задача 3246 ' + a;");
        appendFooter();
    }
}