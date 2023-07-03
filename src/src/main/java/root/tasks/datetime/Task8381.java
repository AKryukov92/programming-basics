package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8381 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит дату." +
                " Нужно напечатать даты пяти дней до указанной и пяти дней после указанной.");
        appendCheckValuesHeader("date");
        appendCheckValuesRow("05.07.2023");
        appendCheckValuesRow("28.02.2023");
        appendCheckValuesRow("29.02.2020");
        appendCheckValuesRow("01.01.2010");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        DateTimeFormatter dMy = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate current = LocalDate.parse(value, dMy);
        int i = 5;
        while (i > 0) {
            LocalDate temp = current.minusDays(i);
            System.out.println("Минус " + i + " дней " + dMy.format(temp));
            i--;
        }
        i++;
        while (i <= 5) {
            LocalDate temp = current.plusDays(i);
            System.out.println("Плюс " + i + " дней " + dMy.format(temp));
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8381());
    }
}
