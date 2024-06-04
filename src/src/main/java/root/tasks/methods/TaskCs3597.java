package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs3597 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны вещественные числа a, b, c. Если a равно 0, вернуть сообщение об ошибке \"Уравнение не является квадратным\". Найдите в прошлых работах или в интернете формулу для вычисления дискриминанта, вычислите его и напишите одно из трех сообщений в зависимости от полученного значения.");
        appendOrderedEscaped(
                "Если дискриминант равен 0, то у уравнения один вещественный корень.",
                "Если дискриминант меньше 0, то у уравнения нет вещественных корней.",
                "Если дискриминант больше 0, то у уравнения два вещественных корня."
        );
        appendOrderedEscaped(
                "В классе Library реализуйте публичный статический метод task3597.",
                "Он принимает в качестве аргумента 3 действительных числа и возвращает строку.",
                "В теле метода верните результат решения задачи, используя значения аргументов в качестве исходных данных."
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String result;
        result = Library.task3597(1, 2, 3);
        Console.WriteLine(result);
        result = Library.task3597(11, 13, 19);
        Console.WriteLine(result);
        double a, b, c;
        a = 3;
        b = 17;
        c = 5;
        System.out.println(Library.task3597(a, b, c));
        a = 5;
        b = 31;
        c = 29;
        System.out.println(Library.task3597(a, b, c));
        Console.WriteLine(Library.task3597(3, 6, 3));
        Console.WriteLine(Library.task3597(1, 2, 1));
        Console.WriteLine(Library.task3597(0, 7, 13));
    }

    protected static class Library {
        public static String task3597(double a, double b, double c) {
            if (a == 0) {
                return "Данное уравнение не является квадратным";
            }
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return "У уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 два вещественных корня";
            }
            if (d == 0) {
                return "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень";
            }
            return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
        }
    }
}
