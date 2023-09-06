package root.tasks.exceptions;

import root.tasks.TwoInputValLayout;

public class TaskJava5259 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task1934 для решения задачи" + linkToTask(1934),
                "Метод Task1934 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException, содержащее текст ошибки из задачи.",
                "В папке с исходным кодом создайте класс Runner1934.",
                "Создайте метод main в классе Runner1934 по аналогии с методами main из задач прошлых практических.",
                "Создайте еще один метод в классе Runner1934. Назовите его step1934. Он ничего не возвращает и не принимает аргументов."
        );
        appendSubheading("Реализуйте метод Main");
        appendOrderedNonEscaped(
                "Выведите сообщение \"Начало работы программы\".",
                "Выведите в консоль сообщение \"Введите значения A и B\".",
                "Объявите переменные a и b для хранения целых чисел.",
                "Инициализируйте переменные a и b значениями, полученными из консоли.",
                "Объявите переменную result для хранения действительных чисел.",
                "Вызовите метод Task1934 класса Library и передайте ему a и b в качестве аргументов.",
                "Результат вызова метода запишите в переменную result.",
                "Выведите на экран сообщение \"Результат равен \" и значение переменной result с точностью 4 знака после запятой.",
                "Выведите сообщение \"Программа завершена успешно\".",
                "В результате запуска метода main класса Runner1934, в консоли должен выводиться текст из таблицы с тестовыми данными, из колонки \"Исходный результат\". Возможны отличия в номерах строк и расположении файлов."
        );
        appendSubheading("Проверьте, что метод выбрасывает необработанные исключения");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRowNoLogic("5", "-11",
                "Начало работы программы\n" +
                        "Введите значения A и B\n" +
                        "5\n" +
                        "-11\n" +
                        "Результат равен 43.8748\n" +
                        "Программа завершена успешно");
        appendCheckValuesRowNoLogic("-3", "-7",
                "Начало работы программы\n" +
                        "Введите значения A и B\n" +
                        "-3\n" +
                        "-7\n" +
                        "Результат равен -21.0000\n" +
                        "Программа завершена успешно");
        appendCheckValuesRowNoLogic("13", "15", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "13\n" +
                "15\n" +
                "Exception in thread \"main\" java.lang.IllegalArgumentException:\n" +
                "    Подкоренное выражение должно быть неотрицательно\n" +
                "\tat Library.task1934(Library.java:6)\n" +
                "\tat Runner1934.main(Runner1934.java:36)");
        appendCheckValuesRowNoLogic("word", "4", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "word\n" +
                "Exception in thread \"main\" java.util.InputMismatchException\n" +
                "    at java.util.Scanner.throwFor(Scanner.java:864)\n" +
                "    at java.util.Scanner.next(Scanner.java:1485)\n" +
                "    at java.util.Scanner.nextInt(Scanner.java:2117)\n" +
                "    at java.util.Scanner.nextInt(Scanner.java:2076)\n" +
                "    at Runner1934.main(Runner1934.java:35)");
        appendCheckValuesRowNoLogic("11", "incorrect", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "11\n" +
                "word\n" +
                "Exception in thread \"main\" java.util.InputMismatchException\n" +
                "    at java.util.Scanner.throwFor(Scanner.java:864)\n" +
                "    at java.util.Scanner.next(Scanner.java:1485)\n" +
                "    at java.util.Scanner.nextInt(Scanner.java:2117)\n" +
                "    at java.util.Scanner.nextInt(Scanner.java:2076)\n" +
                "    at Runner1934.main(Runner1934.java:35)");
        appendCheckValuesFooter();
        appendSubheading("Обработайте исключения");
        appendOrderedNonEscaped(
                "Обработайте IllegalArgumentException так, чтобы на экран выводилось сообщение из исключения \"Подкоренное выражение должно быть неотрицательно\"",
                "Обработайте InputMismatchException так, чтобы на экран выводилась фраза \"Не удалось преобразовать строку в число\"",
                "Стек вызовов не должен выводиться не экран в случае ошибки",
                "Фраза \"Программа завершена успешно\" не должна выводиться на экран в случае ошибки",
                "Фраза \"Результат равен\" не должна выводиться на экран в случае ошибки"
        );
        appendSubheading("Проверьте, что результат работы совпадает с ожидаемым");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("5", "-11");
        appendCheckValuesRow("-3", "-7");
        appendCheckValuesRow("13", "15");
        appendCheckValuesRow("word", "4");
        appendCheckValuesRow("11", "incorrect");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        try {
            System.out.println("Начало работы программы");
            System.out.println("Введите значения A и B");
            double a = Double.parseDouble(firstValue);
            double b = Double.parseDouble(secondValue);
            double result = task1934(a, b);
            System.out.printf("Результат равен %.4f\n", result);
            System.out.println("Программа завершена успешно");
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось преобразовать строку в число");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    protected double task1934(double a, double b) {
        if (b > 0) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно");
        }
        return a * Math.sqrt(-7 * b);
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava5259());
    }
}
