import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 31.03.2017.
 */
public class Lab06 {
    public static void task2354() {
        System.out.println();
        System.out.println("2475");
        System.out.println(task2475() - 120300);

        System.out.println();
        System.out.println("9562");
        System.out.println(task9562(15, 27) - 273);
        System.out.println(task9562(25, 44) - 690);
        System.out.println(task9562(80, 100) - 1890);
        System.out.println(task9562(3000, 24) - 4501224);

        System.out.println();
        System.out.println("3669");
        System.out.println(task3669(8, 13) - 1235520);
        System.out.println(task3669(159, 161) - 4095840);
        System.out.println(task3669(648, 648) - 648);
        System.out.println(task3669(-2, 600));
        System.out.println(task3669(50, 24) - 2421409269157986304L);

        System.out.println();
        System.out.println("5951");
        System.out.println(task5951() - 630);

        System.out.println();
        System.out.println("6580");
        System.out.println(task6580(15, 27) - 5915);
        System.out.println(task6580(25, 44) - 24470);
        System.out.println(task6580(80, 100) - 170870);
        System.out.println(task6580(3000, 24) - 9004496176L);

        System.out.println();
        System.out.println("5969");
        System.out.println(task5969(8, 13));
        System.out.println(task5969(28, 44) - 105);
        System.out.println(task5969(80, 98) - 273);
        System.out.println(task5969(3000, 24) - 642600);

        System.out.println();
        System.out.println("8696");
        System.out.println(task8696() - 69);

        System.out.println();
        System.out.println("2324");
        String[] in2324 = {
            "1 2 3 4 5 0",
            "0",
            "-1 -2 0",
            "1 1 1 1 1 1 1 1 1 1 1 1 0"};
        int[] out2324 = { 15, 0, -3, 12 };
        for (int i = 0; i < in2324.length; i++)
        {
            int result = task2324(in2324[i]);
            System.out.printf("%d (%d)\n", result, out2324[i]);
        }
        System.out.println();
        System.out.println("8731");
        String[] in8731 = {
            "501 501",
            "0 0 1001",
            "400 400 200 1",
            "190 190 190 190 190 190 190 190 190 190 190",
            "130 130 130 130 130 130 130 130 130 130 130",
            "129 179 89 155 188 163 94 66"};
        int[] out8731 = { 2, 3, 4, 6, 8, 8 };
        for (int i = 0; i < in8731.length; i++)
        {
            int result = task8731(in8731[i]);
            System.out.printf("%d (%d)\n", result, out8731[i]);
        }

        System.out.println();
        System.out.println("4082");
        String[] in4082 = {
            "10 20 100",
            "300 400 100",
            "1000 1000 83 150",
            "1 1 1 1 1 1 1 1 199 90"
        };
        String[] out4082 = {
            "Сумма слева: 30, сумма справа: 0",
            "Сумма слева: 0, сумма справа: 700",
            "Сумма слева: 83, сумма справа: 2000",
            "Сумма слева: 8, сумма справа: 199"};
        for (int i = 0; i < in4082.length; i++)
        {
            String result = task4082(in4082[i]);
            System.out.println(result);
            System.out.println(out4082[i]);
        }
    }

    public static void task7649() {
        System.out.println();
        System.out.println("8495");
        StringBuilder sb8495 = new StringBuilder();
        sb8495 = sb8495.append("@");
        sb8495 = task8495(sb8495);
        sb8495 = sb8495.append("#");
        System.out.println(sb8495.toString());

        System.out.println();
        System.out.println("1315");
        StringBuilder sb1315 = new StringBuilder();
        sb1315.append("@");
        task1315(sb1315);
        sb1315.append("#");
        System.out.println(sb1315);

        System.out.println();
        System.out.println("3762");
        String result3762 = task3762(new StringBuilder()).toString();
        System.out.println(result3762);

        System.out.println();
        System.out.println("3550");
        StringBuilder sb3550 = task3550(
                new StringBuilder()
                        .append("@"))
                .append("#");
        System.out.println(sb3550.toString());

        System.out.println();
        System.out.println("6572");
        StringBuilder sb6572 = new StringBuilder();
        task6572(sb6572, 8, 13);
        task6572(sb6572, 691, 703);
        task6572(sb6572, 19, 3);
        System.out.println(sb6572);

        System.out.println();
        System.out.println("2084");
        String result2084;
        result2084 = task2084(new StringBuilder(), 20, 30).append("\n")
                .append(task2084(new StringBuilder(), 8, 13)).append("\n")
                .append(task2084(new StringBuilder(), 571, 580)).append("\n")
                .append(task2084(new StringBuilder(), 691, 703)).append("\n")
                .append(task2084(new StringBuilder(), -71, -90)).append("\n")
                .append(task2084(new StringBuilder(), 64, 58)).append("\n")
                .append(task2084(new StringBuilder(), 19, 7)).append("\n")
                .append(task2084(new StringBuilder(), 401, 390)).append("\n")
                .append(task2084(new StringBuilder(), 800, 785)).append("\n")
                .toString();
        System.out.println(result2084);

        System.out.println();
        System.out.println("5411");
        String result5411 = task5411(
                task5411(
                        task5411(new StringBuilder(), 7, 11)
                                .append("\n")
                        , 211, 223).append("\n")
                , 37, 29).append("\n")
                .toString();
        System.out.println(result5411);

        System.out.println();
        System.out.println("7585");
        int[] in7585 = {10, 15, 20, 9, 21};
        String[] out7585 = {
                "10+\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15+\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20+\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n"
        };
        for (int i = 0; i < in7585.length; i++){
            StringBuilder result = task7585(new StringBuilder(), in7585[i]);
            if (out7585[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result);
            }
        }

        System.out.println();
        System.out.println("8770");
        int[] in8770 = {30, 37, 40, 8, 100};
        String[] out8770 = {
                "30+\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37+\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40+\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n"
        };
        for (int i = 0; i < in8770.length; i++){
            StringBuilder result = task8770(new StringBuilder(), in8770[i]);
            if (out8770[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }
    }

    public static void task9701() {
        System.out.println();
        System.out.println("9180");
        int[] in9180 = {-100, 7, 368, 501, -101};
        int[] outs9180 = {120200, 125229, 57722, 0, 0};
        for (int i = 0; i < in9180.length; i++){
            try {
                int result = task9180(in9180[i]);
                System.out.printf("%d (%d)\n", result, outs9180[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("1544");
        int[] in1544 = {12, 70, 368, 10000, -11, 10001};
        int[] outs1544 = {23, 2430, 67841, 50004945, 0, 0};
        for (int i = 0; i < in1544.length; i++){
            try {
                int result = task1544(in1544[i]);
                System.out.printf("%d (%d)\n", result, outs1544[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2802");
        int[] in2802 = {4, 11, 19, -1, 0};
        double[] out2802 = {2.0833, 3.0198, 3.5477};
        for (int i = 0; i < in2802.length; i++){
            try {
                double result = task2802(in2802[i]);
                System.out.printf("%.6f (%.6f)\n", result, out2802[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5170");
        int[] in5170 = {6, 3219, 7, 2017, -10};
        for (int i = 0; i < in5170.length; i++){
            try {
                if (task5170(in5170[i])) {
                    System.out.println("Число простое");
                } else {
                    System.out.println("Число не простое");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void task6732() {
        System.out.println();
        System.out.println("6066");
        int[] in6066a = {8, 691, 3000};
        int[] in6066b = {13, 702, 24};
        String[] out6066 = {
                "8\n9\n10\n11\n12\n13\n",
                "691\n692\n693\n694\n695\n696\n"+
                        "697\n698\n699\n700\n701\n702\n",
                "ожидается исключение"
        };
        for (int i = 0; i < in6066a.length; i++){
            try {
                StringBuilder result = task6066(new StringBuilder(),
                        in6066a[i], in6066b[i]);
                if (out6066[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2565");
        int[] in2565a = {8, 691, 3000};
        int[] in2565b = {13, 703, 24};
        for (int i = 0; i < in2565a.length; i++){
            try {
                StringBuilder result = task2565(new StringBuilder(),
                        in2565a[i], in2565b[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2594");
        int[] in2594a = {8, 15, 0, -1};
        String[] in2594b = {"#", " ", "?", "*"};
        for (int i = 0; i < in2594a.length; i++){
            try {
                StringBuilder result = task2594(new StringBuilder(),
                        in2594a[i], in2594b[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("1483");
        int[] in1483 = {4, 18, 42, 0, -9};
        for (int i = 0; i < in1483.length; i++){
            try {
                StringBuilder result = task1483(
                        new StringBuilder(), in1483[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("3983");
        int[] in3983 = {5, 23, 51, 0, -7};
        for (int i = 0; i < in3983.length; i++){
            try {
                StringBuilder result = task3983(
                        new StringBuilder(), in3983[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("4236");
        int[] in4236 = {3, 12, 15, -1, 16};
        for (int i = 0; i < in4236.length; i++){
            try {
                StringBuilder result = task4236(
                        new StringBuilder(), in4236[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("8395");
        int[] in8395 = {1, 13, -1, 21};
        for (int i = 0; i < in8395.length; i++){
            try {
                StringBuilder result = task8395(
                        new StringBuilder(), in8395[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5568");
        int[] in5568 = {1, 10, -2, 23};
        for (int i = 0; i < in5568.length; i++){
            try {
                StringBuilder result = task5568(
                        new StringBuilder(), in5568[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2592");
        String[] in2592s = {"#", "?", "*", "=", "o", "!"};
        int[] in2592w = {5, 7, 90, 0, -2, 20};
        int[] in2592h = {3, 10, 0, 15, 8, -6};
        String[] out2592 = {
                "#####\n#####\n#####\n",
                "???????\n???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in2592s.length; i++){
            try {
                StringBuilder result = task2592(
                        new StringBuilder(),
                        in2592s[i],
                        in2592w[i],
                        in2592h[i]);
                if (out2592[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("4075");
        int[] in4075 = {5, 15, 0, -2};
        for (int i = 0; i < in4075.length; i++){
            try {
                StringBuilder result = task4075(
                        new StringBuilder(), in4075[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("7517");
        int[] in7517w = {1, 7, 5, 0, 23, -3, 7};
        int[] in7517h = {1, 3, 5, 17, 0, 11, -7};
        String[] out7517 = {
                " 0\n0 |\n -",
                " 0123456\n0       |\n1       |\n2       |\n -------",
                " 01234\n0     |\n1     |\n2     |\n3     |\n" +
                        "4     |\n -----",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in7517w.length; i++){
            try {
                StringBuilder result = task7517(new StringBuilder(),
                        in7517w[i], in7517h[i]);
                if (out7517[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5448");
        String[] in5448s = {"#", "\\", "^", "*", "56"};
        int[] in5448h = {6, 3, 0, -2, -3};
        for (int i = 0; i < in5448s.length; i++){
            try {
                StringBuilder result = task5448(new StringBuilder(),
                        in5448s[i], in5448h[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5238");
        int[] in5238w = {5, 4, 3, 0, 7, -11, 29};
        int[] in5238h = {5, 5, 5, 5, 0, 4, -2};
        for (int i = 0; i < in5238w.length; i++){
            try {
                StringBuilder result = task5238(new StringBuilder(),
                        in5238w[i], in5238h[i]);
                System.out.println(result.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5171");
        String[] in5171s1 = {"#", "?", "*", "=", "o", "!"};
        String[] in5171s2 = {"0", "-", "!", "+", "T", "."};
        int[] in5171w = {5, 7, 90, 0, -2, 20};
        int[] in5171h = {3, 10, 0, 15, 8, -6};
        String[] out5171 = {
                "#####\n00000\n#####\n",
                "???????\n-------\n???????\n-------\n" +
                        "???????\n-------\n???????\n" +
                        "-------\n???????\n-------\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"
        };
        for (int i = 0; i < in5171w.length; i++){
            try {
                StringBuilder result = task5171(new StringBuilder(),
                        in5171s1[i],in5171s2[i],in5171w[i],in5171h[i]);
                if (out5171[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("1862");
        String[] in1862s1 = {"#", "?", "*", "=", "o", "!"};
        String[] in1862s2 = {"0", "-", "!", "+", "T", "."};
        int[] in1862w = {5, 7, 90, 0, -2, 20};
        int[] in1862h = {3, 10, 0, 15, 8, -6};
        String[] out1862 = {
            "#0#0#\n#0#0#\n#0#0#\n",
            "?-?-?-?\n?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                    "?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                    "?-?-?-?\n?-?-?-?\n?-?-?-?\n",
            "",
            "",
            "ожидается исключение",
            "ожидается исключение"
        };
        for (int i = 0; i < in1862s1.length; i++){
            try {
                StringBuilder result = task1862(new StringBuilder(),
                        in1862s1[i], in1862s2[i], in1862w[i], in1862h[i]);
                if (out1862[i].equals(result.toString())){
                    System.out.println("Задача решена верно");
                } else {
                    result.insert(0, "Неверно. Результат:\n");
                    System.out.println(result.toString());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void task8787(){
        System.out.println();
        System.out.println("2321");
        int[] in2321a = {8, 691, 23};
        int[] in2321b = {13, 702, 11};
        for (int i = 0; i < in2321a.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task2321(in2321a[i], in2321b[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("5053");
        int[] in5053a = {8, 691, 27};
        int[] in5053b = {13, 702, 17};
        for (int i = 0; i < in5053a.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task5053(in5053a[i], in5053b[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("8418");
        int[] in8418 = {6, 385, -9};
        for (int i = 0; i < in8418.length; i++){
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = task8418(in8418[i]);
                for (Integer item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        task2354();
        task7649();
        task9701();
        task6732();
        task8787();
    }

    public static StringBuilder task8495(StringBuilder sb){
        int i = 0;
        while (i < 13){
            sb.append("!");
            i++;
        }
        return sb;
    }

    public static StringBuilder task1315(StringBuilder sb){
        int a = 17;
        int b = 47;
        while (a <= b){
            sb.append(a);
            sb.append(" ");
            a++;
        }
        return sb;
    }

    public static StringBuilder task6066(StringBuilder sb, int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Значение A должно быть не больше значения B");
        }
        int i = a;
        while(i <= b){
            sb.append(i);
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task2565(StringBuilder sb, int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Значение A должно быть не больше значения B");
        }
        int i = b;
        while(i >= a){
            sb.append(i);
            sb.append(" ");
            i--;
        }
        return sb;
    }

    public static StringBuilder task2594(StringBuilder sb, int a, String b) throws Exception {
        if (a < 0){
            throw new Exception("Значение A должно быть неотрицательным");
        }
        int i = 0;
        sb.append("\"");
        while(i < a){
            sb.append(b);
            i++;
        }
        sb.append("\"");
        return sb;
    }

    public static List<Integer> task2321(int a, int b){
        int i, n;
        List<Integer> ret = new ArrayList<>();
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while(i <= n){
            ret.add(i);
            i++;
        }
        return ret;
    }

    public static List<Integer> task5053(int a, int b){
        List<Integer> ret = new ArrayList<>();
        if (a < b){
            while(a <= b){
                ret.add(a);
                a++;
            }
        } else {
            while(b <= a){
                ret.add(a);
                a--;
            }
        }
        return ret;
    }

    public static StringBuilder task3762(StringBuilder sb){
        int i = 1;
        while (i <= 20){
            sb.append(i);
            sb.append(" ");
            sb.append(i*453);
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task3550(StringBuilder sb){
        int i = 1;
        while (i <= 9){
            sb.append(i);
            sb.append(" x 7 = ");
            sb.append(i * 7);
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static int task2475(){
        int a = 100, b = 500, sum = 0;
        while (a <= b){
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task9180(int a) throws Exception {
        if (a < -100 || a > 500){
            throw new Exception("Значение A должно быть в интервале [-100, 500]");
        }
        int b = 500, sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task1544(int b) throws Exception {
        if (b < -10 || b > 10000){
            throw new Exception("Значение b должно быть в интервале [-10,10000]");
        }
        int a = -10, sum = 0;
        while (a <= b){
            sum += a;
            a++;
        }
        return sum;
    }

    public static int task9562(int a, int b) {
        int n;
        int i;
        if (a > b){
            i = b;
            n = a;
        } else {
            i = a;
            n = b;
        }
        int sum = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }

    public static long task3669(int a, int b) {
        long mul = 1;
        long i, n;
        if (a < b) {
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while (i <= n){
            mul *= i;
            i++;
        }
        return mul;
    }

    public static int task5951(){
        int i = 20;
        int n = 40;
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        return sum;
    }

    public static double task2802(int n) throws Exception {
        if (n <= 0){
            throw new Exception("Значение N должно быть положительным");
        }
        int i = 1;
        double sum = 0;
        while (i <= n){
            sum += 1.0/i;
            i++;
        }
        return sum;
    }
    public static int task2324(String str)
    {
        String[] raw = str.split(" ");
        int sum = 0;
        int i = 0;
        int current;
        do
        {
            current = Integer.parseInt(raw[i]);
            sum += current;
            i++;
        }
        while (current != 0);
        return sum;
    }

    public static int task8731(String str)
    {
        String[] raw = str.split(" ");
        int sum = 0;
        int index = 0;
        int current;
        do
        {
            current = Integer.parseInt(raw[index]);
            sum += current;
            index++;
        }
        while (sum <= 1000);
        return index;
    }

    public static String task4082(String str)
    {
        String[] raw = str.split(" ");
        int leftSum = 0;
        int rightSum = 0;
        int current;
        int i = 0;
        do
        {
            current = Integer.parseInt(raw[i]);
            if (current <= 83)
            {
                leftSum += current;
            }
            else if (current >= 199)
            {
                rightSum += current;
            }
            else
            {
                break;
            }
            i++;
        }
        while (true);
        return String.format("Сумма слева: %d, сумма справа: %d", leftSum, rightSum);
    }

    public static long task6580(int a, int b){
        int i, n;
        long sum = 0;
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        while (i <= n){
            sum += i*i;
            i++;
        }
        return sum;
    }

    public static StringBuilder task7585(StringBuilder sb, int x) {
        int i = 10;
        while (i <= 20){
            sb.append(i);
            if (i == x){
                sb.append("+");
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task1483(StringBuilder sb, int n) throws Exception {
        if (n < 0){
            throw new Exception("Значение N должно быть неотрицательным");
        }
        int i = 1;
        while (i <= n){
            sb.append("!");
            if (i%5 == 0){
                sb.append(" ");
            }
            i++;
        }
        return sb;
    }

    public static StringBuilder task3983(StringBuilder sb, int n) throws Exception {
        if (n < 0){
            throw new Exception("Значение N должно быть неотрицательным");
        }
        int i = 1;
        while (i <= n){
            sb.append("#");
            if (i%20 == 0){
                sb.append("\n");
            }
            i++;
        }
        return sb;
    }

    public static StringBuilder task8770(StringBuilder sb, int x) {
        int i = 30;
        while (i <= 40){
            sb.append(i);
            if (i == x){
                sb.append("+");
            } else {
                sb.append("-");
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task4236(StringBuilder sb, int y) throws Exception {
        if (y < 0 || y > 15){
            throw new Exception("Значение Y должно быть в интервале [0, 15]");
        }
        int i = 0;
        while (i < y){
            sb.append("#");
            i++;
        }
        while (i < 15){
            sb.append(".");
            i++;
        }
        return sb;
    }

    public static int task5969(int a, int b){
        int i, n;
        if (a < b){
            i = a;
            n = b;
        } else {
            i = b;
            n = a;
        }
        int sum = 0;
        while (i <= n){
            if (i%7 == 0){
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static int task8696(){
        int i = 100, n = 1000;
        int count = 0;
        while(i <= n){
            if (i%13 == 0){
                count++;
            }
            i++;
        }
        return count;
    }

    public static List<Integer> task8418(int x) throws Exception {
        if (x <= 0){
            throw new Exception("Значение X должно быть положительным");
        }
        int i = 1;
        List<Integer> ret = new ArrayList<>();
        while (i < x/2+1){
            if (x%i == 0){
                ret.add(i);
            }
            i++;
        }
        return ret;
    }

    public static boolean task5170(int y) throws Exception {
        if (y <= 0){
            throw new Exception("Значение Y должно быть положительным");
        }
        int i = 2;
        while (i < y/2+1){
            if (y%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static StringBuilder task8395(StringBuilder sb, int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Значение W должно быть в интервале [0, 20]");
        }
        for (int i = 0; i < w; i++){
            sb.append("a");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("b");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("c");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("d");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("e");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("f");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("g");
        }
        sb.append("\n");
        for (int i = 0; i < w; i++){
            sb.append("h");
        }
        return sb;
    }

    public static StringBuilder task5568(StringBuilder sb, int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Значение W должно быть в интервале [0, 20]");
        }
        int i = 0;
        while (i <= 9){
            int j = 0;
            while (j < w){
                sb.append(i);
                j++;
            }
            sb.append("\n");
            i++;
        }
        return sb;
    }

    public static StringBuilder task2592(StringBuilder sb, String s, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                sb.append(s);
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task4075(StringBuilder sb, int w) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (w < 2){
            return sb.append("\n\n");
        }
        sb.append("+");
        for (int i = 1; i < w-1; i++){
            sb.append("-");
        }
        sb.append("+\n|");
        for (int i = 1; i < w-1; i++){
            sb.append(".");
        }
        sb.append("|\n+");
        for (int i = 1; i < w-1; i++){
            sb.append("-");
        }
        sb.append("+");
        return sb;
    }

    public static StringBuilder task7517(StringBuilder sb, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        sb.append(" ");
        for (int i = 0; i < w; i++){
            sb.append(i);
        }
        sb.append("\n");
        for (int j = 0; j < h; j++){
            sb.append(j);
            for (int i = 0; i < w; i++){
                sb.append(" ");
            }
            sb.append("|\n");
        }
        sb.append(" ");
        for (int i = 0; i < w; i++){
            sb.append("-");
        }
        return sb;
    }

    public static StringBuilder task5448(StringBuilder sb, String s, int h) throws Exception {
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        for (int i = 1; i <= h; i++){
            for (int j = 0; j < i; j++){
                sb.append(s);
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task6572(StringBuilder sb, int a, int b){
        int i = 0, n, min;
        if (a < b){
            n = b - a;
            min = a;
        } else {
            n = a - b;
            min = b;
        }
        if (min%2 == 0){
            min ++;
        }
        while(i <= n){
            for (int j = 0; j < i/2; j++){
                sb.append(".");
            }
            sb.append(i+min);
            sb.append("\n");
            i += 2;
        }
        return sb;
    }

    public static StringBuilder task5238(StringBuilder sb, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            int j = 0;
            while (j < w - i){
                sb.append("+");
                j++;
            }
            while (j < w){
                sb.append("#");
                j++;
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task2084(StringBuilder sb, int a, int b){
        if (a == b){
            return sb.append(a);
        } else if (a < b){
            int i = a + 2;
            if (a%2 == 0) {
                sb.append(a + 1);
                i++;
            } else {
                sb.append(a);
            }
            while (i <= b){
                sb.append(", ");
                sb.append(i);
                i+=2;
            }
            return sb;
        } else {
            int i = a - 2;
            if (a%2 == 0) {
                sb.append(a - 1);
                i--;
            } else {
                sb.append(a);
            }
            while (i >= b){
                sb.append(", ");
                sb.append(i);
                i-=2;
            }
            return sb;
        }
    }

    public static StringBuilder task5411(StringBuilder sb, int p, int q){
        int i = 1, n, min;
        if (p < q){
            min = p;
            n = q - p;
        } else {
            min = q;
            n = p - q;
        }
        sb.append(min);
        while (i <= n/2){
            sb.append("&lt;");
            sb.append(i+min);
            i++;
        }
        while (i <= n){
            sb.append("&gt;");
            sb.append(i+min);
            i++;
        }
        return sb;
    }

    public static StringBuilder task5171(StringBuilder sb, String s1, String s2, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (i%2 == 0){
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task1862(StringBuilder sb, String s1, String s2, int w, int h) throws Exception {
        if (w < 0){
            throw new Exception("Значение W должно быть неотрицательно");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательно");
        }
        if (w == 0 || h == 0){
            return sb;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (j%2 == 0){
                    sb.append(s1);
                } else {
                    sb.append(s2);
                }
            }
            sb.append("\n");
        }
        return sb;
    }
}
