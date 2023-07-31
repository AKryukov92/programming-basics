package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskJava5510 extends LayoutMaker {
    protected void correct() {
        //все ломают
        //содержат основу исправления
        String[] arr = {"ус", "пех", "про", "вал", "резерв"};
        int i = 0;
        i = i + 1;
        arr[4] = arr[i];
        arr[i] = arr[0];
        i = i + 1;
        arr[i] = arr[1];
        arr[3] = arr[4];
        i = i + 1;
        System.out.print(arr[2]);
        System.out.println(arr[3]);
    }

    protected void wrong() {
        String[] arr = {"ус", "пех", "про", "вал", "резерв"};
        int i = 0;
        arr[i] = arr[0];
        arr[i] = arr[1];
        i = i + 1;
        i = i + 1;
        i = i + 1;
        arr[4] = arr[i];
        arr[3] = arr[4];
        System.out.print(arr[2]);
        System.out.println(arr[3]);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". " +
                "Все команды должны быть использованы. " +
                "Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("String[] arr = {\"ус\", \"пех\", \"про\", \"вал\", \"резерв\"};\n" +
                "int i = 0;\n" +
                "arr[i] = arr[0];\n" +
                "arr[i] = arr[1];\n" +
                "i = i + 1;\n" +
                "i = i + 1;\n" +
                "i = i + 1;\n" +
                "arr[4] = arr[i];\n" +
                "arr[3] = arr[4];\n" +
                "System.out.print(arr[2]);\n" +
                "System.out.println(arr[3]);");
        appendFooter();
    }

    public static void main(String[] args) {
        TaskJava5510 task = new TaskJava5510();
        System.out.println(task.getContent());
        task.correct();
        task.wrong();
    }
}
