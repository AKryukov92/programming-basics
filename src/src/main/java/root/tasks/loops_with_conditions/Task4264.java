package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task4264 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число N. Программа должна вывести на экран два столбика чисел. В первом должны быть числа от 0 до N включительно. Определите закономерность в значениях второго столбика по тестовым примерам и реализуйте программу.");
        appendCheckValuesHeader("N");
        appendCheckValuesRow("7");
        appendCheckValuesRow("12");
        appendCheckValuesRow("2");
        appendCheckValuesRow("9");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int n = Integer.parseInt(value);
        if (n < 0) {
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }
        int i = 0;
        int y = 0;
        while (i <= n) {
            System.out.println(i + " - " + y);
            i++;
            if (y < 3) {
                y++;
            } else {
                y = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4264());
    }
}
