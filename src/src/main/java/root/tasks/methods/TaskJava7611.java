package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;

public class TaskJava7611 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле x + 7.");
        appendOrderedNonEscaped(
                implementStatic("Library", "task7611"),
                itAccepts("1 действительное число"),
                "Он возвращает действительное число",
                "В теле метода верните результат решения задачи, используя значение аргумента в качестве исходных данных"
        );
        appendTaskDescEscaped("Код метода будет выглядеть так:");
        appendCheckSingleNonEscaped("public class Library {\n" +
                "    public static double task7611(double x) {\n" +
                "        double res;\n" +
                "        res =  x + 7;\n" +
                "        return res;\n" +
                "    }\n" +
                "}");
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String val) {
        double result;
        result = Library.task7611(11.13);//в качестве аргумента передано число
        System.out.printf("%.4f\n", result);
        double value = -79.19;
        result = Library.task7611(value);//в качестве аргумента передано значение переменной
        System.out.printf("%.4f\n", result);
        System.out.printf("%.4f\n", Library.task7611(0));//результат используется без промежуточной переменной
    }

    protected static class Library {
        public static double task7611(double x) {
            double res;
            res = x + 7;
            return res;
        }
    }
}