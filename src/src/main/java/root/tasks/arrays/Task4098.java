package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task4098 extends TwoInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два числа: position и total." +
                " Кроме того есть известный массив letters: \"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\",\"h\"." +
                " Нужно вывести элемент массива letters на индексе position в строчку количество раз равное total.");
        appendCheckValuesHeader("position", "total");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("7", "5");
        appendCheckValuesRow("4", "20");
        appendCheckValuesRow("4", "0");
        appendCheckValuesRow("-1", "5");
        appendCheckValuesRow("20", "10");
        appendCheckValuesRow("-4", "6");
        appendCheckValuesRow("100", "100");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        int position = Integer.parseInt(firstValue);
        int total = Integer.parseInt(secondValue);
        if (position < 0 || position >= letters.length) {
            System.out.println("Индекс должен быть от 0 до " + letters.length);
            return;
        }
        int i = 0;
        while(i < total) {
            System.out.print(letters[position]);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4098());
    }
}
