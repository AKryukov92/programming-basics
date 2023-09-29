package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Task1845 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество целых чисел. Если число больше 100, нужно написать на экране 'БОЛЬШОЕ'. Если число меньше 20, нужно написать 'МАЛЕНЬКОЕ'. Программа должна завершиться, когда пользователь введёт число меньше или равное нулю.");
        appendCheckValuesHeader();
        appendCheckValuesRow("99,100,-100".split(","));
        appendCheckValuesRow("17,117,60,10,138,-46".split(","));
        appendCheckValuesRow("41,17,138,35,-17".split(","));
        appendCheckValuesRow("17,55,1,127,2,93,125,15,-9".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        String tmp = s.next();
        int x = Integer.parseInt(tmp);
        while (x > 0) {
            System.out.println("Пользователь ввёл " + tmp);
            if (x > 100) {
                System.out.println("БОЛЬШОЕ");
            }
            if (x < 20) {
                System.out.println("МАЛЕНЬКОЕ");
            }
            tmp = s.next();
            x = Integer.parseInt(tmp);
        }
        System.out.println("Число " + x + " не больше 0, завершаю программу");
    }

    public static void main(String[] args) {
        System.out.println(new Task1845());
    }
}
