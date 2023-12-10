package root.tasks.arrays;

public class TaskCs4425 extends TaskJava4425 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит число A и данные - символы, разделенные тире '-'. Вывести на экран элемент на индексе A. Результат оформить по шаблону");
        appendCheckSingleNonEscaped("В массиве длиной $arrLength\n" +
                "на индексе $A\n" +
                "находится элемент со значением '$value'");
        appendTaskDescEscaped("Если в данных два разделителя подряд, то возникает элемент содержащий пустую строку.");
        appendCheckValuesHeader("data", "A");
        appendCheckValuesRow("qw-er-ty-ui", "0");
        appendCheckValuesRow("qw-er-ty-ui", "3");
        appendCheckValuesRow("q-w-e-r-t-y-u-i-o-p", "9");
        appendCheckValuesRow("qwer-tyui", "3");
        appendCheckValuesRow("qw-er-ty-ui", "-1");
        appendCheckValuesRow("a--a", "1");
        appendCheckValuesRow("b-b-    -b", "2");
        appendCheckValuesRow("", "8");
        appendCheckValuesFooter();
        appendTaskDescEscaped("Решение задачи выглядит так:");
        appendCheckSingleNonEscaped(getMain(getClass().getSimpleName()));
        appendFooter();
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs4425());
    }
}
