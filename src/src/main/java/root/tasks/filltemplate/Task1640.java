package root.tasks.filltemplate;

import root.tasks.OneInputValLayout;

public class Task1640 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDesc("Переведите алгоритм с естественного языка на ваш язык программирования.\n" +
                "<ol>" +
                "<li>Выведите на экран значение строкового литерала \"Задача 1640\"</li>\n" +
                "<li>Объявите переменную undersong для хранения повторяющейся строки.</li>\n" +
                "<li>Инициализируйте переменную undersong - запишите в нее строковый литерал \"Йо-хо-хо, и бутылка рому!\".</li>\n" +
                "<li>Выведите на экран результат конкатенации строкового литерала \"Пятнадцать человек на сундук мертвеца.\" и переменной undersong.</li>\n" +
                "<li>Выведите на экран результат конкатенации строкового литерала \"Пей, и дьявол тебя доведет до конца.\" и переменной undersong.</li>\n" +
                "</ol>" +
                "Запустите программу и проверьте, что у вас получился такой же результат:");
        appendCheckSingle(wrapLogic(""));
        appendFooter();
    }

    @Override
    protected void logic(String value) {
        System.out.println("Задача 1640");
        String undersong;
        undersong = "Йо-хо-хо, и бутылка рому!";
        System.out.println("Пятнадцать человек на сундук мертвеца.\n" + undersong);
        System.out.println("Пей, и дьявол тебя доведет до конца.\n" + undersong);
    }
}
