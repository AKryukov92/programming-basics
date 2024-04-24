package root.tasks.exceptions;

import root.tasks.MethodsDictationHelper;
import root.tasks.TwoInputValLayout;

public class TaskCs5259 extends TwoInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить результат по формуле <formula>a<sqrt><val>-7b</val></sqrt></formula>");
        appendOrderedNonEscaped(
                implementStatic("Library", "Task1934"),
                "Метод Task1934 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение ArgumentException с сообщением \"Подкоренное выражение должно быть неотрицательно\".",
                "Создайте проект Runner1934.",
                "В проекте Runner1934 добавьте ссылку на проект CodeProject.",
                "Добавьте команду using пространства имен из проекта CodeProject."
        );
        appendTaskDescNonEscaped("Исходный код метода Main в классе Runner1934");
        appendCheckSingleNonEscaped(methodExample());
        appendTaskDescNonEscaped("Проверьте, что метод выбрасывает необработанные исключения");
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
                "   at Runner1934.Program.Main(String[] args) in E:\\Stage2\\Runner1934\\Program.cs:line 15");
        appendCheckValuesRowNoLogic("word", "4", "Начало работы программы\n" +
                "Введите значения A и B\n" +
                "word\n" +
                "Unhandled Exception: System.FormatException: Input string was not in a correct format.\n" +
                "   at System.Number.StringToNumber(String str, NumberStyles options, \n" +
                "       NumberBuffer& number, NumberFormatInfo info, Boolean parseDecimal)\n" +
                "   at System.Number.ParseInt32(String s, NumberStyles style, NumberFormatInfo info)\n" +
                "   at System.Int32.Parse(String s)\n" +
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
                "   at Runner1934.Program.Main(String[] args) in E:\\Stage2\\Runner1934\\Program.cs:line 15");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("Обработайте исключения");
        appendOrderedNonEscaped(
                "Обработайте ArgumentException так, чтобы на экран выводилось сообщение из исключения \"Подкоренное выражение должно быть неотрицательно\"",
                "Обработайте FormatException так, чтобы на экран выводилась фраза \"Не удалось преобразовать строку в число\"",
                "Стек вызовов не должен выводиться не экран в случае ошибки",
                "Фраза \"Программа завершена успешно\" не должна выводиться на экран в случае ошибки",
                "Фраза \"Результат равен\" не должна выводиться на экран в случае ошибки"
        );
        appendTaskDescNonEscaped("Проверьте, что результат работы совпадает с ожидаемым");
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
    protected String methodExample() {
        return  "Console.WriteLine(\"Начало работы программы\");\n" +
                "Console.WriteLine(\"Введите значения A и B\");\n" +
                "int a, b;\n" +
                "a = Int32.Parse(Console.ReadLine());\n" +
                "b = Int32.Parse(Console.ReadLine());\n" +
                "double result;\n" +
                "result = Library.task1934(a, b);\n" +
                "Console.WriteLine(\"{0:F4}\", result);\n" +
                "Console.WriteLine(\"Программа завершена успешно\");";
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
