package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

public class TaskCs9354 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendOrderedEscaped(
                "Объявите в классе Library публичный статический метод task9354.",
                "Он принимает в качестве аргумента действительное число (edge).",
                "Метод возвращает действительное число в качестве результата.",
                "Если значение аргумента \"edge\" меньше или равно 0, то метод должен выбросить исключение."
        );
        appendTaskDescEscaped("Для того, чтобы выбросить исключение, нужно добавить в тело метода следующий код:");
        appendCheckSingleNonEscaped("if (edge <= 0) {\n" +
                "    throw new Exception(\"Значение edge должно быть положительным\");\n" +
                "}");
        appendTaskDescEscaped("В методе main класса Program добавьте код для проверки:");
        appendCheckSingleNonEscaped(methodExample());
        appendTaskDescEscaped("В результате запуска метода main, в консоли должен появиться следующий текст:");
        appendCheckSingleNonEscaped(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected String methodExample() {
        return "double e = 7;\n" +
                "double res = Library.task9354(e);\n" +
                "Console.WriteLine(\"Площадь поверхности куба равна {0:F4}\", res);\n" +
                "res = Library.task9354(7247);\n" +
                "Console.WriteLine(\"Площадь поверхности куба равна {0:F4}\", res);\n" +
                "try {\n" +
                "    res = Library.task9354(-11);\n" +
                "    Console.WriteLine(\"Площадь поверхности куба равна {0:F4}\", res);\n" +
                "} catch (Exception e) {\n" +
                "    Console.WriteLine(e.Message);\n" +
                "}\n" +
                "try {\n" +
                "    double res = Library.task9354(0);\n" +
                "    Console.WriteLine(\"Площадь поверхности куба равна {0:F4}\", res);\n" +
                "} catch (Exception e) {\n" +
                "    Console.WriteLine(e.Message);\n" +
                "}";
    }

    static class Library {
        public static double task9354(double edge) throws Exception {
            if (edge <= 0) {
                throw new Exception("Значение edge должно быть положительным");
            }
            return edge * edge * 6;
        }
    }

    @Override
    protected void logic(String arg) {
        try {
            double e = 7;
            double res = Library.task9354(e);
            System.out.printf("Площадь поверхности куба равна %.4f\n", res);
            res = Library.task9354(7247);
            System.out.printf("Площадь поверхности куба равна %.4f\n", res);
            res = Library.task9354(-11);
            System.out.printf("Площадь поверхности куба равна %.4f\n", res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double res = Library.task9354(0);
            System.out.printf("Площадь поверхности куба равна %.4f\n", res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs9354());
    }
}
