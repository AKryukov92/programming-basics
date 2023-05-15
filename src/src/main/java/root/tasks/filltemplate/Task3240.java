package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task3240 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст. Для вывода каждого символа \\ вам нужно написать спецсимвол \\\\ то есть символ \\ дважды.");
        appendCheckSingleNonEscaped(" /\\\n" +
                "//\\\\\n" +
                "//\\\\\n" +
                " ][");
        appendFooter();
    }
}
