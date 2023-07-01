package root.tasks.collections;

import root.tasks.LayoutMaker;
import root.tasks.MethodsDictationHelper;
import root.tasks.OneInputValLayout;
import root.tasks.loops_with_conditions.Task8418;

public class TaskJava8317 extends OneInputValLayout implements MethodsDictationHelper {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(8418));
        appendOrderedNonEscaped(
                "В классе Library импортируйте классы \"java.util.Arrays\" и \"java.util.List\".",
                implementStatic("Library", "task8317"),
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел.",
                "В теле метода task8317 в случае получения некорректных значений аргументов, нужно выбросить исключение IllegalArgumentException и указать при этом текст ошибки из задачи."
        );
        appendSubheading("Проверьте результат работы метода с помощью вспомогательной программы");
        appendCheckSingleNonEscaped(wrapLogic("6") +
                wrapLogic("385") +
                wrapLogic("0") +
                wrapLogic("-9")
        );
        appendFooter();
    }

    protected void logic(String value) {
        int x = Integer.parseInt(value);
        System.out.println("Делители числа " + x + ":");
        if (x < 0) {
            System.out.println("Значение X должно быть положительным");
        }
        int i = 1;
        while (i < x / 2 + 1) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(new TaskJava8317());
    }
}
