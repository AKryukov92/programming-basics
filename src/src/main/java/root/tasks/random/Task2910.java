package root.tasks.random;

import root.tasks.OneInputValLayout;

import java.util.Random;

public class Task2910 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран два столбика чисел по 50 штук. В первом случайные целые числа от 0 до 40 включительно, во втором столбике - число из первого столбика плюс 100.");
        appendCheckSingleNonEscaped("Числа от 0 до 40 и прибавление 100" +
                "9 109\n" +
                "35 135\n" +
                "17 117\n" +
                "32 132\n" +
                "40 140\n" +
                "3 103\n" +
                "37 137\n" +
                "11 111\n" +
                "7 107\n" +
                "10 110\n" +
                "8 108\n" +
                "6 106\n" +
                "23 123\n" +
                "38 138\n" +
                "6 106\n" +
                "6 106\n" +
                "18 118\n" +
                "13 113\n" +
                "16 116\n" +
                "30 130\n" +
                "26 126\n" +
                "35 135\n" +
                "25 125\n" +
                "5 105\n" +
                "39 139\n" +
                "16 116\n" +
                "23 123\n" +
                "22 122\n" +
                "7 107\n" +
                "25 125\n" +
                "18 118\n" +
                "35 135\n" +
                "6 106\n" +
                "31 131\n" +
                "5 105\n" +
                "17 117\n" +
                "36 136\n" +
                "36 136\n" +
                "24 124\n" +
                "26 126\n" +
                "32 132\n" +
                "17 117\n" +
                "24 124\n" +
                "2 102\n" +
                "26 126\n" +
                "39 139\n" +
                "33 133\n" +
                "7 107\n" +
                "25 125\n" +
                "33 133");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        //intentionally nothing
    }

    public static void main(String[] args) {
        Random gen = new Random();
        int i = 0;
        while (i < 50) {
            int left = gen.nextInt(41);
            int right = left + 100;
            System.out.println(left + " " + right);
            i++;
        }
    }
}
