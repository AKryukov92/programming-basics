package root.tasks.ranges;

import root.tasks.MultipleInputValLayout;

public class Task4858 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        int redA = Integer.parseInt(args[0]);
        int redB = Integer.parseInt(args[1]);
        int greenA = Integer.parseInt(args[2]);
        int greenB = Integer.parseInt(args[3]);
        if (redB < redA || greenB < greenA) {
            System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;
        }
        double redM = (redA + redB) / 2.0;
        double greenM = (greenA + greenB) / 2.0;
        System.out.printf("Середина красного %.4f\n", redM);
        System.out.printf("Середина зеленого %.4f\n", greenM);
        if (redM < greenM) {
            System.out.println("Красный слева, зеленый справа");
        } else if (redM > greenM) {
            System.out.println("Зеленый слева, красный справа");
        } else {
            System.out.println("Середины интервалов совпадают");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Даны два интервала чисел red(A;B) green(A;B). Нужно найти их середины и определить, чья середина находится справа, а чья - слева. Числа на оси координат увеличиваются вправо.");
        appendCheckValuesHeader("redA", "redB", "greenA", "greenB");
        appendCheckValuesRow("2", "3", "5", "7");
        appendCheckValuesRow("11", "17", "13", "19");
        appendCheckValuesRow("23", "37", "29", "31");
        appendCheckValuesRow("43", "53", "41", "47");
        appendCheckValuesRow("5", "15", "0", "30");
        appendCheckValuesRow("67", "71", "59", "61");
        appendCheckValuesRow("79", "73", "83", "89");
        appendCheckValuesRow("97", "101", "107", "103");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task4858().getContent());
    }
}
