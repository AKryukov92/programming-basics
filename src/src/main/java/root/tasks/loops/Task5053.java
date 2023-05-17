package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task5053 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран <i>в строчку</i> числа от from до to включительно. Если from < to,  то в порядке возрастания. Иначе - в порядке убывания. Перед списком чисел напишите в каком порядке они выводились.");
        appendCheckValuesHeader("from", "to");
        appendCheckValuesRow("8", "13");
        appendCheckValuesRow("27", "17");
        appendCheckValuesRow("19", "19");
        appendCheckValuesRow("691", "702");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int from = Integer.parseInt(firstValue);
        int to = Integer.parseInt(secondValue);
        if (from < to) {
            System.out.println("По возрастанию");
            while (from <= to) {
                System.out.print(from + " ");
                from++;
            }
        } else {
            System.out.println("По убыванию");
            while (to <= from) {
                System.out.print(from + " ");
                from--;
            }
        }
    }
}
