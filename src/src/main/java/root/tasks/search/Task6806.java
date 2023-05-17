package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task6806 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано число (X) в интервале от 10 до 20. Нужно вывести числа в столбик в следующем порядке: 11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20 и написать слово \"Найдено\" справа от введенного числа X.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("10");
        appendCheckValuesRow("15");
        appendCheckValuesRow("20");
        appendCheckValuesRow("9");
        appendCheckValuesRow("23");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr[i] == x) {
                System.out.print(" Найдено");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(new Task6806());
    }
}
