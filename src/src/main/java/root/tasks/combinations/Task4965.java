package root.tasks.combinations;

import root.tasks.OneInputValLayout;

public class Task4965 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Число A меняется от 0 до 99 с шагом 19. Число B меняется от 0 до 99 с шагом 23. Напишите на экране все комбинации значений чисел A и B.");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendTaskDescEscaped("Эта задача решается с помощью вложенных циклов:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int a = 0;
        while (a < 100) {
            int b = 0;
            while (b < 100) {
                System.out.println(a + " " + b);
                b = b + 23;
            }
            a = a + 19;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4965());
    }
}
