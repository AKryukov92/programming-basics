package root.tasks.datetime;

import root.tasks.MultipleInputValLayout;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task8811 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит три даты: start, end, appointment." +
                " Если appointment после start и до end исключительно, написать фразу 'ДАТА В ПЕРИОДЕ'." +
                " В любом другом случае написать - 'ДАТА ЗА ПРЕДЕЛАМИ'");
        appendCheckValuesHeader("start", "end", "appointment");
        appendCheckValuesRow("2023-07-01", "2023-08-01", "2023-01-01");
        appendCheckValuesRow("2023-07-01", "2023-07-31", "2023-07-15");
        appendCheckValuesRow("2023-07-01", "2023-08-01", "2023-01-01");
        appendCheckValuesRow("2023-07-01", "2024-06-01", "2024-01-01");
        appendCheckValuesRow("2023-01-15", "2023-02-05", "2023-01-19");
        appendCheckValuesRow("2023-01-01", "2020-01-01", "2020-01-01");
        appendCheckValuesRow("2023-07-26", "2023-07-26", "2023-07-26");
        appendCheckValuesRow("2023-07-26", "2023-08-01", "2023-07-26");
        appendCheckValuesRow("2023-06-01", "2023-07-26", "2023-07-26");
        appendCheckValuesFooter();
        appendFooter();

    }

    @Override
    protected void logic(String... args) {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(args[0], yMd);
        LocalDate end = LocalDate.parse(args[1], yMd);
        LocalDate appointment = LocalDate.parse(args[2], yMd);
        if (appointment.isAfter(start) && end.isAfter(appointment)) {
            System.out.println("ДАТА В ПЕРИОДЕ");
        } else {
            System.out.println("ДАТА ЗА ПРЕДЕЛАМИ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8811());
    }
}
