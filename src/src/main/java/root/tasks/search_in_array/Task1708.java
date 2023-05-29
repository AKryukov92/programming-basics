package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task1708 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит массив символов с разделителем \",\". Первой строчкой результата вывести содержимое массива. Второй строчкой результата вывести + под символом 'x'.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("z,x,c,v");
        appendCheckValuesRow("a,s,d,f");
        appendCheckValuesRow("q,a,x,w,s,x,e,d,x");
        appendCheckValuesRow("");
        appendCheckValuesRow("x");
        appendCheckValuesRow("x,x,x,x,x,x,x");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i]);
            i++;
        }
        System.out.println();
        i = 0;
        while (i < arr.length) {
            if (arr[i].equals("x")) {
                System.out.print("+");
            } else {
                System.out.print(".");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task1708());
    }
}
