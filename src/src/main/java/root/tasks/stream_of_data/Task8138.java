package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task8138 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество целых чисел. Нужно вывести на экран значение введенного числа и значение предыдущего чисал.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("78<br>" +
                "71<br>" +
                "85<br>" +
                "61<br>" +
                "87<br>" +
                "73<br>" +
                "96<br>" +
                "87<br>" +
                "92"
        );
        appendCheckValuesRow("86<br>" +
                "84<br>" +
                "68<br>" +
                "86<br>" +
                "85<br>" +
                "79<br>" +
                "87<br>" +
                "83<br>" +
                "67"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split("<br>");
        Iterator<String> itr = Arrays.stream(arr).iterator();
        String prev;
        String current = itr.next();
        System.out.println("Предыдущее отсутствует. Текущее " + current);
        prev = current;

        while (itr.hasNext()) {
            current = itr.next();
            System.out.println("Предыдущее "+ prev + ". Текущее " + current);
            prev = current;
        }
    }
}
