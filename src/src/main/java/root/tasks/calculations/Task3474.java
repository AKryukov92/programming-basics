package root.tasks.calculations;

import root.tasks.TwoInputValLayout;

import java.io.PrintStream;

public class Task3474 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дан прямоугольный треугольник. В нем известна длина катета(cathetus) и прилежащий угол(angleDeg). Нужно вычислить длину гипотенузы. Точность чисел - 4 знака после запятой. Результат вывести по шаблону");
        appendCheckSingle("Значение угла в радианах $angleRad\nКосинус этого угла $cos\nДлина гипотенузы $hypotenuse");
        appendCheckValuesHeader("cathetus", "angleDeg", "hypotenuse");
        appendCheckValuesRow("40", "30");
        appendCheckValuesRow("20", "89");
        appendCheckValuesRow("1000", "1");
        appendCheckValuesRow("70", "45");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String first, String second) {
        int cathetus = Integer.parseInt(first);
        int angleDeg = Integer.parseInt(second);
        double angleRad = angleDeg * Math.PI / 180;
        System.out.printf("Значение угла в радианах %.4f\n", angleRad);
        double cos = Math.cos(angleRad);
        System.out.printf("Косинус этого угла %.4f\n", cos);
        double hypotenuse = cathetus / cos;
        System.out.printf("Длина гипотенузы %.4f\n", hypotenuse);
        /*out.print("Проверка\n");
        double otherCathetus = Math.sqrt(hypotenuse * hypotenuse - cathetus * cathetus);
        out.printf("Длина другого катета %.4f\n", otherCathetus);
        out.printf("Отношение противолежащего катета к прилежащему %.4f\n", otherCathetus / hypotenuse);
        double sin = Math.sin(angleRad);
        out.printf("Синус угла %.4f\n", sin);*/
    }

    public static void main(String[] args) {
        new Task3474().logic("40", "30");
        new Task3474().logic("20", "89");
        new Task3474().logic("1000", "1");
        new Task3474().logic("70", "45");
    }
}
