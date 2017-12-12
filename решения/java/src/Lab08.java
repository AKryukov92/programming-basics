import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 02.04.2017.
 */
public class Lab08 {

    public static void main(String[] args) {
    }

    public static final String STR = "abcdefwxyz";
    public static final String STR2 = "abcdacadbacdaabaadc";

    public static int task9631(String s) throws Exception {
        if (!STR.contains(s)) {
            throw new Exception("Значение S отсутствует в строке");
        }
        return STR.length() - STR.indexOf(s) - 1;
    }

    public static int task9812(String ca, String cb) throws Exception {
        if (!STR.contains(ca)) {
            throw new Exception("Значение CA отсутствует в строке");
        }
        if (!STR.contains(cb)) {
            throw new Exception("Значение CB отсутствует в строке");
        }
        int indexA = STR.indexOf(ca);
        int indexB = STR.indexOf(cb);
        if (indexA < indexB) {
            return indexB - indexA - 1;
        } else {
            return indexA - indexB - 1;
        }
    }

    public static List<Integer> task9279(String x) throws Exception {
        if (x.length() != 2) {
            throw new Exception("Вводимая строка должна содержать ровно 2 символа");
        }
        List<Integer> ret = new ArrayList<>();
        int i = STR2.indexOf(x);
        while (i != -1) {
            ret.add(i);
            i = STR2.indexOf(x, i + 1);
        }
        return ret;
    }

    static String task4845(int ca, int cb) throws Exception {
        if (ca < 0 || ca > STR.length()) {
            throw new Exception("Значение CA должно быть в интервале [0,длина строки)");
        }
        if (cb < 0 || cb > STR.length()) {
            throw new Exception("Значение CB должно быть в интервале [0,длина строки)");
        }
        if (ca > cb) {
            return STR.substring(cb, ca + 1);
        } else {
            return STR.substring(ca, cb + 1);
        }
    }

    public static String task5728(String ca, String cb) throws Exception {
        if (!STR.contains(ca)) {
            throw new Exception("Значение CA отсутствует в строке");
        }
        if (!STR.contains(cb)) {
            throw new Exception("Значение CB отсутствует в строке");
        }
        int indexA = STR.indexOf(ca);
        int indexB = STR.indexOf(cb);
        if (indexA < indexB) {
            return STR.substring(indexA + 1, indexB);
        } else {
            return STR.substring(indexB + 1, indexA);
        }
    }

    public static String task7222(String code) throws Exception {
        if (code.length() != 13) {
            throw new Exception("Некорректная длина штрих-кода");
        }
        String country = code.substring(0, 2);
        String manufacturer = code.substring(3, 6);
        String product = code.substring(7, 11);
        String checksum = code.substring(12);
        return "Код страны: " + country +
                "\nКод изготовителя: " + manufacturer +
                "\nКод товара: " + product +
                "\nКонтрольное число: " + checksum;
    }

    public static boolean task7491(String x) {
        return STR.contains(x);
    }

    public static String task5923(int ca, int cb) throws Exception {
        if (ca < 0 || ca > STR.length()) {
            throw new Exception("Значение CA должно быть в интервале [0, длина строки)");
        }
        if (cb < 0) {
            throw new Exception("Значение CB должно быть неотрицательно");
        }
        if ((ca + cb) > STR.length()) {
            throw new Exception("Сумма значений CA и CB должна быть меньше длины строки");
        }
        return STR.substring(0, ca) + STR.substring(ca + cb);
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

    public static String task2166(String s) throws Exception {
        if (s.length() != 2) {
            throw new Exception("Вводимая строка должна содержать ровно 2 символа");
        }
        return STR2.replace(s, " ");
    }

    public static String task9116(String s) throws Exception {
        if (!s.startsWith("\"") || !s.endsWith("\"")) {
            throw new Exception("Строка должна начинаться и заканчиваться кавычкой");
        }
        return s.substring(1, s.length() - 1).trim();
    }

    public static int task9925(String s) {
        return s.split(",").length;
    }

    public static void task1618(String line) throws Exception {
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
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && closeIndex < 0) {
                depth++;
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0) {
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex >= 0) {
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex < 0) {
                break;
            }
            if (depth < 0) {
                throw new Exception("Неожиданный символ '}'");
            }
            System.out.print(depth);
            lastIndex++;
        }
        if (depth > 0) {
            throw new Exception("Неожиданный конец строки");
        }
        System.out.println();
    }

    public static List<Integer> task3657(String a) throws Exception {
        if (a.length() != 1) {
            throw new Exception("Нужно ввести ровно один символ");
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

    public static String task6599(String s) throws Exception {
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

    public static String task1703(String s) throws Exception {
        int ltSignPos = s.indexOf("<");
        int ltSignPosEnd = s.lastIndexOf("<");
        int gtSignPos = s.indexOf(">");
        int gtSignPosEnd = s.lastIndexOf(">");
        int signPos;
        String description;
        if (ltSignPos >= 0) {
            if (gtSignPos > 0 || ltSignPosEnd != ltSignPos) {
                throw new Exception("В выражении должен быть только один знак сравнения");
            }
            description = "меньше";
            signPos = ltSignPos;
        } else if (gtSignPos >= 0) {
            if (gtSignPosEnd != gtSignPos) {
                throw new Exception("В выражении должен быть только один знак сравнения");
            }
            description = "больше";
            signPos = gtSignPos;
        } else {
            throw new Exception("Отсутствует знак сравнения");
        }
        String var = s.substring(0, signPos).trim();
        if (var.isEmpty()){
            throw new Exception("Слева от знака сравнения ожидается переменная");
        }
        if (var.contains(" ")){
            String statement = var.substring(0, var.lastIndexOf(" "));
            String variable = var.substring(var.lastIndexOf(" ")+1);
            throw new Exception("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + variable + "\"");
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
            throw new Exception("Справа от знака сравнения ожидается ограничение");
        }
        if (value.contains(" ")){
            String constraint = value.substring(0, value.lastIndexOf(" "));
            String statement = value.substring(value.lastIndexOf(" ")+1);
            throw new Exception("Неожиданное выражение \"" + statement + "\" слева от переменной \"" + constraint + "\"");
        }
        return String.format("Значение переменной %s %s %s %s", var, description, special, value);
    }
}