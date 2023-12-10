package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class TaskJava5683 extends OneInputValLayout {
    private static class Verbose {
    protected void logic(String str) {
        if (str.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!str.isEmpty()) {
            String[] mas;
            mas = str.split(" ");
            int index = 0;//переменная объединяет два назначения:
            //* Будущий счётчик цикла
            //* Индекс (номер) элемента
            if (index < mas.length) {
                System.out.println(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.length) {
                System.out.println(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.length) {
                System.out.println(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.length) {
                System.out.println(mas[index] + " " + index);
                index = index + 1;
            }
            if (index < mas.length) {
                System.out.println(mas[index] + " " + index);
                index = index + 1;
            }
        }
    }
    }

    @Override
    protected void logic(String str) {
        String[] mas = str.split(" ");
        int index = 0;
        while (index < mas.length) {
            System.out.println(mas[index] + " " + index);
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
        appendTaskDescEscaped("Подробное решение этой задачи выглядит так:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("Примените конструкцию цикла чтобы сделать решение универсальным.");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava5683().getContent());
    }
}
