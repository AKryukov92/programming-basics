import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Александр on 02.04.2017.
 */
public class Lab08 {

    public static void main(String[] args) {
    }

    public static final String STR = "abcdefwxyz";
    public static final String STR2 = "abcdacadbacdaabaadc";

    public static void task9631(String s) {
        if (!STR.contains(s)) {
            System.out.printf("Фрагмент '%s' отсутствует в строке\n", s);
            return;
        }
        System.out.printf("Фрагмент '%s' находится на индексе '%d'\n", s, STR.indexOf(s));
        System.out.printf("Длина введенного фрагмента %d\n", s.length());
        System.out.printf("После него есть еще %d символов\n", STR.length() - STR.indexOf(s) - s.length());
    }

    public static int task9812(String ca, String cb) throws IllegalArgumentException {
        if (!STR.contains(ca)) {
            throw new IllegalArgumentException("Значение CA отсутствует в строке");
        }
        if (!STR.contains(cb)) {
            throw new IllegalArgumentException("Значение CB отсутствует в строке");
        }
        int indexA = STR.indexOf(ca);
        int indexB = STR.indexOf(cb);
        if (indexA < indexB) {
            return indexB - indexA - 1;
        } else {
            return indexA - indexB - 1;
        }
    }

    public static String task4265(String s) {
        if (s.startsWith("s")) {
            return s.toLowerCase();
        } else if (s.startsWith("U")) {
            return s.toUpperCase();
        } else {
            return s;
        }
    }

    public static String task9116(String s) throws IllegalArgumentException {
        if (!s.startsWith("\"") || !s.endsWith("\"")) {
            throw new IllegalArgumentException("Строка должна начинаться и заканчиваться кавычкой");
        }
        return s.substring(1, s.length() - 1).trim();
    }

    public static int task9925(String s) {
        return s.split(",").length;
    }

    public static void task1618(String line) throws IllegalArgumentException {
        System.out.println(line);
        int openIndex;
        int depth = 0;
        int closeIndex;
        int lastIndex = 0;
        while (lastIndex < line.length()) {
            closeIndex = line.indexOf("}", lastIndex);
            openIndex = line.indexOf("{", lastIndex);
            if (openIndex >= 0 && openIndex < closeIndex) {
                depth++;
                System.out.print(depth);
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && closeIndex < 0) {
                depth++;
                System.out.print(depth);
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0) {
                System.out.print(depth);
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex >= 0) {
                System.out.print(depth);
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex < 0) {
                break;
            }
            if (depth < 0) {
                throw new IllegalArgumentException("Неожиданный символ '}'");
            }
            lastIndex++;
        }
        if (depth > 0) {
            throw new IllegalArgumentException("Неожиданный конец строки");
        }
        System.out.println();
    }

    public static String fillString(int length, char toFill){
        if (length > 0){
            char[] array = new char[length];
            Arrays.fill(array, toFill);
            return new String(array);
        }
        return "";
    }

    public static void hiveStructBeautifier(String line) throws IllegalArgumentException {
        System.out.println(line);
        int openIndex;
        int depth = 0;
        int closeIndex;
        int lastIndex = 0;
        while (lastIndex < line.length()) {
            closeIndex = line.indexOf(">", lastIndex);
            openIndex = line.indexOf("<", lastIndex);
            if (openIndex >= 0 && openIndex < closeIndex) {
                depth++;
                System.out.println(fillString(depth,' ') + line.substring(lastIndex, openIndex + 1));
                //System.out.print(depth);
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && closeIndex < 0) {
                depth++;
                System.out.println(fillString(depth, ' ') + "###");
                //System.out.print(depth);
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0) {
                if (lastIndex < closeIndex) {
                    System.out.println(fillString(depth+1, ' ') + line.substring(lastIndex, closeIndex));
                }
                System.out.println(fillString(depth, ' ') + ">");
                depth--;
                //System.out.print(depth);
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex >= 0) {
                if (lastIndex < closeIndex) {
                    System.out.println(fillString(depth + 1, ' ') + line.substring(lastIndex, closeIndex));
                }
                //System.out.print(depth);
                depth--;
                System.out.println(fillString(depth, ' ') + ">");
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex < 0) {
                break;
            }
            if (depth < 0) {
                throw new IllegalArgumentException("Неожиданный символ '}'");
            }
            lastIndex++;
        }
        if (depth > 0) {
            throw new IllegalArgumentException("Неожиданный конец строки");
        }
        System.out.println();
    }

    public static String task8887(String line) throws IllegalArgumentException {
        String[] parts = line.split("[.]");
        StringBuilder sb = new StringBuilder();
        if (parts.length == 1){
            throw new IllegalArgumentException("Отсутствует вызов метода");
        }
        
        return sb.toString();
    }

    public static List<Integer> task3657(String a) throws IllegalArgumentException {
        if (a.length() != 1) {
            throw new IllegalArgumentException("Нужно ввести ровно один символ");
        }
        String input = "jijjbjjcidihddbjbcjdjhjdjijjahahdhjcfjcghcjgjgbjdcijibgjbajhdbjhjacgbdijjbdjdjhjigjjgigjahbjjihgiccaaijjajjjijjiiidfgfhgbjjdjajjfhdjajffjhbjghjijabfihbgjjibdjbcgjhjjjbdjibjhjccjjjfjicjjjdjdjjjfjhjhjffjjfbfhhfdhjdjibdjgadcajdjdajhjcijghgijjgchdjadjjdgfbibjjaaijfjcjgjdafcjbhabiggigdccjccjghjadaacffjajicfdijfacjcdfjhhigbjhhhjcbhhfcicbadjgjjddbhhfjfhgjjbbgijijcjgjjccdjifcjjcgfjjhcdhcabggfiabchjjfbbdbjjjgfcdiadcfffjjgbdjjdahhjjaijjdjfddhahjabaacdhahafghjaajchjcdjaihijjdcajhdigiaafhjiijgjfhdjijigjchbhdabacijcajjhfjfgjahffjbahfjjdjgiiahjajjdjfggihajjgjffgjjdhajjjjhcjdjbgjjdjbjjaadhdfhdijaijhaijfhibdadibjcjdfbjigjcjhaijfghbfcjfjagchjhcadjbdbbjhjgdhbjjjfjihchjahgjajgaficjjfjjdjhjjdjajaadgfbdccgjhhajicjdahcjjajjgjjjijbijigbjbaihjgiahjfhjbjjajbjcfcjcajjdjcghicdjdjgbcjijfcacjccjijjffdjigjjhjfcdhbbjhgjfhjgajjgjhdiachhjjjdajjidgbigicjdbjjhdgjihdjcjgijjdgfjgjaaghjjgddjhcfddaajjbjbiahijdajjjbfaachjgidgcjjahfdhcabdfjhjjaifhjjbbgjchjicjjcajhbbcjbgjjjabhdgjcggajhhddbgajjfjajfcccifaibagjcbfjaihdhhbdfijjf";
        List<Integer> ret = new ArrayList<>();
        int next = input.indexOf(a);
        while (next >= 0) {
            ret.add(next);
            next = input.indexOf(a, next + 1);
        }
        return ret;
    }

    public static String task6599(String s) throws IllegalArgumentException {
        String escaped = s.replace("[", "\\[").replace("]", "\\]");
        boolean outside = true;
        int next = escaped.indexOf("\"");
        int current = 0;
        StringBuilder result = new StringBuilder();
        while (next >= 0) {
            String part = escaped.substring(current, next);
            result.append(part);
            if (outside) {
                result.append("[");
            } else {
                result.append("]");
            }
            outside = !outside;
            current = next + 1;
            next = escaped.indexOf("\"", current);
        }
        if (current < escaped.length()) {
            String part = escaped.substring(current);
            result.append(part);
        }
        return result.toString();
    }

    public static String task1703(String s) throws IllegalArgumentException {
        int ltSignPos = s.indexOf("<");
        int ltSignPosEnd = s.lastIndexOf("<");
        int gtSignPos = s.indexOf(">");
        int gtSignPosEnd = s.lastIndexOf(">");
        int signPos;
        String description;
        if (ltSignPos >= 0) {
            if (gtSignPos > 0 || ltSignPosEnd != ltSignPos) {
                throw new IllegalArgumentException("В выражении должен быть только один знак сравнения");
            }
            description = "меньше";
            signPos = ltSignPos;
        } else if (gtSignPos >= 0) {
            if (gtSignPosEnd != gtSignPos) {
                throw new IllegalArgumentException("В выражении должен быть только один знак сравнения");
            }
            description = "больше";
            signPos = gtSignPos;
        } else {
            throw new IllegalArgumentException("Отсутствует знак сравнения");
        }
        String var = s.substring(0, signPos).trim();
        if (var.isEmpty()){
            throw new IllegalArgumentException("Слева от знака сравнения ожидается переменная");
        }
        if (var.contains(" ")){
            String statement = var.substring(0, var.lastIndexOf(" "));
            String variable = var.substring(var.lastIndexOf(" ")+1);
            throw new IllegalArgumentException("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + variable + "\"");
        }
        String value, special;
        if (s.substring(signPos+1).startsWith("=")){
            value = s.substring(signPos+2).trim();
            special = "либо равно числу";
        } else {
            value = s.substring(signPos+1).trim();
            special = "числа";
        }
        if (value.isEmpty()){
            throw new IllegalArgumentException("Справа от знака сравнения ожидается ограничение");
        }
        if (value.contains(" ")){
            String constraint = value.substring(0, value.lastIndexOf(" "));
            String statement = value.substring(value.lastIndexOf(" ")+1);
            throw new IllegalArgumentException("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + constraint + "\"");
        }
        return String.format("Значение переменной %s %s %s %s", var, description, special, value);
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
    public static char[] letters = {
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

    public static String task4996(String message) {
        char[] uppered = message.toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < uppered.length; i++) {
            int letterIndex = 0;
            if (Character.isWhitespace(uppered[i])) {
                continue;
            }
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == uppered[i]) {
                    letterIndex = j;
                    break;
                }
            }
            result.append(codes[letterIndex]).append(" ");
        }
        return result.toString();
    }
}