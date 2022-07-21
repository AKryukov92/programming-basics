package root.tasks.methods;

import root.tasks.MultipleInputValLayout;

public class TaskCs2772 extends MultipleInputValLayout {
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
        appendSubheading("Реализуйте метод для решения задачи " + linkToTask(7474));
        appendOrdered(
                "В классе Methods реализуйте публичный статический метод task7474.",
                "Он принимает в качестве аргументов 3 целых числа",
                "В теле метода task7474 напечатайте в консоль решение задачи, используя значение аргументов в качестве исходных данных."
        );
        appendSubheading("Проверьте корректность работы метода с помощью вспомогательной программы");
        appendOrdered(
                "В методе main класса Program вызовите метод task2632 класса Methods.",
                "Первым аргументом передайте ему число 1, вторым - число 2, третьим - число 3.",
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
