package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task5321 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст");
        appendCheckSingle("#\n" +
                "##\n" +
                "###\n" +
                "####");
        appendFooter();
    }
}
