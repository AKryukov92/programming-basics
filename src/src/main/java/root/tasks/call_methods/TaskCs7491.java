package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class TaskCs7491 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Дана фиксированная строка \"abcdefwxyz\". Пользователь вводит одну строчку. При поиске введенный фрагмент считается подстрокой. Сообщить пользователю: содержится ли подстрока в исходной строке. Воспользуйтесь методом String.Contains<a target='_blank' href='https://learn.microsoft.com/ru-ru/dotnet/api/system.string.contains?view=netframework-4.8.1'>(открыть справку в новой вкладке)</a>");
        appendCheckValuesHeader("needle");
        appendCheckValuesRow("z");
        appendCheckValuesRow("bx");
        appendCheckValuesRow("fw");
        appendCheckValuesRow("abcd");
        appendCheckValuesRow("abcdefwxyz000");
        appendCheckValuesRow("abcdefwxyz");
        appendCheckValuesRow("123");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String needle) {
        System.out.println("Записываю значение '" + needle + "' в переменную needle");
        String haystack = "abcdefwxyz";
        System.out.println("Записываю значение '" + haystack + "' в переменную haystack");
        System.out.println("Вызов метода выглядит так:");
        System.out.println("bool check = haystack.Contains(needle);");
        boolean check = haystack.contains(needle);

        System.out.print("Переменная check содержит " + check + ", значит ");
        if (check) {
            System.out.println("фрагмент '" + needle + "' найден успешно");
        } else {
            System.out.println("фрагмент '" + needle + "' отсутствует");
        }
    }

    public static void main(String[] args) {
        System.out.println(new TaskCs7491());
    }
}
