package root.tasks.ranges;

import root.tasks.OneInputValLayout;

public class Task9705 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дано несколько интервалов:");
        appendOrdered(
                "от 10 до 17",
                "от 14 до 137",
                "от 47 до 144",
                "от 100 до 171"
        );
        appendTaskDesc("Нужно реализовать программу для проверки попадания числа x в эти интервалы. Границы проверяются исключительно.");
        appendTaskDesc("Также нужно проанализировать итервалы и найти такое число, которое попадает в 1 и 2 интервал, и при этом не попадает в 3 и 4.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("0");
        appendCheckValuesRow("22");
        appendCheckValuesRow("10");
        appendCheckValuesRow("71");
        appendCheckValuesRow("111");
        appendCheckValuesRow("168");
        appendCheckValuesRow("200");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        boolean from10to17 = 10 < x && x < 17;
        boolean from14to137 = 14 < x && x < 137;
        boolean from47to144 = 47 < x && x < 144;
        boolean from100to171 = 100 < x && x < 171;
        if (from10to17) {
            System.out.printf("%d попадает в интервал от 10 до 17 исключительно\n", x);
        } else {
            System.out.printf("%d за пределами интервала от 10 до 17 исключительно\n", x);
        }
        if (from14to137) {
            System.out.printf("%d попадает в интервал от 14 до 137 исключительно\n", x);
        } else {
            System.out.printf("%d за пределами интервала от 14 до 137 исключительно\n", x);
        }
        if (from47to144) {
            System.out.printf("%d попадает в интервал от 47 до 144 исключительно\n", x);
        } else {
            System.out.printf("%d за пределами интервала от 47 до 144 исключительно\n", x);
        }
        if (from100to171) {
            System.out.printf("%d попадает в интервал от 100 до 171 исключительно\n", x);
        } else {
            System.out.printf("%d за пределами интервала от 100 до 171 исключительно\n", x);
        }
        if (from10to17 && from14to137 && !from47to144 && !from100to171) {
            System.out.println("Значение найдено");
        } else {
            System.out.println("Значение не подходит");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9705());
    }
}
