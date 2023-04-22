package root.tasks.sorting;

import root.tasks.OneInputValLayout;

public class Task7066 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив, состоящий из пар элементов. Элементы массива разделены символом ';'. Элементы в паре разделены символом _. Нужно отсортировать массив по возрастанию числа и сохранить пары элементов вместе.");
        appendCheckValuesHeader("9_nine;8_eight;7_seven;6_six;5_five;4_four;3_three");
        appendCheckValuesHeader("9_nine;3_three;6_six;5_five;100_onehundred;4_four");
        appendCheckValuesRow("2_one;2_two;2_three;2_four;2_five");
        appendCheckValuesRow("9_blue;17_green;-2_white;100_black;53_red");
        appendCheckValuesRow("18_square;4_square;17_square;5_square;10000_square;999_square");
        appendCheckValuesRow("");
        appendCheckValuesRow("4_four_thousands;5_five_thousands");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Массив пуст");
            return;
        }
        String[] arr = value.split(";");
        for (int j = 0; j < arr.length-1; j++) {
            System.out.println("Шаг " + j);
            int minIndex = j;
            if (arr[j].isEmpty()) {
                System.out.println("Элемент на индексе 0 пуст");
                return;
            }
            String[] parts = arr[j].split("_");
            int minValue = Integer.parseInt(parts[0]);
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].isEmpty()) {
                    System.out.println("Элемент на индексе " + i + " пуст");
                    return;
                }
                parts = arr[i].split("_");
                int number = Integer.parseInt(parts[0]);
                if (number < minValue) {
                    minValue = number;
                    minIndex = i;
                }
            }
            System.out.println("Минимальный элемент на индексе " + minIndex + " равен " + arr[minIndex]);
            String tmp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = tmp;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7066());
    }
}
