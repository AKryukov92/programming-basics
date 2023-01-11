package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task2072 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит неизвестное количество чисел. Нужно вывести эти числа на экран с номером по порядку начиная с 0. Когда пользователь ввёл число 10, нужно написать 'СЧИТАЕМ ЗАНОВО'. После этого нумерация должна снова начаться с 0. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow(
                "8",
                "9",
                "10",
                "5",
                "6",
                "7",
                "8",
                "10",
                "9"
        );
        appendCheckValuesRow(
                "20",
                "10",
                "18",
                "17",
                "16",
                "15"
        );
        appendCheckValuesRow(
                "10",
                "5",
                "10",
                "10",
                "4",
                "9",
                "1",
                "4",
                "3",
                "10"
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
            if (current.equals("10")) {
                System.out.println("СЧИТАЕМ ЗАНОВО");
                i = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2072().getContent());
    }
}
