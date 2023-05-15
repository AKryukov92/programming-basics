package root.tasks.conditions;

import root.tasks.TwoInputValLayout;

public class Task5116 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        int r = Integer.parseInt(firstValue);
        int k = Integer.parseInt(secondValue);
        if (r < 100 && 100 < k) {
            System.out.println("Оба условия истинны. " + r + " < 100 и 100 < " + k);
        }
        if (r < 100 && k <= 100) {
            System.out.println("Только условие на R истинно. " + r + " < 100");
        }
        if (100 <= r && 100 < k) {
            System.out.println("Только условие на K истинно. 100 < " + k);
        }
        if (100 <= r && k <= 100) {
            System.out.println("Оба условия ложны");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два числа: R, K. " +
                " Нужно подставить эти числа в условия R < 100 и 100 < K. " +
                " Вывести на экран одно из сообщений:" +
                " 'Оба условия истинны'." +
                " 'Только условие на R истинно'," +
                " 'Только условие на K истинно'," +
                " 'Оба условия ложны'.");
        appendCheckValuesHeader("R", "K");
        appendCheckValuesRow("50", "150");
        appendCheckValuesRow("70", "80");
        appendCheckValuesRow("200", "300");
        appendCheckValuesRow("400", "20");
        appendCheckValuesRow("-3", "0");
        appendCheckValuesRow("0", "-3");
        appendCheckValuesRow("100", "100");
        appendCheckValuesFooter();
        appendFooter();
    }
}
