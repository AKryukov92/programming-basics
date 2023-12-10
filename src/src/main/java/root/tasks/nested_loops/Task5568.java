package root.tasks.nested_loops;

import root.tasks.OneInputValLayout;

public class Task5568 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран цифры от 0 до 9. Каждая цифра должна быть на своей строчке. Количество цифр в строчке width вводится с клавиатуры. Вывести не более 20 символов в строке.");
        appendCheckValuesHeader("width");
        appendCheckValuesRow("1");
        appendCheckValuesRow("3");
        appendCheckValuesRow("7");
        appendCheckValuesRow("11");
        appendCheckValuesRow("19");
        appendCheckValuesRow("20");
        appendCheckValuesRow("21");
        appendCheckValuesRow("50");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int width = Integer.parseInt(value);
        if (width < 0 || width > 20) {
            System.out.println("Значение width должно быть в интервале от 0 до 20 включительно");
            return;
        }
        int row = 0;
        while (row <= 9) {
            int i = 0;
            while (i < width) {
                System.out.print(row);
                i++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5568());
    }
}
