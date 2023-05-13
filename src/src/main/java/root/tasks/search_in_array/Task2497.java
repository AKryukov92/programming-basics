package root.tasks.search_in_array;

import root.tasks.TwoInputValLayout;

public class Task2497 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Левый массив пуст");
            return;
        }
        if (secondValue.isEmpty()) {
            System.out.println("Правый массив пуст");
            return;
        }
        String[] data = firstValue.split(",");
        int[] left = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            left[i] = Integer.parseInt(data[i]);
        }
        data = secondValue.split(",");
        int[] right = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            right[i] = Integer.parseInt(data[i]);
        }
        boolean allCorrect = true;
        for (int l = 0; l < left.length; l++) {
            boolean lessThanAll = true;
            for (int r = 0; r < right.length; r++) {
                if (left[l] > right[r]) {
                    System.out.print("Элемент " + left[l] + " на индексе " + l + " левого массива");
                    System.out.println(" больше элемента " + right[r] + " на индексе " + r + " правого массива");
                    lessThanAll = false;
                    break;
                }
                if (left[l] == right[r]) {
                    System.out.print("Элемент " + left[l] + " на индексе " + l + " левого массива");
                    System.out.println(" равен элементу правого массива на индексе " + r);
                    lessThanAll = false;
                    break;
                }
            }
            if (lessThanAll) {
                System.out.println("Элемент " + left[l] + " прошел проверку. Он меньше всех элементов правого массива");
            } else {
                allCorrect = false;
                //break;
            }
        }
        if (allCorrect) {
            System.out.println("Правильно");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два массива: левый и правый. Элементы в них разделены запятой ','." +
                " Если каждый элемент левого массива строго меньше чем все элементы правого массива, написать 'Правильно'." +
                " В противном случае, надо написать индексы и значения элементов, которые нарушают правило. Хотя бы одну пару.");
        appendCheckValuesHeader("левый массив(left)", "правый массив (right)");
        appendCheckValuesRow("3", "9,8,7,6");
        appendCheckValuesRow("5,4,3,2,1", "9");
        appendCheckValuesRow("7", "9,8,7");
        appendCheckValuesRow("5,4,3", "9,8,7,6");
        appendCheckValuesRow("5,4,10", "9,8,7");
        appendCheckValuesRow("15,4,3", "9,8,7,6,5");
        appendCheckValuesRow("5,4,3,2,1", "9,8,7,6");
        appendCheckValuesRow("6,5,4,3", "9,8,7,6");
        appendCheckValuesRow("6,5,14,3", "9,8,7,6");
        appendCheckValuesRow("", "3,2,1");
        appendCheckValuesRow("9,8,7", "");
        appendCheckValuesFooter();
        appendFooter();
        appendTaskDescEscaped("Попробуйте решить это задание правильно по смыслу, но так чтобы напечатался другой текст в тестах с нарушениями правила.");
    }

    public static void main(String[] args) {
        System.out.println(new Task2497().getContent());
    }
}
