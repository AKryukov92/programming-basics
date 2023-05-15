package root.tasks.assertions;

import root.tasks.MultipleInputValLayout;

public class Task6522 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskDescEscaped("Обратите внимание, что ситуаций с неправильными данными может быть значительно больше, чем ситуаций с правильными данными." +
                " Код для предотвращения нежелательных ситуаций может получиться объемнее, чем код для решения задачи.");
        appendTaskHeader();
        appendTaskDescNonEscaped("Смешали volume<sub>1</sub> литров воды с температурой temperature<sub>1</sub> градусов Цельсия " +
                "с volume<sub>2</sub> литрами воды с температурой temperature<sub>2</sub> градусов Цельсия." +
                " Вычислите объем <formula>volume=volume<sub>1</sub>+volume<sub>2</sub></formula> и температуру образовавшейся смеси по формуле" +
                "<formula>\n" +
                "\t\ttemperature=\n" +
                "\t\t<fraction>\n" +
                "\t\t\t<numerator>\n" +
                "\t\t\t\t(temperature<sub>1</sub>*volume<sub>1</sub>+temperature<sub>2</sub>*volume<sub>2</sub>)\n" +
                "\t\t\t</numerator>\n" +
                "\t\t\t<denominator>\n" +
                "\t\t\t\tvolume<sub>1</sub>+volume<sub>2</sub>\n" +
                "\t\t\t</denominator>\n" +
                "\t\t</fraction>\n" +
                "\t</formula>" +
                "Оформите результат по шаблону");
        appendCheckSingleNonEscaped("Объем смеси: $volume л\n" +
                "Температура смеси: $temperature &#8451;");
        appendCheckValuesHeader("volume1", "temperature1", "volume2", "temperature2");
        appendCheckValuesRow("1", "30", "3", "20");
        appendCheckValuesRow("1", "-20", "10", "20");
        appendCheckValuesRow("5", "90", "1", "-10");
        appendCheckValuesRow("-2", "10", "5", "50");
        appendCheckValuesRow("4", "100", "-10", "4");
        appendCheckValuesRow("20", "-800", "20", "30");
        appendCheckValuesRow("20", "10", "30", "-500");
        appendCheckValuesRow("-7", "-1000", "6", "71");
        appendCheckValuesRow("15", "-180", "-21", "90");
        appendCheckValuesRow("31", "10", "-2", "-300");
        appendCheckValuesRow("-7", "-1000", "-21", "71");
        appendCheckValuesRow("15", "-180", "-21", "-300");
        appendCheckValuesRow("-7", "-400", "-5", "-500");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double v1 = Double.parseDouble(args[0]);
        double t1 = Double.parseDouble(args[1]);
        double v2 = Double.parseDouble(args[2]);
        double t2 = Double.parseDouble(args[3]);
        if (v1 <= 0 || v2 <= 0) {
            System.out.println("Объем должен быть неотрицательным");
        }
        if (t1 <= -273.15 || t2 <= -273.15) {
            System.out.println("Температура должна быть выше абсолютного нуля (-273.15)");
        }
        if (v1 > 0 && v2 > 0 && t1 > -273.15 && t2 > -273.15) {
            double v = v1 + v2;
            double t = (t1 * v1 + t2 * v2) / (v1 + v2);
            System.out.printf("Объем смеси: %.4f л\nТемпература смеси: %.4f °C", v, t);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6522());
    }
}
