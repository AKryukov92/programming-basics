package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class TaskJava8691 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст.");
        appendCheckSingleNonEscaped("{ \"x\":15, \"y\": 28.7 }");
        appendTaskDescNonEscaped("Компьютер определяет начало и конец сообщения по двойным кавычкам <zoom>&quot;</zoom>. Из за того, что кавычки одинаковы, любая первая будет значить начало литерала, а следующая - конец литерала. Если будет третья - она будет значить начало нового строкового литерала. Поэтому для вывода на экран одного символа \" нужно написать комбинацию символов <zoom>\\\"</zoom>. Это один из спецсимволов.");
        appendTaskDescEscaped("Спецсимволы - комбинации символов, которые начинаются с обратного слеша и обозначают какой-то особенный символ.");
        appendTaskDescEscaped("Если вы не написали комбинацию символов \\\" там где нужно напечатать кавычку, то ошибки будут такими:");
        appendCheckSingleNonEscaped("System.out.println(\"{ \"x\":15, \"y\": 28.7 }\");");
        resetOrdered();
        appendOrderedEscaped(
                "')' expected",
                "not a statement",
                "';' expected"
        );
        appendTaskDescEscaped("Нужно оформить по аналогии:");
        appendCheckSingleNonEscaped("System.out.println(\"одинокая кавычка \\\" на экране\");");
        appendFooter();
    }
}
