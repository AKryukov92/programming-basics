package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task1903 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество целых чисел. После ввода каждого из чисел, нужно прибавить к нему 7 и вывести на экран. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader();
        appendCheckValuesRow(
                "7",
                "12",
                "23",
                "-1",
                "0",
                "5"
        );
        appendCheckValuesRow(
                "14",
                "15",
                "4"
        );
        appendCheckValuesRow(
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1",
                "1"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        while (source.hasNext()) {
            String tmp = source.next();
            int x = Integer.parseInt(tmp);
            int result = x + 7;
            System.out.println("Пользователь ввёл " + tmp + " после прибавления 7 получается " + result);
        }
    }
}
