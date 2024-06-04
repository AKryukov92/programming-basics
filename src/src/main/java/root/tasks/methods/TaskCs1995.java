package root.tasks.methods;

import root.Console;
import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;

public class TaskCs1995 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано два массива целых чисел. Вывести на экран индекс элемента, на котором массивы начинают отличаться. Если длина массиов отличается сообщите тот индекс, который существует только в одном из массивов.");
        appendOrderedNonEscaped(
                implementStatic("Library", "compareArrays"),
                //целые числа, чтобы не парить мозги  сравнением double с учетом погрешности
                "Он принимает в качестве аргументов 2 массива целых чисел",
                "Он возвращает строку",
                "В теле метода сформируйте ответ и верните его. Используйте значения аргументов в качестве исходных данных."
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    protected static class Library {
        public static String compareArrays(int[] standard, int[] array) {
            int minLength = Math.min(standard.length, array.length);
            for (int i = 0; i < minLength; i++) {
                if (standard[i] != array[i]) {
                    return "Массивы начинают различаться на индексе " + i;
                }
            }
            if (standard.length < array.length) {
                return "Массивы начинают различаться на индексе " + standard.length;
            } else if (array.length < standard.length) {
                return "Массивы начинают различаться на индексе " + array.length;
            } else {
                return "Массивы одинаковы";
            }
        }
    }

    @Override
    protected void logic(String firstValue) {
        int[] standard = new int[]{5, 4, 3, 2, 1};
        int[] array = new int[]{5, 4, 3, 2, 1};
        String result = Library.compareArrays(standard, array);
        Console.WriteLine(result);
        array = new int[]{5, 4, 3};
        result = Library.compareArrays(standard, array);
        Console.WriteLine(result);
        Console.WriteLine(Library.compareArrays(
                new int[]{9, 8, 7, 6},
                new int[]{9, 8, 7, 6, 5}
        ));
        standard = new int[]{9, 8, 7, 6, 5};
        array = new int[]{9, 111, 7};
        Console.WriteLine(Library.compareArrays(standard, array));
        array = new int[]{6, 5, 4, 3, 2, 1};
        Console.WriteLine(Library.compareArrays(
                new int[]{6, 5, 0, 3},
                array
        ));
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs1995());
    }
}
