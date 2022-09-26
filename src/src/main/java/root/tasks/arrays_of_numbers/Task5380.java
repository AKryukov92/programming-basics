package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task5380 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("4 3 2 1 5 5");
        appendCheckValuesRow("4 3 2 1 5");
        appendCheckValuesRow("3 4 2 1");
        appendCheckValuesRow("11");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Отсутствуют исходные данные");
        } else {
            String[] arr = value.split(" ");

            int i = 0;
            while (i < arr.length) {
                int num = Integer.parseInt(arr[i]);
                if (num < arr.length) {
                    System.out.println("Элемент с индексом " + i + " содержит значение " + arr[i] + " и он меньше, чем длина массива " + arr.length);
                } else {
                    System.out.println("Элемент с индексом " + i + " содержит значение " + arr[i] + " и он не меньше длины массива. Остановка");
                    break перефразировать,чтобы не было остановки
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5380());
    }
}
