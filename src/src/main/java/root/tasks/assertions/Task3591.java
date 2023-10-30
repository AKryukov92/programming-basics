package root.tasks.assertions;

import root.tasks.OneInputValLayout;

public class Task3591 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Считая, что Земля - идеальная сфера с радиусом radius=6350 км, определить расстояние до линии горизонта от точки с заданной высотой над Землей. Формулу для расчета придумайте исходя из условий задачи или найдите в Интернете.");
        appendCheckValuesHeader("height");
        appendCheckValuesRow("200");
        appendCheckValuesRow("6857");
        appendCheckValuesRow("0");
        appendCheckValuesRow("-500");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        double height = Double.parseDouble(value);
        if (height < 0) {
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
        }
        if (height >= 0) {
            double radius = 6350;
            double hipotenuse = radius + height;
            double distance = Math.sqrt(hipotenuse * hipotenuse - radius * radius);
            System.out.printf("Расстояние до горизонта равно %.4f", distance);
        }
    }
}
