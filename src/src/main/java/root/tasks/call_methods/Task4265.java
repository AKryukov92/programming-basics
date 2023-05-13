package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class Task4265 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Пользователь вводит строчку." +
                " Если она начинается с символа \"s\", то нужно сделать все символы строчными (преобразовать в нижний регистр)." +
                " Если начинается с \"U\", то нужно сделать все символы заглавными (преобразовать в верхний регистр)." +
                " Иначе - ничего не делать. Вывести результат на экран." +
                " Примените метод toUpperCase <a href='https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toUpperCase--' target='_blank'>(открыть справку в новой вкладке)</a>. и toLowerCase <a href='https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--' target='_blank'>(открыть справку в новой вкладке)</a>");
        appendCheckValuesHeader("string");
        appendCheckValuesRow("sABCDU");
        appendCheckValuesRow("Uxyzs");
        appendCheckValuesRow("s");
        appendCheckValuesRow("F123");
        appendCheckValuesRow("Sopqr");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.indexOf("s") == 0) {
            System.out.println("Индекс буквы s равен 0. Значит всю строку нужно сделать строчной.");
            System.out.println(value.toLowerCase());
        } else if (value.indexOf("U") == 0) {
            System.out.println("Индекс буквы U равен 0. Значит всю строку нужно сделать заглавной.");
            System.out.println(value.toUpperCase());
        }
    }
}
