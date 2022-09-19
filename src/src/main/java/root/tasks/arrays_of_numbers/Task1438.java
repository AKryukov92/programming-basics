package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task1438 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив из 8 чисел. Первые 4 числа описывают зеленый прямоугольник. Следующие 4 числа - красный. Данные о каждом прямоугольнике идут по порядку: x левого верхнего угла, y левого верхнего угла, высота, ширина. Определить координаты верхнего левого угла, ширину и высоту прямоугольника, образующегося при их пересечении. Все координаты - экранные." + linkToTask(5635));
        appendCheckValuesHeader("Xr,Yr,Hr,Wr, Xg,Yg,Hg,Wg");
        appendCheckValuesRow("10;10;200;100;50;50;300;350");
        appendCheckValuesRow("25;25;200;200;225;225;200;200");
        appendCheckValuesRow("102;200;100;200;0;500;100;120");
        appendCheckValuesRow("500;200;100;200;10;400;100;120");
        appendCheckValuesRow("60;70;120;200;50;50;120;200");
        appendCheckValuesRow("100;100;200;200;200;200;50;50");
        appendCheckValuesRow("150;150;150;300;150;150;150;300");
        appendCheckValuesRow("100;0;100;500;0;200;700;100");
        appendCheckValuesRow("5;0;10;10;0;5;10;10");
        appendCheckValuesRow("105;5;10;10;100;0;10;30");
        appendCheckValuesRow("150;150;50;300;100;100;300;200");
        appendCheckValuesRow("0;0;802;200;0;0;610;610");
        appendCheckValuesRow("200;200;100;100;900;200;100;10");
        appendCheckValuesRow("125;138;0;1;205;202;61;62");
        appendCheckValuesRow("100;100;120;220;220;100;120;220");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {

    }
}
