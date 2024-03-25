package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskJava4757 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два числа, нужно вычесть из большего числа меньшее.");
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("99", "17");
        appendCheckValuesRow("14", "5");
        appendCheckValuesFooter();
        appendTaskDescEscaped("При работе с методами вы можете встретить ошибку компиляции \"missing return statement\"." +
                " Пример когда у вас программа без ветвлений:");
        appendCheckSingleNonEscaped("public static int Sum(int a, int b){\n" +
                "    int result;\n" +
                "    result = a + b;\n" +
                "}");
        appendTaskDescEscaped("В этом случае для исправления нужно только дописать команду \"return result;\" как в примере ниже:");
        appendCheckSingleNonEscaped("public static int Sum(int a, int b){\n" +
                "    int result;\n" +
                "    result = a + b;\n" +
                "    return result;//эта команда добавлена\n" +
                "}");
        appendTaskDescEscaped("Если же ваша программа содержит ветвления (if), то ошибка \"missing return statement\" возникает в случае когда вы написали метод примерно так:");
        appendCheckSingleNonEscaped("public static int diff(int a, int b) {\n" +
                "    int result;\n" +
                "    if (a < b) {\n" +
                "        result = b - a;\n" +
                "        return result;\n" +
                "    }\n" +
                "    if (b < a) {\n" +
                "        result = a - b;\n" +
                "        return result;\n" +
                "    }\n" +
                "}");
        appendTaskDescEscaped("При компиляции, компьютер выполняет предварительный анализ кода. В этом примере он видит что команды return находятся внутри ветвлений. Для компьютера возможна ситуация, когда оба условия if будут ложны, а значит ни одна из команд return не будет выполнена. В данном примере - когда a строго равно b. Первый вариант исправления - предусмотреть return \"на всякий случай\" как в примере ниже:");
        appendCheckSingleNonEscaped("public static int diff(int a, int b) {\n" +
                "    int result;\n" +
                "    if (a < b) {\n" +
                "        result = b - a;\n" +
                "        return result;\n" +
                "    }\n" +
                "    if (b < a) {\n" +
                "        result = a - b;\n" +
                "        return result;\n" +
                "    }\n" +
                "    return 0;//на всякий случай\n" +
                "}");
        appendTaskDescEscaped("Другой вариант исправления - использовать if else. Если условие будет ложно, то будут выполнены команды из else. Если истинно - команды из if. Компьютер считает, что хотя бы одна из команд return будет выполнена Как в примере ниже:");
        appendCheckSingleNonEscaped("public static int diff(int a, int b) {\n" +
                "    int result;\n" +
                "    if (a < b) {\n" +
                "        result = b - a;\n" +
                "        return result;\n" +
                "    }\n" +
                "    else {//здесь раньше был if (b < a)\n" +
                "        result = a - b;\n" +
                "        return result;\n" +
                "    }\n" +
                "}");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int first = Integer.parseInt(firstValue);
        int second = Integer.parseInt(secondValue);
        if (first > second) {
            System.out.println(first - second);
        } else {
            System.out.println(second - first);
        }
    }
}
