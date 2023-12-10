package root.tasks.ranges;

import root.tasks.TwoInputValLayout;

public class Task5635 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Дана точка с координатами (X;Y) и прямоугольник, у которого верхний левый угол находится в точке (100;100), высота равна 70, ширина равна 90. Определить, лежит ли точка внутри прямоугольника, включая границы. Все координаты - <b>экранные</b>. Особенность <b>экранных координат</b> в том, что точка с экранными координатами (0;0) находится в верхнем левом углу экрана. Значения X увеличиваются слева направо. Значения Y увеличиваются сверху вниз.<img src=\"images/example5635.png\"/>");
        appendCheckValuesHeader("X", "Y");
        //Области
        appendCheckValuesRow("30", "20");
        appendCheckValuesRow("120","30");
        appendCheckValuesRow("210","40");
        appendCheckValuesRow("50","120");
        appendCheckValuesRow("150","130");
        appendCheckValuesRow("200","150");
        appendCheckValuesRow("80","190");
        appendCheckValuesRow("160","180");
        appendCheckValuesRow("220","200");
        //границы
        appendCheckValuesRow("100","110");
        appendCheckValuesRow("130","100");
        appendCheckValuesRow("190","140");
        appendCheckValuesRow("180","170");
        //углы
        appendCheckValuesRow("100","100");
        appendCheckValuesRow("190","100");
        appendCheckValuesRow("100","170");
        appendCheckValuesRow("190","170");
        //некорректные значения
        appendCheckValuesRow("-10", "30");
        appendCheckValuesRow("40", "-20");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int rx = 100;
        int ry = 100;
        int height = 70;
        int width = 90;
        int tx = Integer.parseInt(firstValue);
        int ty = Integer.parseInt(secondValue);
        int matches = 0;
        if (rx <= tx) {
            if (tx <= rx + width) {
                System.out.println("Координата X внутри прямоугольника");
                matches = matches + 1;
            }
            if (rx + width < tx) {
                System.out.println("Координата X правее прямоугольника");
            }
        }
        if (tx < rx) {
            System.out.println("Координата X левее прямоугольника");
        }
        if (ry <= ty) {
            if (ty <= ry + height) {
                System.out.println("Координата Y внутри прямоугольника");
                matches = matches + 1;
            }
            if (ry + height < ty) {
                System.out.println("Координата Y ниже прямоугольника");
            }
        }
        if (ty < ry) {
            System.out.println("Координата Y выше прямоугольника");
        }
        if (matches == 2) {
            System.out.println("Точка внутри");
        }
        if (matches != 2) {
            System.out.println("Точка снаружи");
        }
    }
}
