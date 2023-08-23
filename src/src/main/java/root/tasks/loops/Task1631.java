package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1631 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int a = Integer.parseInt(value);
        int i = a;
        while (i < a + 10) {
            System.out.print(i);
            System.out.println("---");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в столбик 10 чисел, начиная с A включительно. В конце каждой строки с числом должна быть выведена строка с тремя знаками \"-\".");
        appendCheckValuesHeader("A");
        appendCheckValuesRow("8");
        appendCheckValuesRow("9");
        appendCheckValuesRow("-5");
        appendCheckValuesRow("695");
        appendCheckValuesFooter();
        appendFooter();
        appendTaskDescNonEscaped("Переменные могут называться самыми разными словами и буквами.\n" +
                "Из за этого людям сложно рассуждать о назначении различных переменных.\n" +
                "Назначение переменной и её название могут не совпадать.\n" +
                "В разных программах переменные с одним и тем же смыслом могут иметь разные названия.\n" +
                "При обсуждении смысла переменных в циклах обычно используют два термина: <b>счётчик</b> и <b>ограничение</b>.");
        appendCheckSingleNonEscaped("int i;//переменная увеличивается в цикле. это счетчик\n" +
                "i = 1;\n" +
                "int limit;//переменная сравнивается со счетчиком и не меняется в цикле. это ограничение.\n" +
                "limit = 7;\n" +
                "while (i <= limit) {\n" +
                "    print(i);\n" +
                "    i = i + 1;\n" +
                "}");
    }

    public static void main(String[] args) {
        System.out.println(new Task1631().getContent());
    }
}
