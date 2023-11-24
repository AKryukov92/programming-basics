package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs4776 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить результат по формуле.<formula>\n" +
                "\t\t<sqrt><val>\n" +
                "\t\t\t1-sin<sup>2</sup>(xRad)\n" +
                "\t\t</val></sqrt>\n" +
                "\t</formula>");
        appendTaskDescNonEscaped("Значение угла дано в градусах. Метод для вычисления синуса был рассмотрен в задаче " + linkToTask(7711));
        appendOrderedNonEscaped(
                "В классе Library реализуйте публичный статический метод Task4776.",
                "Он принимает в качестве аргумента 1 действительное число и возвращает действительное число.",
                "В теле метода вычислите результат и верните его"
        );
        appendTaskDescEscaped("В методе main класса Program добавьте следующий код:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getLogic(getClass().getSimpleName())));
        appendTaskDescEscaped("В результате запуска метода main класса Program, в консоли должен появиться текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double result;
        result = Library.task4776(69.97);
        Console.WriteLine("{0:4F}", result);
        //для наглядности проверки можно писать дополнительные условия
        if (0.9395 <= result && result <= 0.9396) {
            Console.WriteLine("Верно");
        } else {
            Console.WriteLine("Результат некорректный");
        }
        result = Library.task4776(31);
        Console.WriteLine("{0:4F}", result);
        Console.WriteLine("{0:4F}", Library.task4776(90));
    }

    protected static class Library {
        public static double task4776(double angleDegree) {
            double angleRadian = angleDegree * Math.PI / 180;
            return Math.sin(angleRadian);
        }
    }
}
