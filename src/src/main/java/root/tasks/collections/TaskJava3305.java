package root.tasks.collections;

import root.tasks.MethodsDictationHelper;
import root.tasks.TwoInputValLayout;

import java.util.ArrayList;

public class TaskJava3305 extends TwoInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два целых числа first и second. Нужно сформировать лист, содержащий все целые числа между указанными по возрастанию. Числа, которые ввёл пользователь, нужно добавить в лист.");
        appendOrderedNonEscaped(
                importClasses("Library", "\"java.util.ArrayList\""),
                implementStatic("Library", "task3305"),
                "Он принимает в качестве аргумента 2 целых числа и возвращает ArrayList целых чисел."
        );
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("11", "2");
        appendCheckValuesRow("-3", "4");
        appendCheckValuesRow("-100", "100");
        appendCheckValuesFooter();
        appendSubheading("Проверьте с помощью вспомогательной программы");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendFooter();
    }

    private static ArrayList<Integer> task3305(int first, int second) {
        ArrayList<Integer> listInts = new ArrayList<>();
        if (first < second) {
            while (first <= second) {
                listInts.add(first);
                first++;
            }
        } else {
            while (second <= first) {
                listInts.add(second);
                second++;
            }
        }
        return listInts;
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int first = Integer.parseInt(firstValue);
        int second = Integer.parseInt(secondValue);
        ArrayList<Integer> result = task3305(first, second);
        int i = 0;
        while (i < result.size()) {
            System.out.print(result.get(i) + " ");
            i = i + 1;
        }
    }
}
