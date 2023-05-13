package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskJs5510 extends LayoutMaker {
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
                "console.log(arr[2] + arr[3]);");
        appendFooter();
    }
}
