package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

public class Task2802 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int n = Integer.parseInt(value);
        if (n <= 0){
            System.out.println("Значение N должно быть положительным");
            return;
        }
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.printf("Сумма ряда %.4f", sum);
        System.out.println();
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дано целое число n. Вычислить сумму ряда <formula>\n" +
                "1+\n" +
                "<fraction>\n" +
                "<numerator>1</numerator>\n" +
                "<denominator>2</denominator>\n" +
                "</fraction>\n" +
                "+\n" +
                "<fraction>\n" +
                "<numerator>1</numerator>\n" +
                "<denominator>3</denominator>\n" +
                "</fraction>\n" +
                "+...+\n" +
                "<fraction>\n" +
                "<numerator>1</numerator>\n" +
                "<denominator>n</denominator>\n" +
                "</fraction>\n" +
                "</formula>");
        appendCheckValuesHeader("N", "sum");
        appendCheckValuesRow("4");
        appendCheckValuesRow("11");
        appendCheckValuesRow("19");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("0");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2802().getContent());
    }
}
