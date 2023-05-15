package root.tasks.search_in_array;

import root.tasks.OneInputValLayout;

public class Task4996 extends OneInputValLayout {
    @Override
    protected void makeLayout() {
        appendHeader();
        appendTaskDescEscaped("Пользователь вводит сообщение. Нужно зашифровать его азбукой Морзе. Между буквами нужно поставить пробел. Пробелы не кодируются. Для шифровки создайте два массива. Один массив содержит   Любая буква не из списка превращается в вопросительный знак.");
        appendTaskDescNonEscaped(getMorseTable());

        appendCheckValuesHeader("message");
        appendCheckValuesRow("добрый день");
        appendCheckValuesRow("передавайте медленнее");
        appendCheckValuesRow("я ничего не понимаю");
        appendCheckValuesRow("помогите");
        appendCheckValuesRow("на нас едет Sturmpanzerwagen");
        appendCheckValuesRow("координаты цели 13 и 90");
        appendCheckValuesRow("промах");
        appendCheckValuesRow("попал");
        appendCheckValuesRow("конец связи");
        appendCheckValuesFooter();
        appendFooter();
    }

    private static String getMorseTable() {
        StringBuilder builder = new StringBuilder();
        builder.append("<table class=\"check_values\">");
        for (int i = 0; i < codes.length; i++) {
            builder.append("<tr><td></td><td>");
            builder.append(letters[i]);
            builder.append("</td><td>");
            builder.append(codes[i]);
            builder.append("</td></tr>");
        }
        builder.append("</table>");

        return builder.toString();
    }

    public static String[] codes = {
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
    public static char[] letters = "?АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ1234567890".toCharArray();

    @Override
    protected void logic(String value) {
        char[] uppered = value.toUpperCase().toCharArray();
        for (int i = 0; i < uppered.length; i++) {
            int letterIndex = 0;
            if (Character.isWhitespace(uppered[i])) {
                continue;
            }
            boolean found = false;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == uppered[i]) {
                    letterIndex = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print(codes[letterIndex] + " ");
            } else {
                System.out.println(codes[0]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Task4996());
    }
}
