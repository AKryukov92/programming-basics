package root.tasks.exceptions;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskCs7740 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrderedNonEscaped(
                "В решении Stage2 создайте проект Runner7740 типа \"Консольное приложение\".",
                "Решите описанную ниже задачу. Исходные данные пользователь вводит вручную.",
                "Обработайте потенциальное исключение, которое возникает когда пользователь вводит не числа."
        );
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры");
        appendCheckValuesHeader("X");
        appendCheckValuesRowCs("11.13");
        appendCheckValuesRowCs("-7919");
        appendCheckValuesRowCs("0");
        appendCheckValuesRowCs("word");
        appendCheckValuesRowCs("$14");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Попробуйте решить задачу как раньше и в качестве исходных данных ввести 'word'.");
        appendCheckSingleNonEscaped("double x = Double.Parse(value);\n" +
                "double result = x + 7;\n" +
                "Console.WriteLine(\"{0:F4}\", result);");
        appendTaskDescEscaped("У вас возникнет примерно такая ошибка:");
        appendCheckSingleNonEscaped("System.<b>FormatException</b>: Input string was not in a correct format.\n" +
                "  at System.Number.ThrowOverflowOrFormatException (System.Boolean overflow, System.String overflowResourceKey) [0x0001a] in <de882a77e7c14f8ba5d298093dde82b2>:0 \n" +
                "  at System.Number.ParseDouble (System.ReadOnlySpan`1[T] value, System.Globalization.NumberStyles styles, System.Globalization.NumberFormatInfo info) [0x0007d] in <de882a77e7c14f8ba5d298093dde82b2>:0 \n" +
                "  at System.Double.Parse (System.String s) [0x0001a] in <de882a77e7c14f8ba5d298093dde82b2>:0 \n" +
                "  at HelloWorld.Main () [0x00006] in <06007635d88644c1b15027f9adf16620>:0 \n" +
                "[ERROR] FATAL UNHANDLED EXCEPTION: System.FormatException: Input string was not in a correct format.\n" +
                "  at System.Number.ThrowOverflowOrFormatException (System.Boolean overflow, System.String overflowResourceKey) [0x0001a] in <de882a77e7c14f8ba5d298093dde82b2>:0 \n" +
                "  at System.Number.ParseDouble (System.ReadOnlySpan`1[T] value, System.Globalization.NumberStyles styles, System.Globalization.NumberFormatInfo info) [0x0007d] in <de882a77e7c14f8ba5d298093dde82b2>:0 \n" +
                "  at System.Double.Parse (System.String s) [0x0001a] in <de882a77e7c14f8ba5d298093dde82b2>:0 ");
        appendTaskDescEscaped("Чтобы программа корректно обрабатывала такие ошибки, нужно добавить конструкцию try catch как в примере ниже:");
        appendCheckSingleNonEscaped("try {//внутри блока try предполагаем, что пользователь ввел число\n" +
                "    double x = Double.Parse(value);\n" +
                "    double result = x + 7;\n" +
                "    Console.WriteLine(\"{0:F4}\", result);\n" +
                "} catch (FormatException ex) {//Слово FormatException было в первое строке ошибки в варианте программы без try catch\n" +
                "    //если преобразовать строку в число не получилось, компьютер перейдет в этот блок\n" +
                "    Console.WriteLine(\"Не удалось преобразовать строку в число '\" + value + \"'\");\n" +
                "}");
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        try {//внутри блока try предполагаем, что пользователь ввел число
            double x= Double.parseDouble(value);
            double result = x + 7;
            Console.WriteLine("%.4f", result);
        } catch (NumberFormatException ex) {
            //если преобразовать строку в число не получилось, компьютер перейдет в этот блок
            System.out.println("Не удалось преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs7740());
    }
}
