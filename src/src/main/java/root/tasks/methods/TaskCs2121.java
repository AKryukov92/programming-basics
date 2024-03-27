package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class TaskCs2121 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два числа: P и Q. Нужно сравнить их.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод Task2121.",
                "Он принимает два целых числа.",
                "Метод возвращает логическое значение.",
                "Если P <= Q, метод должен вернуть true",
                "Если Q < P, метод должен вернуть false",
                "В методе main класса Program добавьте код для проверки:"
        );
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main должен получиться следующий результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendTaskDescEscaped("Метод для решения задачи будет выглядеть так:");
        appendCheckSingleNonEscaped("public static boolean Task2121(int P, int Q) {\n" +
                "    if (P <= Q) {\n" +
                "        return true;\n" +
                "    } else {\n" +
                "        return false;\n" +
                "    }\n" +
                "}");
        appendCheckSingleNonEscaped("Если для ответа вам достаточно одного логического выражения, то метод можно сократить до:");
        appendCheckSingleNonEscaped("public static boolean Task2121(int P, int Q) {\n" +
                "    return P <= Q;\n" +
                "}");
        appendFooter();
    }

    static class Library {
        public static boolean Task2121(int P, int Q) {
            if (P <= Q) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    protected void logic(String value) throws SQLException {
        int p = 0, q = 7;
        boolean result = Library.Task2121(p, q);
        Console.WriteLine(result);
        Console.WriteLine(Library.Task2121(14, 9));
        Console.WriteLine(Library.Task2121(5, 5));
    }
}
