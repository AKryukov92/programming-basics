package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.MultipleInputValLayout;


public class TaskCs2772 extends MultipleInputValLayout implements MethodsDictationHelper {
    @Override
    protected void logic(String... args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];
        System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n" +
                "Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s\n", a, b, c, b, b, a, c);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading(implementMethodToSolve(7474));
        appendOrdered(
                implementStatic("Library", "task7474"),
                itAccepts("3 целых числа"),
                itShouldDo("task7474")
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                callMethod("Runner7474", "Library", "task7474"),
                passArguments("число 1", "число 2", "число 3"),
                "Вызовите метод task2632 еще раз с аргументами -3, 0, 2.",
                "В результате запуска метода main класса Program, в консоли должен появиться текст:"
        );
        appendCheckSingle("" +
                wrapLogic("1", "2", "3") +
                wrapLogic("-3", "0", "2")
        );
        appendFooter();
    }
}
