package root.tasks.exceptions;

import root.tasks.MethodsDictationHelper;
import root.tasks.TwoInputValLayout;

public class TaskCs5259 extends TwoInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(1934));
        appendOrderedNonEscaped(
                implementStatic("Library", "Task1934"),
                "Метод Task1934 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение ArgumentException, содержащее текст ошибки из задачи.",
                "Создайте проект Runner1934.",
                "В проекте Runner1934 добавьте ссылку на проект CodeProject.",
                "Добавьте команду using пространства имен из проекта CodeProject.",
                "Создайте ещё один метод в классе Program проекта Runner1934. Назовите его Step1934. Он ничего не возвращает и не принимает аргументов."
        );
        appendSubheading("Реализуйте метод Step1934");
        appendOrderedNonEscaped(
                "Выведите в консоль сообщение \"Введите значения A и B\".",
                "Объявите переменные a и b для хранения целых чисел.",
                "Инициализируйте переменные a и b значениями, полученными из консоли.",
                "Объявите переменную result для хранения действительных чисел.",
                "Вызовите метод Task1934 класса Library и передайте ему a и b в качестве аргументов.",
                "Результат вызова метода запишите в переменную result.",
                "Выведите на экран сообщение \"Результат равен \" и значение переменной result с точностью 4 знака после запятой."
        );
        appendSubheading("Оформите метод Main");
        appendOrderedNonEscaped(
                "Выведите сообщение \"Начало работы программы\".",
                "Вызовите метод Step1934.",
                "Выведите сообщение \"Программа завершена успешно\".",
                "В результате запуска проекта Runner1934, в консоли должен выводиться текст из таблицы с тестовыми данными, из колонки \"Исходный результат\". Возможны отличия в номерах строк и расположении файлов."
        );
        appendSubheading("Проверьте, что метод выбрасывает исключения");
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
                "Unhandled Exception: System.ArgumentException: Подкоренное выражение должно быть неотрицательно\n" +
                "   at CodeProject.Library.Task1934(Int32 a, Int32 b) in E:\\Stage2\\CodeProject\\Library.cs:line 197\n" +
                "   at Runner1934.Program.Step1934() in E:\\Stage2\\Runner1934\\Program.cs:line 24\n" +
                "   at Runner1934.Program.Main(String[] args) in E:\\Stage2\\Runner1934\\Program.cs:line 15");
        appendCheckValuesRowNoLogic("word", "4", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "word\n" +
                "Unhandled Exception: System.FormatException: Input string was not in a correct format.\n" +
                "   at System.Number.StringToNumber(String str, NumberStyles options, \n" +
                "       NumberBuffer& number, NumberFormatInfo info, Boolean parseDecimal)\n" +
                "   at System.Number.ParseInt32(String s, NumberStyles style, NumberFormatInfo info)\n" +
                "   at System.Int32.Parse(String s)\n" +
                "   at Runner1934.Program.Step1934() in E:\\Stage2\\Runner1934\\Program.cs:line 23\n" +
                "   at Runner1934.Program.Main(String[] args) in E:\\Stage2\\Runner1934\\Program.cs:line 15");
        appendCheckValuesRowNoLogic("11", "incorrect", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "11\n" +
                "word\n" +
                "Unhandled Exception: System.FormatException: Input string was not in a correct format.\n" +
                "   at System.Number.StringToNumber(String str, NumberStyles options,\n" +
                "       NumberBuffer& number, NumberFormatInfo info, Boolean parseDecimal)\n" +
                "   at System.Number.ParseInt32(String s, NumberStyles style, NumberFormatInfo info)\n" +
                "   at System.Int32.Parse(String s)\n" +
                "   at Runner1934.Program.Step1934() in E:\\Stage2\\Runner1934\\Program.cs:line 24\n" +
                "   at Runner1934.Program.Main(String[] args) in E:\\Stage2\\Runner1934\\Program.cs:line 15");
        appendCheckValuesFooter();
        appendSubheading("Обработайте исключения");
        appendOrderedNonEscaped(
                "Обработайте ArgumentException так, чтобы на экран выводилось сообщение из исключения \"Подкоренное выражение должно быть неотрицательно\"",
                "Обработайте FormatException так, чтобы на экран выводилась фраза \"Не удалось преобразовать строку в число\"",
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
        System.out.println("Начало работы программы");
        System.out.println("Введите значения A и B");
        try {
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
        System.out.println(new TaskCs5259());
    }
}
