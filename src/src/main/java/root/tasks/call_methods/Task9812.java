package root.tasks.call_methods;

import root.tasks.TwoInputValLayout;

public class Task9812 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcdefwxyz\". Пользователь вводит два символа. Посчитать количество символов между введенными символами.");
        appendCheckValuesHeader("CA", "CB");
        appendCheckValuesRow("a", "x");
        appendCheckValuesRow("w", "d");
        appendCheckValuesRow("g", "z");
        appendCheckValuesRow("x", "u");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String ca, String cb) {
        String STR = "abcdefwxyz";
        if (!STR.contains(ca)) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (!STR.contains(cb)) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        int indexA = STR.indexOf(ca);
        int indexB = STR.indexOf(cb);
        System.out.println("Фрагмент '" + ca + "' начинается на индексе " + indexA);
        System.out.println("Фрагмент '" + cb + "' начинается на индексе " + indexB);
        if (indexA < indexB) {
            int distance = indexB - indexA - 1;
            System.out.println("Между ними находится " + distance + " символов");
        } else {
            int distance = indexA - indexB - 1;
            System.out.println("Между ними находится " + distance + " символов");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9812());
    }
}
