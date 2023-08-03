package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskJava8072 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". " +
                "Все команды должны быть использованы. " +
                "Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("String[] arr = new String[] {\"успех\" , \"провал\", \"провал\"};\n" +
                "String temp;\n" +
                "arr[0] = \"провал\";\n" +
                "arr[1] = arr[2];\n" +
                "temp = arr[0];\n" +
                "arr[1] = arr[0];\n" +
                "arr[2] = temp;\n" +
                "System.out.println(arr[2]);");
        appendFooter();
    }

    protected void correct() {
        String[] arr = new String[] {"успех" , "провал", "провал"};
        String temp;
        temp = arr[0];
        arr[2] = temp;
        arr[1] = arr[2];
        arr[1] = arr[0];
        arr[0] = "провал";
        System.out.println(arr[2]);
    }

    protected void wrong() {
        String[] arr = new String[] {"успех" , "провал", "провал"};
        String temp;
        arr[0] = "провал";
        arr[1] = arr[2];
        temp = arr[0];
        arr[1] = arr[0];
        arr[2] = temp;
        System.out.println(arr[2]);
    }

    public static void main(String[] args) {
        TaskJava8072 task = new TaskJava8072();
        System.out.println(task);
        task.correct();
        task.wrong();
    }
}
