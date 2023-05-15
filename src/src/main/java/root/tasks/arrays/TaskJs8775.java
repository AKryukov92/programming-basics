package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskJs8775 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". " +
                "Все команды должны быть использованы. " +
                "Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("String[] arr = {\"ус\", \"пех\", \"резерв\", \"вал\", \"про\"};\n" +
                "arr[0] = arr[4];\n" +
                "arr[2] = arr[0];\n" +
                "arr[1] = arr[3];\n" +
                "arr[3] = arr[1];\n" +
                "console.log(arr[2] + arr[3]);");
        appendFooter();
    }

    public static void main(String[] args) {
        TaskJava8775 task = new TaskJava8775();
        System.out.println(task.getContent());
        task.logic();
    }
}
