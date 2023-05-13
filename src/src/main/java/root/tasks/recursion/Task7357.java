package root.tasks.recursion;

import root.tasks.OneInputValLayout;

public class Task7357 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число base. Найти его корень методом бинарного поиска как в задаче " + linkToTask(3827) + " но с помощью рекурсивного алгоритма.");
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
            double result = isRootInRange(base, 0, base);
            System.out.printf("Корень из числа %.4f равен %.4f", base, result);
        }
    }

    private double isRootInRange(double value, double start, double end) {
        System.out.printf("Проверяю интервал (%.4f, %.4f)\n", start, end);
        if (end-start > 0.0001) {
            double middle = start + (end - start) / 2;
            if (middle * middle > value) {
                return isRootInRange(value, start, middle);
            } else {
                return isRootInRange(value, middle, end);
            }
        } else {
            return start;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7357());
    }
}
