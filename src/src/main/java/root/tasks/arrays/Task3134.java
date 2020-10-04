package root.tasks.arrays;

import root.tasks.ThreeInputValLayout;

public class Task3134 extends ThreeInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        int p = Integer.parseInt(secondValue);
        int q = Integer.parseInt(thirdValue);
        String[] arr = firstValue.split(" ");
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
        appendTaskDesc("Пользователь вводит два индекса P, Q и данные - символы, разделенные пробелами. Нужно переставить местами значения элементов на указанных индексах.");
        appendCheckValuesHeader("data", "P", "Q");
        appendCheckValuesRow("a s d f g h", "0", "3");
        appendCheckValuesRow("a s d f g h", "2", "5");
        appendCheckValuesRow("a s d f g h", "4", "2");
        appendCheckValuesRow("a s d f g h", "-1", "5");
        appendCheckValuesRow("a s d f g h", "2", "17");
        appendCheckValuesRow("a s d f g h", "19", "2");
        appendCheckValuesRow("a s d f g h", "1", "-5");
        appendCheckValuesFooter();
        appendFooter();
    }
}
