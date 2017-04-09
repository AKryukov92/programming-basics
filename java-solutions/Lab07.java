/**
 * Created by Александр on 02.04.2017.
 */
public class Lab07 {
    public static void task2354(){
        System.out.println();
        System.out.println("4265");
        System.out.println(task4265("sABCD"));
        System.out.println(task4265("Uxyz"));
        System.out.println(task4265("s"));
        System.out.println(task4265("F123"));
        System.out.println(task4265("Sopqr"));

        System.out.println();
        System.out.println("9925");
        System.out.println(task9925("один, два, три, четыре, пять") - 5);
        System.out.println(task9925("янв,фев,март") - 3);
        System.out.println(task9925("один") - 1);
    }

    public static void main(String[] args) {
        task2354();

        System.out.println();
        System.out.println("9631");
        String[] in9631 = {"z", "a", "g"};
        int[] out9631 = {0, 9, 0};
        for (int i = 0; i < in9631.length; i++){
            try {
                System.out.println(task9631(in9631[i]) - out9631[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9812");
        String[] in9812a = {"a", "w", "g", "x"};
        String[] in9812b = {"x", "d", "z", "u"};
        int[] out9812 = {6, 2, 0, 0};
        for (int i = 0; i < in9812a.length; i++){
            try {
                System.out.println(task9812(in9812a[i], in9812b[i]) - out9812[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5728");
        String[] in5728a = {"a", "c", "y", "g", "a"};
        String[] in5728b = {"z", "d", "d", "z", "l"};
        for (int i = 0; i < in5728a.length; i++){
            try {
                System.out.println(task5728(in5728a[i], in5728b[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("7491");
        String[] in7491 = {"bx", "fw", "123"};
        for (int i = 0; i < in5728a.length; i++){
            try {
                System.out.println(task7491(in7491[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5923");
        int[] in5923a = {5, 6, 0, -1, 10};
        int[] in5923b = {3, 0, 7, 1, 3};
        for (int i = 0; i < in5923a.length; i++){
            try {
                System.out.println(task5923(in5923a[i], in5923b[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("2166");
        String[] in2166 = {"cd", "aa", "xy", "abc", "f"};
        for (int i = 0; i < in2166.length; i++){
            try {
                System.out.println(task2166(in2166[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9116");
        String[] in9116 = {"\"   12345\"", "\"abcdef    \"", "\"  xyz  \"", "\"  a b  \"", "\" pq\"rt \"", "asdf\"", "\"xyz", "p\"w\""};
        for (int i = 0; i < in9116.length; i++){
            try {
                System.out.println(task9116(in9116[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1618");
        String[] in1618 = {
            "{}",
            "{{}}",
            "{{}}{}",
            "{{}{}}",
            "{{{{}{}}{{}{{}}{}}}{{}{}}}",
            "{",
            "{{}",
            "{{}}{",
            "{{{}}{}{}}{{}{}{}",
            "}",
            "{}}",
            "{{{}{}}}{{}{}}{{}}}"
        };
        for (int i = 0; i < in1618.length; i++){
            try {
                task1618(in1618[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String STR = "abcdefwxyz";

    public static int task9631(String s) throws Exception {
        if (!STR.contains(s)){
            throw new Exception("Значение S отсутствует в строке");
        }
        return STR.length() - STR.indexOf(s) - 1;
    }

    public static int task9812(String a, String b) throws Exception {
        if (!STR.contains(a)){
            throw new Exception("Значение A отсутствует в строке");
        }
        if (!STR.contains(b)){
            throw new Exception("Значение B отсутствует в строке");
        }
        int indexA = STR.indexOf(a);
        int indexB = STR.indexOf(b);
        if (indexA < indexB){
            return indexB - indexA - 1;
        } else {
            return indexA - indexB - 1;
        }
    }

    public static String task5728(String a, String b) throws Exception {
        if (!STR.contains(a)){
            throw new Exception("Значение A отсутствует в строке");
        }
        if (!STR.contains(b)){
            throw new Exception("Значение B отсутствует в строке");
        }
        int indexA = STR.indexOf(a);
        int indexB = STR.indexOf(b);
        if (indexA < indexB){
            return STR.substring(indexA + 1, indexB);
        } else {
            return STR.substring(indexB + 1, indexA);
        }
    }

    public static boolean task7491(String x) throws Exception {
        return STR.contains(x);
    }

    public static String task5923(int a, int b) throws Exception {
        if (a < 0 || a > STR.length() || (a + b) > STR.length()){
            throw new Exception("Сообщение об ошибке");
        }
        return STR.substring(0, a) + STR.substring(a + b);
    }

    public static String task4265(String s){
        if (s.startsWith("s")){
            return s.toLowerCase();
        } else if (s.startsWith("U")){
            return s.toUpperCase();
        } else {
            return s;
        }
    }

    public static String task2166(String s) throws Exception {
        if (s.length() != 2){
            throw new Exception("Сообщение об ошибке");
        }
        return "abcdacadbacdaabaadc".replace(s, " ");
    }

    public static String task9116(String s) throws Exception {
        if(!s.startsWith("\"") || !s.endsWith("\"")){
            throw new Exception("Сообщение об ошибке");
        }
        return s.substring(1, s.length() - 1).trim();
    }

    public static int task9925(String s){
        return s.split(",").length;
    }

    public static void task1618(String line) throws Exception {
        System.out.println(line);
        int openIndex;
        int depth = 0;
        int closeIndex;
        int lastIndex = 0;
        while(lastIndex < line.length()){
            closeIndex = line.indexOf("}", lastIndex);
            openIndex = line.indexOf("{", lastIndex);
            if (openIndex >= 0 && openIndex < closeIndex) {
                depth++;
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && closeIndex < 0){
                depth++;
                lastIndex = openIndex;
            }
            if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0){
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex >=0){
                depth--;
                lastIndex = closeIndex;
            }
            if (openIndex < 0 && closeIndex < 0){
                break;
            }
            if (depth < 0){
                throw new Exception("Неожиданная закрывающаяся скобочка");
            }
            System.out.print(depth);
            lastIndex++;
        }
        if (depth > 0){
            throw new Exception("Неожиданный конец строки");
        }
        System.out.println();
    }
}
