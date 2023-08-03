package root.tasks.arrays;

import root.tasks.LayoutMaker;

public class TaskCs8072 extends LayoutMaker {
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
                "Console.WriteLine(arr[2]);");
        appendFooter();
    }
}
