package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task6028 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число X. Вывести на экран в столбик число X, а также 20 следующих чисел с шагом 67. Справа от каждого числа вывести результат вычисления функции 3+10*cos(x). Если значение функции больше 11 или меньше -6, то написать \"ЗА ПРЕДЕЛАМИ\".");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("0");
        appendCheckValuesRow("15");
        appendCheckValuesRow("139");
        appendCheckValuesRow("-40");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double xDeg = Integer.parseInt(value);
        int i = 0;
        System.out.println("Градусы\tРадианы\tФункция");
        while(i < 20) {
            double xRad = Math.toRadians(xDeg);
            double current = 3 + 10 * Math.cos(xRad);
            System.out.printf("%5.0f\t%7.4f\t%8.4f", xDeg, xRad, current);
            if (current < -6 || 11 < current) {
                System.out.println("\tЗА ПРЕДЕЛАМИ");
            } else {
                System.out.println();
            }
            xDeg += 67;
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6028());
    }
}
