package root.tasks.ranges;

import root.tasks.ThreeInputValLayout;

public class TaskJava8715 extends ThreeInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны действительные числа a, b, c. Проверить, выполняются ли неравенства a&lt;b&lt;c.");
        appendCheckValuesHeader("A", "B", "C");
        appendCheckValuesRow("9", "80", "700");//если использовать эту задачу для других языков, такой тест может поймать некорректное сравнение строк
        appendCheckValuesRow("-4", "0", "5");
        appendCheckValuesRow("-3", "-2", "-3");
        appendCheckValuesRow("7", "4", "-2");
        appendCheckValuesRow("0", "5", "-7");
        appendCheckValuesRow("4","4", "4");
        appendCheckValuesRow("-2", "4", "3");
        appendCheckValuesRow("10", "3", "5");
        appendCheckValuesRow("5", "1", "7");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В результате может быть только одно из двух слов. Но в коде нужно предусмотреть несколько ситуаций:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8715());
    }

    @Override
    protected void logic(String firstValue, String secondValue, String thirdValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        int c = Integer.parseInt(thirdValue);
        if (a < b) {
            if (b < c) {
                System.out.println("Истинно");
            }
            if (c <= b) {
                System.out.println("Ложно");
            }
        }
        if (b <= a) {
            System.out.println("Ложно");
        }
    }
}
