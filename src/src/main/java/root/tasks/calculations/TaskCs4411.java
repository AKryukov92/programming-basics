package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class TaskCs4411 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры. При вводе чисел в консоль, между целой и дробной частью нужно ставить запятую, а не точку как в тестах.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("11.13");
        appendCheckValuesRow("-79.19");
        appendCheckValuesRow("0");
        appendCheckValuesRow("6.00006");
        appendCheckValuesRow("9.00004");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В этой задаче вам нужно получить от пользователя число. Для сохранения его в памяти нужно объявить переменную типа double.");
        appendCheckSingleNonEscaped(
                "double x;              //объявление переменной типа double для исходных данных\n" +
                        "x = Double.parse(Console.ReadLine());//читаем значение от пользователя\n" +
                        "double result;         //объявление переменной для результата\n" +
                        "result = x + 7;        //вычисление результата\n" +
                        "Console.WriteLine(\"Результат равен {0:F4}\", result); //Выражение F4 обозначает, что нужно напечатать 4 знака после запятой");
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
