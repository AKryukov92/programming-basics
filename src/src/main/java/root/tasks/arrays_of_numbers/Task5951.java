package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task5951 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Найти сумму кубов всех целых чисел от 20 до 40 включительно.");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int i = 20;
        int sum = 0;
        System.out.println("Ход решения:");
        while (i <= 40) {
            System.out.print("Куб числа " + i + " равен " + i * i * i + ". Промежуточный итог ");
            sum = sum + i * i * i;
            System.out.println(sum);
            i++;
        }
        System.out.println("Ответ " + sum);
    }

    public static void main(String[] args) {
        System.out.println(new Task5951());
    }
}
