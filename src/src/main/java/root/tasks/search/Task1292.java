package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task1292 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит символ (needle), который может быть одной из букв: a,b,c,d,e,f,g,h. Нужно выводить все эти буквы в строчку, пока не будет выведена буква X.");
        appendCheckValuesHeader("needle");
        appendCheckValuesRow("a");
        appendCheckValuesRow("b");
        appendCheckValuesRow("d");
        appendCheckValuesRow("h");
        appendCheckValuesRow("i");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int i = 0;
        while (i < chars.length) {
            System.out.print(chars[i]);
            if (chars[i].equals(value)) {
                break;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1292());
    }
}
