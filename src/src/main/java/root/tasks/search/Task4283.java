package root.tasks.search;

import root.tasks.TwoInputValLayout;

public class Task4283 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит фрагмент K и данные - символы, разделенные пробелами. Посчитать сколько раз встречается фрагмент K в массиве.");
        appendCheckValuesHeader("K", "data");
        appendCheckValuesRow("e", "q w e r q w");
        appendCheckValuesRow("t", "q w e r q w e r q w e");
        appendCheckValuesRow("w", "e w w w w w");
        appendCheckValuesRow("q", "r r r r r r");
        appendCheckValuesRow("qw", "qw er ty qw");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String k, String raw) {
        String[] arr = raw.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(k)) {
                count++;
            }
        }
        System.out.println("Фрагмент " + k + " присутствует в массиве " + count + " раз");
    }

    public static void main(String[] args) {
        System.out.println(new Task4283());
    }
}
