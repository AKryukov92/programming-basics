package root.tasks.exceptions;

import root.tasks.TwoInputValLayout;

import java.util.Locale;

public class TaskCs9058 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод Task3943 для решения задачи " + linkToTask(3943),
                "Метод Task3943 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение ArgumentException, содержащее текст ошибки из задачи.",
                "Создайте проект Runner3943.",
                "В проекте Runner3943 добавьте ссылку на проект CodeProject.",
                "Добавьте команду using пространства имен из проекта CodeProject.",
                "Создайте ещё один метод в классе Program проекта Runner3943. Назовите его Step3943. Он ничего не возвращает и не принимает аргументов."
        );
        appendSubheading("Реализуйте метод Step3943");
        appendOrdered(
                "Выведите в консоль сообщение \"Введите значения x и y\"",
                "Объявите переменные x и y для хранения целых чисел.",
                "Инициализируйте переменные x и y значениями, полученными из консоли.",
                "Объявите переменную result для хранения действительных чисел.",
                "Вызовите метод Task3943 класса Methods и передайте ему x и y в качестве аргументов.",
                "Результат вызова метода запишите в переменную result.",
                "Выведите на экран сообщение \"Результат равен\" и значение переменной result с точностью 4 знака после запятой."
        );
        appendSubheading("Оформите метод Main");
        appendOrdered(
                "Выведите сообщение \"Начало работы программы\".",
                "Вызовите метод Step1934.",
                "Выведите сообщение \"Конец работы программы\"."
        );
        appendSubheading("Проверьте, что метод выбрасывает исключения");
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
                "Unhandled Exception: System.ArgumentException: Подкоренное выражение должно быть неотрицательно\n" +
                "   at CodeProject.Methods.Task3943(Int32 x, Int32 y) in E:\\Stage2\\CodeProject\\Methods.cs:line 206\n" +
                "   at Lab13Task3943.Program.Step1934() in E:\\Stage2\\Lab13Task3943\\Program.cs:line 24\n" +
                "   at Lab13Task3943.Program.Main(String[] args) in E:\\Stage2\\Lab13Task3943\\Program.cs:line 15");
        appendCheckValuesRowNoLogic("20", "-50",
                "Начало работы программы\n" +
                        "Введите значения x и y\n" +
                        "20\n" +
                        "-50\n" +
                        "Unhandled Exception: System.ArgumentException: Значение y должно быть неотрицательным\n" +
                        "   at CodeProject.Methods.Task3943(Int32 x, Int32 y) in E:\\Stage2\\CodeProject\\Methods.cs:line 210\n" +
                        "   at Lab13Task3943.Program.Step1934() in E:\\Stage2\\Lab13Task3943\\Program.cs:line 24\n" +
                        "   at Lab13Task3943.Program.Main(String[] args) in E:\\Stage2\\Lab13Task3943\\Program.cs:line 15");
        appendCheckValuesRowNoLogic("word", "",
                "Начало работы программы\n" +
                "Введите значения x и y\n" +
                "word\n" +
                "Unhandled Exception: System.FormatException: Input string was not in a correct format.\n" +
                "   at System.Number.StringToNumber(String str, NumberStyles options, NumberBuffer& number,\n" +
                "      NumberFormatInfo info, Boolean parseDecimal)\n" +
                "   at System.Number.ParseInt32(String s, NumberStyles style, NumberFormatInfo info)\n" +
                "   at System.Int32.Parse(String s)\n" +
                "   at Lab13Task3943.Program.Step1934() in E:\\Stage2\\Lab13Task3943\\Program.cs:line 22\n" +
                "   at Lab13Task3943.Program.Main(String[] args) in E:\\Stage2\\Lab13Task3943\\Program.cs:line 15");
        appendCheckValuesFooter();
        appendSubheading("Обработайте исключения");
        appendOrdered(
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
        System.out.println(new TaskCs9058());
    }
}
