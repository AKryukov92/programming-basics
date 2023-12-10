package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task9980 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив 'one','two','three','four','five'. Затем пользователь может вводить неизвестное количество чисел. Когда пользователь вводит отрицательное число, нужно прекратить прием чисел и завершить работу программы. Если пользователь ввёл 0 или положительное число, то нужно вывести элемент массива на указанном индексе. Если пользователь вводит число, которое больше размера массива, выведите сообщение об ошибке и продолжите прием чисел.");
        appendCheckValuesHeader();
        appendCheckValuesRow("2,3,-1".split(","));
        appendCheckValuesRow("1,4,5,10,-1".split(","));
        appendCheckValuesRow("0,2,4,-99".split(","));
        appendCheckValuesRow("-2");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        String[] arr = "one,two,three,four,five".split(",");
        int i = Integer.parseInt(source.next());
        while (i > 0) {
            if (i < arr.length) {
                System.out.println("На индексе " + i + " находится элемент со значением " + arr[i]);
            } else {
                System.out.println("В массиве длиной " + arr.length + " не существует элемента с индексом " + i);
            }
            i = Integer.parseInt(source.next());
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task9980());
    }
}
