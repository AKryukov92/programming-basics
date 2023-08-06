package root.tasks.datetime;

import root.tasks.TwoInputValLayout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task3123 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано две отметки времени." +
                " Нужно вычислить количество часов, минут секунд между ними." +
                " Для определения количества минут в текущем часу, нужно найти остаток от деления общего количества минут на 60." +
                " Для определения количества секунд в текущей минуте нужно применить такой же прием.");
        appendCheckValuesHeader("firstDate", "secondDate");
        appendCheckValuesRow("03/07/2023 18:56:00", "03/07/2023 18:56:13");
        appendCheckValuesRow("03/07/2023 18:56:00", "03/07/2023 18:59:13");
        appendCheckValuesRow("03/07/2023 13:56:00", "03/07/2023 18:59:13");
        appendCheckValuesRow("03/07/2023 13:56:00", "03/07/2024 18:59:13");
        appendCheckValuesRow("28/06/2023 17:30:00", "28/06/2023 18:00:00");
        appendCheckValuesRow("16/08/2009 10:00:00", "16/08/2009 10:00:10");
        appendCheckValuesRow("12/04/1961 09:07:00", "12/04/1961 09:18:07");
        appendCheckValuesRow("01/06/2023 16:00:00", "01/06/2023 15:00:00");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        DateTimeFormatter dMyHms = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(firstValue, dMyHms);
        LocalDateTime end = LocalDateTime.parse(secondValue, dMyHms);
        long seconds, minutes, hours;
        if (end.isAfter(start)) {
            seconds = ChronoUnit.SECONDS.between(start, end);
            minutes = ChronoUnit.MINUTES.between(start, end);
            hours = ChronoUnit.HOURS.between(start, end);
        } else {
            seconds = ChronoUnit.SECONDS.between(end, start);
            minutes = ChronoUnit.MINUTES.between(end, start);
            hours = ChronoUnit.HOURS.between(end, start);
        }
        System.out.println("Между датами прошло " + hours + " часов");
        System.out.println("Всего минут " + minutes + ". В текущем часе " + minutes % 60);
        System.out.println("Всего секунд " + seconds + ". В текущей минуте " + seconds % 60);
    }

    public static void main(String[] args) {
        System.out.println(new Task3123());
    }
}
