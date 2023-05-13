package root.tasks.loops;

import root.tasks.OneInputValLayout;

public class Task1315 extends OneInputValLayout {
    @Override
    protected void logic(String value) {
        int i = 1;
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        while (i <= total) {
            System.out.println("Глава " + i);
            i++;
        }
        System.out.println("Заключение");
    }

    protected static void step1(String value) {
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        System.out.println("Глава " + 1);
        System.out.println("Глава " + 2);
        System.out.println("Глава " + 3);
        System.out.println("Заключение");
    }

    protected static void step2(String value) {
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        int i = 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Глава " + i);
        i = i + 1;
        System.out.println("Заключение");
    }

    protected static void step3(String value) {
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        int i = 1;
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        if (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        System.out.println("Заключение");
    }

    protected static void step4(String value) {
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        int i = 1;
        while (i <= total) {
            System.out.println("Глава " + i);
            i = i + 1;
        }
        System.out.println("Заключение");
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число total. Выведите на экран в столбик все целые числа от 1 до total включительно. В начале программы должно появиться слово \"Введение\", а после всех чисел - слово \"Заключение\". Перед каждым числом нужно написать слово \"Глава\".");
        appendCheckValuesHeader("total");
        appendCheckValuesRow("3");
        appendCheckValuesRow("7");
        appendCheckValuesRow("20");
        appendCheckValuesFooter();
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1315().getContent());

        Task1315.step3("3");
        Task1315.step3("7");
        Task1315.step3("20");

        Task1315.step4("3");
        Task1315.step4("7");
        Task1315.step4("20");
    }
}
