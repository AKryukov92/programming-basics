package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs6573 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Найти произведение всех целых чисел от А до B включительно. Значение A может быть как меньше, так и больше B. Для хранения результата используйте переменную типа long. Этот тип поддерживает очень большие целые числа.");
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task6573.",
                "Он принимает в качестве аргумента 2 целых числа и возвращает большое целое число.",
                "В теле метода нужно вернуть результат решения задачи, используя значения аргументов в качестве исходных данных."
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        long result;
        result = Library.task6573(8, 13);
        Console.WriteLine(result);
        result = Library.task6573(13, 8);
        Console.WriteLine(result);
        int from, to;
        from = 159;
        to = 161;
        result = Library.task6573(from, to);
        Console.WriteLine(result);
        from = -2;
        to = 600;
        Console.WriteLine(Library.task6573(from, to));
        Console.WriteLine(Library.task6573(648, 648));
        Console.WriteLine(Library.task6573(35, 24));
    }

    protected static class Library {
        public static long task6573(int a, int b) {
            long mul = 1;
            long i, n;
            if (a < b) {
                i = a;
                n = b;
            } else {
                i = b;
                n = a;
            }
            while (i <= n) {
                mul *= i;
                i++;
            }
            return mul;
        }
    }
}
