package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

public class Task7260 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Нет данных");
        } else {
            String[] arr = value.split(" ");
            int i = 0;
            while (i < arr.length - 2) {
                int first = Integer.parseInt(arr[i]);
                int second = Integer.parseInt(arr[i + 1]);
                int third = Integer.parseInt(arr[i + 2]);
                int sum = first + second + third;
                System.out.printf("Группа %d %d %d сумма %d\n", first, second, third, sum);
                i += 3;
            }
            if (i < arr.length - 1) {
                int first = Integer.parseInt(arr[i]);
                int second = Integer.parseInt(arr[i + 1]);
                int sum = first + second;
                System.out.printf("Группа %d %d сумма %d\n", first, second, sum);
            }else if (i < arr.length) {
                int first = Integer.parseInt(arr[i]);
                System.out.printf("Группа %d сумма %d\n", first, first);
            }
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - целые числа, разделенные пробелами. Условно разделить числа на группы по 3. Посчитать сумму в каждой группе чисел.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("9 8 7 6 5 4");
        appendCheckValuesRow("10 11 12 20 21 22");
        appendCheckValuesRow("10 98 62 37 50 41 77 2");
        appendCheckValuesRow("-10 -13 -18 -8 -8 -18 -9 -17 -1 -16 1 1");
        appendCheckValuesRow("258 115 110 192 173 205 246 248 180 127 237 264 247 291 114 ");
        appendCheckValuesRow("5 9 7 2");
        appendCheckValuesRow("-3 -6 -8 -20 -4 -90");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7260());
    }
}
