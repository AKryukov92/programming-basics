package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task5901 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран текст");
        appendCheckSingle("Три девицы под окном\n" +
                "Пряли поздно вечерком.\n" +
                "\"Кабы я была царица, —\n" +
                "Говорит одна девица, —\n" +
                "То на весь крещеный мир\n" +
                "Приготовила б я пир\".\n" +
                "\"Кабы я была царица, —\n" +
                "Говорит ее сестрица, —\n" +
                "То на весь бы мир одна\n" +
                "Наткала я полотна\".\n" +
                "\"Кабы я была царица, —\n" +
                "Третья молвила сестрица, —\n" +
                "Я б для батюшки-царя\n" +
                "Родила богатыря\".");
        appendFooter();
    }
}
