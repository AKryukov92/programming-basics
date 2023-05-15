package root.tasks.loops;

import root.tasks.MultipleInputValLayout;

public class Task3519 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int width = Integer.parseInt(args[2]);
        if (width == 0) {
            return;
        }
        int begin, end, i;
        if (a < b) {
            begin = a;
            i = a;
            end = b;
        } else {
            begin = b;
            i = b;
            end = a;
        }
        while (i <= end) {
            System.out.print(i);
            System.out.print(" ");
            if ((i - begin + 1) % width == 0) {
                System.out.println();
            }
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано начало и конец интервала, а также ширина вывода." +
                " Вывести все числа в указанном интервале по возрастанию." +
                " Количество чисел на всех строках, кроме последней, должно быть равно ширине вывода.");
        appendCheckValuesHeader("A", "B", "width");
        appendCheckValuesRow("2", "10", "3");
        appendCheckValuesRow("100", "105", "1");
        appendCheckValuesRow("0", "10", "3");
        appendCheckValuesRow("0", "10", "4");
        appendCheckValuesRow("20", "11", "4");
        appendCheckValuesRow("0", "96", "10");
        appendCheckValuesRow("-9", "9", "7");
        appendCheckValuesRow("0", "0", "10");
        appendCheckValuesRow("2", "7", "20");
        appendCheckValuesRow("1", "2", "0");
        appendCheckValuesRow("3", "4", "-6");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task3519().getContent());
    }
}
