package root.tasks.method_generalisation;

import root.tasks.MultipleInputValLayout;

public class Task9709 extends MultipleInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Напишите метод printArrayByRange, который принимает массив строк, число start и число end. Метод должен печатать содержимое массива на экран в строчку, начиная с числа start и не доходя до числа end. Создайте класс PrintingTest. Реализуйте метод main как в других задачах. Вызовите внутри метода main метод printArray и проверьте по таблице, что он возвращает корректные значения.");
        appendCheckValuesHeader("data", "start", "end");
        appendCheckValuesRow("q,w,e,r,t,y", "2", "4");
        appendCheckValuesRow("q,w,e,r,t,y", "5", "5");
        appendCheckValuesRow("q,w,e,r,t,y", "0", "5");
        appendCheckValuesRow("q,w,e", "1", "2");
        appendCheckValuesRow("q,w,e", "0", "2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String... args) {
        String[] arr = args[0].split(",");
        int start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);
        printArrayByRange(arr, start, end);
    }

    public static void printArrayByRange(String[] arr, int start, int end) {
        int i = start;
        while (i < end) {
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
    }
}
