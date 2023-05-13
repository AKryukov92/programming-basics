package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task6066 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в строчку числа от А до В включительно. После каждого числа должен быть выведен символ \";\". Если A > B, то вывести сообщение об ошибке.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "12");
        appendCheckValuesRow("5", "5");
        appendCheckValuesRow("695", "702");
        appendCheckValuesRow("3000", "24");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String A, String B) {
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        if (a <= b) {
            while (a <= b) {
                System.out.print(a + ";");
                a++;
            }
        } else {
            System.out.println("Значение A должно быть не больше значения B");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6066());
    }
}
