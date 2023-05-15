package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task8691 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст. Для вывода на экран одного символа \" нужно написать спецсимвол \\\"");
        appendCheckSingleNonEscaped("{ \"x\":15, \"y\": 28.7 }");
        appendFooter();
    }
}
