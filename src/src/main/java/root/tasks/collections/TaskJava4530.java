package root.tasks.collections;

import root.tasks.OneInputValLayout;

import java.util.TreeSet;

public class TaskJava4530 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Реализовать компаратор для сортировки чисел по сумме их цифр. При равных суммах цифр, нужно сравнивать сами числа.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("9 62 232 1113 23 4");
        appendCheckValuesRow("9 62 232 1113 231 45");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }

    public static void main(String[] args) {

        TreeSet<Integer> tree = new TreeSet<>((a,b) ->{ return a - b;});



    }
}
