package root.tasks.sorting;

import root.tasks.TwoInputValLayout;

public class Task6492 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Пользователь вводит два массива данных одинакового размера. Первый массив содержит символы. Второй - числа. Для каждого элемента первого массива в результате получится отдельный <i>столбец</i>. Количество символов в этом <i>столбце</i> равно значению элемента из второго массива на том же индексе.");
        appendCheckValuesHeader("Данные сверху(chars)", "Данные слева(amounts)");
        appendCheckValuesRow("a s d", "3 2 1");
        appendCheckValuesRow("z x c v b", "1 3 5 0 4");
        appendCheckValuesRow("q w e r t y", "6 2 8 3 1 5");
        appendCheckValuesRow("a s d f", "3 3 3");
        appendCheckValuesRow("z x c", "1 2 3 4");
        appendCheckValuesRow("", "1 2 3 4");
        appendCheckValuesRow("f d s a", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String charsRaw, String amountsRaw) {
        if (charsRaw.isEmpty()) {
            System.out.println("Отсутствуют данные о символах");
            return;
        }
        if (amountsRaw.isEmpty()) {
            System.out.println("Отсутствуют данные о количествах");
            return;
        }
        String[] chars = charsRaw.split(" ");
        String[] amountsStr = amountsRaw.split(" ");
        if (chars.length != amountsStr.length) {
            System.out.println("Длины массивов не совпадают");
            return;
        }
        int[] amounts = new int[amountsStr.length];
        for (int i = 0; i < amountsStr.length; i++) {
            amounts[i] = Integer.parseInt(amountsStr[i]);
        }
        int max = amounts[0];
        for (int i = 1; i < amounts.length; i++) {
            if (max < amounts[i]) {
                max = amounts[i];
            }
        }
        System.out.println("Наибольшая высота столбца: " + max);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i < amounts[j]) {
                    System.out.print(chars[j]);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6492());
    }
}
