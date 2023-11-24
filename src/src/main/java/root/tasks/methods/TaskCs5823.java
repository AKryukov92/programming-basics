package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;

public class TaskCs5823 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит несколько значений. Вывести данный фрагмент текста, заменив названия переменных их значениями.");
        appendCheckSingleNonEscaped("&lt;circle cx=\"$CX\" cy=\"$CY\" r=\"$R\" fill=\"$FILL\"/&gt;");
        appendOrderedNonEscaped(
                implementStatic("Library", "task5823"),
                "Он принимает в качестве аргументов 3 целых числа и 1 строку",
                "В теле метода task5823 напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных."
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String args) {
        int x = 50;
        Library.task5823(x, 50, 40, "yellow");//вызов метода task5823 с аргументами 50, 50, 40, "yellow"
        x = 400;
        Library.task5823(x, 300, 200, "green");
        x = 254;
        String colorOrange = "#cc6600";
        Library.task5823(x, 356, 100, colorOrange);
    }

    protected static class Library {
        public static void task5823(int cx, int cy, int r, String fill) {
            System.out.printf("&lt;circle cx=\"%d\" cy=\"%d\" r=\"%d\" fill=\"%s\"/&gt;\n", cx, cy, r, fill);
        }
    }
}
