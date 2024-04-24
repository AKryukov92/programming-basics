package root.tasks.exceptions;

import root.tasks.MethodsDictationHelper;
import root.tasks.TwoInputValLayout;

public class TaskJava5259 extends TwoInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить результат по формуле <formula>a<sqrt><val>-7b</val></sqrt></formula>.");
        appendOrderedNonEscaped(
                implementStatic("Library", "Task1934"),
                "Метод Task1934 должен возвращать результат решения задачи для корректных значений исходных данных.",
                "Если методу были переданы некорректные значения исходных данных, он должен выбросить исключение IllegalArgumentException с сообщением \"Подкоренное выражение должно быть неотрицательно\".",
                "В папке с исходным кодом создайте класс Runner1934.",
                "Создайте метод main в классе Runner1934 по аналогии с методами main из задач прошлых практических.",
                "Создайте еще один метод в классе Runner1934. Назовите его step1934. Он ничего не возвращает и не принимает аргументов."
        );
        appendTaskDescNonEscaped("Исходный код метода main в классе Runner1934");
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
        appendTaskDescNonEscaped("Обработайте исключения");
        appendOrderedNonEscaped(
                "Обработайте IllegalArgumentException так, чтобы на экран выводилось сообщение из исключения \"Подкоренное выражение должно быть неотрицательно\"",
                "Обработайте InputMismatchException так, чтобы на экран выводилась фраза \"Не удалось преобразовать строку в число\"",
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
        return  "Scanner s = new Scanner(System.in);\n" +
                "System.out.println(\"Начало работы программы\");\n" +
                "System.out.println(\"Введите значения A и B\");\n" +
                "int a, b;\n" +
                "a = s.nextInt();\n" +
                "b = s.nextInt();\n" +
                "double result;\n" +
                "result = Library.task1934(a, b);\n" +
                "System.out.printf(\"%.4f\",result);\n" +
                "System.out.println(\"Программа завершена успешно\");";
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        try {
            System.out.println("Начало работы программы");
            System.out.println("Введите значения A и B");
            double a = Double.parseDouble(firstValue);
            double b = Double.parseDouble(secondValue);
            double result = Library.task1934(a, b);
            System.out.printf("Результат равен %.4f\n", result);
            System.out.println("Программа завершена успешно");
        } catch (NumberFormatException ex) {
            System.out.println("Не удалось преобразовать строку в число");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
    static class Library {
        protected static double task1934(double a, double b) {
            if (b > 0) {
                throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательно");
            }
            return a * Math.sqrt(-7 * b);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava5259());
    }
}
