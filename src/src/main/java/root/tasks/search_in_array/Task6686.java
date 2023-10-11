package root.tasks.search_in_array;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task6686 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит 4 числа одно за другим. Нужно сравнить первое и второе число. Вывести наибольшее из них. Затем сравнить наибольшее и третье число. Вывести наибольшее. Затем сравнить наибольшее и четвертое число. Вывести итоговое наибольшее.");
        appendCheckValuesHeader();
        appendCheckValuesRow("1,2,3,4".split(","));
        appendCheckValuesRow("2,1,3,4".split(","));
        appendCheckValuesRow("2,3,1,4".split(","));
        appendCheckValuesRow("2,3,4,1".split(","));
        appendCheckValuesRow("3,2,1,4".split(","));
        appendCheckValuesRow("3,4,2,1".split(","));
        appendCheckValuesRow("4,1,2,3".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        int a = Integer.parseInt(source.next());
        int b = Integer.parseInt(source.next());
        int max;
        if (a > b) {
            System.out.println("Первое число больше второго. Максимум " + a);
            max = a;
        } else {
            System.out.println("Второе число больше первого. Максимум " + b);
            max = b;
        }
        int c = Integer.parseInt(source.next());
        if (c > max) {
            System.out.println("Третье число больше максимума. Новый максимум " + c);
            max = c;
        } else {
            System.out.println("Третье число меньше максимума. Максимум " + max);
        }
        int d = Integer.parseInt(source.next());
        if (d > max) {
            System.out.println("Четвертое число больше максимума. Новый максимум " + d);
            max = d;
        } else {
            System.out.println("Четвертое число меньше максимума. Максимум " + max);
        }
        System.out.println("Итоговый максимум " + max);
    }

    public static void main(String[] args) {
        System.out.println(new Task6686());
    }
}
