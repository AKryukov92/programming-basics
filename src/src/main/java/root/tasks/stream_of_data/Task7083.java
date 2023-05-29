package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task7083 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество чисел. Проверить каждое введенное число, попадает ли оно в интервал от 30 до 40 включительно. Вывести соответствующее сообщение. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
        appendCheckValuesHeader();
        appendCheckValuesRow(
                "100",
                "29",
                "39",
                "31",
                "35",
                "30",
                "40",
                "41",
                "57",
                "-8"
        );
        appendCheckValuesRow(
                "68",
                "17",
                "49",
                "16",
                "13",
                "37",
                "34",
                "24",
                "-26"
        );
        appendCheckValuesRow("-2");
        appendCheckValuesRow("100", "0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        String current = source.next();
        int x = Integer.parseInt(current);
        while (x > 0) {
            if (30 <= x && x <= 40) {
                System.out.println("Число " + x + " попадает в интервал от 30 до 40");
            } else {
                System.out.println("Число " + x + " за пределами интервала от 30 до 40");
            }
            current = source.next();
            x = Integer.parseInt(current);
        }
        System.out.println("Число " + x + " не больше 0, завершаю программу");
    }

    public static void main(String[] args) {
        System.out.println(new Task7083());
    }
}
