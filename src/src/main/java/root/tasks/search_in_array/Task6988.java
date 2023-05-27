package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task6988 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных - фрагменты текста. Вывести на экран индекс элемента, на котором массивы начинают отличаться.");
        appendCheckValuesHeader("left", "right");
        appendCheckValuesRow("a s d f a", "a s d f a");
        appendCheckValuesRow("a s d f a", "a s d f g");
        appendCheckValuesRow("qwerty asdfgh zxcvb", "qwerty asdfgh asdfgh");
        appendCheckValuesRow("qaz wsx edc", "wsx edc qaz");
        appendCheckValuesRow("qaz wsx edc", "qaz wsx edc rfv");
        appendCheckValuesRow("qaz wsx edc rfv tgb", "qaz wsx edc rfv");
        appendCheckValuesRow("qaz wsx edc", "qaz tgb ujm yhn");
        appendCheckValuesRow("qaz wsx vbn rfv tgb", "qaz wsx edc");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String left, String right) {
        String[] larr = left.split(" ");
        String[] rarr = right.split(" ");
        int i = 0;
        while (i < larr.length && i < rarr.length) {
            if (!larr[i].equals(rarr[i])) {
                System.out.println("Массивы начинают различаться на индексе " + i);
                return;
            }
            i = i + 1;
        }
        if (larr.length < rarr.length) {
            System.out.println("Массивы начинают различаться на индексе " + larr.length);
        } else if (larr.length > rarr.length) {
            System.out.println("Массивы начинают различаться на индексе " + rarr.length);
        } else {
            System.out.println("Массивы одинаковы");
        }
    }
}
