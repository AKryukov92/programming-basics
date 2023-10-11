package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task8138 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Нужно вывести на экран значение введенного числа и значение предыдущего числа. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("78,71,85,61,87,73,96,87,-92".split(","));
        appendCheckValuesRow("86,84,68,86,85,79,87,83,-67".split(","));
        appendCheckValuesRow("-5");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int prev;
        int current = Integer.parseInt(s.next());
        System.out.println("Текущее " + current + ". Предыдущее отсутствует.");
        prev = current;

        while (current >= 0) {
            current = Integer.parseInt(s.next());
            System.out.println("Текущее " + current + ". Предыдущее " + prev);
            prev = current;
        }
        System.out.println("Число " + current + " не больше 0, завершаю программу");
    }

    protected void alternative(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int even = Integer.parseInt(s.next());
        int odd;
        System.out.println("Текущее " + even + ". Предыдущее отсутствует.");
        odd = Integer.parseInt(s.next());
        System.out.println("Текущее " + odd + ". Предыдущее " + even);
        while (s.hasNext()) {
            even = Integer.parseInt(s.next());
            System.out.println("Текущее " + even + ". Предыдущее" + odd);
            if (s.hasNext()) {
                odd = Integer.parseInt(s.next());
                System.out.println("Текущее " + odd + ". Предыдущее " + even);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8138());
    }
}
