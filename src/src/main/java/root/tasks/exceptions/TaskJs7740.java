package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

public class TaskJs7740 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrderedNonEscaped(
                "В папке с задачами создайте файл task7740.html.",
                "Создайте в нем одно поле для ввода, поле для вывода результата и кнопку.",
                "Решите описанную ниже задачу. Исходные данные пользователь вводит вручную.",
                "Обработайте ситуацию, когда пользователь вводит не числа."
        );
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры");
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
}
