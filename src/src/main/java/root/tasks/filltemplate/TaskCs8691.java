package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class TaskCs8691 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст.");
        appendCheckSingleNonEscaped("{ \"x\":15, \"y\": 28.7 }");
        appendTaskDescNonEscaped("Компьютер определяет начало и конец сообщения по двойным кавычкам <zoom>&quot;</zoom>. Из за того, что кавычки одинаковы, любая первая будет значить начало литерала, а следующая - конец литерала. Если будет третья - она будет значить начало нового строкового литерала. Поэтому для вывода на экран одного символа \" нужно написать комбинацию символов <zoom>\\\"</zoom>");
        appendTaskDescEscaped("Если вы не написали комбинацию символов \\\" там где нужно вывести на экран кавычку, то ошибки будут такими:");
        appendCheckSingleNonEscaped("Console.WriteLine(\"{ \"x\":15, \"y\": 28.7 }\");");
        resetOrdered();
        appendOrderedEscaped(
                "Синтаксическая ошибка, требуется \",\"",
                "Имя \"x\" не существует в текущем контексте.",
                "Имя \"y\" не существует в текущем контексте."
        );
        appendTaskDescEscaped("Нужно оформить по аналогии:");
        appendCheckSingleNonEscaped("Console.WriteLine(\"одинокая кавычка \\\" на экране\");");
        appendFooter();
    }
}
