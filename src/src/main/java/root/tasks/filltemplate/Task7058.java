package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task7058 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст");
        appendCheckSingleNonEscaped(" //\n" +
                "<--<\n" +
                " \\\\");
        appendFooter();
    }
}
