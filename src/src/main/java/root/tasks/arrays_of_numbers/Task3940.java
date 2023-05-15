package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task3940 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] leftArr = firstValue.split(" ");
        String[] rightArr = secondValue.split(" ");
        if (leftArr.length != rightArr.length) {
            System.out.println("Размеры массивов должны быть одинаковы");
            return;
        }
        int i = 0;
        while (i < leftArr.length) {
            int l = Integer.parseInt(leftArr[i]);
            int r = Integer.parseInt(rightArr[i]);
            System.out.print(l * r);
            System.out.print(" ");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных - целые числа. Перемножить числа попарно на одинаковых индексах и вывести на экран.");
        appendCheckValuesHeader("left", "right");
        appendCheckValuesRow("1 2 3 4 1", "2 3 4 1 2");
        appendCheckValuesRow("1 2 3 4 1 3 4 4 4 4", "3 4 1 2 3 4 1 2 3 4");
        appendCheckValuesRow("1 2 3", "3 4");
        appendCheckValuesRow("1 2 3", "3 4 1 2");
        appendCheckValuesFooter();
        appendFooter();
    }
}
