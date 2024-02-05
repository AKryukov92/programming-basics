package root.tasks.aggregates;

import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class Task6497 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Найти абсолютное отклонение каждого элемента от среднего арифметического данных значений.");
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
        if (value.length() == 0) {
            System.out.println("0.0000");
            return;
        }
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        double sum = 0;
        int i = 0;
        while (i < arr.length) {
            num[i] = Integer.parseInt(arr[i]);
            sum += num[i];
            i++;
        }
        double avg = sum / arr.length;
        i = 0;
        while (i < num.length) {
            if (num[i] < avg) {
                System.out.printf("%.4f  ", avg - num[i]);
            } else {
                System.out.printf("%.4f  ", num[i] - avg);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6497());
    }
}
