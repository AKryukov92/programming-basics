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
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("x")) {
                System.out.println("Символ 'x' найден на позиции '" + i + "'");
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("Символ 'x' отсутствует");
        }
        if (count > 0) {
            System.out.println("Символ 'x' найден " + count + " раз");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив символов с разделителем \";\". Определить, присутствует ли в данном массиве символ \"x\". " +
        "Чтобы определить, что символ отсутствует, посчитайте количество раз когда символ был обнаружен. " +
                "Если полученное количество равно 0, то напишите фразу символ отсутствует.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("a;s;d;f");
        appendCheckValuesRow("z;x;c;v;x");
        appendCheckValuesRow("zx;df;ty;jk");
        appendCheckValuesRow("q;a;z;w;s;x;e;d;c");
        appendCheckValuesRow("");
        appendCheckValuesRow("x");
        appendCheckValuesRow("x;x;x;x;x;x;x");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2003());
    }
}
