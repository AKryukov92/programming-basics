package root.tasks.assertions;

public class TaskCs2801 extends TaskJava2801 {

    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано два числа: делимое и делитель. Найти частное и остаток от деления. Все значения округлить до целого. Вывести ответ по шаблону:");
        appendCheckSingleNonEscaped("Делимое $dividend, делитель $divider, частное $quotient, остаток $remainder");
        appendCheckValuesHeader("dividend", "divider");
        appendCheckValuesRow("1234", "11");
        appendCheckValuesRow("5", "13");
        appendCheckValuesRow("17", "17");
        appendCheckValuesRow("0", "23");
        appendCheckValuesRow("4", "0");
        appendCheckValuesFooter();
        appendTaskDescNonEscaped("В этой задаче вам нужно работать только с целой частью чисел. Цифры после запятой нужно отбросить при делении. Поэтому можно воспользоваться типом \"целое число\". Переменная для целого числа объявляется так:");
        appendCheckSingleNonEscaped(escapeHtmlSymbols(getMain(getClass().getSimpleName())));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs2801());
    }
}
