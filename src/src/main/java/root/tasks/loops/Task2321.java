package root.tasks.loops;

import root.tasks.TwoInputValLayout;

public class Task2321 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в строчку числа от А до В включительно по возрастанию. Перед списком чисел напишите в каком порядке они выводились. Значение A может быть как меньше, так и больше B.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "13");
        appendCheckValuesRow("23", "11");
        appendCheckValuesRow("0", "0");
        appendCheckValuesRow("691", "702");
        appendCheckValuesRow("571", "571");
        appendCheckValuesRow("1201", "1197");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        int i, n;
        if (a < b) {
            System.out.println("От A до B");
            i = a;
            n = b;
        } else {
            System.out.println("От B до A");
            i = b;
            n = a;
        }
        while (i <= n) {
            System.out.print(i);
            System.out.print(" ");
            i++;
        }
    }

    protected void logic2(String firstValue, String secondValue) {
        int a = Integer.parseInt(firstValue);
        int b = Integer.parseInt(secondValue);
        if (a < b) {
            System.out.println("От A до B");
            while (a <= b) {
                System.out.print(a);
                System.out.print(" ");
                a++;
            }
        } else {
            System.out.println("От B до A");
            while (b <= a) {
                System.out.print(b);
                System.out.print(" ");
                b++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2321());
    }
}
