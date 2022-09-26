package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task3289 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив данных с разделителем ';'. Нужно найти индекс элемента, после которого находится элемент с разницей менее 20.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("0;21;45;50;70;100");
        appendCheckValuesRow("0;30;1;31;2;32");
        appendCheckValuesRow("");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Отсутствуют данные");
        } else {
            String[] arr = value.split(";");
            int i = 0;
            while (i < arr.length - 1) {
                System.out.println("Сравниваю " + arr[i] + " и " + arr[i + 1]);
                int current = Integer.parseInt(arr[i]);
                int next = Integer.parseInt(arr[i + 1]);
                if (next > current && next - current > 20) {
                    System.out.println("Разница между значениями больше 20");
                } else if (next < current && current - next > 20) {
                    System.out.println("Разница между значениями больше 20");
                } else {
                    System.out.println("Разница между значениями меньше 20. Нарушение на индексе " + i);
                    break;
                }
                i++;
            }
        }
    }
}
