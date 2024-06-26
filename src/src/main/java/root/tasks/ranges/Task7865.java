package root.tasks.ranges;

import root.tasks.OneInputValLayout;

public class Task7865 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два интервала чисел Красный [-11;-3] Зеленый [5;19]. Пользователь вводит значение X. Определить, к какому интервалу относится число: к красному или к зеленому. Границы нужно проверять включительно.");
        appendCheckValuesHeader("x");
        appendCheckValuesRow("-5");
        appendCheckValuesRow("-11");
        appendCheckValuesRow("-3");
        appendCheckValuesRow("10");
        appendCheckValuesRow("5");
        appendCheckValuesRow("19");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-20");
        appendCheckValuesRow("20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        if (-11 <= x) {
            if (x <= -3) {
                System.out.println("Красный");
            }
        }
        if (5 <= x) {
            if (x <= 19) {
                System.out.println("Зеленый");
            }
        }
        if (x < -11) {
            System.out.println("X не попадает ни в зеленый, ни в красный интервал");
        }
        if (-3 < x) {
            if (x < 5) {
                System.out.println("X не попадает ни в зеленый, ни в красный интервал");
            }
        }
        if (19 < x) {
            System.out.println("X не попадает ни в зеленый, ни в красный интервал");
        }
    }
}
