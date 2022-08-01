package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskJava8775 extends LayoutMaker {
    protected void logic() {
        //все ломают
        //содержат основу исправления
        String[] arr = {"ус", "пех", "резерв", "вал", "про"};
        //запутывают
        arr[0] = arr[4];
        arr[1] = arr[3];
        //ставят все на место
        arr[2] = arr[0];
        arr[3] = arr[1];
        System.out.print(arr[2]);
        System.out.println(arr[3]);
    }

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". " +
                "Все команды должны быть использованы. " +
                "Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingle("String[] arr = {\"ус\", \"пех\", \"резерв\", \"вал\", \"про\"};\n" +
                "arr[0] = arr[4];\n" +
                "arr[2] = arr[0];\n" +
                "arr[1] = arr[3];\n" +
                "arr[3] = arr[1];\n" +
                "System.out.print(arr[2]);\n" +
                "System.out.println(arr[3]);");
        appendFooter();
    }

    public static void main(String[] args) {
        TaskJava8775 task = new TaskJava8775();
        System.out.println(task.getContent());
        task.logic();
    }
}
