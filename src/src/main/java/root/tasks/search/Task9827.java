package root.tasks.search;

import root.tasks.TwoInputValLayout;

public class Task9827 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два массива данных - фрагменты текста. Вывести на экран все элементы из левого массива, которых нет в правом.");
        appendCheckValuesHeader("left", "right");
        appendCheckValuesRow("one two three four", "one four five six");
        appendCheckValuesRow("one two three four", "one two three four");
        appendCheckValuesRow("", "one two three four");
        appendCheckValuesRow("", "");
        appendCheckValuesRow("one two three four", "two two two two two");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] a = firstValue.split(" ");
        String[] b = secondValue.split(" ");
        for (int ai = 0; ai < a.length; ai++) {
            boolean found = false;
            for (int bi = 0; bi < b.length; bi++) {
                if (a[ai].equals(b[bi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(a[ai]);
            }
        }
    }
}
