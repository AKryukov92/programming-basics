package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1631 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int a = Integer.parseInt(value);
        int i = a;
        while (i < a + 10) {
            System.out.println(i);
            System.out.println("---");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран в столбик 10 чисел, начиная с A включительно. После каждой строки с числом должна быть выведена строка с тремя знаками \"-\".");
        appendCheckValuesHeader("A");
        appendCheckValuesRow("8");
        appendCheckValuesRow("-5");
        appendCheckValuesRow("695");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1631().getContent());
    }
}
