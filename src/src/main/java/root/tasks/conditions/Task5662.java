package root.tasks.conditions;

import root.tasks.MultipleInputValLayout;

public class Task5662 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны вещественные числа a, b, c. Если a равно 0, вывести сообщение об ошибке \"Уравнение не является квадратным\". Найдите в прошлых работах формулу для вычисления дискриминанта, вычислите его и напишите одно из трех сообщений в зависимости от полученного значения.");
        appendOrderedEscaped(
                "Если дискриминант равен 0, то у уравнения один вещественный корень.",
                "Если дискриминант меньше 0, то у уравнения нет вещественных корней.",
                "Если дискриминант больше 0, то у уравнения два вещественных корня."
        );
        appendCheckValuesHeader("a", "b", "c");
        appendCheckValuesRow("1", "2", "3");
        appendCheckValuesRow("11", "13", "19");
        appendCheckValuesRow("3", "17", "5");
        appendCheckValuesRow("5", "31", "29");
        appendCheckValuesRow("3", "6", "3");
        appendCheckValuesRow("1", "2", "1");
        appendCheckValuesRow("0", "7", "13");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == 0) {
            System.out.println("Данное уравнение не является квадратным");
        }
        if (a != 0) {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                System.out.println("У уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 два вещественных корня");
            }
            if (d == 0) {
                System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень");
            }
            if (d < 0) {
                System.out.println("Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет");
            }
        }
    }
}