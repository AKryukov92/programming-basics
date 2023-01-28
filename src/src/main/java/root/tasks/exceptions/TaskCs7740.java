package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

public class TaskCs7740 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrdered(
                "В решении Stage2 создайте проект Runner7740 типа \"Консольное приложение\".",
                "Решите описанную ниже задачу. Исходные данные пользователь вводит вручную.",
                "Обработайте потенциальное исключение, которое возникает когда пользователь вводит не числа."
        );
        appendTaskDesc("Вычислить результат по формуле x + 7, где x вводится с клавиатуры");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("11.13");
        appendCheckValuesRow("-7919");
        appendCheckValuesRow("0");
        appendCheckValuesRow("word");
        appendCheckValuesRow("$14");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        try {
            double x= Double.parseDouble(value);
            double result = x + 7;
            System.out.printf("%.4f", result);
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs7740());
    }
}
