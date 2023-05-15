package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task3788 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит числа, разделенные пробелом. Нужно посчитать количество элементов, которые меньше 100, а затем создать новый массив, в который поместить элементы, которые меньше 100.");
        appendCheckValuesHeader("numbers");
        appendCheckValuesRow("9 200 5 180 16 21 500 20 99");
        appendCheckValuesRow("5 19 40 872 391 217 77");
        appendCheckValuesRow("7 6 5");
        appendCheckValuesRow("99 98 97");
        appendCheckValuesRow("");
        appendCheckValuesRow("1000 999 998");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Исходный массив пуст");
            return;
        }
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
            if (num[i] < 100) {
                count++;
            }
        }
        System.out.println("Количество чисел меньше 100 равно " + count);
        int[] result = new int[count];
        int src = 0;
        int dest = 0;
        while (src < num.length) {
            if (num[src] < 100) {
                result[dest] = num[src];
                dest++;
            }
            src++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3788());
    }
}
