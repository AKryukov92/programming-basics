package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task7150 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит неизвестное количество чисел. Если текущее число больше чем предыдущее, вывести 'ВВЕРХ'. Иначе вывести 'ВНИЗ'. Если 'ВВЕРХ' написано три раза подряд, то дополнительно вывести 'ПОТОЛОК'. Если 'ВНИЗ' написано четыре раза подряд, то дополнительно вывести 'ДНО'.");
        appendCheckValuesHeader();
        appendCheckValuesRow("0,1,2,3,4,2,1,0".split(","));
        appendCheckValuesRow("9,8,7,6,5,6,5".split(","));
        appendCheckValuesRow("10,11,12,13,14".split(","));
        appendCheckValuesRow("9,1,8,2,7,3,6,5".split(","));
        appendCheckValuesRow("0,0,0,0,0,0".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int current = Integer.parseInt(s.next());
        System.out.println(current);
        int downCnt = 1;
        int upCnt = 1;
        while (s.hasNext()) {
            double prev = current;
            current = Integer.parseInt(s.next());
            System.out.println(current);
            if (prev < current) {
                System.out.println("ВВЕРХ");
                upCnt++;
                downCnt = 1;
            } else {
                System.out.println("ВНИЗ");
                upCnt = 1;
                downCnt++;
            }
            if (upCnt > 3) {
                System.out.println("ПОТОЛОК");
            }
            if (downCnt > 4) {
                System.out.println("ДНО");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7150());
    }
}
