package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Iterator;
import java.util.Scanner;

public class Task8731 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Прием данных прекращается, когда сумма введенных чисел становится больше 1000. Вывести количество суммированных чисел.\n");
        appendCheckValuesHeader();
        appendCheckValuesRow("501;501".split(";"));
        appendCheckValuesRow("0;0;1001".split(";"));
        appendCheckValuesRow("400;400;200;1".split(";"));
        appendCheckValuesRow("190;190;190;190;190;190;190;190;190;190".split(";"));
        appendCheckValuesRow("130;130;130;130;130;130;130;130;130;130".split(";"));
        appendCheckValuesRow("129;179;89;155;188;163;94;66;84;151;109;65;83".split(";"));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        int sum = 0;
        int count = 0;
        int current;
        while (sum <= 1000) {
            current = Integer.parseInt(source.next());
            sum += current;
            System.out.println("Накопленная сумма " + sum);
            count++;
            System.out.println("Было введено " + count + " чисел");
        }
        System.out.println("Всего было введено: " + count + " чисел");
    }

    public static void main(String[] args) {
        System.out.println(new Task8731());
    }
}
