package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task9271 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти минимальное число и вычесть его из всех элементов массива.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("5 4 6 2 3 1");
        appendCheckValuesRow("-1 2 3 4 -1 2");
        appendCheckValuesRow("3 4 1 2 3 4 1 2 3 1 2");
        appendCheckValuesRow("4 2 3 4 3 2");
        appendCheckValuesRow("4 4 4 4 4 3 2 1");
        appendCheckValuesRow("4 4 4 4");
        appendCheckValuesRow("");
        appendCheckValuesRow("4 3");
        appendCheckValuesRow("101 200 300 200 600 700");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Массив пуст");
            return;
        }
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        int minIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[minIndex]) {
                minIndex = i;
            }
        }
        int val = num[minIndex];
        System.out.println("Минимальное число находится на индексе " + minIndex + " и равно " + val);
        for (int i = 0; i < num.length; i++) {
            System.out.println("из " + num[i] + " вычитаю " + val);
            num[i] = num[i] - val;
        }
        System.out.println("Результат:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9271());
    }
}
