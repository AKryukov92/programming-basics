package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class TaskJava7920 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Выведите на экран текст одной командой печати. Для переноса строки используйте спецсимвол <zoom>\\n</zoom>");
        appendCheckSingleNonEscaped("  *\n  *\n*****\n  *\n  *");
        appendTaskDescEscaped("Если вы напишете такую команду:");
        appendCheckSingleNonEscaped("System.out.println(\"первая\\nвторая\");");
        appendTaskDescEscaped("то на экране появится");
        appendCheckSingleNonEscaped("первая\nвторая");
        appendFooter();
    }
    public static void main(String[] args) {
        System.out.println(new TaskJava7920());
    }
}
