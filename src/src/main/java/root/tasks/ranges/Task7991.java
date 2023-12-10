package root.tasks.ranges;

import root.tasks.MultipleInputValLayout;

public class Task7991 extends MultipleInputValLayout {

    @Override
    protected void logic(String... args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        if (-11 < x) {
            if (x < 13) {
                System.out.println(x);
            }
        }
        if (-11 < y) {
            if (y < 13) {
                System.out.println(y);
            }
        }
        if (-11 < z) {
            if (z < 13) {
                System.out.println(z);
            }
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны три действительных числа. Вывести только те числа, которые принадлежат интервалу (-11;13) исключая границы.");
        appendCheckValuesHeader("X", "Y", "Z");
        appendCheckValuesRow("9", "10", "11");
        appendCheckValuesRow("3", "20", "0");
        appendCheckValuesRow("12", "2", "-40");
        appendCheckValuesRow("30", "-5", "7");
        appendCheckValuesRow("50", "50", "50");
        appendCheckValuesRow("-4", "25", "15");
        appendCheckValuesRow("-11", "0", "13");
        appendCheckValuesRow("13", "-11", "6");
        appendCheckValuesRow("8", "13", "-11");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7991().getContent());
    }
}
