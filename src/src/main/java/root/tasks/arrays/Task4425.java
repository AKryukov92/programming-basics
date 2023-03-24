package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class Task4425 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Пользователь вводит число A и данные - символы, разделенные тире '-'. Вывести на экран элемент на индексе A. Результат оформить по шаблону");
        appendCheckSingle("В массиве длиной $arrLength\n" +
                "на индексе $A\n" +
                "находится элемент со значением '$value'");
        appendTaskDesc("Если в данных два разделителя подряд, то возникает элемент содержащий пустую строку.");
        appendCheckValuesHeader("data", "A");
        appendCheckValuesRow("qw-er-ty-ui", "0");
        appendCheckValuesRow("qw-er-ty-ui", "3");
        appendCheckValuesRow("q-w-e-r-t-y-u-i-o-p", "9");
        appendCheckValuesRow("qwer-tyui", "3");
        appendCheckValuesRow("qw-er-ty-ui", "-1");
        appendCheckValuesRow("a--a", "1");
        appendCheckValuesRow("b-b-    -b", "2");
        appendCheckValuesRow("", "8");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = firstValue.split("-");
        int a = Integer.parseInt(secondValue);
        if (a < 0 || arr.length <= a) {
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println("В массиве длиной " + arr.length);
        System.out.println("на индексе " + a);
        System.out.println("находится элемент со значением '" + arr[a] + "'");
    }

    public static void main(String[] args) {
        System.out.println(new Task4425());
    }
}
