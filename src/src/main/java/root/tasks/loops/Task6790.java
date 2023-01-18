package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task6790 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Вычислить 20 значений функции 5*cos(x). X меняется от 0 с шагом 25.");
        appendCheckSingle(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = 0;
        int i = 0;
        while (i < 20) {
            double current = 5 * Math.cos(x);
            System.out.printf("%.0f  \t%.4f\n",x, current);
            x += 75;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6790());
    }
}
