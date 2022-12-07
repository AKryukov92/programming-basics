package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task7083 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Проверить каждое введенное число, попадает ли оно в интервал от 30 до 40 включительно. Вывести соответствующее сообщение. Программа сама не заканчивается. Её нужно закрывать вручную.");
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
                "8"
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
                "26"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        while (source.hasNext()) {
            String current = source.next();
            int x = Integer.parseInt(current);
            if (30 <= x && x <= 40) {
                System.out.println("Число " + x + " попадает в интервал от 30 до 40");
            } else {
                System.out.println("Число " + x + " за пределами интервала от 30 до 40");
            }
        }
    }
}
