package root.tasks.datetime;

import root.tasks.TwoInputValLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3696 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит дату и число. Определить какая дата получится если прибавить указанное количество дней к исходной дате.");
        appendCheckValuesHeader("date", "days");
        appendCheckValuesRow("07/08/2023", "40");
        appendCheckValuesRow("31/12/2023", "4");
        appendCheckValuesRow("15/02/2013", "14");
        appendCheckValuesRow("15/02/2012", "14");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(firstValue, fmt);
        int days = Integer.parseInt(secondValue);
        LocalDate shifted = date.plusDays(days);
        System.out.println("При смещении " + firstValue + " на " + secondValue + " дней ");
        System.out.println("получается дата " + shifted.format(fmt));
    }

    public static void main(String[] args) {
        System.out.println(new Task3696());
    }
}
