package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

public class Task1431 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные пробелами. Нужно найти два наибольших числа. Если есть два одинаковых числа с наибольшим значением, то вывести их оба.");
        appendCheckValuesRow("2 5 4 3 12");//максимум далеко, второе второй
        appendCheckValuesRow("3 3 3 9 28");//максимум далеко, второе далеко
        appendCheckValuesRow("10 0 3 33");//максимум далеко, второй первый
        appendCheckValuesRow("31 17 0 0");//максимум первый, второй второй
        appendCheckValuesRow("48 0 0 7");//максимум первый, второй далеко
        appendCheckValuesRow("24 37 2 8");//максимум второй, второй первый
        appendCheckValuesRow("0 49 0 9");//максимум второй, второй далеко
        appendCheckValuesRow("2 2 5 5");//два одинаково больших числа
        appendCheckValuesRow("9 8 7 9");//два одинаково больших числа
        appendCheckValuesRow("-9 -8 -4 -9");//отрицательные значения
        appendCheckValuesRow("2");//всего одно значение
        appendCheckValuesRow("1000000");
        appendCheckValuesRow("2 3");
        appendCheckValuesRow("5 5");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        int max = num[0];
        if (num.length > 1) {
            int sec;
            if (num[1] > max) {
                sec = max;
                max = num[1];
            } else {
                sec = num[1];
            }
            for (int i = 2; i < num.length; i++) {
                int curr = num[i];
                if (curr >= max) {
                    sec = max;
                    max = curr;
                } else if (curr > sec) {
                    sec = curr;
                }
            }
            System.out.println("Два наибольших числа:" + max + " " + sec);
        } else {
            System.out.println("Максимум " + max + ". В массиве 1 элемент.");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1431());
    }
}
