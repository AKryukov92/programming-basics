package root.tasks.arrays_of_numbers;

import root.tasks.MultipleInputValLayout;

public class Task3850 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит три числа: начало интервала, конец интервала и количество частей. Нужно разделить интервал на несколько равных частей и написать на каких числах происходит разделение.");
        appendCheckValuesHeader("start", "end", "amount");
        appendCheckValuesRow("0", "100", "5");
        appendCheckValuesRow("10", "20", "2");
        appendCheckValuesRow("-50", "50", "4");
        appendCheckValuesRow("20", "40", "3");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double start = Double.parseDouble(args[0]);
        double end = Double.parseDouble(args[1]);
        double amount = Double.parseDouble(args[2]);
        if (start >= end) {
            System.out.println("Начало интервала должно быть меньше чем конец интервала");
            return;
        }
        double width = end - start;
        double partWidth = width / amount;
        double i = start + partWidth;
        System.out.printf("Интервал от %.4f до %.4f делится на %.0f частей шириной %.4f. Получаются интервалы:\n",
                start, end, partWidth, amount);
        double prev = start;
        while (i < end) {
            System.out.printf("от %.4f до %.4f\n", prev, i);
            prev = i;
            i += partWidth;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3850());
    }
}
