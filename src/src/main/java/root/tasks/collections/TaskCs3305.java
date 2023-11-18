package root.tasks.collections;

public class TaskCs3305 extends TaskJava3305 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит два целых числа first и second. Нужно сформировать лист, содержащий все целые числа между указанными по возрастанию. Числа, которые ввёл пользователь, нужно добавить в лист.");
        appendOrderedNonEscaped(
                "В начале файла добавьте команду \"using System.Collections.Generic;\"",
                implementStatic("Library", "task3305"),
                "Он принимает в качестве аргумента 2 целых числа и возвращает List целых чисел."
        );
        appendCheckValuesHeader("first", "second");
        appendCheckValuesRow("0", "10");
        appendCheckValuesRow("11", "2");
        appendCheckValuesRow("-3", "4");
        appendCheckValuesRow("-100", "100");
        appendCheckValuesFooter();
        appendSubheading("Проверьте с помощью вспомогательной программы");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getMain(getClass().getSimpleName())));
        appendFooter();
    }
}
