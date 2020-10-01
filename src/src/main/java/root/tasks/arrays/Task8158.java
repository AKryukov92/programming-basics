package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

import java.io.PrintStream;

public class Task8158 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue, PrintStream out) {
        int firstPosition = -1;
        int secondPosition = -1;
        String[] arr = "a,b,c,d,e,f,g,h,a,b,c,d,e".split(",");
        int i = 0;
        while (i < arr.length) {
            if (firstValue.equals(arr[i])) {
                firstPosition = i;
            }
            if (secondValue.equals(arr[i])) {
                secondPosition = i;
            }
            i = i + 1;
        }
        if (firstPosition >= 0) {
            out.println("Символ '" + firstValue + "' найден на позиции '" + firstPosition + "'");
        } else {
            out.println("Символ '" + firstValue + "' отсутствует");
        }
        if (secondPosition >= 0) {
            out.println("Символ '" + secondValue + "' найден на позиции '" + secondPosition + "'");
        } else {
            out.println("Символ '" + secondValue + "' отсутствует");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дан массив символов \"a,b,c,d,e,f,g,h,a,b,c,d,e\". Пользователь вводит два отдельных символа." +
                " По каждому из символов нужно написать, присутствует он в массиве или нет.");
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("a", "x");
        appendCheckValuesRow("y", "d");
        appendCheckValuesRow("b", "f");
        appendCheckValuesRow("w", "u");
        appendCheckValuesRow("e", "e");
        appendCheckValuesRow("i", "i");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task8158().getContent());
    }
}
