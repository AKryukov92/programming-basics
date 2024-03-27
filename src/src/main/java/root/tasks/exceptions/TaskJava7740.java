package root.tasks.exceptions;

import root.tasks.OneInputValLayout;

public class TaskJava7740 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendOrderedNonEscaped(
                "В папке с исходным кодом создайте класс Runner7740",
                "Создайте метод main в классе Runner7740 по аналогии с методами main из задач прошлых практических.",
                "Решите описанную ниже задачу. Исходные данные пользователь вводит вручную.",
                "Обработайте потенциальное исключение, которое возникает когда пользователь вводит не числа."
        );
        appendTaskDescEscaped("Вычислить результат по формуле x + 7, где x вводится с клавиатуры");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("11.13");
        appendCheckValuesRow("-7919");
        appendCheckValuesRow("0");
        appendCheckValuesRow("word");
        appendCheckValuesRow("$14");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Попробуйте решить задачу как раньше и в качестве исходных данных ввести 'word'.");
        appendCheckSingleNonEscaped("double x = Double.Parse(value);\n" +
                "double result = x + 7;\n" +
                "System.out.printf(\"%.4f\", result);");
        appendTaskDescEscaped("При вводе 'word', у вас возникнет примерно такая ошибка:");
        appendCheckSingleNonEscaped("Exception in thread \"main\" java.lang.<b>NumberFormatException</b>: For input string: \"word\"\n" +
                "\tat sun.misc.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2043)\n" +
                "\tat sun.misc.FloatingDecimal.parseDouble(FloatingDecimal.java:110)\n" +
                "\tat java.lang.Double.parseDouble(Double.java:538)\n" +
                "\tat root.tasks.exceptions.TaskJava7740.logic(TaskJava7740.java:32)\n" +
                "\tat root.tasks.OneInputValLayout.rethrowAsRuntime(OneInputValLayout.java:16)\n" +
                "\tat root.tasks.OneInputValLayout.appendCheckValuesRow(OneInputValLayout.java:68)\n" +
                "\tat root.tasks.exceptions.TaskJava7740.makeLayout(TaskJava7740.java:20)\n" +
                "\tat root.tasks.LayoutMaker.getContent(LayoutMaker.java:29)\n" +
                "\tat root.tasks.LayoutMaker.toString(LayoutMaker.java:232)\n" +
                "\tat java.lang.String.valueOf(String.java:2994)\n" +
                "\tat java.io.PrintStream.println(PrintStream.java:821)\n" +
                "\tat root.tasks.exceptions.TaskJava7740.main(TaskJava7740.java:43)\n" +
                "\n" +
                "Process finished with exit code 1\n");
        appendTaskDescEscaped("Чтобы программа корректно обрабатывала такие ошибки, нужно добавить конструкцию try catch как в примере ниже:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        try {//внутри блока try предполагаем, что пользователь ввел число
            double x = Double.parseDouble(value);
            double result = x + 7;
            System.out.printf("%.4f", result);
        } catch (NumberFormatException ex) {
            //Слово NumberFormatException было в первое строке ошибки в варианте программы без try catch
            //если преобразовать строку в число не получилось, компьютер перейдет в этот блок
            System.out.println("Не удалось преобразовать строку в число '" + value + "'");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava7740());
    }
}
