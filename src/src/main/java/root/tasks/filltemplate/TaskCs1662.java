package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class TaskCs1662 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendTaskId();
        appendTaskHeader();
        appendTaskDescNonEscaped("Строковый литерал. <a href='https://learn.microsoft.com/ru-ru/cpp/c-language/c-string-literals?view=msvc-170'>Строковые литералы в C</a>." +
                " Это последовательность символов, которая начинается с двойной кавычки и заканчивается двойной кавычкой." +
                " Используется для оформления текста при печати на экран или других манипуляциях.");
        appendTaskDescEscaped("Чтобы напечатать строковый литерал содержащий фразу \"Ура, заработало\" в консоль, используйте команду:");
        appendCheckSingleNonEscaped("Console.WriteLine(\"Ура! заработало\");");
        appendTaskDescEscaped("Выведите на экран текст");
        appendCheckSingleNonEscaped("Ура! заработало!\n" +
                "Вторая строка, вторая команда\n" +
                "Выделенный текст можно копировать сочетанием клавиш Ctrl+C\n" +
                "Скопированный текст можно вставить в код сочетанием клавиш Ctrl+V");
        appendTaskDescEscaped("Если не поставить кавычку в конце строкового литерала, то компьютер не сможет понять когда он заканчивается. Поэтому при попытке запуска компьютер выдаст три ошибки компиляции:");
        appendCheckSingleNonEscaped("Console.Write(\"Ура! Заработало!);");
        appendOrderedEscaped(
                "Символ новой строки в константе.",
                "Требуется \")\"",
                "Требуется \";\""
        );
        appendTaskDescEscaped("Если у вас английская версия Visual Studio, то ошибки будут такими:");
        resetOrdered();
        appendOrderedEscaped(
                ") expected",
                "; expected",
                "Newline in constant"
        );
        appendFooter();
    }
}
