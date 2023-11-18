package root.tasks.collections;

public class TaskCs8317 extends TaskJava8317 {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дано положительное целое число X. Нужно найти все его делители.");
        appendOrderedNonEscaped(
                "В начале файла добавьте команду \"using System.Collections.Generic;\"",
                implementStatic("Library", "task8317"),
                "Он принимает в качестве аргумента 1 целое число и возвращает List целых чисел.",
                "В теле метода task8317 в случае получения некорректных значений аргументов, нужно выбросить исключение ArgumentException и указать при этом текст ошибки из задачи."
        );
        appendSubheading("Проверьте результат работы метода с помощью вспомогательной программы");
        appendTaskDescEscaped("Пользователь вводит бесконечное количество чисел. После ввода каждого числа нужно напечатать его делители. При возникновении исключения, напечатайте на экран сообщение об ошибке и продолжите работу программы.");
        appendCheckValuesHeader();
        appendCheckValuesRow("6,385,1,0,-9".split(","));
        appendCheckValuesFooter();
        appendFooter();
    }
}
