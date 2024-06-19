package root.tasks.recursion;

import root.tasks.LayoutMaker;

public class Task4664 extends LayoutMaker {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Написать подробное решение:");
        appendCheckSingleNonEscaped("public static void main(String[] args) {\n" +
                "        int[] haystack = new int[]{9, 80, 7, -6, 50, 4, -300};\n" +
                "        search(haystack, 4, 0);\n" +
                "    }\n" +
                "\n" +
                "    public static void search(int[] haystack, int needle, int i) {\n" +
                "        if (i >= haystack.length) {\n" +
                "            System.out.println(\"Не найден\");\n" +
                "            return;\n" +
                "        }\n" +
                "        if (haystack[i] == needle) {\n" +
                "            System.out.println(\"Найден на индексе \" + i);\n" +
                "            return;\n" +
                "        }\n" +
                "        search(haystack, needle, i + 1);\n" +
                "    }");
        appendFooter();
    }
}
