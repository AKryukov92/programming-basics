package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task1662 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDesc("Строковый литерал. <a href='https://learn.microsoft.com/ru-ru/cpp/c-language/c-string-literals?view=msvc-170'>Строковые литералы в C</a>." +
                " Это последовательность символов, которая начинается с двойной кавычки и заканчивается двойной кавычкой." +
                " Используется для оформления текста при печати на экран или других манипуляциях.");
        appendTaskHeader();
        appendTaskDesc("Выведите на экран текст");
        appendCheckSingle("+---+\n|   |\n|   |\n+---+");
        appendFooter();
    }
}
