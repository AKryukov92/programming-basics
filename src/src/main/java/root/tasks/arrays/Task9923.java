package root.tasks.arrays;

import root.tasks.OneInputValLayout;

import java.io.PrintStream;

public class Task9923 extends OneInputValLayout {
    @Override
    protected void logic(String firstValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split(" ");

        int lastIndex = arr.length - 1;
        System.out.println("Индекс последнего элемента " + lastIndex);
        System.out.println("Значение последнего элемента " + arr[lastIndex]);
        System.out.println("Вместо " + arr[0] + " пишем " + arr[lastIndex]);
        arr[0] = arr[lastIndex];
        System.out.println("Элементы массива:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - символы, разделенные пробелом. Скопировать последний элемент в начало массива. Вывести все элементы массива по порядку.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("qw er ty");
        appendCheckValuesRow("qwe asd zxc");
        appendCheckValuesRow("a s d f g h");
        appendCheckValuesRow("single");
        appendCheckValuesRow("");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task9923().getContent());
    }
}
