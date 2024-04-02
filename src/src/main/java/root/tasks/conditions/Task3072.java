package root.tasks.conditions;

import root.tasks.TwoInputValLayout;

import java.sql.SQLException;

public class Task3072 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два числа P и Q. Определить какое из них максимальное, а какое - минимальное. Вычислить абсолютную разницу между ними. Результат оформить по шаблону:");
        appendCheckSingleNonEscaped("Максимальное $max, минимальное $min. Разница $diff.");
        appendCheckValuesHeader("P", "Q");
        appendCheckValuesRow("173", "179");
        appendCheckValuesRow("359", "271");
        appendCheckValuesRow("439", "-761");
        appendCheckValuesRow("5", "5");
        appendCheckValuesRow("0", "-15");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) throws SQLException {
        int p = Integer.parseInt(firstValue);
        int q = Integer.parseInt(secondValue);
        if (p > q) {
            System.out.println("Максимальное " + p + ", минимальное " + q + ". Разница " + (p - q) + ".");
        } else {
            System.out.println("Максимальное " + q + ", минимальное " + p + ". Разница " + (q - p) + ".");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3072());
    }
}
