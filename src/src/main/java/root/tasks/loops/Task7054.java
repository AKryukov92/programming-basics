package root.tasks.loops;

import root.tasks.MultipleInputValLayout;
import root.tasks.OneInputValLayout;
import root.tasks.TwoInputValLayout;

public class Task7054 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит три числа: seed, amountOf7, amountOf3." +
                " Начиная с seed, вывести amountOf7 штук чисел в строчку по возрастанию с шагом 7." +
                " А потом начать с последнего полученного числа и вывести amountOf3 чисел в порядке уменьшения с шагом 3.");
        appendCheckValuesHeader("seed", "amount of 7", "amount of 3");
        appendCheckValuesRow("0", "3", "2");
        appendCheckValuesRow("10", "4", "3");
        appendCheckValuesRow("1000", "2", "10");
        appendCheckValuesRow("600", "0", "5");
        appendCheckValuesRow("500", "7", "0");
        appendCheckValuesRow("100", "-2", "2");
        appendCheckValuesRow("100", "4", "-3");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int seed = Integer.parseInt(args[0]);
        int amount7 = Integer.parseInt(args[1]);
        int amount3 = Integer.parseInt(args[2]);
        if (amount3 < 0 || amount7 < 0) {
            System.out.println("Количество чисел должно быть неотрицательным");
            return;
        }
        int i = 0;
        System.out.println("По возрастанию с шагом 7");
        if (amount7 > 0) {
            while (i < amount7) {
                System.out.print(seed);
                System.out.print(" ");
                seed += 7;
                i++;
            }
            seed -= 7;
            System.out.println();
        } else {
            System.out.println("Нет чисел");
        }
        i = 0;
        System.out.println("По убыванию с шагом 3");
        while (i < amount3) {
            System.out.print(seed);
            System.out.print(" ");
            seed -= 3;
            i++;
        }
        if (amount3 == 0) {
            System.out.println("Нет чисел");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7054());
    }
}
