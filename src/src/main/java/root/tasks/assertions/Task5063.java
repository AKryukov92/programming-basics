package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task5063 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дан угол в градусах (aInitial). Определить (aRemainder) наименьшее положительное значение угла, равного данному. (Остаток от деления на 360)");
        appendCheckValuesHeader("aInitial");
        appendCheckValuesRow("365");
        appendCheckValuesRow("45");
        appendCheckValuesRow("1125");
        appendCheckValuesRow("1500");
        appendCheckValuesRow("2000");
        appendCheckValuesRow("0");
        appendCheckValuesRow("360");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int aInitial = Integer.parseInt(value);
        int aRemainder = aInitial % 360;
        System.out.println("Угол " + aInitial + " равен углу " + aRemainder);
    }
}
