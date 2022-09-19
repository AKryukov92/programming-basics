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
        appendCheckValuesRow("161 216 143");
        appendCheckValuesRow("88 54 70 71 86 98");
        appendCheckValuesRow("10 11 12 20 21 22 95 96 89");
        appendCheckValuesRow("-10 -13 -18 -8 -8 -18 -9 -17 -1 -16 1 1");
        appendCheckValuesRow("258 115 110 192 173 205 246 248 180 127 237 264 247 291 114 ");

        appendCheckValuesRow("1000 2000");
        appendCheckValuesRow("170 198 265 186 265");
        appendCheckValuesRow("10 98 62 37 50 41 77 2");
        appendCheckValuesRow("19 28 23 16 10 13 23 27 21 13 28");

        appendCheckValuesRow("999");
        appendCheckValuesRow("74 72 76 90");
        appendCheckValuesRow("-3 -6 -8 -20 -4 -90 0");
        appendCheckValuesRow("74 72 76 90 86 66 85 65 63 74");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7260());
    }
}
