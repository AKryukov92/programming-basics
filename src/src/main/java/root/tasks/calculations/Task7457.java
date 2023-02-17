package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7457 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана скорость в километрах/час. Найти значение этой скорости в метрах/секунду. Выведите ответ по шаблону \"$velocityInKmH км/ч это $velocityInMS м/с\". Точность чисел составляет 2 знака после запятой.");
        appendCheckValuesHeader("velocityInKmH");
        appendCheckValuesRow("60");
        appendCheckValuesRow("200");
        appendCheckValuesRow("5");
        appendCheckValuesRow("0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double velocityInKmH = Double.parseDouble(value);
        double velocityInMH = velocityInKmH * 1000;
        double velocityInMmin = velocityInMH / 60;
        double velocityInMS = velocityInMmin / 60;
        System.out.printf("%.2f км/ч\n", velocityInKmH);
        System.out.printf("%.2f м/ч\n", velocityInMH);
        System.out.printf("%.2f м/мин\n", velocityInMmin);
        System.out.printf("%.2f м/с\n", velocityInMS);
    }

    public static void main(String[] args) {
        System.out.println(new Task7457());
    }
}
