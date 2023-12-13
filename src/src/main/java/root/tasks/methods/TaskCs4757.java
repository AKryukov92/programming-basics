package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskCs4757 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два числа, нужно вычесть из большего числа меньшее.");
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("99", "17");
        appendCheckValuesRow("14", "5");
        appendCheckValuesFooter();
        appendTaskDescEscaped("При работе с методами вы можете встретить ошибку ");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {

    }
}
