package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class TaskJava4411 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("11.13");
        appendCheckValuesRow("-79.19");
        appendCheckValuesRow("0");
        appendCheckValuesRow("6.00006");
        appendCheckValuesRow("9.00004");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В этой задаче вам нужно получить от пользователя число. Для сохранения его в памяти нужно объявить переменную типа double.");
        appendCheckSingleNonEscaped(
                "Scanner input = new Scanner(System.in);\n" +
                "double x;              //объявление переменной типа double для исходных данных\n" +
                "x = input.nextDouble();//читаем значение от пользователя\n" +
                "double result;         //объявление переменной для результата\n" +
                "result = x + 7;        //вычисление результата\n" +
                "System.out.printf(\"Результат равен %.4f\", result); //Выражение F4 обозначает, что нужно напечатать 4 знака после запятой");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        double result;
        result = x + 7;
        System.out.printf("Результат равен %.4f", result);
    }
}
