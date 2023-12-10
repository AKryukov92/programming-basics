package root.tasks.assertions;

import root.Console;
import root.Double;

public class TaskCs1058 extends TaskJava1058 {
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
        double ax = Double.Parse(arr[0]);
        double ay = Double.Parse(arr[1]);
        double bx = Double.Parse(arr[2]);
        double by = Double.Parse(arr[3]);
        Console.WriteLine("Координаты точки A({0:F4},{1:F4})\n", ax, ay);
        Console.WriteLine("Координаты точки B({0:F4},{1:F4})\n", bx, by);
        double result;
        result = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        Console.WriteLine("Расстояние между точками равно {0:F4}", result);
    }
}
