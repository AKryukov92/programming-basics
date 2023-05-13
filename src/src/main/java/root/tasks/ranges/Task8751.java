package root.tasks.ranges;

import root.tasks.OneInputValLayout;

public class Task8751 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Определить агрегатное состояние (state) и внутреннюю энергию (Q) воды массой 17 кг (m). Пользователь вводит температуру в градусах Цельсия (t<sub>C</sub>). Температура перехода из кристалла в жидкость (кристаллизации) 0&#8451;. Температура перехода из жидкости в газ (конденсации) 100&#8451;. Удельная теплоемкость c = 4.2 * 10 <sup>3</sup>Дж/кгK. Для вычисления теплоемкости, нужна температура в Кельвинах, которая вычисляется по формуле <formula>t<sub>K</sub>=t<sub>C</sub> + 273.15</formula>. Удельная теплота парообразования r = 2.26 * 10<sup>6</sup>Дж/кг. Удельная теплота плавления &lambda; = 3.3 * 10<sup>5</sup>Дж/кг. Внутренняя энергия зависит от агрегатного состояния и вычисляется по формуле:");
        appendOrderedNonEscaped(
                "<formula>Q<sub>кристалл</sub> = m * t<sub>K</sub> * c Дж</formula>",
                "<formula>Q<sub>жидкость</sub> = m * (t<sub>K</sub> * c + r) Дж</formula>",
                "<formula>Q<sub>газ</sub> = m * (t<sub>K</sub> * c + r + &lambda;) Дж</formula>"
        );
        appendTaskDescEscaped("Точность результатов два знака после запятой. Оформить ответ по шаблону:");
        appendCheckSingleNonEscaped("Агрегатное состояние: $state\n" +
                "Внутренняя энергия: $Q Дж");
        appendTaskDescEscaped("Если агрегатное состояние не удается определить точно, нужно перед ответом добавить фразу \"Вещество в переходном состоянии.\".");
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }
}
