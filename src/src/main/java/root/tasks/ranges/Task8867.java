package root.tasks.ranges;

import root.tasks.MultipleInputValLayout;

public class Task8867 extends MultipleInputValLayout {
    @Override
    protected void logic(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        if (a > b) {
            System.out.println("Некорректный интервал. Левая граница должна быть меньше правой.");
            return;
        }
        if (a <= x && x <= b) {
            System.out.printf("%d попадает в интервал от %d до %d", x, a, b);
        } else {
            System.out.printf("%d за пределами интервала от %d до %d", x, a, b);
        }
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Даны действительные числа a, b, x. Если x принадлежит интервалу от a до b включительно, выведите ответ по шаблону:");
        appendCheckSingle("$x попадает в интервал от $a до $b");
        appendTaskDesc("В ином случае, выведите ответ по шаблону:");
        appendCheckSingle("$x за пределами интервала от $a до $b");
        appendTaskDesc("Интервал считается корректным, если a <= b. Если это не так, выведите сообщение об ошибке.");
        appendCheckValuesHeader("A", "B", "X");
        appendCheckValuesRow("1", "3", "2");
        appendCheckValuesRow("-4", "5", "0");
        appendCheckValuesRow("-2", "7", "-10");
        appendCheckValuesRow("0", "5", "7");
        appendCheckValuesRow("4","4", "4");
        appendCheckValuesRow("6", "4", "3");
        appendCheckValuesRow("4", "-2", "3");
        appendCheckValuesFooter();
        appendFooter();
    }
}
