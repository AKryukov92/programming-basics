package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task5792 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст");
        appendCheckSingle("&lt;h1&gt;Мой первый векторный рисунок&lt;/h1&gt;\n" +
                "\n" +
                "&lt;svg width=\"800\" height=\"600\"&gt;\n" +
                "    &lt;circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
                "        stroke-width=\"4\" fill=\"yellow\"/&gt;\n" +
                "&lt;/svg>&gt;");
        appendFooter();
    }
}
