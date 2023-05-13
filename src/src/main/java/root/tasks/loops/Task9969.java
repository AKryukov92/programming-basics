package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task9969 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число start. Нужно вывести это число три раза в строку. А потом продолжая строку вывести 10 следующих чисел с шагом 7. Последнее получившееся число тоже нужно вывести три раза в строку.");
        appendCheckValuesHeader("start");
        appendCheckValuesRow("0");
        appendCheckValuesRow("1");
        appendCheckValuesRow("19");
        appendCheckValuesRow("20");
        appendCheckValuesRow("1000");
        appendCheckValuesRow("-14");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        int start = Integer.parseInt(value);
        System.out.print(start);
        System.out.print(" ");
        System.out.print(start);
        System.out.print(" ");
        int i = 0;
        while (i < 10) {
            System.out.print(start);
            System.out.print(" ");
            start += 7;
            i++;
        }
        System.out.print(start);
        System.out.print(" ");
        System.out.print(start);
        System.out.print(" ");
        System.out.print(start);
        System.out.print(" ");
    }

    public static void main(String[] args) {
        System.out.println(new Task9969());
    }
}
