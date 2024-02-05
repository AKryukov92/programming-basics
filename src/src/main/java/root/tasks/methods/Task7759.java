package root.tasks.methods;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task7759 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти абсолютное отклонение каждого элемента от среднего арифметического данных значений.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task7759",
                "Метод принимает один аргумент - массив целых чисел",
                "Метод возвращает массив действительных чисел"
        );
        appendCheckValuesHeader("numbers");
        appendCheckValuesRow("9 8 9 1 1 5 1 1");
        appendCheckValuesRow("1 2 3 4 1 3 4 4 4 4");
        appendCheckValuesRow("5 5 5 5 5");
        appendCheckValuesRow("");
        appendCheckValuesRow("1 1 1 9 9 100 30");
        appendCheckValuesRow("1000000 1 1");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        if (value.length() > 0) {
            String[] arr = value.split(" ");
            int[] num = new int[arr.length];
            int i = 0;
            while (i < arr.length) {
                num[i] = Integer.parseInt(arr[i]);
                i++;
            }
            double[] result = Library.task7759(num);
            i = 0;
            while (i < result.length) {
                System.out.printf("%.4f  ", result[i]);
                i++;
            }
        }
        else {
            System.out.print("");
        }
    }

    static class Library {
        public static double[] task7759(int[] values) {
            if (values.length == 0) {
                return new double[0];
            }
            double sum = 0;
            int i = 0;
            while (i < values.length) {
                sum += values[i];
                i++;
            }
            double avg = sum / values.length;
            i = 0;
            double[] result = new double[values.length];
            while (i < values.length) {
                if (values[i] < avg) {
                    result[i] = avg - values[i];
                } else {
                    result[i] = values[i] - avg;
                }
                i++;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7759());
    }
}
