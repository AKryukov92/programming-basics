package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class TaskCs2936 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число M и данные - целые числа, разделенные пробелами. Умножить все элементы массива на M.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task2936.",
                "Он принимает в качестве аргументов 1 действительное число, массив действительных чисел.",
                "Методв возвращает массив действительных чисел.",
                "В теле метода создайте новый массив и заполните его значениями, которые получатся в результате решения задачи.",
                "Массив, который был передан в качестве аргумента, измениться не должен"
        );
        appendSubheading("В методе main класса Program добавьте код для проверки:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main должен получиться следующий результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        double[] data, result;
        data = new double[]{9, 8, 7, 6, 5, 4};
        result = Library.task2936(31, data);
        Console.Write("При умножении массива '");
        int i = 0;
        while (i < data.length) {
            Console.Write(data[i] + "  ");
            i++;
        }
        Console.Write("на число 31, получился массив ");
        i = 0;
        while (i < result.length) {
            Console.Write(result[i] + "  ");
            i++;
        }
    }

    static class Library {
        public static double[] task2936(int m, double[] num) {
            double[] result = new double[num.length];
            int i = 0;
            while (i < num.length) {
                result[i] = num[i] * m;
                i++;
            }
            return result;
        }
    }
}
