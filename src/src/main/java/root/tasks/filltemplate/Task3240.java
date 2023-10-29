package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task3240 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Выведите на экран текст. Для вывода каждого символа <zoom>\\</zoom> вам нужно написать спецсимвол <zoom>\\\\</zoom> то есть символ <zoom>\\</zoom> дважды. Для того, чтобы напечатать на экран три символа <zoom>\\</zoom>, нужно было бы написать шесть символов \\ в коде.");
        appendCheckSingleNonEscaped(" /\\\n" +
                "//\\\\\n" +
                "//\\\\\n" +
                " ][");
        appendFooter();
    }
}
