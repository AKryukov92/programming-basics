package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task5871 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        //чтобы напомнить о том, что вокруг знаменателя надо ставить скобки
        //чтобы была одна сложная задача на вычисления
        double result = Math.sqrt(-3 * x) / (Math.sqrt(10 - x) + Math.sqrt(x));

    }

    @Override
    protected void makeLayout() {

    }
}
