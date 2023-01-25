package root.tasks.nested_loops;

import root.tasks.OneInputValLayout;

public class Task4075 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран рамку шириной W.");
        appendCheckValuesHeader("width");
        appendCheckValuesRow("5");
        appendCheckValuesRow("2");
        appendCheckValuesRow("15");
        appendCheckValuesRow("1");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-10");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int width = Integer.parseInt(value);
        if (width < 2) {
            System.out.println("Число width должно быть 2 или более");
            return;
        }
        System.out.print("+");
        int i = 0;
        while (i < width - 2) {
            System.out.print("-");
            i++;
        }
        System.out.print("+\n|");
        i = 0;
        while (i < width - 2) {
            System.out.print(".");
            i++;
        }
        System.out.print("|\n+");
        i = 0;
        while (i < width - 2) {
            System.out.print("-");
            i++;
        }
        System.out.print("+");
    }

    public static void main(String[] args) {
        System.out.println(new Task4075());
    }
}
