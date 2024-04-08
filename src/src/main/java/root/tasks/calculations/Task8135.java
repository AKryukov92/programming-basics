package root.tasks.calculations;

import root.tasks.MultipleInputValLayout;

import java.sql.SQLException;

public class Task8135 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит вещественные числа a, b, c. Оформить квадратное уравнение с учетом знаков. В результате не должно быть знаков + и - рядом. Если какой-то из множителей равен 1, то он не пишется. Если какой-то из множителей равен 0, то все слагаемое не пишется.");
        appendCheckValuesHeader("a", "b", "c");
        appendCheckValuesRow("5", "2", "3");
        appendCheckValuesRow("-2", "2", "3");
        appendCheckValuesRow("1", "2", "3");
        appendCheckValuesRow("-1", "2", "3");
        appendCheckValuesRow("0", "2", "3");
        appendCheckValuesRow("5", "1", "7");
        appendCheckValuesRow("5", "-1", "7");
        appendCheckValuesRow("5", "-3", "7");
        appendCheckValuesRow("5", "0", "7");
        appendCheckValuesRow("5", "3", "-4");
        appendCheckValuesRow("5", "3", "-1");
        appendCheckValuesRow("5", "3", "1");
        appendCheckValuesRow("5", "3", "0");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Для удобства проверки, вы можете оформить ответ в виде:");
        appendCheckSingleNonEscaped("Должно быть: 5*x^2 -3*x +7 = 0 //здесь пишите текст из тестовых данных\n" +
                                    "Получилось : 5*x^2 -3*x +7 = 0//здесь расположите результат вызова метода");
        appendTaskDescEscaped("Оформите все тестовые случаи таким образом. Таким образом вы сможете быстро увидеть в каких случаях фактический результат отличается от ожидаемого.");
        appendFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == 1) {
            System.out.print("x^2 ");
        } else if (a != 0) {
            System.out.print(a + "*x^2 ");
        }
        if (a == 0 && b == 1) {
            System.out.println("x ");
        } else if (b == 1) {
            System.out.print("+x ");
        } else if (b < 0) {
            System.out.print(b + "*x ");
        } else if (a == 0 && b > 0) {
            System.out.print(b + "*x ");
        } else if (b > 0) {
            System.out.print("+" + b + "*x ");
        }
        if (c < 0) {
            System.out.print(c);
        } else if (c > 0) {
            System.out.print("+" + c);
        }
        System.out.println(" = 0");
    }

    public static void main(String[] args) {
        System.out.println(new Task8135());
    }
}
