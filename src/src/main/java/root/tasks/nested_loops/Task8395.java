package root.tasks.nested_loops;

import root.tasks.OneInputValLayout;

public class Task8395 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число width. Выведите на экран буквы латинского алфавита a,b,c,d,e,f,g,h. Каждая буква должна быть на новой строчке. Количество букв в строчке вводится с клавиатуры. Если width меньше 1 или больше 20, вывести сообщение об ошибке.");
        appendCheckValuesHeader("width");
        appendCheckValuesRow("1");
        appendCheckValuesRow("3");
        appendCheckValuesRow("5");
        appendCheckValuesRow("19");
        appendCheckValuesRow("20");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-7");
        appendCheckValuesRow("21");
        appendCheckValuesRow("1000");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int width = Integer.parseInt(value);
        if (width < 1 || width > 20) {
            System.out.println("Значение width должно быть в интервале от 1 до 20 включительно");
            return;
        }
        int i = 0;
        while (i < width) {
            System.out.print("a");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("b");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("c");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("d");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("e");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("f");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("g");
            i++;
        }
        System.out.println();
        i = 0;
        while (i < width) {
            System.out.print("h");
            i++;
        }
        System.out.println();
    }

    protected void logic2(String value) {
        int width = Integer.parseInt(value);
        if (width < 1 || width > 20) {
            System.out.println("Значение width должно быть в интервале от 1 до 20 включительно");
            return;
        }

        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        int index = 0;
        while (index < letters.length) {
            int i = 0;
            while (i < width) {
                System.out.print(letters[index]);
                i++;
            }
            System.out.println();
            index++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task8395());
    }
}
