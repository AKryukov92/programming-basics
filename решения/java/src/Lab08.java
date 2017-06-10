import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Александр on 03.04.2017.
 */
public class Lab08 {
    public static void main(String[] args) {
        task2354();
        task2030();
        task7649();
        task8787();
        task9707();
        System.out.println();
        System.out.println("7369");
        String[] in7369top = {
            "q a z w s x",
            "e d c",
            "a a a a",
            "r f v",
            ""
        };
        String[] in7369left = {
            "q w e",
            "a s d f g h j",
            "a a a a",
            "",
            "z x c v"
        };
        for (int i = 0; i < in7369left.length; i++){
            String result = task7369(in7369left[i], in7369top[i]);
            System.out.println(result);
        }

        System.out.println();
        System.out.println("5894");
        String[] in5894top = {
            "q a z",
            "qw fg hj ty kl",
            "oiuy hjkl vbmn",
            "a s d f",
            ""
        };
        String[] in5894left = {
            "q w e",
            "qw er ty ui op",
            "asdf ghjk",
            "",
            "zxc vbn"
        };
        for (int i = 0; i < in5894left.length; i++){
            try {
                int result = task5894(in5894left[i], in5894top[i]);
                System.out.println("Повторений: " + result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void task2354() {
        System.out.println();
        System.out.println("3946");
        String[] in3946 = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                ""
        };
        double[] out3946 = {2.2, 3, 0};
        for (int i = 0; i < in3946.length; i++) {
            double result = task3946(in3946[i]);
            System.out.printf("%.6f (%.6f)\n", result, out3946[i]);
        }


        System.out.println();
        System.out.println("7035");
        String[] in7035 = {
                "1 2 3 4 5 6",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 8 9",
                "4 4 4 4",
                "4 3"
        };
        int[] out7035 = {1, 1, 2, 3, 4, 3};
        for (int i = 0; i < in7035.length; i++) {
            int result = task7035(in7035[i]);
            System.out.printf("%d (%d)\n", result, out7035[i]);
        }

        System.out.println();
        System.out.println("4283");
        int[] in4283k = {3, 5, 2, 1};
        String[] in4283s = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"
        };
        int[] out4283 = {1, 0, 5, 0};
        for (int i = 0; i < in4283k.length; i++) {
            int result = task4283(in4283k[i], in4283s[i]);
            System.out.printf("%d (%d)\n", result, out4283[i]);
        }

        System.out.println();
        System.out.println("9182");
        String[] in9182 = {
                "1 2 3 4 5 6",
                "1 2 3 1 2 6",
                "1 1 1 1 1 1"
        };
        int[] out9182 = {6, 4, 1};
        for (int i = 0; i < out9182.length; i++) {
            int result = task9182(in9182[i]);
            System.out.printf("%d (%d)\n", result, out9182[i]);
        }
    }

    public static void task2030() {
        System.out.println();
        System.out.println("4515");
        String[] in4515 = {
                "9 8 7 6 5",
                "4 3 2 1 5 6 7 8 9 0",
                "1 2 3 1"
        };
        for (int i = 0; i < in4515.length; i++) {
            if (task4515(in4515[i])) {
                System.out.println("Повторения есть");
            } else {
                System.out.println("Повторений нет");
            }
        }
    }

    public static void task7649(){
        System.out.println();
        System.out.println("5694");
        String[] in5694 = {"a", "d", "h", "i", "z"};
        String[] out5694 = {
            "a+\nb\nc\nd\ne\nf\ng\nh\n",
            "a\nb\nc\nd+\ne\nf\ng\nh\n",
            "a\nb\nc\nd\ne\nf\ng\nh+\n",
            "a\nb\nc\nd\ne\nf\ng\nh\n",
            "a\nb\nc\nd\ne\nf\ng\nh\n"
        };
        for (int i = 0; i < in5694.length; i++) {
            StringBuilder result = task5694(new StringBuilder(), in5694[i]);
            if (out5694[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }

        System.out.println();
        System.out.println("6806");
        int[] in6806 = {10, 15, 20, 9, 23};
        String[] out6806 = {
                "11\n13\n17\n19\n10+\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15+\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20+\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n"
        };
        for (int i = 0; i < in6806.length; i++) {
            StringBuilder result = task6806(new StringBuilder(), in6806[i]);
            if (out6806[i].equals(result.toString())){
                System.out.println("Задача решена верно");
            } else {
                result.insert(0, "Неверно. Результат:\n");
                System.out.println(result.toString());
            }
        }
    }

    public static void task8787(){
        System.out.println();
        System.out.println("1223");
        String[] in1223 = {
                "1 2 3 4 1",
                "1 2 3 4 1 2 3 4 1 2",
                ""
        };
        for (int i = 0; i < in1223.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task1223(in1223[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("3940");
        String[] in3940l = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                "1 2 3",
                "1 2 3"
        };
        String[] in3940r = {
                "2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4",
                "3 4",
                "3 4 1 2"
        };
        for (int i = 0; i < in3940l.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = task3940(in3940l[i], in3940r[i]);
                for (Integer item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("8311");
        int[] in8311b = {0, 3, 2, 8, 11, -1, 8};
        int[] in8311e = {3, 10, 2, 2, 8, 5, 50};
        String[] in8311data = {
                "1 2 3 4 1",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3",
                "1 2 3 4 1 2 3 4 1 2 3"
        };
        for (int i = 0; i < in8311b.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<Integer> result = task8311(
                        in8311b[i], in8311e[i], in8311data[i]);
                for (Integer item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("3134");
        int[] in3134p = {0, 2, 4, -1, 2, 19, 1};
        int[] in3134q = {3, 5, 2, 5, 17, 2, -5};
        String in3134data = "1 2 3 4 1 2";
        for (int i = 0; i < in3134p.length; i++) {
            try {
                StringBuilder sb = new StringBuilder();
                List<String> result = task3134(
                        in3134p[i], in3134q[i], in3134data);
                for (String item : result) {
                    sb.append(item);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("9774");
        int[] in9774m = {31, -3};
        String in9774data = "1 2 3 4 1 2";
        for (int i = 0; i < in9774m.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task9774(in9774m[i], in9774data);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("9711");
        String[] in9711 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 4"
        };
        for (int i = 0; i < in9711.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task9711(in9711[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("3333");
        int[] in3333s = {1, 3, 6, 8, 99, -2, -9};
        String in3333data = "1 2 3 4 1 2";
        for (int i = 0; i < in3333s.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task3333(in3333s[i], in3333data);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("9271");
        String[] in9271 = {
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3"
        };
        for (int i = 0; i < in9271.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task9271(in9271[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("4497");
        int[] in4497x = {1, 3, 5};
        int[] in4497y = {33, 55, 1};
        String in4497data = "1 2 3 4 1 2";
        for (int i = 0; i < in4497x.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task4497(
                    in4497x[i], in4497y[i], in4497data);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("8820");
        String[] in8820 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"
        };
        for (int i = 0; i < in8820.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<String> result = task8820(in8820[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("3218");
        String[] in3218 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3"
        };
        for (int i = 0; i < in3218.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task3218(in3218[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("7703");
        String[] in7703 = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"
        };
        for (int i = 0; i < in7703.length; i++) {
            StringBuilder sb = new StringBuilder();
            List<Integer> result = task7703(in7703[i]);
            for (Integer item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }

        System.out.println();
        System.out.println("5541");
        String[] in5541 = {
                "1 2 3 4 1 2",
                "1 1 3 3 2 2"
        };
        for (int i = 0; i < in5541.length; i++) {
            StringBuilder sb = new StringBuilder();
            Set<String> result = task5541(in5541[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void task9707(){
        System.out.println();
        System.out.println("4425");
        int[] in4425a = {0, 3, 9, 5, -1, 0};
        String[] in4425data = {
                "q w e r",
                "q w e r",
                "q w e r t y u i o p",
                "q w e r",
                "q w e r",
                ""
        };
        String[] out4425 = {"q", "r", "p", "", "", ""};
        for (int i = 0; i < in4425a.length; i++){
            try {
                String result = task4425(in4425a[i], in4425data[i]);
                System.out.printf("%s (%s)\n", result, out4425[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5683");
        String[] in5683 = {
            "qw er ty",
            "qw er ty ui op",
            "asd fgh jkl",
            "",
            "q w e r a s d f z x c v"
        };
        for (int i = 0; i < in5683.length; i++){
            System.out.println(task5683(in5683[i]));
        }

        System.out.println();
        System.out.println("7290");
        int[] in7290b = {3, 2, 0, 4, 7, 1, -5};
        String[] in7290data = {
                "1 1 1 3 4 1",
                "1 2 3 4 1 2",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "1 1 1 3 4 1",
                "1 2 3"
        };
        int[] out7290 = {4, 4, 6, 2, 0, 0, 0, 0};
        for (int i = 0; i < in7290b.length; i++) {
            try {
                int result = task7290(in7290b[i], in7290data[i]);
                System.out.printf("%d (%d)\n", result, out7290[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("8769");
        int[] in8769p = {1, 8, 0, 0, 1, -1, 5};
        int[] in8769q = {3, 10, 5, 5, 7, 0, 10};
        String[] in8769s = {
                "1 2 3 4 1 2",
                "3 4 4 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 2 1",
                "4 4 4 4",
                "4 3",
                "1 2 3 4"
        };
        int[] out8769 = {2, 1, 2, 3, 0, 0, 0};
        for (int i = 0; i < in8769p.length; i++) {
            try {
                int result = task8769(in8769p[i], in8769q[i], in8769s[i]);
                System.out.printf("%d (%d)\n", result, out8769[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String task4425(int a, String raw) throws Exception {
        if (raw.isEmpty()){
            throw new Exception("Исходная строка пуста");
        }
        String[] arr = raw.split(" ");
        if (a < 0 || a >= arr.length){
            throw new Exception("Число A должно быть в интервале [0, размер массива)");
        }
        return arr[a];
    }

    private static String task5683(String str) {
        if (str.isEmpty()){
            return "";
        }
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            sb.append(" ");
            sb.append(i);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static List<Integer> task1223(String raw){
        List<Integer> ret = new ArrayList<>();
        if (raw.length() == 0){
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = arr.length - 1; i >= 0; i--){
            ret.add(Integer.parseInt(arr[i]));
        }
        return ret;
    }

    public static double task3946(String raw){
        if (raw.length() == 0){
            return 0;
        }
        String[] arr = raw.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        return sum/arr.length;
    }

    public static List<Integer> task3940(String left, String right) throws Exception {
        String[] larr = left.split(" ");
        String[] rarr = right.split(" ");
        if (larr.length != rarr.length){
            throw new Exception("Размеры массивов должны быть одинаковы");
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < larr.length; i++){
            int l = Integer.parseInt(larr[i]);
            int r = Integer.parseInt(rarr[i]);
            ret.add(l*r);
        }
        return ret;
    }

    public static List<Integer> task8311(int b, int e, String raw) throws Exception {
        String[] arr = raw.split(" ");
        if (b < 0 || b >= arr.length){
            throw new Exception("Число B должно быть в интервале [0, размер массива)");
        }
        if (e < 0 || e >= arr.length){
            throw new Exception("Число E должно быть в интервале [0, размер массива)");
        }
        List<Integer> ret = new ArrayList<>();
        int i, n;
        if (b < e){
            i = b;
            n = e;
        } else {
            i = e;
            n = b;
        }
        while(i <= n){
            ret.add(Integer.parseInt(arr[i]));
            i++;
        }
        return ret;
    }

    public static List<String> task3134(int p, int q, String raw) throws Exception {
        String[] arr = raw.split(" ");
        if (p < 0 || p >= arr.length ){
            throw new Exception("Число P должно быть в интервале [0, размер массива)");
        }
        if (q < 0 || q >= arr.length){
            throw new Exception("Число Q должно быть в интервале [0, размер массива)");
        }
        List<String> ret = new ArrayList<>();
        String t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
        for (int i = 0; i < arr.length; i++){
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<Integer> task9774(int m, String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--){
            ret.add(Integer.parseInt(arr[i]) * m);
        }
        return ret;
    }

    public static List<Integer> task9711(String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        ret.add(Integer.parseInt(arr[arr.length - 1]));
        for (int i = 0; i < arr.length - 1; i++){
            ret.add(Integer.parseInt(arr[i]));
        }
        return ret;
    }

    public static List<Integer> task3333(int s, String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        int ds;
        if (s < 0){
            ds = -s%arr.length;
        } else {
            ds = arr.length - s%arr.length;
        }
        for (int i = ds; i < arr.length; i++){
            ret.add(Integer.parseInt(arr[i]));
        }
        for (int i = 0; i < ds; i++){
            ret.add(Integer.parseInt(arr[i]));
        }
        return ret;
    }

    public static int task7290(int b, String raw) throws Exception {
        String[] arr = raw.split(" ");
        if (b < 0 || b >= arr.length){
            throw new Exception("Число B должно быть в интервале [0, размер массива)");
        }
        int t = Integer.parseInt(arr[b]);
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (Integer.parseInt(arr[i]) < t){
                count++;
            }
        }
        return count;
    }

    public static StringBuilder task5694(StringBuilder sb, String x){
        String[] arr = "a b c d e f g h".split(" ");
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (arr[i].equals(x)){
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task6806(StringBuilder sb, int x){
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (arr[i] == x){
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static String task7369(String leftRaw, String topRaw){
        if (leftRaw.isEmpty()){
            return "Данные слева отсутствуют";
        }
        if(topRaw.isEmpty()){
            return "Данные сверху отсутствуют";
        }
        StringBuilder sb = new StringBuilder();
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        sb.append("  ");
        sb.append(topRaw);
        sb.append("\n");
        for (int i = 0; i < leftArr.length; i++){
            sb.append(leftArr[i]);
            for (int j = 0; j < topArr.length; j++){
                if(leftArr[i].equals(topArr[j])){
                    sb.append(" +");
                } else {
                    sb.append("  ");
                }
            }
            sb.append("|\n");
        }
        sb.append(" ");
        for(int i = 0; i < topArr.length;i++){
            sb.append("--");
        }
        return sb.toString();
    }

    public static int task5894(String leftRaw, String topRaw) throws Exception {
        if (leftRaw.isEmpty()){
            throw new Exception("Данные слева отсутствуют");
        }
        if(topRaw.isEmpty()){
            throw new Exception("Данные сверху отсутствуют");
        }
        int count = 0;
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        for (int i = 0; i < leftArr.length; i++){
            for (int j = 0; j < topArr.length; j++){
                if(leftArr[i].equals(topArr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean task4515(String raw){
        String[] arr = raw.split(" ");
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].equals(arr[j])){
                    return true;
                }
            }
        }
        return false;
    }

    public static int task7035(String raw) {
        String[] arr = raw.split(" ");
        int min = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++){
            int current = Integer.parseInt(arr[i]);
            if (current < min){
                min = current;
            }
        }
        return min;
    }

    public static List<Integer> task9271(String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        if (arr.length == 0){
            return ret;
        }
        int min = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++){
            int current = Integer.parseInt(arr[i]);
            if (current < min){
                min = current;
            }
        }
        for (int i = 0; i < arr.length; i++){
            ret.add(Integer.parseInt(arr[i]) - min);
        }
        return ret;
    }

    public static int task8769(int p, int q, String raw) throws Exception {
        String[] arr = raw.split(" ");
        int i, n;
        if (p < 0 || p >= arr.length){
            throw new Exception("Число P должно быть в интервале [0, размер массива)");
        }
        if (q < 0 || q >= arr.length){
            throw new Exception("Число Q должно быть в интервале [0, размер массива)");
        }
        if (p < q){
            i = p;
            n = q;
        } else {
            i = q;
            n = p;
        }
        int min = Integer.parseInt(arr[i]);
        while(i <= n){
            int current = Integer.parseInt(arr[i]);
            if (current < min){
                min = current;
            }
            i++;
        }
        return min;
    }

    public static List<Integer> task4497(int x, int y, String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            int current = Integer.parseInt(arr[i]);
            if (current == x){
                ret.add(y);
            } else {
                ret.add(current);
            }
        }
        return ret;
    }

    public static List<String> task8820(String raw){
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--){
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<Integer> task3218(String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        int[] data = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            data[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i; j < arr.length; j++){
                if (data[j] < data[min]){
                    min = j;
                }
            }
            int t = data[min];
            data[min] = data[i];
            data[i] = t;
            ret.add(t);
        }
        return ret;
    }

    public static int task4283(int k, String raw){
        String[] arr = raw.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (Integer.parseInt(arr[i]) == k){
                count++;
            }
        }
        return count;
    }

    public static List<Integer> task7703(String raw){
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[j].equals(arr[i])){
                    count++;
                }
            }
            ret.add(count);
        }
        return ret;
    }

    public static Set<String> task5541(String raw){
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            data.add(arr[i]);
        }
        return data;
    }

    public static int task9182(String raw){
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            data.add(arr[i]);
        }
        return data.size();
    }
}
