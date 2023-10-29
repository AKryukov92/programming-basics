package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task7920 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Выведите на экран текст одной командой печати. Для переноса строки используйте спецсимвол <zoom>\\n</zoom>");
        appendCheckSingleNonEscaped("  *\n  *\n*****\n  *\n  *");
        appendFooter();
    }
}
