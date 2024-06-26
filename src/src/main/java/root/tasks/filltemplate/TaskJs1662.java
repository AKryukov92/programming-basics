package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class TaskJs1662 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст");
        appendCheckSingleNonEscaped("+---+\n|   |\n|   |\n+---+");
        appendCheckSingleNonEscaped("Чтобы изменить часть веб-страницы, нужно найти на ней соответствующий элемент.\n" +
                "Для этого нужно применить команду document.getElementById(\"\")\n" +
                "В круглых скобках нужно указать id элемента.\n" +
                "В HTML id элемента указывается в атрибуте id.\n" +
                "Например у элемента <div id=\"out\"> идентификатор out.\n" +
                "Поэтому команда для его поиска будет выглядеть\n" +
                "document.getElementById(\"out\")\n" +
                "\n" +
                "Результат работы этой команды нужно записать в переменную с помощью операции присваивания.\n" +
                "tag = document.getElementById(\"out\");\n" +
                "Предварительно переменную нужно объявить командой\n" +
                "let tag;\n" +
                "\n" +
                "Затем мы можем менять содержимое найденного элемента присваиванием.\n" +
                "Например tag.innerHTML = \"+---+\";\n" +
                "Запишет в текст элемента плюс, три минуса и еще плюс.\n" +
                "Этот текст интерпретируется как HTML.\n" +
                "Если записать в элемент выражение &lt;h1&lt;Заголовок&lt;/h1&lt;\n" +
                "то на странице появится слово \"Заголовок\", оформленное крупным жирным шрифтом." +
                "<h1>Заголовок</h1>"
        );
        appendFooter();
    }
}
