package root.tasks.nested_loops;

import root.tasks.TwoInputValLayout;

public class Task7323 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два числа: width и diff. Выведите на экран две строки символов \"*\". В первой строке должно быть width штук символов. Количество символов во второй строчке отличается на значение diff.");
        appendCheckValuesHeader("width", "diff");
        appendCheckValuesRow("4", "3");
        appendCheckValuesRow("10", "5");
        appendCheckValuesRow("7", "0");
        appendCheckValuesRow("7", "-3");
        appendCheckValuesRow("2", "-2");
        appendCheckValuesRow("0", "5");
        appendCheckValuesRow("7", "-11");
        appendCheckValuesRow("-2", "4");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int width = Integer.parseInt(firstValue);
        int diff = Integer.parseInt(secondValue);
        int diff2 = width + diff;
        if (width < 0) {
            System.out.println("Количество символов в первой строке должно быть неотрицательным");
            return;
        }
        if (diff2 < 0) {
            System.out.println("Количество символов во второй строке должно быть неотрицательным");
            return;
        }
        int i = 0;
        System.out.println("Первая строка " + width + " символов");
        while (i < width) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        System.out.println("Во второй строке нужно вывести " + diff2 + " символов");
        i = 0;
        while(i < diff2) {
            System.out.print("*");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7323());
    }
}
