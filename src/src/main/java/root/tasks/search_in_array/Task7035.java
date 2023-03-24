package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task7035 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        int min = num[0];
        System.out.println("Ход решения:");
        System.out.println("Начинаю и запоминаю " + min);
        for (int i = 1; i < num.length; i++){
            System.out.println("Сравниваю " + min + " и " + num[i]);
            if (num[i] < min) {
                System.out.println("Вместо " + min + " запоминаю " + num[i]);
                min = num[i];
            }
        }
        System.out.println("В массиве {" + String.join(",", arr) + "} минимальный элемент это " + min);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные пробелами. Нужно найти минимальное число.");
        appendCheckValuesHeader("");
        appendCheckValuesRow("12 5 7 8 3 4 2");
        appendCheckValuesRow("2 3 4 5 12");
        appendCheckValuesRow("3 4 1 2 3 4 1 2 3 1 2");
        appendCheckValuesRow("4 2 3 4 3 2");
        appendCheckValuesRow("4 4 4 4 4 3 8 9");
        appendCheckValuesRow("4 4 4 4");
        appendCheckValuesRow("4 3");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7035().getContent());
    }
}
