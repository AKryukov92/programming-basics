package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task6355 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число seed. Вывести 10 строчек по 7 чисел в каждой. В первой строчке - числа начиная с seed по возрастанию c шагом 1. Во второй строчке - с шагом 2 и так далее. В строчке 10 шаг должен быть равен 10. После двоеточия поставьте символ табуляции \"\\t\"");
        appendCheckValuesHeader("seed");
        appendCheckValuesRow("0");
        appendCheckValuesRow("2");
        appendCheckValuesRow("1000");
        appendCheckValuesRow("-20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int seed = Integer.parseInt(value);
        int row = 1;
        while (row <= 10) {
            int i = seed;
            int limit = seed + row*7;
            System.out.print("Числа от " + seed + " до " + limit + " с шагом " + row + ":\t");
            while(i <= limit) {
                System.out.print(i + " ");
                i+=row;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6355());
    }
}
