package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task7920 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст одной командой печати. Для переноса строки используйте спецсимвол \\n");
        appendCheckSingle("  *\n  *\n*****\n  *\n  *");
        appendFooter();
    }
}
