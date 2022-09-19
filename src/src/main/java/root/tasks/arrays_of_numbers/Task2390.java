package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task2390 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Нет данных");
            return;
        }
        String[] arr = value.split(";");
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            int n = Integer.parseInt(arr[i]);
            if (n < 0) {
                System.out.println("Элемент массива на индексе "+ i + " меньше нуля");
                i++;
                continue;
            }
            while (j < n) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные символов \";\"." +
                " Нужно вывести на экран столько строк символов \"#\", сколько было введено чисел. Количество символов в строке зависит от значения соответствующего элемента массива. Если значение элемента отрицательно - вместо строки символов вывести сообщение \"Элемент массива на индексе $i меньше нуля\" и продолжить работу.");
        appendCheckValuesHeader("amounts");
        appendCheckValuesRow("9;8;7;6;5;4");
        appendCheckValuesRow("15;0;4;20;10");
        appendCheckValuesRow("3");
        appendCheckValuesRow("");
        appendCheckValuesRow("3;-1;6;-100000;4");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2390());
    }
}
