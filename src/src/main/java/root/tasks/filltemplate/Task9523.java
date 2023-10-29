package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task9523 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Выведите на экран текст." +
                " Найдите в Интернете код символа градуса в кодировке Unicode  перед буквой C." +
                " Код должен быть в шестнадцатеричной системе счисления." +
                " Напишите спецсимвол, который начинается с \\u и после него укажите код символа градуса." +
                " Например спецсимвол для знака <zoom>\u00A5</zoom> (йена) выглядит как <zoom>\\u00A5</zoom>");
        appendCheckSingleNonEscaped("Температура воздуха: 25\u00B0C");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task9523());
    }
}
