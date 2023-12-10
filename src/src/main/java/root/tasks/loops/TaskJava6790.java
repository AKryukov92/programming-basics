package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class TaskJava6790 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число X. Оно обозначает количество градусов. Вычислить 20 следующих значений с шагом 50 (iDeg). Справа от каждого числа вывести соответствующее значение в радианах (iRad) и результат вычисления функции y=5*cos(iRad). Чтобы красиво оформить столбики чисел, напишите после чисел символ табуляции \"\\t\".");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("0");
        appendCheckValuesRow("20");
        appendCheckValuesRow("97");
        appendCheckValuesRow("-33");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Подробное решение для первых двух строк текста:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    private class Verbose {
    protected void logic(String value) {
        double xRad, current, xDeg;
        xDeg = Integer.parseInt(value);
        int i = 0;
        System.out.println("Градусы\tРадианы\tФункция");
        if (i < 20) {
            xRad = xDeg * Math.PI / 180;
            current = 5 * Math.cos(xRad);
            System.out.printf("%.0f\t%.4f\t%.4f\n", xDeg, xRad, current);
            xDeg = xDeg + 50;
            i = i + 1;
        }
        if (i < 20) {
            xRad = xDeg * Math.PI / 180;
            current = 5 * Math.cos(xRad);
            System.out.printf("%.0f\t%.4f\t%.4f\n", xDeg, xRad, current);
            xDeg = xDeg + 50;
            i = i + 1;
        }
    }
    }

    @Override
    protected void logic(String value) {
        double xDeg = Integer.parseInt(value);
        int i = 0;
        System.out.println("Градусы\tРадианы\tФункция");
        while (i < 20) {
            double xRad = xDeg * Math.PI / 180;
            double current = 5 * Math.cos(xRad);
            System.out.printf("%.0f\t%.4f\t%.4f\n",xDeg, xRad, current);
            xDeg = xDeg + 50;
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava6790());
    }
}
