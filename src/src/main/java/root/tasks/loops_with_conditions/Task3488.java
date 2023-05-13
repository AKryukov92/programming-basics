package root.tasks.loops_with_conditions;

import root.tasks.MultipleInputValLayout;

public class Task3488 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит три целых числа: A, B, C. Нужно вывести 10 чисел, начиная с указанных в три столбика.\n" +
                "Первый столбик начинается с A. Второй - с B. Третий - с C.\n" +
                "Если хотя бы одно из чисел в строке будет равно 10, то вывести в конце строку \"найдено\".");
        appendCheckValuesHeader("A", "B", "C");
        appendCheckValuesRow("0", "0", "0");
        appendCheckValuesRow("5", "0", "0");
        appendCheckValuesRow("8", "6", "4");
        appendCheckValuesRow("15", "10", "5");
        appendCheckValuesRow("21", "14", "7");
        appendCheckValuesRow("36", "30", "24");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int i = 0;
        System.out.println("a  b  c");
        while (i < 10) {
            System.out.print(a + " " + b + " " + c);
            if (a == 10 || b == 10 || c == 10) {
                System.out.println(" Найдено");
            } else {
                System.out.println();
            }
            i = i + 1;
            a = a + 1;
            b = b + 1;
            c = c + 1;
        }
    }
}
