package root.tasks.exceptions;

import root.tasks.MethodsDictationHelper;
import root.tasks.TwoInputValLayout;

public class TaskJava9058 extends TwoInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(3943));
        appendOrderedNonEscaped(
                implementStatic("Library", "Task3943"),
                "Метод Task3943 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащее текст ошибки из задачи.",
                "Создайте класс Runner3943, реализуйте в нем метод main."
        );
        appendSubheading("Реализуйте метод main");
        appendOrderedNonEscaped(
                "Выведите сообщение \"Начало работы программы\".",
                "Выведите в консоль сообщение \"Введите значения x и y\"",
                "Объявите переменные x и y для хранения целых чисел.",
                "Инициализируйте переменные x и y значениями, полученными из консоли.",
                "Объявите переменную result для хранения действительных чисел.",
                "Вызовите метод Task3943 класса Library и передайте ему x и y в качестве аргументов.",
                "Результат вызова метода запишите в переменную result.",
                "Выведите на экран сообщение \"Результат равен\" и значение переменной result с точностью 4 знака после запятой.",
                "Выведите сообщение \"Конец работы программы\"."
        );
        appendSubheading("Проверьте, что программа выбрасывает необработанные исключения");
        appendCheckValuesHeader("x", "y");
        appendCheckValuesRowNoLogic("-5", "81",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "-5\n" +
                        "81\n" +
                        "Результат равен -10.0000\n" +
                        "Конец работы программы");
        appendCheckValuesRowNoLogic("13", "36",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "13\n" +
                        "36\n" +
                        "Результат равен -21,7945\n" +
                        "Конец работы программы");
        appendCheckValuesRowNoLogic("-20", "36",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "-20\n" +
                        "36\n" +
                        "Exception in thread \"main\" java.lang.IllegalArgumentException:\n" +
                        "    Подкоренное выражение должно быть неотрицательно\n" +
                        "\tat Library.task3943(Library.java:6)\n" +
                        "\tat Runner3943.main(Runner3943.java:36)");
        appendCheckValuesRowNoLogic("20", "-50",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "20\n" +
                        "-50\n" +
                        "Exception in thread \"main\" java.lang.IllegalArgumentException:\n" +
                        "    Значение y должно быть неотрицательным\n" +
                        "\tat Library.task3943(Library.java:6)\n" +
                        "\tat Runner3943.main(Runner3943.java:36)");
        appendCheckValuesRowNoLogic("word", "",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "word\n" +
                        "Exception in thread \"main\" java.util.InputMismatchException\n" +
                        "    at java.util.Scanner.throwFor(Scanner.java:864)\n" +
                        "    at java.util.Scanner.next(Scanner.java:1485)\n" +
                        "    at java.util.Scanner.nextInt(Scanner.java:2117)\n" +
                        "    at java.util.Scanner.nextInt(Scanner.java:2076)\n" +
                        "    at Runner1934.main(Runner3943.java:35)");
        appendCheckValuesFooter();
        appendSubheading("Обработайте исключения");
        appendOrderedNonEscaped(
                "Обработайте ArgumentException так, чтобы на экран выводилось сообщение из исключения \"Подкоренное выражение должно быть неотрицательно\"",
                "Обработайте FormatException так, чтобы на экран выводилась фраза \"Не удалось преобразовать строку в число\"",
                "Стек вызовов не должен выводиться не экран в случае ошибки.",
                "Фраза \"Конец работы программы\" должна выводиться на экран как в случае ошибки, так и в случае успешного результата.",
                "Фраза \"Результат равен\" не должна выводиться на экран в случае ошибки"
        );
        appendSubheading("Проверьте, что результат работы совпадает с ожидаемым");
        appendCheckValuesHeader("x", "y");
        appendCheckValuesRow("-5", "81");
        appendCheckValuesRow("13", "36");
        appendCheckValuesRow("-20", "36");
        appendCheckValuesRow("20", "-50");
        appendCheckValuesRow("word", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        try {
            double x = Double.parseDouble(firstValue);
            double y = Double.parseDouble(secondValue);
            System.out.println("Начало работы программы");
            task3943(x, y);
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось преобразовать строку в число");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Конец работы программы");
    }

    public static void task3943(double x, double y) {
        if (y < 0) {
            throw new IllegalArgumentException("Значение y должно быть неотрицательным");
        }
        if (x + Math.sqrt(y) < 0) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным");
        }
        if (x + Math.sqrt(y) >= 0) {
            double result = -5 * Math.sqrt(x + Math.sqrt(y));
            System.out.printf("Результат вычислений %.4f", result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9058());
    }
}
