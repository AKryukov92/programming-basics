package root.tasks.assertions;

import root.tasks.MultipleInputValLayout;

public class Task9622 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Вычислите:");
        appendOrderedNonEscaped(
                "Кинетическую энергию тела по формуле: <formula>\n" +
                "\t\t\tkineticEnergy = \n" +
                "\t\t\t<fraction>\n" +
                "\t\t\t\t<numerator>mass*velocity<sup>2</sup></numerator>\n" +
                "\t\t\t\t<denominator>2</denominator>\n" +
                "\t\t\t</fraction>\n" +
                "\t\t</formula>",
                "Потенциальную энергию тела по формуле: <formula>potentialEnergy = mass*g*height</formula>"
        );
        appendTaskDescNonEscaped("Значение g - <a href=\"https://ru.wikipedia.org/wiki/%D0%A3%D1%81%D0%BA%D0%BE%D1%80%D0%B5%D0%BD%D0%B8%D0%B5_%D1%81%D0%B2%D0%BE%D0%B1%D0%BE%D0%B4%D0%BD%D0%BE%D0%B3%D0%BE_%D0%BF%D0%B0%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F\">ускорение свободного падения</a>, приблизительно равное 9,8067. Оформите результат по шаблону:");
        appendCheckSingleNonEscaped("Кинетическая энергия составляет: $kineticEnergy Дж\n" +
                "Потенциальная энергия составляет: $potentialEnergy Дж");
        appendCheckValuesHeader("mass", "velocity", "height");
        appendCheckValuesRow("7351", "7349", "7333");
        appendCheckValuesRow("19", "23", "29");
        appendCheckValuesRow("-1", "2", "3");
        appendCheckValuesRow("2", "-5", "8");
        appendCheckValuesRow("2", "6", "-9");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        double mass = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);
        double height = Double.parseDouble(args[2]);
        if (mass <= 0) {
            System.out.println("Значение M должно быть положительным");
        }
        if (velocity <= 0) {
            System.out.println("Значение V должно быть положительным");
        }
        if (height < 0) {
            System.out.println("Значение H должно быть неотрицательным");
        }
        if (mass > 0) {
            if (velocity > 0) {
                if (height >= 0) {
                    double g = 9.8067;
                    double kineticEnergy = mass * velocity * velocity / 2;
                    double potentialEnergy = mass * g * height;
                    System.out.printf("Кинетическая энергия составляет: %.4f Дж\n" +
                            "Потенциальная энергия составляет: %.4f Дж", kineticEnergy, potentialEnergy);
                }
            }
        }
    }
}
