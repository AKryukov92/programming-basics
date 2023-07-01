package root.tasks.datetime;

import root.tasks.TwoInputValLayout;

public class Task3123 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("дано две отметки времени. нужно вычислить количество прошедших часов, минут секунд");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {

    }
}
