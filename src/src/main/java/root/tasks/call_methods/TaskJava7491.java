package root.tasks.call_methods;

import root.tasks.OneInputValLayout;

public class TaskJava7491 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendNonEscaped("Дана фиксированная строка \"abcdefwxyz\". Пользователь вводит одну строчку. При поиске введенная строка считается подстрокой. Сообщить пользователю: содержится ли подстрока в исходной строке. Воспользуйтесь методом String.Contains<a target='_blank' href='https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-'>(открыть справку в новой вкладке)</a>");
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
        System.out.println("boolean check = haystack.contains(needle);");
        boolean check = haystack.contains(needle);
        System.out.print("Переменная check содержит " + check + ", значит ");
        if (check) {
            System.out.println("фрагмент '" + needle + "' найден успешно");
        } else {
            System.out.println("фрагмент '" + needle + "' отсутствует");
        }
    }
}
