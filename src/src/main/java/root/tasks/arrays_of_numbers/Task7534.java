package root.tasks.arrays_of_numbers;

import root.tasks.TwoInputValLayout;

public class Task7534 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два массива данных одинакового размера. Первый массив содержит символы. Второй - числа. Для каждого элемента первого массива в результате получится отдельная строка. Количество символов в этой строке равно значению элемента из второго массива на том же индексе.");
        appendCheckValuesHeader("chars", "amounts");
        appendCheckValuesRow("q a z", "3 2 5");
        appendCheckValuesRow("q w e r t y", "3 3 1 7 2 6");
        appendCheckValuesRow("a s d f", "9 0 7 2");
        appendCheckValuesRow("a s d f", "3 3 3");
        appendCheckValuesRow("z x c", "1 2 3 4");
        appendCheckValuesRow("", "1 1 1");
        appendCheckValuesRow("a a a", "");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split(" ");
        String[] num = secondValue.split(" ");
        int i = 0;


}
