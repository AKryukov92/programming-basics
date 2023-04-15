package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task4707 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные пробелами. Реализовать алгоритм сортировки по возрастанию:");
        appendOrdered(
                "Найдите индекс минимального значения в текущем списке",
                "Обменяйте значение на этом индексе со значением первого неотсортированного индекса",
                "Отсортируйте хвост списка, исключив из рассмотрения уже отсортированные элементы"
        );
        appendCheckValuesHeader("array");
        appendCheckValuesRow("9 8 9 1 1 5 1 1");
        appendCheckValuesRow("1 2 3 4 1 3 4 4 4 4");
        appendCheckValuesRow("5 5 5 5 5");
        appendCheckValuesRow("1 9 1 30 9 1 100");
        appendCheckValuesRow("1000000 1 1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String raw) {
        if (raw.length() == 0) {
            System.out.println("Массив пуст");
            return;
        }
        System.out.println(raw);
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length - 1; j++) {
            int minIdx = j;
            for (int i = j + 1; i < num.length; i++) {
                if (num[minIdx] > num[i]) {
                    minIdx = i;
                }
            }
            System.out.printf("Минимальное значение %d на индексе %d. Первая неотсортированная позиция: %d\n", num[minIdx], minIdx, j);
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }
}
