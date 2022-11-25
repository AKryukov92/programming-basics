package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task1903 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество целых чисел. После ввода каждого из чисел, нужно прибавить к нему 7 и вывести на экран. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("7<br>" +
                "12<br>" +
                "23<br>" +
                "-1<br>" +
                "0<br>" +
                "5"
        );
        appendCheckValuesRow("14<br>" +
                "15<br>" +
                "4"
        );
        appendCheckValuesRow("1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1"
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
            int result = x + 7;
            System.out.println("Пользователь ввёл " + tmp + " после прибавления 7 получается " + result);
        }
    }
}
