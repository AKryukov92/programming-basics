package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task7595 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Нужно вычислить сумму этих чисел. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("");
        appendCheckValuesRow("1<br>" +
                "20<br>" +
                "300<br>" +
                "4000<br>" +
                "50000"
        );
        appendCheckValuesRow("11<br>" +
                "19<br>" +
                "7<br>" +
                "1<br>" +
                "3<br>" +
                "20<br>" +
                "7<br>" +
                "12<br>" +
                "4"
        );
        appendCheckValuesRow("8<br>" +
                "-9<br>" +
                "3<br>" +
                "14<br>" +
                "11<br>" +
                "14<br>" +
                "14<br>" +
                "-4<br>" +
                "2"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split("<br>");
        Iterator<String> itr = Arrays.stream(arr).iterator();
        int sum = 0;
        System.out.println("Изначальная сумма равна " + sum);
        while (itr.hasNext()) {
            String current = itr.next();
            int x = Integer.parseInt(current);
            System.out.println("К значению " + sum + " прибавляем " + x);
            sum += x;
            System.out.println("Получается " + sum);
        }
    }
}
