package root.tasks.collections;

public class TaskCs4568 extends TaskJava4568 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит 4 фрагмента текста. В памяти нужно хранить только различные фрагменты из всех, которые пользователь ранее вводил.");
        appendCheckValuesHeader();
        appendCheckValuesRow("red,green,red,green".split(","));
        appendCheckValuesRow("red,red,blue,blue".split(","));
        appendCheckValuesRow("a,a,a,a".split(","));
        appendCheckValuesFooter();
        appendTaskDescEscaped("Уникальность элементов достигается за счет использования HashSet.");
        appendTaskDescEscaped("В начале файла добавьте команду:");
        appendCheckSingleNonEscaped("using System.Collections.Generic;\n");
        appendTaskDescEscaped("Тело метода main:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getMain(getClass().getSimpleName())));
        appendFooter();
    }
}
