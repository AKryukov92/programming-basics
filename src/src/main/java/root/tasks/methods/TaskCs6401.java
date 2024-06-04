package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

import java.sql.SQLException;

public class TaskCs6401 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два действительных числа A и B, которые обозначают границы интервала. Нужно проверить, принадлежит ли значение X указанному интервалу.");
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task6401.",
                "Он принимает три действительных числа: A, B, X и возвращает логическое значение.",
                "Если X принадлежит интервалу от A до B включительно, метод должен вернуть значение true.",
                "Если X за пределами интервала от A до B включительно, метод должен вернуть значение false.",
                "Если A < B, значит интервал от A до B. Если B < A, значит интервал от B до A.",
                "В методе main класса Program добавьте код для проверки:"
        );
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendTaskDescEscaped("В результате запуска метода main должен получиться следующий результат:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) throws SQLException {
        double a = -2, b = 7;
        boolean result;
        double x = -10;
        result = Library.Task6401(a, b, x);
        if (result) {
            Console.WriteLine(x + " принадлежит интервалу");
        } else {
            Console.WriteLine(x + " за пределами интервала");
        }
        result = Library.Task6401(b, a, x);
        if (result) {
            Console.WriteLine(x + " принадлежит интервалу");
        } else {
            Console.WriteLine(x + " за пределами интервала");
        }
        x = 0;
        if (Library.Task6401(-2, 7, x)) {
            Console.WriteLine(x + " принадлежит интервалу");
        } else {
            Console.WriteLine(x + " за пределами интервала");
        }

        if (Library.Task6401(7, -2, x)) {
            Console.WriteLine(x + " принадлежит интервалу");
        } else {
            Console.WriteLine(x + " за пределами интервала");
        }
        Console.WriteLine(Library.Task6401(-2, 7, 15));
        Console.WriteLine(Library.Task6401(-2, 7, 4));
    }

    static class Library {
        public static boolean Task6401(double a, double b, double x) {
            if (a < b) {
                if (a <= x && x <= b) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (b <= x && x <= a) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


}
