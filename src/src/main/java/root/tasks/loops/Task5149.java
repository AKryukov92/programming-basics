package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task5149 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два числа: stepA, stepB. Нужно написать 19 чисел в строчку начиная с 15 с шагом stepA. На следующей строчке нужно написать 7 чисел начиная с 100 с шагом stepB");
        appendCheckValuesHeader("stepA", "stepB");
        appendCheckValuesRow("1", "5");
        appendCheckValuesRow("23", "-2");
        appendCheckValuesRow("-100", "2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int stepA = Integer.parseInt(firstValue);
        int stepB = Integer.parseInt(secondValue);
        int i = 0;
        while (i < 19) {
            int t = 15 + i * stepA;
            System.out.print(t + " ");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < 7) {
            int t = 100 + i * stepB;
            System.out.print(t + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5149());
    }
}
