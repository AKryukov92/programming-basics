package Lab14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Runner8240 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstString = s.nextLine();
        long secondUnix = s.nextLong();
        TimeZone utc = TimeZone.getTimeZone("UTC");
        SimpleDateFormat dateWithTime = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        dateWithTime.setTimeZone(utc);
        try {
            Date firstDate = dateWithTime.parse(firstString);
            Date secondDate = new Date(secondUnix);
            System.out.println(firstString + " это " + firstDate.getTime());
            System.out.println(secondUnix + " это " + dateWithTime.format(secondDate));
            if (secondUnix > firstDate.getTime()) {
                System.out.println("Вторая дата позже, чем первая.");
            } else if (secondUnix < firstDate.getTime()) {
                System.out.println("Первая дата позже, чем вторая.");
            } else {
                System.out.println("Даты равны.");
            }
        } catch (ParseException e) {
            System.out.println("Первая дата была введена в некорректном формате");
        }
    }
}
