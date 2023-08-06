package root.tasks.loops_with_conditions;

import root.tasks.TwoInputValLayout;

public class Task5522 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два целых числа: left и right. Нужно вывести числа от 50 до 60 включительно в столбик. Если число в строке равно left, нужно написать фразу \"Найдено LEFT\" справа от числа. Если число в строке равно right, нужно написать фразу \"Найдено RIGHT\" справа от числа.");
        appendCheckValuesHeader("left", "right");
        appendCheckValuesRow("51", "59");
        appendCheckValuesRow("57", "53");
        appendCheckValuesRow("56", "56");
        appendCheckValuesRow("50", "60");
        appendCheckValuesRow("60", "50");
        appendCheckValuesRow("0", "-1");
        appendCheckValuesRow("100", "200");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int left = Integer.parseInt(firstValue);
        int right = Integer.parseInt(secondValue);
        int i = 50;
        while (i <= 60) {
            System.out.print(i);
            if (i == left) {
                System.out.print(" Найдено left");
            }
            if (i == right) {
                System.out.print(" Найдено right");
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task5522());
    }
}
