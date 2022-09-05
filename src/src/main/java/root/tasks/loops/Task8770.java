package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task8770 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дано число (X) в интервале от 30 до 40. Нужно вывести числа от 30 до 40 включительно в столбик и поставить символ \"+\" справа от введенного числа X и символ \"-\" справа от всех остальных.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("30");
        appendCheckValuesRow("31");
        appendCheckValuesRow("37");
        appendCheckValuesRow("40");
        appendCheckValuesRow("8");
        appendCheckValuesRow("100");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        int i = 30;
        while (i <= 40) {
            if (i == x) {
                System.out.println(i + "+");
            } else {
                System.out.println(i + "-");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8770());
    }
}
