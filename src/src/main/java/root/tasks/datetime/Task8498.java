package root.tasks.datetime;

import root.tasks.TwoInputValLayout;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8498 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит две даты." +
                " Определить, совпадают ли дни недели у этих дат.");
        appendCheckValuesHeader("firstDate", "secondDate");
        appendCheckValuesRow("2023-07-03", "2023-08-13");
        appendCheckValuesRow("2023-08-14", "2023-08-07");
        appendCheckValuesRow("2023-01-01", "2022-01-01");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outFmt = DateTimeFormatter.ofPattern("EEEE");
        LocalDate first = LocalDate.parse(firstValue, yMd);
        LocalDate second = LocalDate.parse(secondValue, yMd);
        DayOfWeek firstDow = first.getDayOfWeek();
        DayOfWeek secondDow = second.getDayOfWeek();
        if (firstDow == secondDow) {
            System.out.println("Дни недели совпадают и равны " + outFmt.format(first));
        } else {
            System.out.println("Дни недели различаются.");
            System.out.println("У первой даты " + outFmt.format(first));
            System.out.println("У второй даты " + outFmt.format(second));
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8498());
    }
}
