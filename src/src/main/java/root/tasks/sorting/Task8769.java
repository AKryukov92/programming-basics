package root.tasks.sorting;

import root.tasks.MultipleInputValLayout;

public class Task8769 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит числа from и to и данные - целые числа, разделенные пробелами. Напечатать элементы, у которых индекс находится между from и to включительно. Найти минимальное число между элементами с номерами from и to включительно.");
        appendCheckValuesHeader("data", "from", "to");
        appendCheckValuesRow("5 6 7 8 5 6", "1", "3");
        appendCheckValuesRow("3 4 4 2 3 4 1 2 3 1 2", "8", "10");
        appendCheckValuesRow("11 12 13 5 11 12", "1", "4");
        appendCheckValuesRow("4 2 3 4 3 2", "0", "5");
        appendCheckValuesRow("4 4 4 4 4 3 2 1", "0", "5");
        appendCheckValuesRow("1 2 3 4 1 2", "4", "2");
        appendCheckValuesRow("4 4 4 4", "1", "7");
        appendCheckValuesRow("4 3", "-1", "0");
        appendCheckValuesRow("1 2 3 4", "5", "10");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        String raw = args[0];
        int from = Integer.parseInt(args[1]);
        int to = Integer.parseInt(args[2]);
        String[] arr = raw.split(" ");
        int i, n;
        if (from < 0 || from >= arr.length) {
            System.out.println("Число from должно быть в интервале [0, размер массива)");
            return;
        }
        if (to < 0 || to >= arr.length) {
            System.out.println("Число to должно быть в интервале [0, размер массива)");
            return;
        }
        if (from < to) {
            i = from;
            n = to;
        } else {
            i = to;
            n = from;
        }
        System.out.print("Фрагмент массива:");
        int min = Integer.parseInt(arr[i]);
        while (i <= n) {
            System.out.print(" ");
            System.out.print(arr[i]);
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
            }
            i++;
        }
        System.out.println("\nМинимальное среди них: ");
        System.out.println(min);
    }
}
