package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task6988 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива данных - фрагменты текста. Вывести на экран индекс элемента, на котором массивы начинают отличаться. Если длина массиов отличается сообщите тот индекс, который существует только в одном из массивов.");
        appendCheckValuesHeader("standard", "array");
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
    protected void logic(String standardStr, String arrayStr) {
        String[] standard = standardStr.split(" ");
        String[] array = arrayStr.split(" ");
        int minLen;
        if (standard.length < array.length) {
            System.out.println("Длина массива-эталона меньше длины проверяемого массива");
            minLen = standard.length;
        } else if (array.length < standard.length){
            System.out.println("Длина проверяемого массива меньше длины массива-эталона");
            minLen = array.length;
        } else {
            System.out.println("Длины массивов совпадают");
            minLen = array.length;
        }
        System.out.println("Сравниваю до индекса " + minLen + " исключительно");
        int i = 0;
        while (i < minLen) {
            if (!standard[i].equals(array[i])) {
                System.out.println("Массивы начинают различаться на индексе " + i);
                return;
            }
            i = i + 1;
        }
        if (standard.length < array.length) {
            System.out.println("Массивы начинают различаться на индексе " + standard.length);
        } else if (standard.length > array.length) {
            System.out.println("Массивы начинают различаться на индексе " + array.length);
        } else {
            System.out.println("Массивы одинаковы");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6988());
    }
}
