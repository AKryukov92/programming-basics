package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task2594 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int amount = Integer.parseInt(value);
        System.out.println("012345678901234567890123456789");
        int i = 0;
        while (i < amount) {
            System.out.print("#");
            i++;
        }
        System.out.print("\nКонец");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число (amount). Напечатайте на экран числа \"012345678901234567890123456789\" затем символ \"#\" указанное количество раз в строчку и затем слово \"Конец\". Если пользователь ввел отрицательное число, ничего делать не нужно.");
        appendCheckValuesHeader("amount");
        appendCheckValuesRow("3");
        appendCheckValuesRow("0");
        appendCheckValuesRow("15");
        appendCheckValuesRow("27");
        appendCheckValuesRow("-1");
        appendCheckValuesRow("-9");
        appendCheckValuesFooter();
        appendTaskDescEscaped("В этой задаче счётчик не выводится на экран. Однако он все равно нужен, чтобы компьютер понимал сколько раз он повторил команду вывода и мог вовремя остановиться.");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task2594());
    }
}
