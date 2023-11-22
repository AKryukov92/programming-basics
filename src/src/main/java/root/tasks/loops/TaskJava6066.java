package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class TaskJava6066 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в строчку числа от А до В включительно. После каждого числа должен быть выведен символ \";\". Если B < A, то вывести сообщение об ошибке.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "12");
        appendCheckValuesRow("5", "5");
        appendCheckValuesRow("695", "702");
        appendCheckValuesRow("3000", "24");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Конструкцию цикла можно вкладывать в конструкцию условия. Пример решения этой задачи:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String A, String B) {
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        if (b < a) {
            System.out.println("Значение A должно быть меньше или равно значению B");
        }
        if (a <= b) {
            while (a <= b) {
                System.out.print(a + ";");
                a = a + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava6066());
    }
}
