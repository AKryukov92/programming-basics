package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task7365 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendSubheading("Переведите алгоритм с естественного языка на ваш язык программирования.");
        appendOrderedNonEscaped(
                "Объявите переменную accountBalance для хранения баланса счета.",
                "Объявите переменную messageText для хранения текста сообщения.",
                "Инициализируйте переменную accountBalance - запишите в нее строковый литерал \"0,37\".",
                "Выведите на экран строковый литерал \"Задача 7365\".",
                "Запишите в переменную messageText строковый литерал \"Пора пополнить счет!\\n\".",
                "Запишите в переменную messageText результат конкатенации значения переменной messageText и строкового литерала \"Баланс Вашего счета составляет \".",
                "Запишите в переменную messageText результат конкатенации значений переменных messageText и accountBalance.",
                "Запишите в переменную messageText результат конкатенации значения переменной messageText и строкового литерала \" руб.\".",
                "Выведите на экран значение переменной messageText."
        );
        appendTaskDescEscaped("Запустите программу и проверьте, что у вас получился такой же результат");
        appendCheckSingleNonEscaped("Задача 7365\n" +
                "Пора пополнить счет!\n" +
                "Баланс Вашего счета составляет 0,37 руб.");
        appendFooter();
    }
}
