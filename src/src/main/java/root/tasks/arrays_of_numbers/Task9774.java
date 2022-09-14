package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task9774 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println();
            return;
        }
        String[] arr = firstValue.split(" ");
        int m = Integer.parseInt(secondValue);
        int i = 0;
        while (i < arr.length) {
            int num = Integer.parseInt(arr[i]);
            System.out.print(num * m);
            System.out.print(" ");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число M и данные - целые числа, разделенные пробелами. Умножить все элементы массива на M.");
        appendCheckValuesHeader("data", "M");
        appendCheckValuesRow("9 8 7 6 5 4", "31");
        appendCheckValuesRow("9 8 7 6 5 4", "-3");
        appendCheckValuesRow("98 76 54", "11");
        appendCheckValuesRow("", "73");
        appendCheckValuesFooter();
        appendFooter();
    }
}
