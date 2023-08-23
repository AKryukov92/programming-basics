package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task6059 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два числа: P и M. Нужно вывести на экран две строчки чисел. В первой строчке 10 чисел с шагом 1 начиная с P. Во второй строчку 10 чисел с шагом 1 начиная с M.");
        appendCheckValuesHeader("P", "M");
        appendCheckValuesRow("0", "50");
        appendCheckValuesRow("50", "0");
        appendCheckValuesRow("10", "10");
        appendCheckValuesRow("-11", "20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int p = Integer.parseInt(firstValue);
        int m = Integer.parseInt(secondValue);
        int i = p + 10;
        while (p < i) {
            System.out.print(p + " ");
            p++;
        }
        System.out.println();
        i = m + 10;
        while (m < i) {
            System.out.print(m + " ");
            m++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6059());
    }
}
