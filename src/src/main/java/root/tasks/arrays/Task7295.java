package root.tasks.arrays;

import root.tasks.StreamInputLayout;

import java.util.Scanner;

public class Task7295 extends StreamInputLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив 'one','two','three','four','five', 'six'. Пользователь вводит число. Оно обозначает позицию в массиве, на которую будут записываться другие буквы. Затем пользователь вводит два строковых значения. Первое записывается на указанную позицию. Второе - на следующую. После ввода букв, нужно напечатать получившийся массив на экране. Затем пользователь может ввести данные повторно. Программа должна обрабатывать бесконечное количество чисел.");
        appendCheckValuesHeader();
        appendCheckValuesRow("2,aaaa,bbbb".split(","));
        appendCheckValuesRow("1,zx,cv,3,as,df".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(Readable Systemin) {
        Scanner source = new Scanner(Systemin);
        String[] arr = "one,two,three,four,five,six".split(",");
        while(source.hasNext()) {
            int writeIndex = Integer.parseInt(source.next());
            String val1 = source.next();
            String val2 = source.next();
            arr[writeIndex] = val1;
            arr[writeIndex + 1] = val2;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task7295());
    }
}
