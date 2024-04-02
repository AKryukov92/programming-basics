package root.tasks.conditions;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task5980 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано действительное число K. Если оно положительно, вычислить квадратный корень из него. Иначе - квадрат числа. Результат оформите по шаблону:");
        appendCheckSingleNonEscaped("Корень из $K равен $root.\n");
        appendCheckSingleNonEscaped("Квадрат из $K равен $square.");
        appendCheckValuesHeader("K");
        appendCheckValuesRow("9");
        appendCheckValuesRow("13.94");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-7.8");
        appendCheckValuesRow("-0.25");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        double k = Double.parseDouble(value);
        if (k > 0) {
            System.out.printf("Корень из %.4f равен %.4f\n", k, Math.sqrt(k));
        } else {
            System.out.printf("Квадрат числа %.4f равен %.4f\n", k, k * k);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5980());
    }
}
