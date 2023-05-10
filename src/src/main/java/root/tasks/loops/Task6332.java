package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task6332 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int initial = Integer.parseInt(value);
        int i = initial;
        int j = 1;
        while (i < initial + 12) {
            System.out.print(i);
            if (j == 3) {
                j = 0;
                System.out.print(" ");
                int w = 0;
                while (w < i && w < 30) {
                    System.out.print("#");
                    w++;
                }
            }
            System.out.println();
            j++;
            i++;
        }

    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число. Вывести его и 10 следующих чисел в столбик с шагом 1." +
                " Справа от каждого третьего числа вывести решетки в строчку." +
                " Количество решеток равно числу, которое выводилось в начале строки." +
                " Количество решеток должно быть не более 30." +
                " Есди число в строке отрицательное - не выводить решетки.");

        appendCheckValuesHeader("start");
        appendCheckValuesRow("0");
        appendCheckValuesRow("10");
        appendCheckValuesRow("-10");
        appendCheckValuesRow("100");
        appendCheckValuesRow("22");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task6332().getContent());
    }
}
