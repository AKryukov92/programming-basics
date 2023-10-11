package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task2324 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. При вводе числа \"0\", прием данных завершается. Вывести сумму и количество введенных чисел.");
        appendCheckValuesHeader();
        appendCheckValuesRow("5", "4", "3", "2", "1", "0");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-1", "-2", "0");
        appendCheckValuesRow("1,1,1,1,1,1,1,1,1,1,1,1,0".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int sum = 0, count = 0;
        int current = Integer.parseInt(s.next());
        while (current != 0 || s.hasNext()) {
            sum = sum + current;
            count = count + 1;
            current = Integer.parseInt(s.next());
        }
        System.out.println("Сумма чисел: " + sum + ", Количество чисел: " + count);
    }
}
