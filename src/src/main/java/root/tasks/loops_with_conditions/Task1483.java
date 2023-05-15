package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task1483 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите N символов \"!\" в строчку. После каждого пятого, вывести пробел.");
        appendCheckValuesHeader("N");
        appendCheckValuesRow("4");
        appendCheckValuesRow("18");
        appendCheckValuesRow("42");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-9");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int n = Integer.parseInt(value);
        if (n < 0) {
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }
        int i = 0;
        int y = 0;
        while (i < n) {
            if (4 == y) {
                System.out.print("! ");
                y = 0;
            } else {
                System.out.print("!");
                y++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1483());
    }
}
