package root.tasks.method_generalisation;

import root.tasks.TwoInputValLayout;

public class Task8862 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Напишите метод printArrayFromStart, который принимает массив строк и число start. Метод должен печатать содержимое массива на экран в строчку, начиная с числа start. Создайте класс PrintingTest. Реализуйте метод main как в других задачах. Вызовите внутри метода main метод printArray и проверьте по таблице, что он возвращает корректные значения.");
        appendCheckValuesHeader("data", "start");
        appendCheckValuesRow("q,w,e,r,t,y", "3");
        appendCheckValuesRow("q,w,e,r,t,y", "5");
        appendCheckValuesRow("q,w,e,r,t,y", "0");
        appendCheckValuesRow("q,w,e", "2");
        appendCheckValuesRow("q,w,e", "0");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        String[] arr = firstValue.split(",");
        int start = Integer.parseInt(secondValue);
        printArrayFromStart(arr, start);
    }

    public static void printArrayFromStart(String[] arr, int start) {
        int i = start;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
    }
}
