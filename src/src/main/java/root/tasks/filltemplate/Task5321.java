package root.tasks.filltemplate;

import root.tasks.LayoutMaker;

public class Task5321 extends LayoutMaker {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Выведите на экран текст");
        appendCheckSingleNonEscaped("+---+\n|   |\n|   |\n+---+");
        appendTaskDescEscaped("Шпаргалка по расположению символов на клавиатуре");
        appendTaskDescNonEscaped("\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <th>Символ</th>\n" +
                "        <th>на русской раскладке</th>\n" +
                "        <th>на английской раскладке</th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>|</zoom></td>\n" +
                "        <td>отсутствует</td>\n" +
                "        <td>Вводить c шифтом. Ищите символы\n" +
                "        <zoom>\\</zoom>\n" +
                "        <zoom>/</zoom>\n" +
                "        <zoom>|</zoom> справа, возле Enter. Клавиша может быть на любом ряду.</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>.</zoom></td>\n" +
                "        <td>Вводить без шифта. Ищите символы \n" +
                "        <zoom>?</zoom>\n" +
                "        <zoom>,</zoom>\n" +
                "        <zoom>/</zoom>\n" +
                "        <zoom>.</zoom> справа снизу</td>\n" +
                "        <td>Вводить без шифта. Ищите символы\n" +
                "        <zoom>&gt;</zoom>\n" +
                "        <zoom>.</zoom>\n" +
                "        <zoom>ю</zoom> справа снизу</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>(</zoom></td>\n" +
                "        <td colspan=\"2\">Вводить c шифтом. Ищите символы \n" +
                "        <zoom>(</zoom>\n" +
                "        <zoom>9</zoom> справа сверху</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>)</zoom></td>\n" +
                "        <td colspan=\"2\">Вводить c шифтом. Ищите символы \n" +
                "        <zoom>)</zoom>\n" +
                "        <zoom>0</zoom> справа сверху</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>\"</zoom></td>\n" +
                "        <td>Вводить c шифтом. Ищите символы\n" +
                "        <zoom>@</zoom>\n" +
                "        <zoom>\"</zoom>\n" +
                "        <zoom>2</zoom> слева сверху</td>\n" +
                "        <td>Вводить c шифтом. Ищите символы\n" +
                "        <zoom>\"</zoom>\n" +
                "        <zoom>'</zoom>\n" +
                "        <zoom>э</zoom> справа посередине</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><zoom>;</zoom></td>\n" +
                "        <td>Вводить c шифтом. Ищите символы\n" +
                "        <zoom>$</zoom>\n" +
                "        <zoom>;</zoom>\n" +
                "        <zoom>4</zoom> слева сверху</td>\n" +
                "        <td>Вводить c шифтом. Ищите символы\n" +
                "        <zoom>:</zoom>\n" +
                "        <zoom>;</zoom>\n" +
                "        <zoom>ж</zoom> справа посередине</td>\n" +
                "    </tr>\n" +
                "</table>");
        appendFooter();
    }
}
