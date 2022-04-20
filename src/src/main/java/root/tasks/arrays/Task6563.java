package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task6563 extends OneInputValLayout {
    @Override
    protected void logic(String data) {
        if (data.isEmpty()) {
            System.out.println("Нет данных");
            return;
        }
        String[] arr = data.split(" ");
        System.out.print("BEGIN");
        if (arr.length > 0) {
            System.out.print(" ");
            System.out.print(arr[0]);
        }
        if (arr.length > 1) {
            System.out.print(" ");
            System.out.println(arr[1]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.println(arr[i - 1] + " " + arr[i] + " " + arr[i + 1]);
        }
        if (arr.length > 1) {
            System.out.print(arr[arr.length - 2]);
        }
        if (arr.length > 0 && arr.length != 1) {
            System.out.print(" ");
            System.out.print(arr[arr.length - 1]);
        }
        System.out.println(" END");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - фрагменты текста, разделенные пробелами. Вывести данные на экран в три столбика. Второй столбик содержит по одному введенному элементу в строке. Первый столбик - предыдущий элемент. Третий столбик - следующий элемент. Если предыдущий отсутствует, нужно написать BEGIN. Если следующий отсутствует - END.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("qw er ty");
        appendCheckValuesRow("qw er ty ui op");
        appendCheckValuesRow("asd fgh jkl");
        appendCheckValuesRow("single");
        appendCheckValuesRow("first second");
        appendCheckValuesRow("");
        appendCheckValuesRow("q w e r a s d f z x c v");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task6563().getContent());
    }
}
