package root.tasks.datetime;

import root.tasks.TwoInputValLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task7480 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит две даты." +
                " Сравните даты. Определите какая позже, какая раньше." +
                " Напечатать подробный ответ на экран.");
        appendCheckValuesHeader("firstDate", "secondDate");
        appendCheckValuesRow("28.06.2023", "20.06.2023");
        appendCheckValuesRow("20.06.2023", "28.06.2023");
        appendCheckValuesRow("01.07.2023", "07.01.2023");
        appendCheckValuesRow("05.02.2001", "05.02.2002");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate first = LocalDate.parse(firstValue, dmy);
        LocalDate second = LocalDate.parse(secondValue, dmy);
        if (first.isAfter(second)) {
            System.out.println("Первая дата позже второй");
        } else {
            System.out.println("Вторая дата позже первой");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7480());
    }
}
