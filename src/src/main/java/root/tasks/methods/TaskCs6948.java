package root.tasks.methods;

import root.Console;

import java.sql.SQLException;

public class TaskCs6948 extends TaskJava6948 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти среднее арифметическое введенных элементов. Вывести с точностью 6 знаков после запятой.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task6948.",
                "В качестве аргумента принимает массив целых чисел.",
                "Возвращает действительное число."
        );
        appendTaskDescEscaped("Добавьте в метод main класса Program следующий код");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main класса Program, должен получиться такой результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        int[] values;
        values = new int[]{9, 8, 9, 1, 1, 5, 1, 1};
        double result;
        result = Library.task6948(values);
        Console.WriteLine("{0:F4}", result);
        values = new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4};
        result = Library.task6948(values);
        Console.WriteLine("{0:F4}", result);
        result = Library.task6948(new int[]{5, 5, 5, 5, 5});
        Console.WriteLine("{0:F4}", result);
        result = Library.task6948(new int[]{});
        Console.WriteLine("{0:F4}", result);
        int[] array = new int[]{1, 9, 1, 30, 9, 1, 100};
        Console.WriteLine("{0:F4}", Library.task6948(array));
        Console.WriteLine("{0:F4}",
                Library.task6948(new int[]{
                        100000, 1, 1
                })
        );
    }

    static class Library {
        public static double task6948(int[] values) {
            double sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            if (values.length > 0) {
                double avg = sum / values.length;
                return avg;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs6948());
    }
}
