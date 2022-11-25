package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

import java.util.Arrays;
import java.util.Iterator;

public class Task2072 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Нужно вывести эти числа на экран с номером по порядку начиная с 0. После каждого третьего нужно вывести 'СЧИТАЕМ ЗАНОВО'. После этого нумерация должна снова начаться с 0. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1<br>" +
                "1"
        );
        appendCheckValuesRow("-24<br>" +
                "-1<br>" +
                "-1<br>" +
                "-48<br>" +
                "-47<br>" +
                "-47"
        );
        appendCheckValuesRow("-47<br>" +
                "15<br>" +
                "18<br>" +
                "-20<br>" +
                "44<br>" +
                "-13<br>" +
                "16<br>" +
                "12<br>" +
                "23<br>" +
                "-15"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split("<br>");
        Iterator<String> itr = Arrays.stream(arr).iterator();
        int i = 0;
        while (itr.hasNext()) {
            String current = itr.next();
            System.out.println("Число № " + i + " равно " + current);
            i++;
            if (i == 3) {
                System.out.println("СЧИТАЕМ ЗАНОВО");
                i = 0;
            }
        }
    }
}
