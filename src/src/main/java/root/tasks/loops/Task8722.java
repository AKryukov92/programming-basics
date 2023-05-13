package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task8722 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два целых числа: A и B. Выведите на экран два столбика чисел по возрастанию с шагом 1. В первом - от 0 до A. Во втором - от 0 до B. Если одно из введенных чисел меньше нуля, вывести сообщение об ошибке.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("2", "5");
        appendCheckValuesRow("5", "2");
        appendCheckValuesRow("3", "11");
        appendCheckValuesRow("11", "3");
        appendCheckValuesRow("20", "17");
        appendCheckValuesRow("17", "20");
        appendCheckValuesRow("0", "6");
        appendCheckValuesRow("6", "0");
        appendCheckValuesRow("-1", "3");
        appendCheckValuesRow("5", "-8");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        if (a < 0) {
            System.out.println("Значение A должно быть неотрицательно");
            return;
        }
        if (b < 0) {
            System.out.println("Значение B должно быть неотрицательно");
            return;
        }
        int i = 0;
        int n;
        if (a < b) {
            n = b;
        } else {
            n = a;
        }
        while (i <= n) {
            if (i <= a && i <= b) {
                System.out.println(i + "\t" + i);
            } else if (i > a) {
                System.out.println("\t" + i);
            } else {
                System.out.println(i);
            }
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8722());
    }
}
