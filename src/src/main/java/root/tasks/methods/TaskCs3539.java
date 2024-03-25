package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class TaskCs3539 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти минимальное число и вычесть его из всех элементов массива.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task3539",
                "Он принимает в качестве аргумента массив действительных чисел",
                "В теле метода создайте новый массив и заполните его значениями, которые получатся в результате решения задачи.",
                "Массив, который был передан в качестве аргумента, измениться не должен",
                "В методе main класса Program добавьте код для проверки:"
        );
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main должен получиться следующий результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        double[] data = new double[]{4, 2, 3, 4, 3, 2};
        double[] result = Library.task3539(data);
        Console.WriteLine("Исходный массив:");
        int i = 0;
        while (i < data.length) {
            Console.Write(data[i] + " ");
            i += 1;
        }
        Console.WriteLine("\nРезультат обработки:");
        i = 0;
        while (i < result.length) {
            Console.Write(result[i] + " ");
            i += 1;
        }
    }

    static class Library {
        public static double[] task3539(double[] num) {
            int minIndex = 0;
            int i = 0;
            while (i < num.length) {
                if (num[i] < num[minIndex]) {
                    minIndex = i;
                }
                i += 1;
            }
            double val = num[minIndex];
            double[] result = new double[num.length];
            i = 0;
            while (i < num.length) {
                result[i] = num[i] - val;
                i += 1;
            }
            return result;
        }
    }
}
