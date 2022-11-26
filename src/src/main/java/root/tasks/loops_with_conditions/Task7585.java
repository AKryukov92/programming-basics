package root.tasks.loops_with_conditions;

import root.tasks.OneInputValLayout;

public class Task7585 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дано целое число (X). Нужно вывести числа от 10 до 20 включительно в столбик и написать слово \"Найдено\" справа от введенного числа X.");
        appendCheckValuesHeader("X");
        appendCheckValuesRow("10");
        appendCheckValuesRow("15");
        appendCheckValuesRow("20");
        appendCheckValuesRow("9");
        appendCheckValuesRow("21");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        int i = 10;
        while (i <= 20) {
            if (x == i) {
                System.out.println(i + " Найдено");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
