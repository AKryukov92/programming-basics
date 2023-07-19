package root.tasks.arrays_of_numbers;

import root.tasks.MultipleInputValLayout;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        //задачу можно решить без массива!
        throw new NotImplementedException();
    }
}
