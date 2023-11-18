package root.tasks.calculations;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class TaskJava4411 extends StreamInputLayout {
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
        appendTaskDescEscaped("В этой задаче вам нужно получить от пользователя число. Это число может иметь цифры после запятой. Для сохранения таких чисел в памяти нужно объявить переменную типа double.");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescNonEscaped("Если вы получили ошибку:");
        appendCheckSingleNonEscaped("Exception in thread \"main\" java.util.InputMismatchException\n" +
                "\tat java.util.Scanner.throwFor(Scanner.java:864)\n" +
                "\tat java.util.Scanner.next(Scanner.java:1485)\n" +
                "\tat java.util.Scanner.nextDouble(Scanner.java:2413)");
        appendTaskDescNonEscaped("Значит при вводе данных был напечатан неподходящий разделитель целой части. Такая проблема возникает из за различных настроек операционной системы. Обычно выбор между запятой <zoom>,</zoom> и точкой <zoom>.</zoom>. Если один из этих символов не подошел, используйте другой.");
        appendFooter();
    }

    //parseDouble тут указан из за странной InputMismatchException, которая возникает при указании точки
    //а также потому что в практических по массивам нужно не переучивать людей со сканера на парсинг
    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        double x;           //объявление переменной типа double для числа с цифрами после запятой
        x = Double.parseDouble(s.nextLine()); //читаем значение от пользователя
        double result;      //объявление переменной для результата
        result = x + 7;     //вычисление результата
        System.out.printf("Результат равен %.4f", result); //Выражение %.4f обозначает, что нужно напечатать 4 знака после запятой
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4411());
    }
}
