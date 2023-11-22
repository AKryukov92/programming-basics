package root.tasks.loops;

import root.tasks.OneInputValLayout;

import java.util.Scanner;

public class TaskJava1315 extends OneInputValLayout {
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
        appendCheckValuesRow("0");
        appendCheckValuesRow("1");
        appendCheckValuesRow("2");
        appendCheckValuesRow("3");
        appendCheckValuesRow("4");
        appendCheckValuesRow("6");
        appendCheckValuesRow("5");
        appendCheckValuesRow("20");
        appendCheckValuesFooter();

        appendTaskDescNonEscaped("Конечная цель решения - компактная запись с помощью конструкции цикла. Чтобы к ней прийти, нужно сделать несколько промежуточных шагов. Первым делом нужно реализовать подробное решение для нескольких частных случаев. Нужно написать несколько условий. Первое должно работать для всех чисел. Следующее для всех чисел кроме первого. Шестое - для всех чисел, кроме первых шести. Подробное решение этой задачи выглядит так:");
        appendCheckSingleNonEscaped("Scanner s = new Scanner(System.in);\n" +
                "int total = Integer.parseInt(s.nextLine());\n" +
                "System.out.println(\"Введение\");\n" +
                "if (1 <= total) {\n" +
                "    System.out.println(\"Глава \" + 1);//Это действие будет работать когда пользователь вводит числа 1,2,3,4,5,6\n" +
                "}\n" +
                "if (2 <= total) {\n" +
                "    System.out.println(\"Глава \" + 2);//Это действие будет работать когда пользователь вводит числа 2,3,4,5,6\n" +
                "}\n" +
                "if (3 <= total) {\n" +
                "    System.out.println(\"Глава \" + 3);//Это действие будет работать когда пользователь вводит числа 3,4,5,6\n" +
                "}\n" +
                "if (4 <= total) {\n" +
                "    System.out.println(\"Глава \" + 4);//Это действие будет работать когда пользователь вводит числа 4,5,6\n" +
                "}\n" +
                "if (5 <= total) {\n" +
                "    System.out.println(\"Глава \" + 5);//Это действие будет работать когда пользователь вводит числа 5,6\n" +
                "}\n" +
                "if (6 <= total) {\n" +
                "    System.out.println(\"Глава \" + 6);//Это действие будет работать когда пользователь вводит число 6\n" +
                "}\n" +
                "System.out.println(\"Заключение\");");
        appendTaskDescNonEscaped("Подробное решение работает корректно почти для всех тестов. В полученном результате нужно найти набор повторяющихся действий. В данном случае это:");
        appendCheckSingleNonEscaped("if (1 <= total) {\n" +
                "    System.out.println(\"Глава \" + 1);\n" +
                "}\n");
        appendTaskDescNonEscaped("Обратите внимания, что эти действия повторяются с небольшими изменениями. В них используются разные числа: 1, 2, 3 и так далее. Нужно это число заменить на переменную. Таким образом действия будут полностью идентичными. Код должен получиться таким:");
        appendCheckSingleNonEscaped("Scanner s = new Scanner(System.in);\n" +
                "int total = Integer.parseInt(s.nextLine());\n" +
                "int i = 1;\n" +
                "System.out.println(\"Введение\");\n" +
                "if (i <= total) {\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;//До этой команды значение переменной i равно 1. После неё оно станет равно 2.\n" +
                "}\n" +
                "if (i <= total) {//Значение i равно 2\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "if (i <= total) {//Значение i равно 3\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "if (i <= total) {//Значение i равно 4\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "if (i <= total) {//Значение i равно 5\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "if (i <= total) {//Значение i равно 6\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "System.out.println(\"Заключение\");");
        appendTaskDescNonEscaped("Как только вы написали код, который состоит из полностью одинаковых фрагментов, вы можете применить конструкцию while для автоматического повторения этих действий.");
        appendCheckSingleNonEscaped("Scanner s = new Scanner(System.in);\n" +
                "int total = Integer.parseInt(s.nextLine());\n" +
                "int i = 1;\n" +
                "System.out.println(\"Введение\");\n" +
                "while (i <= total) {\n" +
                "    System.out.println(\"Глава \" + i);\n" +
                "    i = i + 1;\n" +
                "}\n" +
                "System.out.println(\"Заключение\");");
        appendTaskDescNonEscaped("План решения задачи:");
        appendOrderedEscaped(
                "Написать подробное решение для нескольких тестов с помощью условий",
                "Найти похожие повторяющиеся действия",
                "Понять чем они отличаются",
                "Найти закономерность в найденных различиях",
                "Заменить закономерность на переменную",
                "Заменить условия конструкцией цикла"
        );
        appendFooter();
    }

    public static void main(String[] args) {
        //System.out.println(new Task1315().getContent());
        Scanner s = new Scanner(System.in);
        int total = Integer.parseInt(s.nextLine());
        if (1 <= total) {
            System.out.println("Глава " + 1);//Это действие будет работать когда пользователь вводит числа 1,2,3,4,5,6
        }
        if (2 <= total) {
            System.out.println("Глава " + 2);//Это действие будет работать когда пользователь вводит числа 2,3,4,5,6
        }
        if (3 <= total) {
            System.out.println("Глава " + 3);//Это действие будет работать когда пользователь вводит числа 3,4,5,6
        }
        if (4 <= total) {
            System.out.println("Глава " + 4);//Это действие будет работать когда пользователь вводит числа 4,5,6
        }
        if (5 <= total) {
            System.out.println("Глава " + 5);//Это действие будет работать когда пользователь вводит числа 5,6
        }
        if (6 <= total) {
            System.out.println("Глава " + 6);//Это действие будет работать когда пользователь вводит число 6
        }
        System.out.println("Заключение");
        //Task1315.step1("3");
        //Task1315.step1("5");

//        Task1315.step3("3");
//        Task1315.step3("7");
//        Task1315.step3("20");
//
//        Task1315.step4("3");
//        Task1315.step4("7");
//        Task1315.step4("20");
    }
}
