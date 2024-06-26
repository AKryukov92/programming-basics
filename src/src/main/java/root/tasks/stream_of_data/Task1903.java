package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task1903 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. После ввода каждого из чисел, нужно прибавить к нему 7 и вывести на экран. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
        appendCheckValuesHeader();
        appendCheckValuesRow("7,12,23,-7".split(","));
        appendCheckValuesRow("7,12,0".split(","));
        appendCheckValuesRow("14,15,4,-20".split(","));
        appendCheckValuesRow("1,1,1,1,1,1,1,1,1,1,1,-1".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        String tmp = s.next();
        int x = Integer.parseInt(tmp);
        while (x > 0) {
            int result = x + 7;
            System.out.println("Пользователь ввёл " + tmp + " после прибавления 7 получается " + result);
            tmp = s.next();
            x = Integer.parseInt(tmp);
        }
        System.out.println("Число " + x + " не больше 0, завершаю программу");
    }

    public static void main(String[] args) {
        System.out.println(new Task1903());
    }
}
