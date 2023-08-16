package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task9298 extends OneInputValLayout {

    @Override
    protected void logic(String value) {
        int edge = Integer.parseInt(value);
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
        }
        if (edge > 0) {
            int result = 6 * edge * edge;
            System.out.print(result);
        }
    }

    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDescEscaped("Основное внимание в этой лабораторной уделено одной из техник защитного программирования - выводу сообщений об ошибке. Говорить пользователю о том, что он ввёл некорректные данные очень важно. Это может быть важнее, чем посчитать результат.");
        appendTaskDescEscaped("В программе нужно предусмотреть как минимум два варианта действий. Один - когда все данные корректны. Второй - когда исходные данные не подходят для выполнения расчетов. Для оформления нужно использовать конструкции ветвления.");
        appendTaskHeader();
        appendTaskDescNonEscaped("Дана длина ребра куба. Найти площадь его боковой поверхности по формуле <formula>area=6*edge<sup>2</sup></formula>.");
        appendCheckValuesHeader("edge");
        appendCheckValuesRow("1");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();
        appendFooter();

        appendCheckSingleNonEscaped("Всегда пишите фигурные скобочки у конструкций ветвления." +
                "Пишите открывающую и закрывающую скобку одновременно. Заполняйте внутреннее содержимое после того, как напишете открывающую и закрывающую часть блока. У людей часто возникают ошибки в логике программы из за того, что скобки расставлены неправильно.");
        appendCheckSingleNonEscaped("Сначала напишите\n" +
                "if () {\n" +
                "}\n" +
                "if () {\n" +
                "}");
        appendCheckSingleNonEscaped("Затем напишите\n" +
                "if () {\n" +
                "//сообщение об ошибке\n" +
                "}\n" +
                "if () {\n" +
                "//расчет и вывод результата\n" +
                "}");
        appendCheckSingleNonEscaped("Подумайте какое условие будет истинно для всех некорректных данных.\n" +
                "if (edge < 0) {\n" +
                "//сообщение об ошибке\n" +
                "}\n" +
                "if () {\n" +
                "//расчет и вывод результата\n" +
                "}");
        appendCheckSingleNonEscaped("Подумайте какое условие будет истинно для всех корректных данных, которые полезны для расчета результата.\nif (edge < 0) {\n" +
                "//сообщение об ошибке\n" +
                "}\n" +
                "if () {\n" +
                "//расчет и вывод результата\n" +
                "}");
    }

    public static void main(String[] args) {
        System.out.println(new Task9298());
    }
}
