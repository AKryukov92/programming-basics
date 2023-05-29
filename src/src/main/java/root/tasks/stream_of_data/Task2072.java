package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task2072 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество чисел. Нужно вывести эти числа на экран с номером по порядку начиная с 0. Когда пользователь ввёл число 10, нужно написать 'СЧИТАЕМ ЗАНОВО'. После этого нумерация должна снова начаться с 0. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
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
                "9",
                "-1"
        );
        appendCheckValuesRow(
                "20",
                "10",
                "18",
                "17",
                "16",
                "15",
                "0"
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
                "10",
                "0"
        );
        appendCheckValuesRow("0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int i = 0;
        int current = Integer.parseInt(source.next());
        while(current > 0) {
            System.out.println("Число № " + i + " равно " + current);
            i++;
            if (current == 10) {
                System.out.println("СЧИТАЕМ ЗАНОВО");
                i = 0;
            }
            current = Integer.parseInt(source.next());
        }
        System.out.println("Число " + current + " не больше 0, завершаю программу");
    }

    public static void main(String[] args) {
        System.out.println(new Task2072().getContent());
    }
}
