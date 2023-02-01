package root.tasks.stream_of_data;

import root.tasks.OneInputValLayout;

public class Task3827 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число base. Найти его корень методом бинарного поиска. Множество чисел от 0 до base нужно поделить пополам. Вычислить квадрат от середины. Если квадрат меньше base, то повторить операцию в половине, которая ближе к base. Если квадрат больше base, повторить операцию в половине, которая ближе к 0. Делить множество чисел пополам, пока не обнаружится нужное. Точность вычислений 0.0001.");
        appendCheckValuesHeader("base");
        appendCheckValuesRow("10000");
        appendCheckValuesRow("1000");
        appendCheckValuesRow("9");
        appendCheckValuesRow("1");
        appendCheckValuesRow("0.08");
        appendCheckValuesRow("0.5");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("-0.99");
        appendCheckValuesRow("-300");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double base = Double.parseDouble(value);
        if (base == 1) {
            System.out.println("Корень из числа 1 равен 1.");
        } else if (base == 0) {
            System.out.println("Корень из числа 0 равен 0.");
        } else if (base < 0) {
            System.out.println("Введите число больше 0");
        } else if (base > 0) {
            double start = 0, end = base / 4;
            int i = 0;
            while (end - start > 0.0001) {
                double lowerStart = start, middle = start + (end - start) / 2, higherEnd = end;
                System.out.printf("При делении пополам получилось два интервала: (%.4f,%.4f) и (%.4f, %.4f)\n", lowerStart, middle, middle, higherEnd);
                if (middle * middle > base) {
                    System.out.printf("Целевое число в интервале (%.4f, %.4f)\n", lowerStart, middle);
                    start = lowerStart;
                    end = middle;
                } else {
                    System.out.printf("Целевое число в интервале (%.4f, %.4f)\n", middle, higherEnd);
                    start = middle;
                    end = higherEnd;
                }
                i++;
            }
            System.out.println("Ответ найден за " + i + " шагов");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task3827());
    }
}
