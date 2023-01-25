package root.tasks.nested_loops;

import root.tasks.MultipleInputValLayout;

public class Task2592 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран прямоугольник из символов. Символ S, ширина прямоугольника W, высота прямоугольника H вводятся с клавиатуры.");
        appendCheckValuesHeader("S", "W", "H");
        appendCheckValuesRow("#", "5", "3");
        appendCheckValuesRow("?", "7", "10");
        appendCheckValuesRow("*", "90", "0");
        appendCheckValuesRow("=", "0", "15");
        appendCheckValuesRow("o", "-2", "8");
        appendCheckValuesRow("!", "20", "-6");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        String s = args[0];
        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);
        if (width < 0) {
            System.out.println("Значение width должно быть 0 или более");
            return;
        }
        if (height < 0) {
            System.out.println("Значение height должно быть 0 или более");
            return;
        }
        int row = 0;
        while (row < height) {
            int col = 0;
            while (col < width) {
                System.out.print(s);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
