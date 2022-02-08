package root.tasks.random;

import root.tasks.OneInputValLayout;

import java.util.Random;

public class Task2386 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран в столбик 50 случайных целые чисел от 0 до 40 включительно");
        appendCheckSingle("Числа от 0 до 40" +
                "25\n" +
                "20\n" +
                "10\n" +
                "22\n" +
                "28\n" +
                "5\n" +
                "5\n" +
                "24\n" +
                "40\n" +
                "30\n" +
                "15\n" +
                "2\n" +
                "8\n" +
                "14\n" +
                "30\n" +
                "28\n" +
                "15\n" +
                "13\n" +
                "6\n" +
                "1\n" +
                "1\n" +
                "36\n" +
                "21\n" +
                "25\n" +
                "3\n" +
                "11\n" +
                "28\n" +
                "38\n" +
                "12\n" +
                "10\n" +
                "23\n" +
                "18\n" +
                "31\n" +
                "39\n" +
                "5\n" +
                "16\n" +
                "32\n" +
                "17\n" +
                "17\n" +
                "17\n" +
                "30\n" +
                "23\n" +
                "18\n" +
                "21\n" +
                "31\n" +
                "5\n" +
                "3\n" +
                "11\n" +
                "18\n" +
                "25");
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }

    public static void main(String[] args) {
        Random gen = new Random();
        int i = 0;
        while (i < 50) {
            System.out.println(gen.nextInt(41));
            i++;
        }
    }
}
