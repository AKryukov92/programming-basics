package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task7711 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит угол, выраженный в градусах. Нужно перевести этот угол в радианы и вычислить результат по формуле <b>sin(angleRad)</b>.");
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
        System.out.printf("Угол %.4f градусов это %.4f радиан. Синус этого угла равен %.4f", angleDegree, angleRadian, result);
    }
}
