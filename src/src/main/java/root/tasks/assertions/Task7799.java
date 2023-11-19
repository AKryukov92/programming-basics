package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task7799 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Вычислить силу трения по формуле. Значение угла дано в градусах. <formula>force=mass*g*cos(angleRadian)</formula>, где g - <a href=\"https://ru.wikipedia.org/wiki/%D0%A3%D1%81%D0%BA%D0%BE%D1%80%D0%B5%D0%BD%D0%B8%D0%B5_%D1%81%D0%B2%D0%BE%D0%B1%D0%BE%D0%B4%D0%BD%D0%BE%D0%B3%D0%BE_%D0%BF%D0%B0%D0%B4%D0%B5%D0%BD%D0%B8%D1%8F\">ускорение свободного падения</a>, приблизительно равное 9,8067");
        appendImage("images/task7799.png");
        appendCheckValuesHeader("mass", "angleDegree");
        appendCheckValuesRow("5", "45");
        appendCheckValuesRow("7297", "30");
        appendCheckValuesRow("10", "90");
        appendCheckValuesRow("7", "91");
        appendCheckValuesRow("9", "100");
        appendCheckValuesRow("0", "30");
        appendCheckValuesRow("-10", "5");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Исходя из смысла задачи и тестовых данных вам нужно понять, какие проверки исходных данных добавить.");
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        double mass = Double.parseDouble(firstValue);
        double angleDegree = Double.parseDouble(secondValue);
        double g = 9.8067;
        if (mass <= 0) {
            System.out.println("Масса должна быть положительной");
        }
        if (90 <= angleDegree) {
            System.out.println("Сила трения равна 0 Дж");
        }
        if (angleDegree < 90) {
            double force = mass * g * Math.cos(angleDegree * Math.PI / 180);
            System.out.printf("Сила трения равна %.4f Дж", force);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7799());
    }
}
