package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

import java.util.InputMismatchException;

public class TaskJava7740 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrdered(
                "В папке с исходным кодом создайте класс Runner7740",
                "Создайте метод main в классе Runner7740 по аналогии с методами main из задач прошлых практических.",
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
        System.out.println(new TaskJava7740());
    }
}
