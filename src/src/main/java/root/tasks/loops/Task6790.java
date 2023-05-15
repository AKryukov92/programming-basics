package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task6790 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число X. Оно обозначает количество градусов. Вычислить 20 следующих значений с шагом 50. Справа от каждого числа вывести соответствующее значение в радианах и результат вычисления функции 5*cos(x).");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("0");
        appendCheckValuesRow("20");
        appendCheckValuesRow("97");
        appendCheckValuesRow("-33");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double xDeg = Integer.parseInt(value);
        int i = 0;
        System.out.println("Градусы\tРадианы\tФункция");
        while (i < 20) {
            double xRad = Math.toRadians(xDeg);
            double current = 5 * Math.cos(Math.toRadians(xDeg));
            System.out.printf("%5.0f\t%8.4f\t%8.4f\n",xDeg, xRad, current);
            xDeg += 50;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6790());
    }
}
