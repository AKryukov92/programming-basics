package root.tasks.recursion;

import root.tasks.LayoutMaker;

public class Task4106 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Написать подробную версию программы.");
        appendCheckSingleNonEscaped("private static void work(int n) {\n" +
                "    if (n < 0) {\n" +
                "        return;\n" +
                "    }\n" +
                "    work(n-2);\n" +
                "    print(n);\n" +
                "    work(n-3);\n" +
                "}\n" +
                "public static void main(String[] args) {\n" +
                "    work(6);\n" +
                "}");
        appendTaskDescEscaped("Этот код возвращает числа: 02416130. Проверьте, что подробная версия программы возвращает те же числа.");
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new Task4106());
    }
}
