package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task2003 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        if (value.isEmpty()) {
            System.out.println("Символ 'x' отсутствует");
            return;
        }
        String[] arr = value.split(";");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("x")) {
                System.out.println("Символ 'x' найден на позиции '" + i + "'");
                return;
            }
        }
        System.out.println("Символ 'x' отсутствует");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит символ массив символов с разделителем \";\". Определить, присутствует ли в данном массиве символ \"x\".");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("a;s;d;f");
        appendCheckValuesRow("z;x;c;v");
        appendCheckValuesRow("q;a;z;w;s;x;e;d;c");
        appendCheckValuesRow("");
        appendCheckValuesRow("x");
        appendCheckValuesRow("x;x;x;x;x;x;x");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2003().getContent());
    }
}
