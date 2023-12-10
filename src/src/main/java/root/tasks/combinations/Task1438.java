package root.tasks.combinations;

import root.tasks.OneInputValLayout;

public class Task1438 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Пользователь вводит массив из 8 чисел. Первые 4 числа описывают зеленый прямоугольник. Следующие 4 числа - красный. Данные о каждом прямоугольнике идут по порядку: x левого верхнего угла, y левого верхнего угла, высота, ширина. Определить координаты верхнего левого угла, ширину и высоту прямоугольника, образующегося при их пересечении. Все координаты - экранные." + linkToTask(5635));
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
        String[] arr = value.split(";");
        int xr = Integer.parseInt(arr[0]);
        int yr = Integer.parseInt(arr[1]);
        int hr = Integer.parseInt(arr[2]);
        int wr = Integer.parseInt(arr[3]);

        int xg = Integer.parseInt(arr[4]);
        int yg = Integer.parseInt(arr[5]);
        int hg = Integer.parseInt(arr[6]);
        int wg = Integer.parseInt(arr[7]);

        int rxa = xr;
        int rxb = xr + wr;
        int gxa = xg;
        int gxb = xg + wg;

        int ixa;
        int ixb;
        if (rxa < gxa && gxa < rxb) {
            if (gxb > rxb) {
                ixa = gxa;
                ixb = rxb;
            } else {
                ixa = gxa;
                ixb = gxb;
            }
        } else {
            if (gxb > rxb) {
                ixa = rxa;
                ixb = rxb;
            } else {
                ixa = rxa;
                ixb = gxb;
            }
        }

        int rya = yr;
        int ryb = yr + hr;
        int gya = yg;
        int gyb = yg + hg;

        int iya;
        int iyb;
        if (rya < gya && gya < ryb) {
            if (gyb > ryb) {
                iya = gya;
                iyb = ryb;
            } else {
                iya = gya;
                iyb = gyb;
            }
        } else {
            if (gyb > ryb) {
                iya = rya;
                iyb = ryb;
            } else {
                iya = rya;
                iyb = gyb;
            }
        }

        System.out.println(ixa + ";" + (ixb - ixa) + ";" + iya + ";" + (iyb - iya));
    }
}
