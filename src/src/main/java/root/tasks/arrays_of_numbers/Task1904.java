package root.tasks.arrays_of_numbers;

import root.tasks.OneInputValLayout;

public class Task1904 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит массив цифр, разделенных запятой. Нужно собрать из отдельных цифр целое число. К готовому числу нужно прибавить 7 и написать результат.");
        appendCheckValuesHeader("digits");
        appendCheckValuesRow("9,8,7,6");
        appendCheckValuesRow("1,2,3,4,5,6");
        appendCheckValuesRow("99");
        appendCheckValuesRow("-3");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        String[] arr = value.split(",");
        int num = 0;
        int i = 0;
        while (i < arr.length) {
            num = num * 10;
            int current = Integer.parseInt(arr[i]);
            if (current > 9 || current < 0) {
                System.out.println("Некорректное значение " + arr[i] + " ожидается один символ - цифра.");
                return;
            }
            num += current;
            i = i + 1;
        }
        System.out.println("Готовое число: " + num);
        int result = num + 7;
        System.out.println("Результат сложения:" + result);
    }

    public static void main(String[] args) {
        System.out.println(new Task1904());
    }
}
