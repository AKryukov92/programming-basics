package root.tasks.search;

import root.tasks.TwoInputValLayout;

public class Task6638 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива чисел: желтый и синий. Вывести на экран три группы элементов. Вывести на экран разницу между массивами. Если исходные массивы не отсортированы по возрастанию, вывести сообщение об ошибке.");
        appendCheckValuesHeader("Желтый массив (yellow)", "Синий массив (blue)");
        appendCheckValuesRow("1 2 3 4 5", "1 3 5 6");
        appendCheckValuesRow("1 2 2 2 3", "2 2 2 3 3 4");
        appendCheckValuesRow("9 8 8 8 7", "9 8");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] yellow = firstValue.split(" ");
        String[] blue = secondValue.split(" ");
        int[] ynum = new int[yellow.length];
        int[] bnum = new int[blue.length];
        for (int i = 0; i < yellow.length; i++) {
            ynum[i] = Integer.parseInt(yellow[i]);
        }
        for (int i = 0; i < blue.length; i++) {
            bnum[i] = Integer.parseInt(blue[i]);
        }
        int y = 0;
        int b = 0;
        while (true) {
            if (y >= ynum.length && b >= bnum.length) {
                break;
            } else if (y >= ynum.length) {
                System.out.println("--- " + bnum[b]);
                b++;
            } else if (b >= bnum.length) {
                System.out.println(ynum[y] + " ---");
                y++;
            } else if (ynum[y] < bnum[b]) {
                System.out.println(ynum[y] + " ---");
                y++;
            } else if (ynum[y] > bnum[b]) {
                System.out.println("--- " + bnum[b]);
                b++;
            } else if (ynum[y] == bnum[b]) {
                System.out.println(ynum[y] + " " + bnum[b]);
                y++;
                b++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6638());
    }
}
