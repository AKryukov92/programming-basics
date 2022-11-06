package root.tasks.methods;

import root.tasks.MultipleInputValLayout;

public class TaskJs2772 extends MultipleInputValLayout {
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
                "В файле для исходного кода реализуйте функцию task7474.",
                "В качестве аргументов ей будут передавать 3 числа.",
                "В теле функции нужно напечатать в консоль решение задачи  используя значение аргумента как исходные данные."
        );
        appendSubheading("Проверьте корректность работы функции с помощью вспомогательной программы");
        appendOrdered(
                "В корне директории создайте файл Runner7474.html. Подключите в нем файл с кодом \"src/lab12.js\".",
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