package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task5301 extends OneInputValLayout {
    @Override
    protected void logic(String firstValue) {
        int a = Integer.parseInt(firstValue);
        int i = 0;
        int step = 1;
        while (i < a) {
            System.out.print(i + " ");
            i+= step;
            step++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит целое число limit. " +
                "Выведите на экран <i>в строчку</i> числа, начиная с 0 до limit, исключая limit. " +
                "Шаг счетчика должен увеличиваться на 1 каждую итерацию цикла.");
        appendCheckValuesHeader("A");
        appendCheckValuesRow("100");
        appendCheckValuesRow("10");
        appendCheckValuesRow("150");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-10");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task5301().getContent());
    }
}
