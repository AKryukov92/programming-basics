package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class Task4312 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        double edge = Double.parseDouble(firstValue);
        double height = Double.parseDouble(secondValue);
        if (edge <= 0) {
            System.out.println("Длина основания треугольника должна быть положительна");
            return;
        }
        if (height <= 0) {
            System.out.println("Высота треугольника должна быть положительна");
            return;
        }
        double area = edge * height / 2;
        System.out.printf("Площадь прямоугольного треугольника с высотой %.0f и основанием %.0f равна %.4f", height, edge, area);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Вычислить площадь прямоугольного треугольника по формуле <formula>area=edge*height/2</formula>, где edge - основание, height - высота.");
        appendCheckValuesHeader("edge", "height");
        appendCheckValuesRow("1", "1");
        appendCheckValuesRow("2", "3");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("-2", "1");
        appendCheckValuesRow("3", "-4");
        appendCheckValuesFooter();
        appendFooter();
    }
}