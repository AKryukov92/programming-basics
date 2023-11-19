package root.tasks.ranges;

import root.tasks.MultipleInputValLayout;

public class Task8715 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны действительные числа a, b, c. Проверить, выполняются ли неравенства a&lt;b&lt;c.");
        appendCheckValuesHeader("A", "B", "C");
        appendCheckValuesRow("1", "2", "3");
        appendCheckValuesRow("-4", "0", "5");
        appendCheckValuesRow("-3", "-2", "-3");
        appendCheckValuesRow("7", "4", "-2");
        appendCheckValuesRow("0", "5", "-7");
        appendCheckValuesRow("4","4", "4");
        appendCheckValuesRow("-2", "4", "3");
        appendCheckValuesRow("10", "3", "5");
        appendCheckValuesRow("5", "1", "7");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a < b) {
            if (b < c) {
                System.out.println("Истинно");
            }
            if (c <= b) {
                System.out.println("Ложно");
            }
        }
        if (b <= a) {
            System.out.println("Ложно");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8715());
    }
}
