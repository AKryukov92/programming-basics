package root.tasks.arrays;

import root.tasks.OneInputValLayout;

public class Task8820 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(" ");
        String t;
        for (int i = 0; i < arr.length / 2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит данные - символы, разделенные пробелами." +
                " Инвертировать массив - переставить элементы массива в обратном порядке." +
                " Вывод в этой задаче практически не отличается от вывода задачи " + linkToTask(1223) +
                " но вам будет полезнее решить именно с перестановкой элементов в массиве.");
        appendCheckValuesHeader("data");
        appendCheckValuesRow("q w e r t y");
        appendCheckValuesRow("as df gh");
        appendCheckValuesRow("q w e r t y a s d f g");
        appendCheckValuesFooter();
        appendFooter();
    }
}