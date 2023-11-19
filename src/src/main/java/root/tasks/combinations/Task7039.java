package root.tasks.combinations;

import root.tasks.OneInputValLayout;

public class Task7039 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Напечатать на экран все комбинации чисел 0, 1, 2. Не пишите на экран комбинацию, в которой одна и та же цифра отображается несколько раз.");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int i1 = 0;
        while (i1 < 3) {
            int i2 = 0;
            while (i2 < 3) {
                int i3 = 0;
                while (i3 < 3) {
                    if (i1 != i2) {
                        if (i2 != i3) {
                            if (i1 != i3) {
                                System.out.println(i1 + " " + i2 + " " + i3);
                            }
                        }
                    }
                    i3 = i3 + 1;
                }
                i2 = i2 + 1;
            }
            i1 = i1 + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7039());
    }
}
