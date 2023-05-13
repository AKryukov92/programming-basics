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

        appendTaskDescEscaped("Если возникают затруднения при решении задач, сделайте сначала подробное решение без цикла. Это поможет увидеть закономерность и компактно перефразировать с помощью цикла.");
    }

    public static void main(String[] args) {
        System.out.println(new Task1631().getContent());
    }
}
