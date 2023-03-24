package root.tasks.methods;

import root.tasks.MethodsDictationHelper;
import root.tasks.MultipleInputValLayout;

public class TaskJs2772 extends MultipleInputValLayout implements MethodsDictationHelper {
    @Override
    public boolean isJs() {
        return true;
    }

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
        appendSubheading("Реализуйте функцию для решения задачи " + linkToTask(7474));
        appendOrdered(
                implementStatic("Library","task7474"),
                itAccepts("3 целых числа"),
                itShouldDo("task7474")
        );
        appendSubheading("Проверьте корректность работы функции с помощью вспомогательной программы");
        appendOrdered(
                callMethod("Runner7474", "Library", "task7474"),
                "В скриптах на странице Runner7474.html нужно 2 раза вызвать функцию task7474.",
                "При каждом вызове функции task7474 в качестве аргументов нужно передавать значения из разных тестов, описанных в задаче.",
                "При открытии файла Runner7474.html, в консоли должен появиться текст:"
        );
        appendCheckSingle("" +
                wrapLogic("1", "2", "3") +
                wrapLogic("-3", "0", "2")
        );
        appendFooter();
    }
}