package root.tasks.stream_of_data;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task2368 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число N. Если N меньше 0, нужно вывести соощение об ошибке. Затем пользователь вводит еще N штук чисел. Вычислить сумму введенных чисел. Программа должна вывести сумму и завершиться самостоятельно.");
        appendCheckValuesHeader();
        appendCheckValuesRow("3,3,-15,0".split(","));
        appendCheckValuesRow("1", "1000");
        appendCheckValuesRow("5,-13,12,13,7,3".split(","));
        appendCheckValuesRow("0", "");
        appendCheckValuesRow("4,-7,-5,-13,12".split(","));
        appendCheckValuesRow("-3", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int n = Integer.parseInt(s.next());
        if (n < 0) {
            System.out.println("Значение N должно быть больше 0.");
        }
        if (n == 0) {
            System.out.println("Итоговая сумма равна 0");
        }
        if (n > 0) {
            int sum = 0;
            int i = 0;
            while (i < n && s.hasNext()) {
                String current = s.next();
                int x = Integer.parseInt(current);
                sum += x;
                i = i + 1;
            }
            System.out.println("Итоговая сумма равна " + sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2368());
    }
}