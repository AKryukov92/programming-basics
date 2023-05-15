package root.tasks.ranges;

import root.tasks.MultipleInputValLayout;

public class Task3864 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskDescNonEscaped("Даны координаты srcX и srcY исходной точки, а также destX и destY точки назначения. Решите обратную геодезическую задачу - определите горизонтальное п<b>р</b>оложение между точками (длина линии, distance) и дирекционный угол этого отрезка angle, выраженный в градусах");
        appendOrderedNonEscaped(
                "Вычислите приращение координат. <formula>dx = destX - srcX</formula>; <formula>dy = destY - srcY</formula>",
                "Определите румб линии по формуле <formula>r = arctg<fraction class=\"abs\"><numerator>dy</numerator><denominator>dx</denominator></fraction></formula>. Арктангенс из абсолютного значения результата деления.",
                "Выберите формулу для вычисления угла по знакам приращения координат и определите дирекционный угол по ней<table class=\"check_values\">\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<th rowspan=\"2\">Четверть</th>\n" +
                        "\t\t\t<th colspan=\"2\">Знаки приращения координат</th>\n" +
                        "\t\t\t<th rowspan=\"2\">Связь между румбами и дирекционными углами</th>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<th>dx</th>\n" +
                        "\t\t\t<th>dy</th>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td></td>\n" +
                        "\t\t\t<td>0 и более</td>\n" +
                        "\t\t\t<td>больше 0</td>\n" +
                        "\t\t\t<td>angle = r</td>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td></td>\n" +
                        "\t\t\t<td>меньше 0</td>\n" +
                        "\t\t\t<td>0 и более</td>\n" +
                        "\t\t\t<td>angle = 180 - r</td>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td></td>\n" +
                        "\t\t\t<td>0 и менее</td>\n" +
                        "\t\t\t<td>меньше 0</td>\n" +
                        "\t\t\t<td>angle = 180 + r</td>\n" +
                        "\t\t</tr>\n" +
                        "\t\t<tr>\n" +
                        "\t\t\t<td></td>\n" +
                        "\t\t\t<td>больше 0</td>\n" +
                        "\t\t\t<td>0 и менее</td>\n" +
                        "\t\t\t<td>angle = 360 - r</td>\n" +
                        "\t\t</tr>\n" +
                        "\t</table>",
                "Определите горизонтальное проложение (расстояние между точками)."
        );
        appendTaskDescEscaped("Выведите на экран четверть угла, горизонтальное проложение и дирекционный угол в градусах, с точностью до 4 знаков после запятой.");
        appendCheckValuesHeader("srcX", "srcY", "destX", "destY");
        appendCheckValuesRow("10","10","13","14");
        appendCheckValuesRow("24","4","3","17");
        appendCheckValuesRow("23", "25","12","16");
        appendCheckValuesRow("3", "11", "13", "5");
        appendCheckValuesRow("5", "5", "5", "10");
        appendCheckValuesRow("10", "5", "5", "5");
        appendCheckValuesRow("5", "10", "5", "5");
        appendCheckValuesRow("5", "5", "10", "5");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double srcX = Double.parseDouble(args[0]);
        double srcY = Double.parseDouble(args[1]);
        double destX = Double.parseDouble(args[2]);
        double destY = Double.parseDouble(args[3]);
        double dx = destX - srcX;
        double dy = destY - srcY;
        double distance = Math.sqrt(dx * dx + dy * dy);

        double rumb = Math.toDegrees(Math.atan(Math.abs(dy / dx)));
        int quarter;
        double angle;
        if (dx >= 0 && dy > 0) {
            angle = rumb;
            quarter = 1;
        } else if (dx < 0 && dy >= 0) {
            angle = 180 - rumb;
            quarter = 2;
        } else if (dx <= 0 && dy < 0) {
            angle = rumb + 180;
            quarter = 3;
        } else {
            angle = 360 - rumb;
            quarter = 4;
        }
        System.out.printf("Угол в %d четверти\n", quarter);
        System.out.printf("Горизонтальное проложение %.4f\nДирекционный угол %.4f\n", distance, angle);
    }

    public static void main(String[] args) {
        System.out.println(new Task3864());
    }
}
