package root.tasks.call_methods;

import root.tasks.TwoInputValLayout;

public class Task5728 extends TwoInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Дан текст");
        appendCheckSingleNonEscaped("&lt;h1&gt;Мой первый векторный рисунок&lt;/h1&gt;\n" +
                "\n" +
                "&lt;svg width=\"800\" height=\"600\"&gt;\n" +
                "    &lt;circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
                "        stroke-width=\"4\" fill=\"yellow\"/&gt;\n" +
                "&lt;/svg&gt;");
        appendTaskDescEscaped("Пользователь вводит два фрагмента текста: open и close. Вывести на экран фрагмент текста (подстроку), который находится между open и close, исключая их. Нужно найти позицию того фрагмента close, который находится после окончания фрагмента open.");
        appendCheckValuesHeader("open", "close");
        appendCheckValuesRowEscaped("<svg", ">");
        appendCheckValuesRowEscaped("<h1>", "</h1>");
        appendCheckValuesRowEscaped("<", ">");
        appendCheckValuesRowEscaped("fill=\"", "\"");
        appendCheckValuesRowEscaped("<circle", "/>");
        appendCheckValuesRowEscaped("h1", "h1");
        appendCheckValuesRowEscaped("head", "/head");
        appendCheckValuesRowEscaped("<circle", "<svg");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String open, String close) {
        String full = "<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "    <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
                "        stroke-width=\"4\" fill=\"yellow\"/>\n" +
                "</svg>";
        if (!full.contains(open)) {
            System.out.println("Значение " + escapeHtmlSymbols(open) + " не найдено в тексте");
            return;
        }
        int openIndex = full.indexOf(open);
        int partStart = openIndex + open.length();
        System.out.println("Фрагмент '" + escapeHtmlSymbols(open) + "' начинается на индексе " + openIndex + " и заканчивается на индексе " + partStart);
        int closeIndex = full.indexOf(close, partStart);
        if (closeIndex < 0) {
            System.out.println("Фрагмент '" + escapeHtmlSymbols(close) + "' не найдено после фрагмента '" + escapeHtmlSymbols(open) + "'");
            return;
        }
        System.out.println("Фрагмент '" + escapeHtmlSymbols(close) + "' после open начинается на индексе " + closeIndex);
        System.out.println("Вырезаю фрагмент с индекса " + partStart + " до индекса " + closeIndex);
        String part = full.substring(partStart, closeIndex);
        System.out.println("Получился фрагмент:\n" + escapeHtmlSymbols(part));
    }

    public static void main(String[] args) {
        System.out.println(new Task5728());
    }
}
