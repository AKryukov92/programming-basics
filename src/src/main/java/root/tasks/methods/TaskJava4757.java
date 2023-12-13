package root.tasks.methods;

import root.tasks.TwoInputValLayout;

public class TaskJava4757  extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны два числа, нужно вычесть из большего числа меньшее.");
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("99", "17");
        appendCheckValuesRow("14", "5");
        appendCheckValuesFooter();
        appendTaskDescEscaped("При работе с методами вы можете встретить ошибку компиляции \"java: missing return statement\"." +
                " Пример когда у вас программа без ветвлений:");
        appendCheckSingleNonEscaped("public static int sum(int a, int b){\n" +
                "    int result;\n" +
                "    result = a + b;\n" +
                "}//эта скобочка подчеркивается красным");
дописать про missing return statement

        appendTaskDescEscaped("Она возникает в случае когда вы написали метод примерно так:");
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
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {

    }
}
