package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task2733 extends StreamInputLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит целые числа по одному. Если число больше 0, нужно умножить его на 3, вывести результат и завершить работу программы. " +
                "Если число меньше 0, нужно написать 'число должно быть больше 0', пропустить умножение и попросить пользователя ввести число заново. " +
                "Если число равно 0, нужно завершить работу программы.");
        appendCheckValuesHeader();
        appendCheckValuesRow("-4,-10,5".split(","));
        appendCheckValuesRow("41".split(","));
        appendCheckValuesRow("-1,0,1".split(","));
        appendCheckValuesRow("-20,-30,200".split(","));
        appendCheckValuesRow("-1,-2,-3,-4,-5,-6,7".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int current = Integer.parseInt(s.next());
        while (current <= 0) {
            System.out.println("Было введено " + current + ". Нужно ввести число больше 0.");
            current = Integer.parseInt(s.next());
        }
        int result = current * 3;
        System.out.println("Было введено " + current + ". Результат " + result);
    }

    public static void main(String[] args) {
        System.out.println(new Task2733());
    }
}
