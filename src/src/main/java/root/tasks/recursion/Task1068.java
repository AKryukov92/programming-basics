package root.tasks.recursion;

import root.tasks.LayoutMaker;

public class Task1068 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Написать сокращенное решение.");
        appendCheckSingleNonEscaped("private static void level1() {\n" +
                "        System.out.println(\"Предисловие\");\n" +
                "        System.out.println(\"Глава 1\");\n" +
                "        level2();\n" +
                "    }\n" +
                "    private static void level2() {\n" +
                "        System.out.println(\"Глава 2\");\n" +
                "        level3();\n" +
                "    }\n" +
                "    private static void level3() {\n" +
                "        System.out.println(\"Глава 3\");\n" +
                "        level4();\n" +
                "    }\n" +
                "    private static void level4() {\n" +
                "        System.out.println(\"Глава 4\");\n" +
                "        System.out.println(\"Заключение\");\n" +
                "    }\n" +
                "    public static void main(String[] args) {\n" +
                "        level1();\n" +
                "    }");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task1068());
//        System.out.println("Предисловие");
//        System.out.println("Глава 1");
//        System.out.println("Глава 2");
//        System.out.println("Глава 3");
//        System.out.println("Глава 4");
//        System.out.println("Заключение");
//        level1();
//        levelX(1);
    }
    private static void level1() {
        System.out.println("Предисловие");
        System.out.println("Глава 1");
        level2();
    }
    private static void level2() {
        System.out.println("Глава 2");
        level3();
    }
    private static void level3() {
        System.out.println("Глава 3");
        level4();
    }
    private static void level4() {
        System.out.println("Глава 4");
        System.out.println("Заключение");
    }
    private static void levelX(int x) {
        if (x == 1) {
            System.out.println("Предисловие");
        }
        if (x <= 4) {
            System.out.println("Глава " + x);
            levelX(x+1);
        } else {
            System.out.println("Заключение");
        }
    }
}
