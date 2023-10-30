package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task8833 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить результат по формуле <formula><sqrt><val>x</val></sqrt></formula>. Сообщите об ошибке если пользователь ввел отрицательное число Воспользуйтесь стандартной функцией:");
        appendCheckSingleNonEscaped("result = Math.sqrt(x);");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("7606");
        appendCheckValuesRow("9");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-7603");
        appendCheckValuesRow("-1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        if (x < 0) {
            System.out.println("Значение X должно быть неотрицательным");
        }
        if (0 <= x) {
            double result = Math.sqrt(x);
            System.out.printf("Корень из %.4f равен %.4f", x, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8833());
    }
}
