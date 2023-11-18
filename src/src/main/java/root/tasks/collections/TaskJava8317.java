package root.tasks.collections;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;
import root.tasks.StreamInputLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskJava8317 extends StreamInputLayout implements MethodsDictationHelper {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано положительное целое число X. Нужно найти все его делители.");
        appendOrderedNonEscaped(
                importClasses("Library", "\"java.util.Arrays\"", "\"java.util.List\""),
                implementStatic("Library", "task8317"),
                "Он принимает в качестве аргумента 1 целое число и возвращает ArrayList целых чисел.",
                "В теле метода task8317 в случае получения некорректных значений аргументов, нужно выбросить исключение IllegalArgumentException и указать при этом текст ошибки из задачи."
        );
        appendSubheading("Проверьте результат работы метода с помощью вспомогательной программы");
        appendTaskDescEscaped("Пользователь вводит бесконечное количество чисел. После ввода каждого числа нужно напечатать его делители. При возникновении исключения, напечатайте на экран сообщение об ошибке и продолжите работу программы.");
        appendCheckValuesHeader();
        appendCheckValuesRow("6,385,1,0,-9".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }

    private static List<Integer> task8317(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Значение X должно быть неотрицательным");
        }
        List<Integer> dividers = new ArrayList<>();
        int i = 1;
        while (i < x / 2 + 1) {
            if (x % i == 0) {
                dividers.add(i);
            }
            i++;
        }
        dividers.add(x);
        return dividers;
    }

    protected void logic(Readable Systemin) {
        Scanner s = new Scanner(Systemin);
        while (s.hasNext()) {
            try {
                int n = s.nextInt();
                System.out.println("Делители числа " + n + ":");
                List<Integer> dividers = task8317(n);
                for (Integer div : dividers) {
                    System.out.print(div + " ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8317());
    }
}
