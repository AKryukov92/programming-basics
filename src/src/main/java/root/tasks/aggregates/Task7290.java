package root.tasks.aggregates;

import root.tasks.TwoInputValLayout;

public class Task7290 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split(" ");
        int b = Integer.parseInt(secondValue);
        if (b < 0 || b >= arr.length) {
            System.out.println("Число B должно быть в интервале [0, размер массива)");
        } else {
            int t = Integer.parseInt(arr[b]);
            System.out.println("На индексе B находится " + arr[b]);
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) < t) {
                    count++;
                }
            }
            System.out.println("Количество меньших " + count);
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число B и данные - целые числа, разделенные пробелами. Определить сколько элементов массива меньше, чем элемент на позиции B.");
        appendCheckValuesHeader("data", "B");
        appendCheckValuesRow("1 1 1 3 4", "3");
        appendCheckValuesRow("3 2 15 10 4 60", "3");
        appendCheckValuesRow("1 2 3 4 1 2", "2");
        appendCheckValuesRow("4 4 4 4 4 3 2 1", "7");
        appendCheckValuesRow("3 4 1 2 3 4 1 2 3 1 2", "0");
        appendCheckValuesRow("4 4 4 4", "1");
        appendCheckValuesRow("1 1 1 3 4 1", "-5");
        appendCheckValuesRow(" 1 2 3", "10");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7290());
    }
}
