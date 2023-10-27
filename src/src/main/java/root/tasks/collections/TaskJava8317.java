package root.tasks.collections;

import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;

import java.util.ArrayList;
import java.util.List;

public class TaskJava8317 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    public boolean isJava() {
        return true;
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(8418));
        appendOrderedNonEscaped(
                importClasses("Library", "\"java.util.Arrays\"", "\"java.util.List\""),
                implementStatic("Library", "task8317"),
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел.",
                "В теле метода task8317 в случае получения некорректных значений аргументов, нужно выбросить исключение " + argumentException() + " и указать при этом текст ошибки из задачи."
        );
        appendSubheading("Проверьте результат работы метода с помощью вспомогательной программы");
        appendOrderedNonEscaped("Вызовите метод с аргументами 6, 385, 1, 0, -9");
        appendCheckSingleNonEscaped(wrapLogic("6") +
                wrapLogic("385") +
                wrapLogic("1") +
                wrapLogic("0") +
                wrapLogic("-9")
        );
        appendFooter();
    }

    private static List<Integer> task8317(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Значение X должно быть неотрицательным");
        }
        List<Integer> dividers = new ArrayList<>();
        System.out.println("Делители числа " + x + ":");
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

    protected void logic(String value) {
        int x = Integer.parseInt(value);
        try {
            List<Integer> dividers = task8317(x);
            for (Integer div : dividers) {
                System.out.print(div + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8317());
    }
}
