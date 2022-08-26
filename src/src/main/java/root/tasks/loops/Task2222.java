package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task2222 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два числа: P и Q. Вывести в столбик 20 чисел по возрастанию, которые делятся без остатка на P. Написать фразу \"делится на Q\" после каждого числа, которое делится без остатка на Q. Если пользователь вввел не положительное число, вывести сообщение об ошибке.");
        appendCheckValuesHeader("P", "Q");
        appendCheckValuesRow("2", "3");
        appendCheckValuesRow("2", "4");
        appendCheckValuesRow("2", "7");
        appendCheckValuesRow("7", "11");
        appendCheckValuesRow("2", "0");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("2", "-4");
        appendCheckValuesRow("-2", "3");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int p = Integer.parseInt(firstValue);
        int q = Integer.parseInt(secondValue);
        if (p <= 0) {
            System.out.println("Значение P должно быть положительным");
            return;
        }
        if (q <= 0) {
            System.out.println("Значение Q должно быть положительным");
            return;
        }
        int i = 0;
        int current = p;
        while (i < 20) {
            if (current % q == 0) {
                System.out.println(current + " делится на Q");
            } else {
                System.out.println(current);
            }
            current += p;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2222());
    }
}
