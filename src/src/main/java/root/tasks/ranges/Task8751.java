package root.tasks.ranges;

import root.tasks.OneInputValLayout;

public class Task8751 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Определить агрегатное состояние (state) и внутреннюю энергию (internalEnergy) воды массой 17 кг (mass). Пользователь вводит температуру в градусах Цельсия (temperatureCelsius). Температура перехода из кристалла в жидкость (кристаллизации) 0&#8451;. Температура перехода из жидкости в газ (конденсации) 100&#8451;. Удельная теплоемкость heatCapacity = 4.2 * 10 <sup>3</sup>Дж/кгK. Для вычисления теплоемкости, нужна температура в Кельвинах, которая вычисляется по формуле <formula>temperatureKelvins=temperatureCelsius + 273.15</formula>. Удельная теплота парообразования vaporisationHeat = 2.26 * 10<sup>6</sup>Дж/кг. Удельная теплота плавления fusionHeat = 3.3 * 10<sup>5</sup>Дж/кг. Внутренняя энергия зависит от агрегатного состояния и вычисляется по формуле:");
        appendOrderedNonEscaped(
                "Кристалл <formula>internalEnergy = mass * temperatureKelvins * heatCapacity Дж</formula>",
                "Жидкость <formula>internalEnergy = mass * (temperatureKelvins * heatCapacity + vaporisationHeat) Дж</formula>",
                "Газ <formula>internalEnergy = mass * (temperatureKelvins * heatCapacity + vaporisationHeat + fusionHeat) Дж</formula>"
        );
        appendTaskDescEscaped("Точность результатов два знака после запятой. Оформить ответ по шаблону:");
        appendCheckSingleNonEscaped("Агрегатное состояние: $state\n" +
                "Внутренняя энергия: $internalEnergy Дж");
        appendTaskDescEscaped("Если агрегатное состояние не удается определить точно, нужно перед ответом добавить фразу \"Вещество в переходном состоянии.\".");
        appendCheckValuesHeader("temperatureCelsius");
        appendCheckValuesRow("-273");
        appendCheckValuesRow("-10");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("0");
        appendCheckValuesRow("99");
        appendCheckValuesRow("100");
        appendCheckValuesRow("101");
        appendCheckValuesRow("-274");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double temperatureCelsius = Double.parseDouble(value);
        if (temperatureCelsius <= -273.15) {
            System.out.println("Некорректная температура");
            return;
        }
        double internalEnergy;
        double heatCapacity = 4.2E3;
        double vaporisationHeat = 2.26E6;
        double fusionHeat = 3.3E5;
        double m = 17;
        double temperatureKelvins = temperatureCelsius + 273.15;
        if (temperatureCelsius == 0 || temperatureCelsius == 100){
            System.out.println("Вещество в переходном состоянии.");
        }
        if (temperatureCelsius <= 0) {
            System.out.println("Агрегатное состояние: кристалл");
            internalEnergy = m * temperatureKelvins * heatCapacity;
            System.out.printf("Внутренняя энергия: %.2f Дж\n", internalEnergy);
        }
        if (0 <= temperatureCelsius && temperatureCelsius <= 100) {
            System.out.println("Агрегатное состояние: жидкость");
            internalEnergy = m * (temperatureKelvins * heatCapacity + vaporisationHeat);
            System.out.printf("Внутренняя энергия: %.2f Дж\n%n", internalEnergy);
        }
        if (100 <= temperatureCelsius) {
            System.out.println("Агрегатное состояние: газ");
            internalEnergy = m * (temperatureKelvins * heatCapacity + vaporisationHeat + fusionHeat);
            System.out.printf("Внутренняя энергия: %.2f Дж\n%n", internalEnergy);
        }
    }
}
