package root.tasks.assignment_puzzles;

import root.tasks.LayoutMaker;

public class TaskCs3246 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". Все команды должны быть использованы. Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("Console.WriteLine(\"Задача 3246\");\n" +
                "String a, b, c; //Объявляю переменные a, b, c для хранения текста\n" +
                "c = \"успех\";  //Записываю в переменную c значение \"успех\"\n" +
                "b = \"провал\"; //Записсываю в переменную b значение \"провал\"\n" +
                "c = b;          //Читаю из b, записываю в c\n" +
                "a = b;          //Читаю из b, записываю в a\n" +
                "b = c;          //Читаю из c, записываю в b\n" +
                "Console.WriteLine(a); //Печать результата на экран");
        appendTaskDescNonEscaped("Код, написанный справа от символов <zoom>//</zoom> это комментарии. Они не исполняются компьютером и могут содержать любой текст.");
        appendFooter();
    }
}