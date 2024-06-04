package root.tasks.methods;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs4776 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дано действительное число xDeg, которое обозначает угол в градусах. Переведите угол из градусов в радианы с помощью метода Math.toRadian. Вычислите результат по формуле.<formula>\n" +
                "\t\t<sqrt><val>\n" +
                "\t\t\t1-sin<sup>2</sup>(xRad)\n" +
                "\t\t</val></sqrt>\n" +
                "\t</formula>");
        appendTaskDescNonEscaped("Для вычисления корня воспользуйтесь методом Math.sqrt. Для вычисления синуса воспользуйтесь методом Math.sin. Для решения задачи также можете воспользоваться методом вычисления косинуса Math.cos.");
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
        Console.WriteLine("{0:F4}", result);
        //для наглядности проверки можно писать дополнительные условия
        if (0.3425 <= result && result <= 0.3426) {
            Console.WriteLine("Верно");
        } else {
            Console.WriteLine("Результат некорректный");
        }
        result = Library.task4776(31);
        Console.WriteLine("{0:F4}", result);
        Console.WriteLine("{0:F4}", Library.task4776(90));
    }

    protected static class Library {
        public static double task4776(double angleDegree) {
            double angleRadian = angleDegree * Math.PI / 180;
            double sin = Math.sin(angleRadian);
            return Math.sqrt(1 - sin * sin);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs4776());
    }
}
