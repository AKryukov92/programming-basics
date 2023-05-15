package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task9865 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дана скорость в <a href=\"https://ru.wikipedia.org/wiki/%D0%A3%D0%B7%D0%B5%D0%BB_(%D0%B5%D0%B4%D0%B8%D0%BD%D0%B8%D1%86%D0%B0_%D0%B8%D0%B7%D0%BC%D0%B5%D1%80%D0%B5%D0%BD%D0%B8%D1%8F)\">узлах</a>. Нужно найти приблизительную скорость в километрах/час. Для быстрого приблизительного пересчёта в уме узлов в километры в час: «умножь на два и вычти 10 процентов». Выведите ответ по шаблону: \"$knots узлов это $KmH км/ч\". Точность чисел - 2 знака после запятой.");
        appendCheckValuesHeader("knots");
        appendCheckValuesRow("15");
        appendCheckValuesRow("11");
        appendCheckValuesRow("1");
        appendCheckValuesRow("0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double kmH = Double.parseDouble(value);
        double kmH2 = kmH * 2;
        System.out.printf("Умножили %.4f на 2 получили %.4f\n", kmH, kmH2);
        double tenh = kmH2 * 0.1;
        double knots = kmH2 - tenh;
        System.out.printf("10%% от %.4f это %.4f\n", kmH2, tenh);
        System.out.printf("%.2f узлов это приблизительно %.2f км/ч\n", kmH, knots);
    }

    public static void main(String[] args) {
        System.out.println(new Task9865());
    }
}
