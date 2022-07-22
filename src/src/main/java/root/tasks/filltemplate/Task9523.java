package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task9523 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст");
        appendCheckSingle("Температура воздуха: 25\u00B0C");
        appendFooter();
    }
}
