package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task3134 extends TwoInputValLayout {
    @Override
    protected void logic(String secondValue, String thirdValue) {
        int p = Integer.parseInt(secondValue);
        int q = Integer.parseInt(thirdValue);
        String[] arr = "a s d f g h".split(" ");
        if (p < 0 || p >= arr.length) {
            System.out.print("Число P должно быть в интервале [0, размер массива)");
            return;
        }
        if (q < 0 || q >= arr.length) {
            System.out.print("Число Q должно быть в интервале [0, размер массива)");
            return;
        }
        String t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
        System.out.print("Меняю ");
        System.out.print(arr[q]);
        System.out.print(" на ");
        System.out.print(arr[p]);
        System.out.print("\n");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            System.out.print(" ");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дан известный массив, содержащий элементы: a, s, d, f, g, h. Пользователь вводит два числа P, Q и данные - символы, разделенные пробелами. Нужно переставить местами значения элементов на индексах P и Q.");
        appendCheckValuesHeader("P", "Q");
        appendCheckValuesRow("0", "3");
        appendCheckValuesRow("2", "5");
        appendCheckValuesRow("4", "2");
        appendCheckValuesRow("-1", "5");
        appendCheckValuesRow("2", "17");
        appendCheckValuesRow("19", "2");
        appendCheckValuesRow("1", "-5");
        appendCheckValuesFooter();
        appendFooter();
    }
}
