package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task1845 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество целых чисел. Если число больше 20, нужно написать на экране 'БОЛЬШОЕ'. Если число меньше 0, нужно написать 'МАЛЕНЬКОЕ'. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("-7<br>" +
                "17<br>" +
                "20<br>" +
                "0<br>" +
                "38<br>" +
                "-46"
        );
        appendCheckValuesRow("11<br>" +
                "17<br>" +
                "38<br>" +
                "-35<br>" +
                "-17"
        );
        appendCheckValuesRow("-7<br>" +
                "15<br>" +
                "-1<br>" +
                "27<br>" +
                "-2<br>" +
                "13<br>" +
                "25<br>" +
                "15<br>" +
                "9"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split("<br>");
        Iterator<String> itr = Arrays.stream(arr).iterator();

        while (itr.hasNext()) {
            String tmp = itr.next();
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
