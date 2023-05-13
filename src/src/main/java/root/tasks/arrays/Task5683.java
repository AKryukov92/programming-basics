package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task5683 extends OneInputValLayout {
    @Override
    protected void logic(String str) {
        if (str.isEmpty()) {
            System.out.println();
            return;
        }
        String[] mas = str.split(" ");
        int index = 0;
        while (index < mas.length) {
            System.out.print(mas[index]);
            System.out.print(" ");
            System.out.println(index);
            index = index + 1;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - символы, разделенные пробелами. Вывести элементы массива на экран в столбик и пронумеровать их, начиная с нуля.");
        appendCheckValuesHeader("str");
        appendCheckValuesRow("qw er ty");
        appendCheckValuesRow("qw er ty ui op");
        appendCheckValuesRow("asd fgh jkl");
        appendCheckValuesRow("");
        appendCheckValuesRow("q w e r a s d f z x c v");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task5683().getContent());
    }
}
