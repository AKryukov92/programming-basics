import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Александр on 03.04.2017.
 */
public class Lab08 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("5541");
        String[] in5541 = {
            "1 1 1 1",
            "1 1 2 2",
            "1 1 1 2",
            "1 2 3 4",
            "1 2 3 4 1 2",
            "1 1 3 3 2 2"
        };
        for (int i = 0; i < in5541.length; i++) {
            StringBuilder sb = new StringBuilder();
            Set<String> result = Lab08.task5541(in5541[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static String task4425(int a, String raw) throws Exception {
        if (raw.isEmpty()){
            throw new Exception("Исходная строка пуста");
        }
        String[] arr = raw.split(" ");
        if (a < 0 || a >= arr.length){
            throw new Exception("Число A должно быть в интервале [0, размер массива)");
        }
        return arr[a];
    }

    static String task5683(String str) {
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

    public static List<String> task1223(String raw){
        List<String> ret = new ArrayList<>();
        if (raw.isEmpty()){
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = arr.length - 1; i >= 0; i--){
            ret.add(arr[i]);
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

    public static List<String> task8311(int b, int e, String raw) throws Exception {
        String[] arr = raw.split(" ");
        if (b < 0 || b >= arr.length){
            throw new Exception("Число B должно быть в интервале [0, размер массива)");
        }
        if (e < 0 || e >= arr.length){
            throw new Exception("Число E должно быть в интервале [0, размер массива)");
        }
        List<String> ret = new ArrayList<>();
        int i, n;
        if (b < e){
            i = b;
            n = e;
        } else {
            i = e;
            n = b;
        }
        while(i <= n){
            ret.add(arr[i]);
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
        List<Integer> ret = new ArrayList<>();
        if (raw.isEmpty()){
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = 0; i < arr.length; i++){
            ret.add(Integer.parseInt(arr[i]) * m);
        }
        return ret;
    }

    public static List<String> task9711(String raw){
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        ret.add(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++){
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<String> task3333(int s, String raw){
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        int ds;
        if (s < 0){
            ds = -s%arr.length;
        } else {
            ds = arr.length - s%arr.length;
        }
        for (int i = ds; i < arr.length; i++){
            ret.add(arr[i]);
        }
        for (int i = 0; i < ds; i++){
            ret.add(arr[i]);
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

    public static String task7035(String raw) {
        String[] arr = raw.split(" ");
        int min = Integer.parseInt(arr[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("Ход решения: \nНачинаю с ");
        sb.append(min);
        for (int i = 1; i < arr.length; i++){
            int current = Integer.parseInt(arr[i]);
            sb.append("\nСравниваю ");
            sb.append(min);
            sb.append(" и ");
            sb.append(current);
            if (current < min){
                sb.append("\nЗаменяю");
                min = current;
            }
        }
        sb.append("\nОтвет: ");
        sb.append(min);
        return sb.toString();
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
