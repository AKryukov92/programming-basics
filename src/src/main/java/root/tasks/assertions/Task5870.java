package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task5870 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Видеоролик длится timeInSeconds секунд. Определить сколько это в полных часах, минутах и секундах.");
        appendCheckValuesHeader("timeInSeconds");
        appendCheckValuesRow("4000");
        appendCheckValuesRow("3603");
        appendCheckValuesRow("3599");
        appendCheckValuesRow("3660");
        appendCheckValuesRow("59");
        appendCheckValuesRow("61");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("-20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int timeInSeconds = Integer.parseInt(value);
        if (timeInSeconds < 0) {
            System.out.println("Количество времени должно быть неотрицательным");
        }
        if (timeInSeconds >= 0) {
            int h = timeInSeconds / 3600;
            int m = timeInSeconds / 60 % 60;
            int s = timeInSeconds % 60;
            System.out.printf("%d часов %d минут %d секунд", h, m, s);
        }
    }
}
