package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task1392 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти медиану для множества введенных элементов. Медиана — это число, которое является серединой множества чисел. Если множество содержит четное количество чисел, нужно вычислить среднее для двух чисел, находящихся в середине множества. Результат вывести с точностью 2 знака после запятой.");
        appendCheckValuesHeader("numbers");
        appendCheckValuesRow("9 8 9 1 1 5 1 1");
        appendCheckValuesRow("1 9 8 9 1 1 5 1 1");
        appendCheckValuesRow("1 2 3 4 1 3 4 4 4 4");
        appendCheckValuesRow("5 5 5 5 5");
        appendCheckValuesRow("");
        appendCheckValuesRow("13");
        appendCheckValuesRow("5000 1000");
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
            int temp = num[minIdx];
            num[minIdx] = num[j];
            num[j] = temp;
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        if (num.length % 2 == 0) {
            System.out.println("В массиве четное количество элементов");
            int medianLeft = num.length / 2 - 1;
            int medianRight = num.length / 2;
            double realMedian = ((double) num[medianLeft] + num[medianRight]) / 2;
            System.out.printf("Медиана: (%d + %d) / 2", num[medianLeft], num[medianRight]);
            System.out.printf(" = %.2f\n", realMedian);
        } else {
            System.out.println("В массиве НЕчетное количество элементов");
            int medianIdx = num.length / 2;
            System.out.println("Медиана: " + num[medianIdx]);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1392());
    }
}
