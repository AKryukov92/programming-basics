package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class Task8543 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит дату в формате hh:mm dd.MM.yyyy, где");
        appendOrderedNonEscaped(
                "hh - номер часа в дне в 24 часовом формате",
                "mm - номер минуты в часу",
                "dd - номер дня в месяце",
                "MM - номер месяца в году",
                "yyyy - номер года"
        );
        appendTaskDescEscaped("Извлечь из строки все фрагменты даты и подробно описать что означает дата. Используйте методы indexOf и substring.");
        appendCheckValuesHeader("datetime");
        appendCheckValuesRow("19:39 16.11.2016");
        appendCheckValuesRow("0:0 1.1.1970");
        appendCheckValuesRow("19:23 14.4.2023");
        appendCheckValuesRow("14:39 9.10.2015");
        appendCheckValuesRow("0:51 23.4.2016");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String datetime) {
        int colonDelimiter = datetime.indexOf(":");
        String hour = datetime.substring(0, colonDelimiter);
        int timeDelimiter = datetime.indexOf(" ");
        String minute = datetime.substring(colonDelimiter + 1, timeDelimiter);
        int dayDelimiter = datetime.indexOf(".");
        String day = datetime.substring(timeDelimiter + 1, dayDelimiter);
        int monthDelimiter = datetime.indexOf(".", dayDelimiter + 1);
        String month = datetime.substring(dayDelimiter + 1, monthDelimiter);
        String year = datetime.substring(monthDelimiter + 1);
        System.out.println("Минута " + minute);
        System.out.println("Час " + hour);
        System.out.println("День " + day);
        System.out.println("Месяц " + month);
        System.out.println("Год " + year);
    }

    public static void main(String[] args) {
        System.out.println(new Task8543());
    }
}
