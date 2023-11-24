package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;


public class TaskCs2772 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями. $A, $B, $C на введенные значения a, b, c соответственно.");
        appendCheckSingleNonEscaped("Квадратное уравнение $A*x*x + $B*x + $C = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = $B*$B - 4*$A*$C");
        appendOrderedNonEscaped(
                implementStatic("Library", "task2772"),
                itAccepts("3 целых числа"),
                itShouldDo("task2772")
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String args) {
        Library.task2772(1, 2, 3);
        Library.task2772(-3, 0, 2);
    }

    protected static class Library {
        public static void task2772(int a, int b, int c) {
            System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n" +
                    "Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s\n", a, b, c, b, b, a, c);
        }
    }

}
