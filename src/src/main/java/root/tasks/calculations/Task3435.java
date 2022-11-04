package root.tasks.calculations;

import root.tasks.OneInputValLayout;

public class Task3435 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Перевести угол из радианов в градусы. <a href=\"https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D0%B4%D0%B8%D0%B0%D0%BD\" target=\"_blank\">Радиан</a> - угол, соответствующий дуге, длина которой равна её радиусу. Единица измерения плоских углов в Международной системе единиц (СИ). Выведите ответ по шаблону \"$angleRadian радиан это $angleDegree градусов\". Точность чисел - 4 знака после запятой.");
        appendCheckValuesHeader("angleRadian");
        appendCheckValuesRow("0.7854");
        appendCheckValuesRow("19.6350");
        appendCheckValuesRow("0");
        appendCheckValuesRow("6.2832");
        appendCheckValuesRow("1.5708");
        appendCheckValuesRow("34.9066");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double angleRadian = Double.parseDouble(value);
        double angleDegree = angleRadian / Math.PI * 180;
        System.out.printf("%.4f радиан это %.4f градусов\n", angleRadian, angleDegree);
    }
}
