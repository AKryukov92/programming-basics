package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task3218 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Реализуйте алгоритм сортировки по возрастанию 'пузырьком':");
        appendOrderedNonEscaped(
                "Сравните каждый элемент массива со следующим.",
                "Если значение просматриваемого элемента больше значения следующего, поменяйте местами их значения.",
                "Повторяйте просмотр массива, пока все элементы не будут отсортированы."
        );
        appendCheckValuesHeader("array");
        appendCheckValuesRow("4 1 1 1");
        appendCheckValuesRow("1 4 2 1");
        appendCheckValuesRow("3 4 1 5");
        appendCheckValuesRow("1 2 3 4 1 2");
        appendCheckValuesRow("9 8 9 1 1 5 1 1");
        appendCheckValuesRow("5 5 5 5 5");
        appendCheckValuesRow("1 9 1 30 9 1 100");
        appendCheckValuesRow("");
        appendCheckValuesRow("9 10 11 12 13 14 15 16 17 18 19");
        appendCheckValuesRow("19");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Попробуйте улучшить решение. Если в последнем просмотре не было перестановок, прекратить обработку");
        appendFooter();
    }

    @Override
    protected void logic(String raw) {
        if (raw.isEmpty()) {
            System.out.println("Массив пуст");
            return;
        }
        System.out.println(raw);
        String[] arr = raw.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int j = 0; j < num.length; j++) {
            System.out.printf("Шаг %d ", j);
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    System.out.printf("Меняем %d и %d ", num[i], num[i + 1]);
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                } else {
                    System.out.printf("Оставляем %d и %d ", num[i], num[i + 1]);
                }
            }
            System.out.println();
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }
}
