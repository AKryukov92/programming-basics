package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class Task8920 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        System.out.println(Library.task7759(firstValue, secondValue.split(" ")));
    }

    static class Library {
        public static int task7759(String k, String[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(k)) {
                    count++;
                }
            }
            return count;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан фрагмент текста K и массив текстовых фрагментов data. Посчитать сколько раз встречается фрагмент K в массиве.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task8920",
                "Метод принимает два аргумента: строку и массив строк",
                "Метод возвращает число"
        );
        appendCheckValuesHeader("K", "data");
        appendCheckValuesRow("e", "q w e r q w");
        appendCheckValuesRow("t", "q w e r q w e r q w e");
        appendCheckValuesRow("w", "e w w w w w");
        appendCheckValuesRow("q", "r r r r r r");
        appendCheckValuesRow("qw", "qw er ty qw");
        appendCheckValuesFooter();
        appendFooter();
    }
}
