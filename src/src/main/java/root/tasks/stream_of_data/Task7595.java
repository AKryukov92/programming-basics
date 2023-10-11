package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task7595 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество чисел. Нужно вычислить сумму этих чисел. Программа сама не заканчивается. Её нужно закрывать вручную.");
        appendCheckValuesHeader();
        appendCheckValuesRow("1,20,300,4000,50000".split(","));
        appendCheckValuesRow("11,19,7,1,3,20,7,12,4".split(","));
        appendCheckValuesRow("8,-9,3,14,11,14,14,-4,2".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int sum = 0;
        System.out.println("Изначальная сумма равна " + sum);
        while (s.hasNext()) {
            String current = s.next();
            int x = Integer.parseInt(current);
            System.out.println("К значению " + sum + " прибавляем " + x);
            sum += x;
            System.out.println("Получается " + sum);
        }
    }
}
