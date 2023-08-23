package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task7995 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив data и число X. Массив data состоит из пар элементов. Элементы массива разделены символом ';'. Элементы в паре разделены символом _. Нужно найти все элементы массива data, у которых первый элемент равен числу X.");
        appendCheckValuesHeader("data", "X");
        appendCheckValuesRow("9_nine;8_eight;7_seven;6_six;5_five;4_four;3_three", "3");
        appendCheckValuesRow("9_nine;3_three;6_six;5_five;100_onehundred;4_four", "9");
        appendCheckValuesRow("9_nine;3_three;6_six;5_five;100_onehundred;4_four", "20");
        appendCheckValuesRow("18_square;4_square;17_square;5_square;10000_square;999_square", "5");
        appendCheckValuesRow("0_zero;0_zero;1_one;2_two;3_three", "0");
        appendCheckValuesRow("0_zero;0_zero;1_one;2_two;3_three", "1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String data, String X) {
        String[] arr = data.split(";");
        int i = 0;
        boolean found = false;
        while (i < arr.length) {
            String[] parts = arr[i].split("_");
            if (parts[0].equals(X)) {
                System.out.println("Элементу с ключом " + X + " соответствует значение " + parts[1]);
                found = true;
            }
            i++;
        }
        if (!found) {
            System.out.println("Элемент с ключом " + X + " не найден");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7995());
    }
}
