package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task8519 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дана дата по Омску(UTC+06:00). Определить сколько времени будет в Москве(UTC+03:00), Новосибирске(UTC+07:00), Лондоне (UTC+01:00), на Кубе (UTC-05:00), в Непале (UTC+05:45)");
        appendCheckValuesHeader("date");
        appendCheckValuesRow("18:16 07.08.2023");
        appendCheckValuesRow("23:11 28.06.2023");
        appendCheckValuesRow("04:35 02.09.2015");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        LocalDateTime noZone = LocalDateTime.parse(value, fmt);
        ZonedDateTime omsk = noZone.atZone(ZoneId.of("UTC+06:00"));
        ZonedDateTime nsk = omsk.withZoneSameInstant(ZoneId.of("UTC+07:00"));
        ZonedDateTime moscow = omsk.withZoneSameInstant(ZoneId.of("UTC+03:00"));
        ZonedDateTime lond = omsk.withZoneSameInstant(ZoneId.of("UTC+01:00"));
        ZonedDateTime cuba = omsk.withZoneSameInstant(ZoneId.of("UTC-05:00"));
        ZonedDateTime nepal = omsk.withZoneSameInstant(ZoneId.of("UTC+05:45"));
        System.out.println("Когда в Омске " + omsk.format(fmt));
        System.out.println("в Новосибирске " + nsk.format(fmt));
        System.out.println("в Москве " + moscow.format(fmt));
        System.out.println("в Лондоне " + lond.format(fmt));
        System.out.println("на Кубе " + cuba.format(fmt));
        System.out.println("в Непале " + nepal.format(fmt));
    }

    public static void main(String[] args) {
        System.out.println(new Task8519());
    }
}
