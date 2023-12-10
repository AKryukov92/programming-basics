package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class TaskJava9298 extends OneInputValLayout {

    @Override
    protected void logic(String value) {
        double edge = Double.parseDouble(value);
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        }
        if (edge > 0) {
            double result;
            result = 6 * edge * edge;
            System.out.printf("Площадь поверхности куба равна %.4f", result);
        }
    }

    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDescEscaped("Основное внимание в этой практической работе уделено одной из техник защитного программирования - сообщениям об ошибке. Говорить пользователю о том, что он ввёл некорректные данные очень важно. Это может быть важнее, чем посчитать результат.");
        appendTaskDescEscaped("В программе нужно предусмотреть как минимум два варианта действий. Один - когда все данные корректны. Второй - когда исходные данные не подходят для выполнения расчетов. Для оформления нужно использовать конструкции ветвления.");
        appendTaskHeader();
        appendTaskDescNonEscaped("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendCheckValuesHeader("edge");
        appendCheckValuesRow("1");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();

        appendSubheading("Порядок решения задач с проверками исходных данных");
        appendTaskDescEscaped("Реализуйте чтение исходных данных");
        appendCheckSingleNonEscaped(
                "double edge;\n" +
                "edge = Double.parseDouble(input.nextLine());\n");
        appendTaskDescEscaped("Добавьте две конструкции ветвления: для корректных и некорректных данных. Всегда пишите фигурные скобочки у конструкций ветвления. Пишите открывающую и закрывающую скобку одновременно. Заполняйте внутреннее содержимое после того, как напишете открывающую и закрывающую часть блока. У людей часто возникают ошибки в логике программы из за того, что скобки расставлены неправильно.");
        appendCheckSingleNonEscaped(
                "double edge;\n" +
                        "edge = Double.parseDouble(input.nextLine());\n" +
                        "if () {\n" +
                        "//сообщение об ошибке\n" +
                        "}\n" +
                        "if () {\n" +
                        "//расчет и вывод результата\n" +
                        "}");
        appendTaskDescEscaped("Подумайте, какое условие будет истинно для всех корректных данных, которые полезны для расчета результата.");
        appendCheckSingleNonEscaped(
                "double edge;\n" +
                "edge = Double.parseDouble(input.nextLine());\n" +
                "if () {\n" +
                "//сообщение об ошибке\n" +
                "}\n" +
                "if (edge > 0) {\n" +
                "//расчет и вывод результата\n" +
                "}");
        appendTaskDescEscaped("Подумайте какое условие будет истинно для всех некорректных данных.");
        appendCheckSingleNonEscaped(
                "double edge;\n" +
                "edge = Double.parseDouble(input.nextLine());\n" +
                "if (edge <= 0) {\n" +
                "//сообщение об ошибке\n" +
                "}\n" +
                "if (edge > 0) {\n" +
                "//расчет и вывод результата\n" +
                "}");
        appendTaskDescEscaped("Добавьте вычисления, вывод результата и сообщений об ошибке");
        appendCheckSingleNonEscaped(
                "double edge;\n" +
                "edge = Double.parseDouble(input.nextLine());\n" +
                "if (edge <= 0) {\n" +
                "    //сообщение об ошибке\n" +
                "    System.out.println(\"Значение edge должно быть положительным\");\n" +
                "}\n" +
                "if (edge > 0) {\n" +
                "    //расчет и вывод результата\n" +
                "    double result;\n" +
                "    result = 6 * edge * edge;\n" +
                "    System.out.printf(\"Площадь поверхности куба равна %.4f\", result);\n"+
                "}");
        appendTaskDescEscaped("Для сравнения можно применять следующие операторы:");
        appendOrderedNonEscaped(
                "<zoom>&lt;</zoom> Истинно, если значение слева <b>меньше</b> значения справа",
                "<zoom>&gt;</zoom> Истинно, если значение слева <b>больше</b> значения справа",
                "<zoom>&lt;=</zoom> Истинно, если значение слева <b>меньше или равно</b> значению справа",
                "<zoom>&gt;=</zoom> Истинно, если значение слева <b>больше или равно</b> значению справа",
                "<zoom>==</zoom> Истинно, если значение слева <b>строго равно</b> значению справа. Для сравнения строк нужно применять выражение standard.equals(someString).",
                "<zoom>!=</zoom> Истинно, если значение слева <b>не равно</b> значению справа"
        );
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava9298());
    }
}
