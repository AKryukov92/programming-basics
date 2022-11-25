package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task7083 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Проверить каждое введенное число, попадает ли оно в интервал от 30 до 40 включительно. Вывести соответствующее сообщение. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("5<br>" +
                "27<br>" +
                "7<br>" +
                "18<br>" +
                "24<br>" +
                "19<br>" +
                "26<br>" +
                "14<br>" +
                "8"
        );
        appendCheckValuesRow("8<br>" +
                "17<br>" +
                "9<br>" +
                "16<br>" +
                "13<br>" +
                "7<br>" +
                "4<br>" +
                "24<br>" +
                "26<br>"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split("<br>");
        Iterator<String> itr = Arrays.stream(arr).iterator();

        while (itr.hasNext()) {
            String current = itr.next();
            int x = Integer.parseInt(current);
            if (30 <= x && x <= 40) {
                System.out.println("Число " + x + " попадает в интервал от 30 до 40");
            } else {
                System.out.println("Число " + x + " за пределами интервала от 30 до 40");
            }
        }
    }
}
