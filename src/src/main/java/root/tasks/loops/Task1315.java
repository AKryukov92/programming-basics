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

    //Шаги по решению задач с циклами:
    //1. Решить задачу без использования циклов, но с использованием условий. Должны работать первые два теста.
    // Как проверить, что условие написано правильно?
    // Если подробное решение содержало 3 команды, то нужно написать 6 одинаковых команд.
    // При запуске должно работать все еще 3 команды.
    // Остальные команды не должны выполняться, потому что их условие станет ложным.
    // Условие должно быть одинаково во всех 6 командах.
    // Если нужно изменить код, то он меняется во всех командах одновременно.
    // Если повторяющиеся действия на шаге 4 уже содержат if или while, то уже написанные условия нужно поместить в новый if.
    // В условиях обычно сравниваются две переменные.
    // Одна из переменных меняется по найденной в шаге 3 закономерности.
    // Другая переменная инициализируется в начале программы и в ходе её работы остается неизменной.
    // Первоначальное решение с условиями упрощает дальнейшие переделки.
    //2. Найти повторяющиеся действия. Между повторами не должно быть других команд.
    //3. Нужно выявить закономерность.
    //4. Число, которое используется в закономерности нужно выразить как переменную.
    //написать было-стало step1-step2
    //6. Первый if заменяется на while.
    // Теперь правильно работать должны все тесты.
    protected static void step1(String value) {
        int total = Integer.parseInt(value);
        System.out.println("Введение");
        if (1 <= total) {
            System.out.println("Глава " + 1);
        }
        if (2 <= total) {
            System.out.println("Глава " + 2);
        }
        if (3 <= total) {
            System.out.println("Глава " + 3);
        }
        if (4 <= total) {
            System.out.println("Глава " + 4);
        }
        if (5 <= total) {
            System.out.println("Глава " + 5);
        }
        if (6 <= total) {
            System.out.println("Глава " + 6);
        }
        System.out.println("Заключение");
    }

    protected static void step2(String value) {
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
        appendCheckValuesRow("2");
        appendCheckValuesRow("3");
        appendCheckValuesRow("4");
        appendCheckValuesRow("6");
        appendCheckValuesRow("5");
        appendCheckValuesRow("20");
        appendCheckValuesFooter();
        appendFooter();

        appendTaskDescNonEscaped(". Это поможет увидеть закономерность и компактно перефразировать с помощью цикла. Подробное решение этой задачи выглядит так:");
        appendCheckSingleNonEscaped("int total = Integer.parseInt(string);\n" +
                "println(\"Введение\");\n" +
                "if (1 <= total) {\n" +
                "    print(\"Глава \" + 1);\n" +
                "}\n" +
                "if (2 <= total) {\n" +
                "    print(\"Глава \" + 2);\n" +
                "}\n" +
                "if (3 <= total) {\n" +
                "    println(\"Глава \" + 3);\n" +
                "}\n" +
                "if (4 <= total) {\n" +
                "    println(\"Глава \" + 4);\n" +
                "}\n" +
                "if (5 <= total) {\n" +
                "    println(\"Глава \" + 5);\n" +
                "}\n" +
                "if (6 <= total) {\n" +
                "    println(\"Глава \" + 6);\n" +
                "}\n" +
                "println(\"Заключение\");");
        appendTaskDescNonEscaped("Следующие шаги решения:");
        appendOrderedEscaped(
                "Найти похожие повторяющиеся действия",
                "Понять чем они отличаются",
                "Найти закономерность в найденных различиях",
                "Заменить закономерность на переменную"
        );
        appendTaskDescEscaped("Подробный пл");
    }

    public static void main(String[] args) {
        //System.out.println(new Task1315().getContent());
        Task1315.step1("3");
        Task1315.step1("5");

//        Task1315.step3("3");
//        Task1315.step3("7");
//        Task1315.step3("20");
//
//        Task1315.step4("3");
//        Task1315.step4("7");
//        Task1315.step4("20");
    }
}
