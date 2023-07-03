package root.tasks.datetime;

import root.tasks.MultipleInputValLayout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task9418 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано расстояние в метрах и две отметки времени - начало и конец движения." +
                " Нужно вычислить скорость в м/с.");
        appendCheckValuesHeader("distance", "start", "end");
        appendCheckValuesRow("7000", "2023-06-28 17:30:00", "2023-06-28 18:00:00");
        appendCheckValuesRow("100", "2009-08-16 10:00:00", "2009-08-16 10:00:10");
        appendCheckValuesRow("5275970", "1961-04-12 09:07:00", "1961-04-12 09:18:07");
        appendCheckValuesRow("10000", "2023-06-01 16:00:00", "2023-06-01 15:00:00");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double distance = Double.parseDouble(args[0]);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(args[1], dtf);
        LocalDateTime end = LocalDateTime.parse(args[2], dtf);
        long seconds;
        if (end.isAfter(start)) {
            seconds = ChronoUnit.SECONDS.between(start, end);
        } else {
            seconds = ChronoUnit.SECONDS.between(end, start);
        }
        System.out.println("Между двумя датами прошло " + seconds + " секунд");
        double speed = distance / seconds;
        System.out.printf("Скорость получается %.4f м/с", speed);
    }

    public static void main(String[] args) {
        System.out.println(new Task9418());
    }
}
