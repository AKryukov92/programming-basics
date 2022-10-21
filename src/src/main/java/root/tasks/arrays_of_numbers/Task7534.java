package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task7534 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два массива данных одинакового размера. Первый массив содержит символы. Второй - числа. Для каждого элемента первого массива в результате получится отдельная строка. Количество символов в этой строке равно значению элемента из второго массива на том же индексе.");
        appendCheckValuesHeader("chars", "amounts");
        appendCheckValuesRow("q a z", "3 2 5");
        appendCheckValuesRow("q w e r t y", "3 3 1 7 2 6");
        appendCheckValuesRow("a s d f", "9 0 7 2");
        appendCheckValuesRow("a s d f", "3 3 3");
        appendCheckValuesRow("z x c", "1 2 3 4");
        appendCheckValuesRow("", "1 1 1");
        appendCheckValuesRow("a a a", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Отсутствуют данные о символах");
            return;
        }
        if (secondValue.isEmpty()) {
            System.out.println("Отсутствуют данные о количествах");
            return;
        }
        String[] arr = firstValue.split(" ");
        String[] num = secondValue.split(" ");
        if (arr.length != num.length) {
            System.out.println("Длины массивов не совпадают");
            return;
        }
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            int len = Integer.parseInt(num[i]);
            while (j < len) {
                System.out.print(arr[i]);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7534());
    }

}
