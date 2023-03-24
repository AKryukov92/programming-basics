package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class TaskCs9631 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcdefwxyz\". Пользователь вводит фрагмент текста. Определить сколько других символов находится после его окончания. Используйте метод IndexOf <a target='_blank' href='https://learn.microsoft.com/ru-ru/dotnet/api/system.string.indexof?view=netframework-4.8.1'>(открыть справку в новой вкладке)</a> чтобы найти начало фрагмента в исходной строке.");
        appendCheckValuesHeader("needle");
        appendCheckValuesRow("z");
        appendCheckValuesRow("a");
        appendCheckValuesRow("g");
        appendCheckValuesRow("abcd");
        appendCheckValuesRow("wxyz");
        appendCheckValuesRow("axby");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String needle) {
        System.out.println("Записываю значение '" + needle + "' в переменную needle");
        String haystack = "abcdefwxyz";
        System.out.println("Записываю значение '" + haystack + "' в переменную haystack");
        System.out.println("Вызов метода выглядит так:");
        System.out.println("int index = haystack.IndexOf(needle);");
        int index = haystack.indexOf(needle);
        System.out.print("Переменная index содержит " + index + ", значит ");
        if (index < 0) {
            System.out.printf("фрагмент '%s' отсутствует в строке\n", needle);
        } else {
            System.out.printf("Фрагмент '%s' находится на индексе '%d'\n", needle, haystack.indexOf(needle));
            System.out.printf("Длина введенного фрагмента %d\n", needle.length());
            System.out.printf("После него есть еще %d символов\n", haystack.length() - haystack.indexOf(needle) - needle.length());
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs9631());
    }
}
