package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

public class Task3946 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти среднее арифметическое введенных элементов. Вывести с точностью 6 знаков после запятой.");
        appendCheckValuesHeader("array");
        appendCheckValuesRow("9 8 9 1 1 5 1 1");
        appendCheckValuesRow("1 2 3 4 1 3 4 4 4 4");
        appendCheckValuesRow("5 5 5 5 5");
        appendCheckValuesRow("");
        appendCheckValuesRow("1 9 1 30 9 1 100");
        appendCheckValuesRow("1000000 1 1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String raw) {
        if (raw.length() == 0) {
            System.out.println("0.0000");
            return;
        }
        String[] arr = raw.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        double avg = sum / arr.length;
        System.out.printf("%.4f", avg);
    }

    public static void main(String[] args) {
        System.out.println(new Task3946());
    }
}
