package root.tasks.search;

import root.tasks.OneInputValLayout;

public class Task2234 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит зашифрованное сообщение на азбуке Морзе. Нужно зашифровать его и вывести результат. Буквы Морзе разделены пробелом. Любая буква не из списка превращается в вопросительный знак.");
        appendTaskDescNonEscaped("<table class=\"check_values\">\n" +
                "\t\t<tr>\n" +
                "\t\t\t<th>№ п/п</th>\n" +
                "\t\t\t<th>Русский символ</th>\n" +
                "\t\t\t<th>Код Морзе</th>\n" +
                "\t\t</tr>\n" +
                "\t\t<tr><td></td><td>?</td><td>..--..</td></tr>\n" +
                "\t\t<tr><td></td><td>А</td><td>.-</td></tr>\n" +
                "\t\t<tr><td></td><td>Б</td><td>-...</td></tr>\n" +
                "\t\t<tr><td></td><td>В</td><td>.--</td></tr>\n" +
                "\t\t<tr><td></td><td>Г</td><td>--.</td></tr>\n" +
                "\t\t<tr><td></td><td>Д</td><td>-..</td></tr>\n" +
                "\t\t<tr><td></td><td>Е</td><td>.</td></tr>\n" +
                "\t\t<tr><td></td><td>Ж</td><td>...-</td></tr>\n" +
                "\t\t<tr><td></td><td>З</td><td>--..</td></tr>\n" +
                "\t\t<tr><td></td><td>И</td><td>..</td></tr>\n" +
                "\t\t<tr><td></td><td>Й</td><td>.---</td></tr>\n" +
                "\t\t<tr><td></td><td>К</td><td>-.-</td></tr>\n" +
                "\t\t<tr><td></td><td>Л</td><td>.-..</td></tr>\n" +
                "\t\t<tr><td></td><td>М</td><td>--</td></tr>\n" +
                "\t\t<tr><td></td><td>Н</td><td>-.</td></tr>\n" +
                "\t\t<tr><td></td><td>О</td><td>---</td></tr>\n" +
                "\t\t<tr><td></td><td>П</td><td>.--.</td></tr>\n" +
                "\t\t<tr><td></td><td>Р</td><td>.-.</td></tr>\n" +
                "\t\t<tr><td></td><td>С</td><td>...</td></tr>\n" +
                "\t\t<tr><td></td><td>Т</td><td>-</td></tr>\n" +
                "\t\t<tr><td></td><td>У</td><td>..-</td></tr>\n" +
                "\t\t<tr><td></td><td>Ф</td><td>..-.</td></tr>\n" +
                "\t\t<tr><td></td><td>Х</td><td>....</td></tr>\n" +
                "\t\t<tr><td></td><td>Ц</td><td>-.-.</td></tr>\n" +
                "\t\t<tr><td></td><td>Ч</td><td>---.</td></tr>\n" +
                "\t\t<tr><td></td><td>Ш</td><td>----</td></tr>\n" +
                "\t\t<tr><td></td><td>Щ</td><td>--.-</td></tr>\n" +
                "\t\t<tr><td></td><td>Ъ</td><td>--.--</td></tr>\n" +
                "\t\t<tr><td></td><td>Ы</td><td>-.--</td></tr>\n" +
                "\t\t<tr><td></td><td>Ь</td><td>--.--</td></tr>\n" +
                "\t\t<tr><td></td><td>Э</td><td>..-..</td></tr>\n" +
                "\t\t<tr><td></td><td>Ю</td><td>..--</td></tr>\n" +
                "\t\t<tr><td></td><td>Я</td><td>.-.-</td></tr>\n" +
                "\t\t<tr><td></td><td>1</td><td>.----</td></tr>\n" +
                "\t\t<tr><td></td><td>2</td><td>..---</td></tr>\n" +
                "\t\t<tr><td></td><td>3</td><td>...--</td></tr>\n" +
                "\t\t<tr><td></td><td>4</td><td>....-</td></tr>\n" +
                "\t\t<tr><td></td><td>5</td><td>.....</td></tr>\n" +
                "\t\t<tr><td></td><td>6</td><td>-....</td></tr>\n" +
                "\t\t<tr><td></td><td>7</td><td>--...</td></tr>\n" +
                "\t\t<tr><td></td><td>8</td><td>---..</td></tr>\n" +
                "\t\t<tr><td></td><td>9</td><td>----.</td></tr>\n" +
                "\t\t<tr><td></td><td>0</td><td>-----</td></tr>\n" +
                "\t</table>");
        appendCheckValuesHeader("message");
        appendCheckValuesRow("-.. --- -... .-. -.-- .--- -.. . -. ..-..");
        appendCheckValuesRow(".--. . .-. . -.. .- .-- .- .--- - . -- . -.. .-.. . -. -. . .");
        appendCheckValuesRow(".-.- -. .. ---. . --. --- -. . .--. --- -. .. -- .- ..--");
        appendCheckValuesRow(".--. --- -- --- --. .. - .");
        appendCheckValuesRow("-. .- -. .- ... . -.. . - ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--.. ..--..");
        appendCheckValuesRow("-.- --- --- .-. -.. .. -. .- - -.-- -.-. . .-.. .. .---- ...-- .. ----. -----");
        appendCheckValuesRow(".--. .-. --- -- .- ....");
        appendCheckValuesRow(".--. --- .--. .- .-..");
        appendCheckValuesRow("-.- --- -. . -.-. ... .-- .-.- --.. ..");
        appendCheckValuesFooter();
        appendFooter();
    }

    @Override
    protected void logic(String message) {
        String[] codes = {
                "..--..",
                ".-",
                "-...",
                ".--",
                "--.",
                "-..",
                ".",
                "...-",
                "--..",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                ".-.",
                "...",
                "-",
                "..-",
                "..-.",
                "....",
                "-.-.",
                "---.",
                "----",
                "--.-",
                "--.--",
                "-.--",
                "..-..",
                "..-..",
                "..--",
                ".-.-",
                ".----",
                "..---",
                "...--",
                "....-",
                ".....",
                "-....",
                "--...",
                "---..",
                "----.",
                "-----"
        };
        char[] letters = {
                '?',
                'А',
                'Б',
                'В',
                'Г',
                'Д',
                'Е',
                'Ж',
                'З',
                'И',
                'Й',
                'К',
                'Л',
                'М',
                'Н',
                'О',
                'П',
                'Р',
                'С',
                'Т',
                'У',
                'Ф',
                'Х',
                'Ц',
                'Ч',
                'Ш',
                'Щ',
                'Ъ',
                'Ы',
                'Ь',
                'Э',
                'Ю',
                'Я',
                '1',
                '2',
                '3',
                '4',
                '5',
                '6',
                '7',
                '8',
                '9',
                '0'
        };
        String[] arr = message.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int letterIndex = 0;
            for (int j = 0; j < codes.length; j++) {
                if (arr[i].equals(codes[j])) {
                    letterIndex = j;
                    break;
                }
            }
            System.out.print(letters[letterIndex]);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task2234());
    }
}
