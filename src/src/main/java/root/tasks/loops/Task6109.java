package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task6109 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дан диапазон от 0 до 1000. Пользователь вводит два целых числа: parts и needle. Нужно разбить исходный диапазон на parts частей. Затем нужно выяснить, в какой из диапазонов попадает значение needle.");
        appendCheckValuesHeader("parts", "needle");
        appendCheckValuesRow("10", "0");
        appendCheckValuesRow("10", "1000");
        appendCheckValuesRow("10", "666");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int parts = Integer.parseInt(firstValue);
        int needle = Integer.parseInt(secondValue);
        int i = 0;
        int width = 1000 / parts;
        System.out.println("Предположение");
        int part = needle / width;
        System.out.println(part);
        while (i < parts) {
            int start = i * width;
            int end = i * width + width;
            System.out.print("Диапазон от " + start + " до " + end);
            if (i < parts) {
                if (start <= needle && needle < end) {
                    System.out.println(" Найдено");
                } else System.out.println();
            } else {

            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6109());
    }
}
