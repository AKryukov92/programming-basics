package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1259 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int w = Integer.parseInt(value);
        if (w < 0) {
            System.out.println("Вводимое число должно быть неотрицательно");
            return;
        }
        int i = 0;
        while (i < w && i < 20) {
            System.out.print("*");
            i++;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит целое число. Это количество символов '*', которые нужно вывести в строчку. Вывести не более 20 символов.");
        appendCheckValuesHeader("width");
        appendCheckValuesRow("0");
        appendCheckValuesRow("1");
        appendCheckValuesRow("10");
        appendCheckValuesRow("19");
        appendCheckValuesRow("20");
        appendCheckValuesRow("21");
        appendCheckValuesRow("50");
        appendCheckValuesRow("1000");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("-100");
        appendCheckValuesRow("-1000");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("Попробуйте адаптировать решение задачи " + linkToTask(2594));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1259().getContent());
    }
}
