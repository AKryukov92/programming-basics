package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1139 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int x = Integer.parseInt(value);
        int i = x;
        while (i <= x+30){
            System.out.print(i + " ");
            i+=3;
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число x. Вывести на экран в строчку число x, а также 10 следующих чисел с шагом 3.");
        appendCheckValuesHeader("x");
        appendCheckValuesRow("2");
        appendCheckValuesRow("4");
        appendCheckValuesRow("-6");
        appendCheckValuesRow("1000");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1139().getContent());
    }
}
