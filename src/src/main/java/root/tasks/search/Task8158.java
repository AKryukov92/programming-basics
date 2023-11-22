package root.tasks.search;

import root.tasks.TwoInputValLayout;

public class Task8158 extends TwoInputValLayout {
    @Override
    protected void logic(String firstValue, String secondValue) {
        int countFirst = 0;
        int countSecond = 0;
        String[] arr = "a,b,c,d,e,f,g,h,a,b,c,d,e".split(",");
        int i = 0;
        while (i < arr.length) {
            if (firstValue.equals(arr[i])) {
                countFirst = countFirst + 1;
            }
            if (secondValue.equals(arr[i])) {
                countSecond = countSecond + 1;
            }
            i = i + 1;
        }
        if (countFirst > 0) {
            System.out.println("Символ '" + firstValue + "' найден. " + countFirst + " шт.");
        } else {
            System.out.println("Символ '" + firstValue + "' отсутствует");
        }
        if (countSecond > 0) {
            System.out.println("Символ '" + secondValue + "' найден. " + countSecond + " шт.");
        } else {
            System.out.println("Символ '" + secondValue + "' отсутствует");
        }
    }

    private void logic2(String firstValue, String secondValue) {
        int firstPosition = -1;
        int secondPosition = -1;
        String[] arr = "a,b,c,d,e,f,g,h,a,b,c,d,e".split(",");
        int i = 0;
        while (i < arr.length) {
            if (firstValue.equals(arr[i])) {
                firstPosition = i;
                break;
            }
            i++;
        }
        if (firstPosition >= 0) {
            System.out.println("Символ '" + firstValue + "' найден");
        } else {
            System.out.println("Символ '" + firstValue + "' отсутствует");
        }
        i = 0;
        while (i < arr.length) {
            if (secondValue.equals(arr[i])) {
                secondPosition = i;
                break;
            }
            i = i + 1;
        }
        if (secondPosition >= 0) {
            System.out.println("Символ '" + secondValue + "' найден");
        } else {
            System.out.println("Символ '" + secondValue + "' отсутствует");
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан массив символов \"a,b,c,d,e,f,g,h,a,b,c,d,e\". Пользователь вводит два отдельных символа." +
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
