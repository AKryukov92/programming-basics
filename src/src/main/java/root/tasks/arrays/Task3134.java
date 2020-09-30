package root.tasks.arrays;

import root.tasks.ThreeInputValLayout;

import java.io.PrintStream;

public class Task3134 extends ThreeInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue, PrintStream out) {
        int p = Integer.parseInt(secondValue);
        int q = Integer.parseInt(thirdValue);
        String[] arr = firstValue.split(" ");
        if (p < 0 || p >= arr.length) {
            out.print("Число P должно быть в интервале [0, размер массива)");
            return;
        }
        if (q < 0 || q >= arr.length) {
            out.print("Число Q должно быть в интервале [0, размер массива)");
            return;
        }
        String t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
        out.print("Меняю ");
        out.print(arr[q]);
        out.print(" на ");
        out.print(arr[p]);
        out.print("\n");
        int i = 0;
        while (i < arr.length) {
            out.print(arr[i]);
            out.print(" ");
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
