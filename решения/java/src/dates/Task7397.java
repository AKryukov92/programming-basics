package dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Task7397 {
    public static void main(String[] args) {
        System.out.println("Задача 7397");
        Date today = new Date();
        SimpleDateFormat dateWithTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Текущее время: " + dateWithTime.format(today));
        long todayUnix = today.getTime();
        System.out.println("Текущее unix-время: " + todayUnix);
        Instant todayInst = today.toInstant();
        Instant tomorrow = todayInst.plus(1, ChronoUnit.DAYS);
        Date tomorrowDate = Date.from(tomorrow);
        System.out.println("Время через 1 день: " + dateWithTime.format(tomorrowDate));
        long tomorrowUnix = tomorrowDate.getTime();
        System.out.println("Unix-время через 1 день: " + tomorrowUnix);
    }
}
