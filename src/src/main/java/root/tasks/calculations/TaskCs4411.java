package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class TaskCs4411 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры.");
        appendCheckValuesHeader("X");
        appendCheckValuesRowCs("11.13");
        appendCheckValuesRowCs("-79.19");
        appendCheckValuesRowCs("0");
        appendCheckValuesRowCs("6.00006");
        appendCheckValuesRowCs("9.00004");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В этой задаче вам нужно получить от пользователя число. Это число может иметь цифры после запятой. Для сохранения таких чисел в памяти нужно объявить переменную типа double.");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getMain(getClass().getSimpleName())));
        appendTaskDescNonEscaped("Если вы получили ошибку ");
        appendCheckSingleNonEscaped("Необработанное исключение: System.FormatException: Входная строка имела неверный формат.\n" +
                "   в System.Number.ParseDouble(String value, NumberStyles options, NumberFormatInfo numfmt)\n" +
                "   в System.Double.Parse(String s)\n" +
                "   в Example.Program.Main(String[] args) в C:\\Users\\Александр\\source\\repos\\Example\\Example\\Program.cs:строка 9");
        appendTaskDescNonEscaped("Значит при вводе данных был напечатан неподходящий разделитель целой части. Такая проблема возникает из за различных настроек операционной системы. Обычно выбор между запятой <zoom>,</zoom> и точкой <zoom>.</zoom>. Если один из этих символов не подошел, используйте другой.");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double x = Double.parseDouble(value);
        double result;
        result = x + 7;
        System.out.printf("Результат равен %.4f", result);
    }
}
