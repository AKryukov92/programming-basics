package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task1737 extends StreamInputLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит целое число (size). Создайте массив такого размера. Затем пользователь вводит несколько фрагментов текста. Каждый фрагмент текста нужно записать в массив. Когда пользователь введет size фрагментов, нужно завершить программу и написать все элементы массива подряд в строчку через пробелы.");
        appendCheckValuesHeader();
        appendCheckValuesRow("5,qa,ws,ed,rf,tg,yh".split(","));
        appendCheckValuesRow("3,a,s,d,f".split(","));
        appendCheckValuesRow("0");
        appendCheckValuesRow("2,qwer,asdf".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        int size = Integer.parseInt(s.next());
        if (size == 0) {
            System.out.println("Размер массива должен быть числом больше 0.");
            return;
        }
        System.out.println("Создаю массив размером " + size);
        String[] arr = new String[size];
        int i = 0;
        while (i < size) {
            arr[i] = s.next();
            i++;
        }
        System.out.println("Получился массив:");
        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1737());
    }
}
