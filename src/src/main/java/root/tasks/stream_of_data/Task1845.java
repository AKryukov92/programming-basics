package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task1845 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Если число больше 20, нужно написать на экране 'БОЛЬШОЕ'. Если число меньше 0, нужно написать 'МАЛЕНЬКОЕ'. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader();
        appendCheckValuesRow(
                "-7",
                "17",
                "20",
                "0",
                "38",
                "-46"
        );
        appendCheckValuesRow(
                "11",
                "17",
                "38",
                "-35",
                "-17"
        );
        appendCheckValuesRow(
                "-7",
                "15",
                "-1",
                "27",
                "-2",
                "13",
                "25",
                "15",
                "9"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        while (source.hasNext()) {
            String tmp = source.next();
            int x = Integer.parseInt(tmp);
            System.out.println("Пользователь ввёл " + tmp);
            if (x > 20) {
                System.out.println("БОЛЬШОЕ");
            }
            if (x < 0) {
                System.out.println("МАЛЕНЬКОЕ");
            }
        }
    }
}
