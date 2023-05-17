package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task5694 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит символ (X), который может быть одной из букв: a,b,c,d,e,f,g,h. Нужно вывести все эти буквы в столбик и написать слово \"Найдено\" справа от введенной буквы X.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("a");
        appendCheckValuesRow("d");
        appendCheckValuesRow("h");
        appendCheckValuesRow("i");
        appendCheckValuesRow("z");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = "a b c d e f g h".split(" ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            if (arr[i].equals(value)) {
                System.out.println(" Найдено");
            } else {
                System.out.println();
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5694());
    }
}