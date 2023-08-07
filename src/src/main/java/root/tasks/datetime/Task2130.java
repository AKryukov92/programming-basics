package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task2130 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит смещение по часовым поясам. Определить как изменится время 2023-06-28 18:27 по Гринвичу(UTC+00:00) при введенной пользователем таймзоне.");
        appendCheckValuesHeader("timezone");
        appendCheckValuesRow("UTC+01:00");
        appendCheckValuesRow("UTC+10:00");
        appendCheckValuesRow("UTC");
        appendCheckValuesRow("UTC-10:00");
        appendCheckValuesRow("Turkey");
        appendCheckValuesRow("Africa/Lubumbashi");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String base = "2023-06-28 18:27";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        ZonedDateTime utc = LocalDateTime.parse(base, fmt).atZone(ZoneId.of("UTC"));
        ZonedDateTime zoned = utc.withZoneSameInstant(ZoneId.of(value));
        System.out.println("Если время по Гринвичу равно " + base);
        System.out.println("то при таймзоне " + value + " время будет равно " + zoned.format(fmt));
    }

    public static void main(String[] args) {
        System.out.println(new Task2130());
    }
}
