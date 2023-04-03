package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task3240 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст. Для вывода каждого символа \\ вам нужно написать спецсимвол \\\\ то есть символ \\ дважды.");
        appendCheckSingle(" /\\\n" +
                "//\\\\\n" +
                "//\\\\\n" +
                " ][");
        appendFooter();
    }
}
