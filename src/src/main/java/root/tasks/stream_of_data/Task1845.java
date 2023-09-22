package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task1845 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Если число больше 100, нужно написать на экране 'БОЛЬШОЕ'. Если число меньше 20, нужно написать 'МАЛЕНЬКОЕ'. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
        appendCheckValuesHeader();
        appendCheckValuesRow("99", "100", "-100");
        appendCheckValuesRow(
                "17",
                "117",
                "60",
                "10",
                "138",
                "-46"
        );
        appendCheckValuesRow(
                "41",
                "17",
                "138",
                "35",
                "-17"
        );
        appendCheckValuesRow(
                "17",
                "55",
                "1",
                "127",
                "2",
                "93",
                "125",
                "15",
                "-9"
        );
        appendCheckValuesFooter();
        appendFooter();
        throw new RuntimeException("смещенный вывод");
    }

    @Override
    protected void logic(Iterator<String> source) {
        String tmp = source.next();
        int x = Integer.parseInt(tmp);
        while (x > 0) {
            System.out.println("Пользователь ввёл " + tmp);
            if (x > 100) {
                System.out.println("БОЛЬШОЕ");
            }
            if (x < 20) {
                System.out.println("МАЛЕНЬКОЕ");
            }
            tmp = source.next();
            x = Integer.parseInt(tmp);
        }
        System.out.println("Число " + x + " не больше 0, завершаю программу");
    }

    public static void main(String[] args) {
        System.out.println(new Task1845());
    }
}
