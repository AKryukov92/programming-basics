package root.tasks.calculations;

import root.tasks.MultipleInputValLayout;

import java.sql.SQLException;

public class Task6556 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Даны вещественные положительные числа a, b, c, d. Выяснить, можно ли прямоугольник шириной widthA и высотой heightA уместить внутри прямоугольника шириной widthB и высотой heightB. Каждая из сторон одного прямоугольника была параллельна или перпендикулярна каждой стороне второго прямоугольника.");
        appendImage("images/task6556.png");
        appendCheckValuesHeader("widthA", "heightA", "widthB", "heightB");
        appendCheckValuesRow("3", "5", "7", "9");
        appendCheckValuesRow("7", "1", "11", "3");
        appendCheckValuesRow("1", "7", "11", "3");
        appendCheckValuesRow("2", "13", "5", "19");
        appendCheckValuesRow("13", "11", "7", "19");
        appendCheckValuesRow("11", "13", "7", "19");
        appendCheckValuesRow("23", "3", "9", "11");
        appendCheckValuesRow("-2", "8", "9", "7");
        appendCheckValuesRow("3", "-4", "5", "6");
        appendCheckValuesRow("13", "15", "-17", "19");
        appendCheckValuesRow("6911", "5881", "3203", "-4639");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) throws SQLException {
        int widthA = Integer.parseInt(args[0]);
        int heightA = Integer.parseInt(args[1]);
        int widthB = Integer.parseInt(args[2]);
        int heightB = Integer.parseInt(args[3]);
        if (widthA < 0) {
            System.out.println("Значение A должно быть неотрицательным");
        } else if (heightA < 0) {
            System.out.println("Значение B должно быть неотрицательным");
        } else if (widthB < 0) {
            System.out.println("Значение C должно быть неотрицательным");
        } else if (heightB < 0) {
            System.out.println("Значение D должно быть неотрицательным");
        } else if (widthA < widthB && heightA < heightB) {
            System.out.println("Размещение возможно");
        } else {
            System.out.println("Размещение невозможно");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task6556());
    }
}
