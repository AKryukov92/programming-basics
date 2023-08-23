package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task3669 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Найти произведение всех целых чисел от А до B включительно. Значение A может быть как меньше, так и больше B. Для хранения результата используйте переменную типа long. Этот тип поддерживает очень большие целые числа.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "13");
        appendCheckValuesRow("13", "8");
        appendCheckValuesRow("159", "161");
        appendCheckValuesRow("648", "648");
        appendCheckValuesRow("-2", "600");
        appendCheckValuesRow("35", "24");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        long mul = 1;
        long i, min, max;
        if (a < b) {
            min = a;
            i = a;
            max = b;
        } else {
            min = b;
            i = b;
            max = a;
        }
        while (i <= max) {
            mul *= i;
            i++;
        }
        System.out.println("Произведение чисел от " + min + " до " + max + " равно " + mul);
    }

    public static void main(String[] args) {
        System.out.println(new Task3669());
    }
}
