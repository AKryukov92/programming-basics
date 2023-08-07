package root.tasks.datetime;

import root.tasks.OneInputValLayout;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1912 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит время. Нужно определить какой прием пищи следующий. Завтрак идет с 8:00 до 9:00. Обед идет с 13:00 до 14:00. Ужин идет с 18:30 до 19:15.");
        appendCheckValuesHeader("currentTime");
        appendCheckValuesRow("06:00");
        appendCheckValuesRow("08:30");
        appendCheckValuesRow("10:00");
        appendCheckValuesRow("13:15");
        appendCheckValuesRow("16:00");
        appendCheckValuesRow("19:00");
        appendCheckValuesRow("23:00");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currentTime = LocalTime.parse(value, fmt);
        LocalTime breakfastStart = LocalTime.parse("08:00");
        LocalTime breakfastEnd = LocalTime.parse("09:00");
        LocalTime lunchStart = LocalTime.parse("13:00");
        LocalTime lunchEnd = LocalTime.parse("14:00");
        LocalTime dinnerStart = LocalTime.parse("18:30");
        LocalTime dinnerEnd = LocalTime.parse("19:15");
        if (breakfastStart.isAfter(currentTime)) {
            System.out.println("Следующий прием пищи - завтрак");
        } else if(breakfastEnd.isAfter(currentTime)) {
            System.out.println("Завтрак еще не закончился");
        } else  if (lunchStart.isAfter(currentTime)) {
            System.out.println("Следующий прием пищи - обед");
        } else if(lunchEnd.isAfter(currentTime)) {
            System.out.println("Обед еще не закончился");
        } else if (dinnerStart.isAfter(currentTime)) {
            System.out.println("Следующий прием пищи - ужин");
        } else if(dinnerEnd.isAfter(currentTime)) {
            System.out.println("Ужин еще не закончился");
        } else if (currentTime.isAfter(dinnerEnd)) {
            System.out.println("Следующий прием пищи - завтрак");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1912());
    }
}
