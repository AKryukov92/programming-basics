package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task2565 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Выведите на экран в строчку числа от B до A включительно в обратном порядке. Слева от ряда чисел выведите символ \"{\", а справа - \"}\". Если A > B, то вывести сообщение об ошибке.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "10");
        appendCheckValuesRow("8", "13");
        appendCheckValuesRow("13", "8");
        appendCheckValuesRow("691", "703");
        appendCheckValuesRow("17", "17");
        appendCheckValuesRow("3000", "24");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        if (a > b) {
            System.out.println("Значение A должно быть не больше значения B");
        } else {
            System.out.print("{ ");
            while (a <= b) {
                System.out.print(b);
                System.out.print(" ");
                b--;
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2565().getContent());
    }

}
