package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task6663 extends OneInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число start." +
                " Нужно вывести числа от start до 25 включительно." +
                " Если число start меньше 25, то по возрастанию." +
                " Иначе - по убыванию." +
                " В конце нужно написать сколько чисел было выведено на экране.");
        appendCheckValuesHeader("start");
        appendCheckValuesRow("20");
        appendCheckValuesRow("19");
        appendCheckValuesRow("30");
        appendCheckValuesRow("32");
        appendCheckValuesRow("0");
        appendCheckValuesRow("25");
        appendCheckValuesRow("40");
        appendCheckValuesRow("100");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int start = Integer.parseInt(value);
        int total;
        if (start < 25) {
            total = 26 - start;
            while (start <= 25) {
                System.out.print(start);
                System.out.print(" ");
                start++;
            }
        } else {
            total = start - 24;
            while (25 <= start) {
                System.out.print(start);
                System.out.print(" ");
                start--;
            }
        }
        System.out.println();
        System.out.println("Всего чисел: " + total);
    }
}
