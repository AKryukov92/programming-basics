package root.tasks.collections;

public class TaskCs5087 extends TaskJava5087 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит 4 фрагмента текста. Все эти фрагменты нужно хранить в памяти. Когда пользователь закончит вводить данные, нужно напечатать на экран все фрагменты, которые пользователь вводил ранее.");
        appendCheckValuesHeader();
        appendCheckValuesRow("one,two,three,three".split(","));
        appendCheckValuesRow("five,six,seven,six".split(","));
        appendCheckValuesFooter();
        appendTaskDescEscaped("В начале файла добавьте команду:");
        appendCheckSingleNonEscaped("using System.Collections.Generic;");
        appendTaskDescEscaped("Тело метода Main:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getMain(getClass().getSimpleName())));
        appendFooter();
    }
}
