package root.tasks.loops;

public class TaskCs6066 extends TaskJava6066 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран в строчку числа от А до В включительно. После каждого числа должен быть выведен символ \";\". Если A > B, то вывести сообщение об ошибке.");
        appendCheckValuesHeader("A", "B");
        appendCheckValuesRow("8", "12");
        appendCheckValuesRow("5", "5");
        appendCheckValuesRow("695", "702");
        appendCheckValuesRow("3000", "24");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Конструкцию цикла можно вкладывать в конструкцию условия. Пример решения этой задачи:");
        appendCheckSingleNonEscaped(getMain(getClass().getSimpleName()));
        appendFooter();
    }
}
