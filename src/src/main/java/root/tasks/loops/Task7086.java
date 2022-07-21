package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task7086 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        int i = x;
        while (i <= x + 30) {
            System.out.print(i + " ");
            i+=3;
        }
        System.out.println();
        i = x - 40;
        while (i <= x) {
            System.out.print(i + " ");
            i+=4;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число x." +
                " Вывести на экран две строчки чисел." +
                " Первая начинается с числа x, после которого написаны 10 следующих чисел с шагом 3." +
                " Вторая заканчивается числом x, перед которым написаны 10 предыдущих чисел с шагом 4.");
        appendCheckValuesHeader("x");
        appendCheckValuesRow("2");
        appendCheckValuesRow("13");
        appendCheckValuesRow("-6");
        appendCheckValuesRow("1000");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7086().getContent());
    }
}
