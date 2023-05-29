package root.tasks.method_generalisation;

import root.tasks.OneInputValLayout;

public class Task9309 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Напишите метод printArray, который принимает массив строк и печатает его содержимое на экран в строчку. Создайте класс PrintingTest. Реализуйте метод main как в других задачах. Вызовите внутри метода main метод printArray и проверьте по таблице, что он возвращает корректные значения.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("q,w,e,r,t,y");
        appendCheckValuesRow("q,w,e");
        appendCheckValuesRow("a,s,d,f");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        printArray(arr);
    }

    public static void printArray(String[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
    }
}
