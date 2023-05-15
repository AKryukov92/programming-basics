package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task4426 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число. Оно обозначает количество элементов массива. Затем он вводит элементы массива по одному. По окончанию приема данных, нужно вывести на экран все элементы массива в строчку.");
        appendCheckValuesHeader();
        appendCheckValuesRow("4 qw er ty ui".split(" "));
        appendCheckValuesRow("3 as df gh".split(" "));
        appendCheckValuesRow("10 z x c v b n m a s d".split(" "));
        appendCheckValuesRow("1 single".split(" "));
        appendCheckValuesRow("0");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("-100");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        int n = Integer.parseInt(source.next());
        if (n > 0) {
            String[] arr = new String[n];
            int i = 0;
            while (i < n) {
                arr[i] = source.next();
                i = i + 1;
            }
            i = 0;
            while (i < n) {
                System.out.print(arr[i] + " ");
                i = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4426());
    }
}
