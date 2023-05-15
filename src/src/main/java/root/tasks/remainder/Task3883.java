package root.tasks.remainder;

import root.tasks.OneInputValLayout;

public class Task3883 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано целое число А. Если значение A находится за пределами интервала от 1000 до 9999, то вывести сообщение об ошибке. Определите количество сотен. Для этого разделите A на 100 и найдите остаток от деления на 10. Определите количество единиц. Для этого найдите остаток от деления на 10. Если количество сотен равно количеству единиц, то оформить результат по шаблону 1. В ином случае - по шаблону 2.");
        appendCheckSingleNonEscaped("Количество сотен: $hundreds\n" +
                "Количество единиц: $units\n" +
                "Количество сотен равно количеству единиц.");
        appendCheckSingleNonEscaped("Количество сотен: $hundreds\n" +
                "Количество единиц: $units\n" +
                "Количество сотен не равно количеству единиц.");
        appendCheckValuesHeader("A");
        appendCheckValuesRow("1234");
        appendCheckValuesRow("6543");
        appendCheckValuesRow("9812");
        appendCheckValuesRow("9171");
        appendCheckValuesRow("100");
        appendCheckValuesRow("98765");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int a = Integer.parseInt(value);
        if (a < 1000 || a > 9999) {
            System.out.println("Значение A должно быть в интервале от 1000 до 9999 включительно");
            return;
        }
        int hundreds = a / 100 % 10;
        int units = a % 10;
        System.out.printf("Количество сотен: %d\n", hundreds);
        System.out.printf("Количество единиц: %d\n", units);
        if (hundreds == units) {
            System.out.println("Количество сотен равно количеству единиц");
        } else {
            System.out.println("Количество сотен не равно количеству единиц.");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3883());
    }
}
