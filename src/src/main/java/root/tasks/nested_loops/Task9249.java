package root.tasks.nested_loops;

import root.tasks.TwoInputValLayout;

public class Task9249 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два числа: R и T. Вывести две строки символов \"#\". В первой строке должно быть R штук символов. Во второй строке T штук. Если какое-либо число будет отрицательно, вывести сообщение об ошибке.");
        appendCheckValuesHeader("R", "T");
        appendCheckValuesRow("5", "11");
        appendCheckValuesRow("11", "5");
        appendCheckValuesRow("20", "3");
        appendCheckValuesRow("3", "20");
        appendCheckValuesRow("0", "7");
        appendCheckValuesRow("4", "0");
        appendCheckValuesRow("-90", "6");
        appendCheckValuesRow("6", "-7");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Попробуйте решить задачу так, чтобы использовалась только одна переменная-счётчик.");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int r = Integer.parseInt(firstValue);
        int t = Integer.parseInt(secondValue);
        int i = 0;
        System.out.println("Первая строчка");
        while (i < r) {
            System.out.print("#");
            i++;
        }
        System.out.println();
        System.out.println("Вторая строчка");
        i = 0;
        while(i < t) {
            System.out.print("#");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9249());
    }
}
