package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task1522 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = value.split("_");
        int max = Integer.parseInt(arr[0]);
        int min = max;
        int i = 1;
        System.out.println("Ход решения:");
        while (i < arr.length) {
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
                System.out.println("Промежуточное минимальное " + min);
            } else if (current > max) {
                max = current;
                System.out.println("Промежуточное максимальное " + max);
            }
            i++;
        }
        System.out.println("Итоговое минимальное " + min);
        System.out.println("Итоговое максимальное " + max);
        System.out.println("Разница " + (max - min));
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - числа, разделенные символом \"_\". Найти разницу между максимальным и минимальным элементом.");
        appendCheckValuesHeader("N", "sum");
        appendCheckValuesRow("9_8_7_6_5_4");
        appendCheckValuesRow("5_9_1_6_7_3");
        appendCheckValuesRow("100_5_64_3_87");
        appendCheckValuesRow("3_4_5_6_7_8");
        appendCheckValuesRow("8_8_8_8_8_8");
        appendCheckValuesRow("");
        appendCheckValuesRow("5_-5_0");
        appendCheckValuesFooter();
        appendFooter();
    }
}
