package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaskCs9425 extends OneInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано несколько дат в виде текста." +
                " Выбрать правильный формат чтобы программа прочитала дату."+
                " Вывести на экран отдельно день, месяц и год, час, минуту, секунду.");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendTaskDescEscaped("Пример преобразования даты из текста в DateTime:");
        appendCheckSingleNonEscaped(getMain(getClass().getSimpleName()));
    }

    private static class Verbose {
    protected void logic(String value) {
        String yMd = "yyyy-MM-dd";
        String str1 = "2023-06-28";
        LocalDate dt1 = LocalDate.parse(str1, DateTimeFormatter.ofPattern(yMd));
        System.out.println("Выражение " + str1 + " означает");
        System.out.println("Год: " + dt1.getYear());
        System.out.println("Месяц: " + dt1.getMonthValue());
        System.out.println("День: " + dt1.getDayOfMonth());

        String yMdhm = "yyyy-MM-dd HH:mm";
        String str2 = "2023-06-28 18:38";
        LocalDateTime dt2 = LocalDateTime.parse(str2, DateTimeFormatter.ofPattern(yMdhm));
        System.out.println("Выражение " + str2 + " означает");
        System.out.println("Год: " + dt2.getYear());
        System.out.println("Месяц: " + dt2.getMonthValue());
        System.out.println("День: " + dt2.getDayOfMonth());
        System.out.println("Час: " + dt2.getHour());
        System.out.println("Минута: " + dt2.getMinute());
        System.out.println("Секунда: " + dt2.getSecond());
    }
    }

    @Override
    protected void logic(String value) {
        String yMd = "yyyy-MM-dd";
        String yMdhm = "yyyy-MM-dd HH:mm";
        String dMyhms = "dd/MM/yyyy HH:mm:ss";
        String dmy = "d/M/yy";
        String hmdMy = "HH:mm dd.MM.yyyy";
        String str1 = "2023-06-28";
        LocalDate dt1 = LocalDate.parse(str1, DateTimeFormatter.ofPattern(yMd));
        System.out.println("Выражение " + str1 + " означает");
        System.out.println("Год: " + dt1.getYear());
        System.out.println("Месяц: " + dt1.getMonthValue());
        System.out.println("День: " + dt1.getDayOfMonth());

        String str2 = "2023-06-28 18:38";
        LocalDateTime dt2 = LocalDateTime.parse(str2, DateTimeFormatter.ofPattern(yMdhm));
        System.out.println("Выражение " + str2 + " означает");
        System.out.println("Год: " + dt2.getYear());
        System.out.println("Месяц: " + dt2.getMonthValue());
        System.out.println("День: " + dt2.getDayOfMonth());
        System.out.println("Час: " + dt2.getHour());
        System.out.println("Минута: " + dt2.getMinute());
        System.out.println("Секунда: " + dt2.getSecond());

        String str3 = "28/06/2023 18:38:00";
        LocalDateTime dt3 = LocalDateTime.parse(str3, DateTimeFormatter.ofPattern(dMyhms));
        System.out.println("Выражение " + str3 + " означает");
        System.out.println("Год: " + dt3.getYear());
        System.out.println("Месяц: " + dt3.getMonthValue());
        System.out.println("День: " + dt3.getDayOfMonth());
        System.out.println("Час: " + dt3.getHour());
        System.out.println("Минута: " + dt3.getMinute());
        System.out.println("Секунда: " + dt3.getSecond());

        String str4 = "3/4/23";
        LocalDate dt4 = LocalDate.parse(str4, DateTimeFormatter.ofPattern(dmy));
        System.out.println("Выражение " + str4 + " означает");
        System.out.println("Год: " + dt4.getYear());
        System.out.println("Месяц: " + dt4.getMonthValue());
        System.out.println("День: " + dt4.getDayOfMonth());

        String str5 = "18:44 28.06.2023";
        LocalDateTime dt5 = LocalDateTime.parse(str5, DateTimeFormatter.ofPattern(hmdMy));
        System.out.println("Выражение " + str5 + " означает");
        System.out.println("Год: " + dt5.getYear());
        System.out.println("Месяц: " + dt5.getMonthValue());
        System.out.println("День: " + dt5.getDayOfMonth());
        System.out.println("Час: " + dt5.getHour());
        System.out.println("Минута: " + dt5.getMinute());
        System.out.println("Секунда: " + dt5.getSecond());

        String str6 = "1995-03-01";
        LocalDate dt6 = LocalDate.parse(str6, DateTimeFormatter.ofPattern(yMd));
        System.out.println("Выражение " + str6 + " означает");
        System.out.println("Год: " + dt6.getYear());
        System.out.println("Месяц: " + dt6.getMonthValue());
        System.out.println("День: " + dt6.getDayOfMonth());
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs9425());
    }
}
