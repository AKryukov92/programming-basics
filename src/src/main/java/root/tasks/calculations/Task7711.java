package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7711 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Пользователь вводит угол, выраженный в градусах." +
                " Нужно перевести этот угол в радианы и вычислить результат по формуле <b>sin(angleRad)</b>." +
                " Для получения значения в радианах примените формулу, которую использовали в задаче " + linkToTask(8428) + ". Для вычисления синуса, используйте команду:");
        appendCheckSingleNonEscaped("result = Math.sin(angleRad); //использование стандартного метода вычисления синуса.");
        appendCheckValuesHeader("angleDegree");
        appendCheckValuesRow("45");
        appendCheckValuesRow("90");
        appendCheckValuesRow("360");
        appendCheckValuesRow("1125");
        appendCheckValuesRow("7639");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double angleDegree = Double.parseDouble(value);
        double angleRadian = angleDegree * Math.PI / 180;
        double result = Math.sin(angleRadian);
        System.out.printf("Угол %.4f градусов это %.4f радиан.\nСинус этого угла равен %.4f", angleDegree, angleRadian, result);
    }
}
