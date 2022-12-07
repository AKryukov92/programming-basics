package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task7595 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Нужно вычислить сумму этих чисел. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("");
        appendCheckValuesRow(
                "1",
                "20",
                "300",
                "4000",
                "50000"
        );
        appendCheckValuesRow(
                "11",
                "19",
                "7",
                "1",
                "3",
                "20",
                "7",
                "12",
                "4"
        );
        appendCheckValuesRow(
                "8",
                "-9",
                "3",
                "14",
                "11",
                "14",
                "14",
                "-4",
                "2"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int sum = 0;
        System.out.println("Изначальная сумма равна " + sum);
        while (source.hasNext()) {
            String current = source.next();
            int x = Integer.parseInt(current);
            System.out.println("К значению " + sum + " прибавляем " + x);
            sum += x;
            System.out.println("Получается " + sum);
        }
    }
}
