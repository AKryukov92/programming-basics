package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskCs3985 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Переставьте команды так, чтобы при запуске на экран было выведено слово \"успех\". " +
                "Все команды должны быть использованы. " +
                "Дописывать новые команды и дублировать существующие - нельзя.");
        appendCheckSingleNonEscaped("String[] arr = new String[] {\"провал0\" , \"провал1\", \"провал2\", \"успех\", \"провал4\", \"провал5\"};\n" +
                "String temp;\n" +
                "arr[2] = arr[1];\n" +
                "arr[1] = arr[0];\n" +
                "temp = arr[5];\n" +
                "arr[0] = temp;\n" +
                "arr[5] = arr[4];\n" +
                "arr[4] = arr[3];\n" +
                "System.out.println(arr[2]);");
        appendFooter();
    }
}
