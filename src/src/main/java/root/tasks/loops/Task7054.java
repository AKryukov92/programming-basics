package root.tasks.loops;

import root.tasks.OneInputValLayout;
import root.tasks.TwoInputValLayout;

public class Task7054 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {

    }

    @Override
    protected void makeLayout() {
        appendTaskDesc("Вывести ряд чисел с шагом 7. А потом начать с последнего числа и вывести числа в порядке уменьшеия с шагом 3");
    }
}
