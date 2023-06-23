package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

public class Task1794 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив чисел." +
                " Найти наибольшую разницу между соседними элементами массива." +
                " Сравнивать нужно разницу между следующим и предыдущим значением.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("9 6 5 4 2");
        appendCheckValuesRow("3 5 6 10 1");
        appendCheckValuesRow("250 500 999 1000");
        appendCheckValuesRow("2");
        appendCheckValuesRow("10 0");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Массив пуст");
        } else {
            String[] arr = value.split(" ");
            if (arr.length == 1) {
                System.out.println("Массив должен содержать хотя бы 2 элемента");
            } else {
                int current = Integer.parseInt(arr[0]);
                int next = Integer.parseInt(arr[1]);
                int diff = next - current;
                int max = diff;
                System.out.println("Разница между элементами на индексах " + 0 + " и " + 1 + " равна " + diff);
                int i = 2;
                System.out.println("Эта разница считается максимальной");
                current = next;
                while (i < arr.length) {
                    next = Integer.parseInt(arr[i]);
                    diff = next - current;
                    System.out.println("Разница между элементами на индексах " + (i - 1) + " и " + i + " равна " + diff);
                    if (diff > max) {
                        System.out.println("Эта разница считается максимальной");
                        max = diff;
                    }
                    current = next;
                    i++;
                }
                System.out.println("Наибольшая разница между соседними элементами равна " + max);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1794());
    }
}
