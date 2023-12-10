package root.tasks.assertions;

import root.Console;
import root.tasks.OneInputValLayout;

public class TaskJava1058 extends OneInputValLayout {

    public static String getTaskDescription() {
        return "Числа обозначают координаты двух точек A и B. Первое число это x точки A. Второе - y точки A. Третье x точки B. Четвертое y точки B. Вычислить расстояние между точками по формуле <br/>\n" +
                "    <formula>\n" +
                "      <sqrt><val>\n" +
                "        (Bx - Ax)<sup>2</sup> + (By - Ay)<sup>2</sup>\n" +
                "      </val></sqrt>\n" +
                "    </formula>";
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescNonEscaped("Пользователь вводит массив из 4 значений, разделенных символов ','. " + getTaskDescription());
        appendCheckValuesHeader("coordinates");
        appendCheckValuesRow("1,1,3,4");
        appendCheckValuesRow("-2,4,8,-10");
        appendCheckValuesRow("0,0,-5,-7");
        appendCheckValuesRow("0,0,0,0");
        appendCheckValuesRow("-1,-3,2,9");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Каждый элемент массива содержит число. Нужно преобразовать числа и записать их в переменные.");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        double ax = Integer.parseInt(arr[0]);
        double ay = Integer.parseInt(arr[1]);
        double bx = Integer.parseInt(arr[2]);
        double by = Integer.parseInt(arr[3]);
        System.out.printf("Координаты точки A(%.2f,%.2f)\n", ax, ay);
        System.out.printf("Координаты точки B(%.2f,%.2f)\n", bx, by);
        double result;
        result = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        System.out.printf("Расстояние между точками равно %.4f", result);
    }
}
