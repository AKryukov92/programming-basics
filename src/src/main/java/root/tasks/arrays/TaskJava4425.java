package root.tasks.arrays;

import root.tasks.TwoInputValLayout;

public class TaskJava4425 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число A и данные - символы, разделенные тире '-'. Вывести на экран элемент на индексе A. Результат оформить по шаблону");
        appendCheckSingleNonEscaped("В массиве длиной $arrLength\n" +
                "на индексе $A\n" +
                "находится элемент со значением '$value'");
        appendTaskDescEscaped("Если в данных два разделителя подряд, то возникает элемент содержащий пустую строку.");
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
        appendTaskDescEscaped("Решение задачи выглядит так:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {//обратите внимание на восклицательный знак в начале. Условие с восклицательным знаком истинно, когда выражение после знака - ложно.
            String[] arr;//объявление переменной для хранения массива текстовых фрагментов
            arr = firstValue.split("-");//разбиение текстового фрагмента на части. Знак "-" называется разделитель.
            //qw-er-ty-ui превращается в массив
            //на индексе 0 элемент qw
            //на индексе 1 элемент er
            //на индексе 2 элемент ty
            //на индексе 3 элемент ui
            int a;//тип переменной - целое число. Её назначение - хранить индекс элемента
            a = Integer.parseInt(secondValue);
            if (a < 0) {//индексы в массиве начинаются с 0
                System.out.println("Индекс A должен быть больше или равен 0");
            }
            if (arr.length <= a) {//длина массива всегда на 1 больше, чем индекс последнего числа
                System.out.println("Индекс A должен быть строго меньше длины массива");
            }
            if (0 <= a) {
                if (a < arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("на индексе " + a);
                    System.out.println("находится элемент со значением '" + arr[a] + "'");
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava4425());
    }
}
