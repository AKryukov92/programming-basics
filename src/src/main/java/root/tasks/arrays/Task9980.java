package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Iterator;

public class Task9980 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дан массив 'one','two','three','four','five'. Затем пользователь может вводить неизвестное количество чисел. Когда пользователь вводит отрицательное число, нужно прекратить прием чисел и завершить работу программы. Если пользователь ввёл 0 или положительное число, то нужно вывести элемент массива на указанном индексе.");
        appendCheckValuesHeader();
        appendCheckValuesRow("2,3,-1");
        appendCheckValuesRow("1,4,5,10,-1");
        appendCheckValuesRow("0,2,4,-99");
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Iterator<String> source) {
        String[] arr = "one,two,three,four,five".split(",");
        int i = Integer.parseInt(source.next());
        while (i > 0) {
            System.out.println("На индексе " + i + " находится элемент со значением" + arr[i]);
            i = Integer.parseInt(source.next());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9980());
    }
}
