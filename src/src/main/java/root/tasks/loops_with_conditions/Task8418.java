package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task8418 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано положительное целое число X. Вывести все его делители в строчку.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("6");
        appendCheckValuesRow("385");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-9");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        System.out.println("Делители числа " + x + ":");
        if (x < 0) {
            System.out.println("Значение X должно быть положительным");
        }
        int i = 1;
        while (i < x / 2 + 1) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(new Task8418());
    }
}
