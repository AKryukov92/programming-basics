package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task7035 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        String[] arr = value.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        int minIndex = 0;
        System.out.println("Ход решения:");
        System.out.println("Начинаю и запоминаю " + minIndex);
        for (int i = 1; i < num.length; i++){
            System.out.print("Сравниваю значение " + num[minIndex] + " на индексе " + minIndex);
            System.out.println(" и значение " + num[i] + " на индексе " + i);
            if (num[i] < num[minIndex]) {
                System.out.println("Вместо " + minIndex + " запоминаю " + i);
                minIndex = i;
            }
        }
        System.out.println("В массиве {" + String.join(",", arr) + "} минимальный элемент это " + num[minIndex] + " на индексе " + minIndex);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит данные - целые числа, разделенные пробелами. Нужно найти минимальное число и его индекс.");
        appendOrderedNonEscaped("В начале работы запомните индекс минимального как 0.",
                "Затем просматривайте каждый элемент массива.",
                "Если просматриваемый элемент массива меньше, чем элемент на индексе минимального, то запомните индекс просматриваемого"
        );
        appendCheckValuesHeader("");
        appendCheckValuesRow("12 5 7 8 3 4 2");
        appendCheckValuesRow("2 3 4 5 12");
        appendCheckValuesRow("3 4 1 2 3 4 1 2 3 1 2");
        appendCheckValuesRow("4 2 3 4 3 2");
        appendCheckValuesRow("4 4 4 4 4 3 8 9");
        appendCheckValuesRow("4 4 4 4");
        appendCheckValuesRow("4 3");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task7035().getContent());
    }
}
