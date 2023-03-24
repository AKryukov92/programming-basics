package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task8138 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество целых чисел. Нужно вывести на экран значение введенного числа и значение предыдущего числа.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow(
                "78",
                "71",
                "85",
                "61",
                "87",
                "73",
                "96",
                "87",
                "92"
        );
        appendCheckValuesRow(
                "86",
                "84",
                "68",
                "86",
                "85",
                "79",
                "87",
                "83",
                "67"
        );
        appendCheckValuesFooter();
        appendFooter();
    }
    @Override
    protected void logic(Iterator<String> source) {
        String prev;
        String current = source.next();
        System.out.println("Текущее " + current + ". Предыдущее отсутствует.");
        prev = current;

        while (source.hasNext()) {
            current = source.next();
            System.out.println("Текущее " + current + ". Предыдущее "+ prev);
            prev = current;
        }
    }

    protected void alternative(Iterator<String> source) {
        String even = source.next();
        String odd;
        System.out.println("Текущее " + even + ". Предыдущее отсутствует.");
        odd = source.next();
        System.out.println("Текущее " + odd + ". Предыдущее "+ even);
        while(source.hasNext()) {
            even = source.next();
            System.out.println("Текущее " + even + ". Предыдущее" + odd);
            if (source.hasNext()) {
                odd = source.next();
                System.out.println("Текущее " + odd + ". Предыдущее " + even);
            }
        }
    }
}
