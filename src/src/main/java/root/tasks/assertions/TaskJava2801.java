package root.tasks.assertions;

import root.tasks.TwoInputValLayout;

public class TaskJava2801 extends TwoInputValLayout {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано два числа: делимое и делитель. Найти частное и остаток от деления. Все значения округлить до целого. Вывести ответ по шаблону:");
        appendCheckSingleNonEscaped("Делимое $dividend, делитель $divider, частное $quotient, остаток $remainder");
        appendCheckValuesHeader("dividend", "divider");
        appendCheckValuesRow("1234", "11");
        appendCheckValuesRow("5", "13");
        appendCheckValuesRow("17", "17");
        appendCheckValuesRow("0", "23");
        appendCheckValuesRow("4", "0");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("В этой задаче вам нужно работать только с целой частью чисел. Цифры после запятой нужно отбросить при делении. Поэтому можно воспользоваться типом \"целое число\". Переменная для целого числа объявляется так:");
        appendCheckSingleNonEscaped(getLogic(getClass().getSimpleName()));
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int dividend, divider; //Объявление переменных типа int для целых чисел
        dividend = Integer.parseInt(firstValue);//читаем значение от пользователя
        divider = Integer.parseInt(secondValue);
        if (divider == 0) {//если значение переменной divider строго равно 0
            System.out.println("Делитель не может быть равен 0");
        }
        if (divider != 0) {//если значение переменной divider не равно 0
            int quotient = dividend / divider;
            int remainder = dividend % divider;//Нахождение остатка от деления dividend на divider
            System.out.printf("Делимое %d, делитель %d", dividend, divider);//Выражение %d обозначает, что нужно написать целое число
            System.out.printf(", частное %d, остаток %d\n", quotient, remainder);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava2801());
    }
}
