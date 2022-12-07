package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task2072 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Нужно вывести эти числа на экран с номером по порядку начиная с 0. После каждого третьего нужно вывести 'СЧИТАЕМ ЗАНОВО'. После этого нумерация должна снова начаться с 0. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow(
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
        appendCheckValuesRow(
                "-24",
                "-1",
                "-1",
                "-48",
                "-47",
                "-47"
        );
        appendCheckValuesRow(
                "-47",
                "15",
                "18",
                "-20",
                "44",
                "-13",
                "16",
                "12",
                "23",
                "-15"
        );
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int i = 0;
        while (source.hasNext()) {
            String current = source.next();
            System.out.println("Число № " + i + " равно " + current);
            i++;
            if (i == 3) {
                System.out.println("СЧИТАЕМ ЗАНОВО");
                i = 0;
            }
        }
    }
}
