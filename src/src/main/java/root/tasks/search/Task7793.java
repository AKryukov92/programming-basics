package root.tasks.search;

import root.tasks.TwoInputValLayout;

public class Task7793 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит два массива данных: красный и зеленый. Вывести на экран три группы элементов." +
                " Сначала те, что есть только в красном фрагменте." +
                " Следом те элементы, которые есть и в красном и в зеленом. В конце - элементы, которые есть только в зеленом.");
        appendCheckValuesHeader("Красный массив (red)", "Зеленый массив (green)");
        appendCheckValuesRow("qw er ty ui", "as er df qw");
        appendCheckValuesRow("qw er ty ui","as df gh jk");
        appendCheckValuesRow("zx cv bn", "zx cv bn");
        appendCheckValuesRow("q w e r t y", "y e q a s d");
        appendCheckValuesRow("a a a a a a", "a");
        appendCheckValuesRow("b", "b b b b b b");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String red, String green) {
        String[] redArr = red.split(" ");
        String[] greenArr = green.split(" ");
        System.out.println("Только в красном");
        for (int ri = 0; ri < redArr.length; ri++) {
            boolean found = false;
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(redArr[ri]);
            }
        }
        System.out.println("Есть в обоих");
        for (int ri = 0; ri < redArr.length; ri++) {
            for (int gi = 0; gi < greenArr.length; gi++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    System.out.println(redArr[ri]);
                    break;
                }
            }
        }
        System.out.println("Только в зеленом");
        for (int gi = 0; gi < greenArr.length; gi++) {
            boolean found = false;
            for (int ri = 0; ri < redArr.length; ri++) {
                if (redArr[ri].equals(greenArr[gi])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(greenArr[gi]);
            }
        }
        System.out.println();
    }
}
