import java.util.*;

/**
 * Created by Александр on 03.04.2017.
 */
public class Lab07 {
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
            Set<String> result = Lab07.task5541(in5541[i]);
            for (String item : result) {
                sb.append(item);
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    static String task4425(int a, String raw) throws IllegalArgumentException {
        if (raw.isEmpty()) {
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(" ");
        if (a < 0 || a >= arr.length) {
            throw new IllegalArgumentException("Число A должно быть в интервале [0, размер массива)");
        }
        return arr[a];
    }

    static String task5683(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(" ");
            sb.append(i);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static List<String> task1223(String raw) {
        List<String> ret = new ArrayList<>();
        if (raw.isEmpty()) {
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static String task1433(String raw) {
        if (raw.isEmpty()) {
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(";");
        int index = (arr.length-1)/2;
        return String.format("Индекс %d, элемент %s", index, arr[index]);
    }

    public static String task7834(String raw){
        if (raw.isEmpty()){
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(",");
        StringBuilder sb = new StringBuilder();
        int[] indexes = new int[] {0, 2, 3, 5};
        for (int i = 0; i < indexes.length; i++){
            if (arr.length > indexes[i]){
                sb.append(arr[indexes[i]]);
            } else {
                sb.append("Элемент на индексе ");
                sb.append(indexes[i]);
                sb.append(" отсутствует");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static double task3946(String raw) {
        if (raw.length() == 0) {
            return 0;
        }
        String[] arr = raw.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum / arr.length;
    }

    public static double[] task6497(String raw) {
        if (raw.length() == 0) {
            return new double[0];
        }
        String[] arr = raw.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
        }
        double avg = sum / arr.length;
        double[] deltas = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            deltas[i] = Math.abs(Double.parseDouble(arr[i]) - avg);
        }
        return deltas;
    }

    public static double task5648(String raw) {
        if (raw.length() == 0) {
            throw new IllegalArgumentException("Дана пустая последовательность");
        }
        String[] arr = raw.split(" ");
        double[] drr = new double[arr.length];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            drr[i] = Double.parseDouble(arr[i]);
            sum += drr[i];
        }
        double avg = sum / arr.length;
        double sumOfD = 0;
        for (int i = 0; i < arr.length; i++) {
            double d = (drr[i] - avg);
            sumOfD += d * d;
        }
        return Math.sqrt(1.0 / (arr.length - 1.0) * sumOfD);
    }

    public static List<Integer> task3940(String left, String right) throws IllegalArgumentException {
        String[] larr = left.split(" ");
        String[] rarr = right.split(" ");
        if (larr.length != rarr.length) {
            throw new IllegalArgumentException("Размеры массивов должны быть одинаковы");
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < larr.length; i++) {
            int l = Integer.parseInt(larr[i]);
            int r = Integer.parseInt(rarr[i]);
            ret.add(l * r);
        }
        return ret;
    }

    public static List<String> task8311(int b, int e, String raw) throws IllegalArgumentException {
        String[] arr = raw.split(" ");
        if (b < 0 || b >= arr.length) {
            throw new IllegalArgumentException("Число B должно быть в интервале [0, размер массива)");
        }
        if (e < 0 || e >= arr.length) {
            throw new IllegalArgumentException("Число E должно быть в интервале [0, размер массива)");
        }
        List<String> ret = new ArrayList<>();
        int i, n;
        if (b < e) {
            i = b;
            n = e;
        } else {
            i = e;
            n = b;
        }
        while (i <= n) {
            ret.add(arr[i]);
            i++;
        }
        return ret;
    }

    public static List<String> task3134(int p, int q, String raw) throws IllegalArgumentException {
        String[] arr = raw.split(" ");
        if (p < 0 || p >= arr.length) {
            throw new IllegalArgumentException("Число P должно быть в интервале [0, размер массива)");
        }
        if (q < 0 || q >= arr.length) {
            throw new IllegalArgumentException("Число Q должно быть в интервале [0, размер массива)");
        }
        List<String> ret = new ArrayList<>();
        String t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
        for (int i = 0; i < arr.length; i++) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<Integer> task9774(int m, String raw) {
        List<Integer> ret = new ArrayList<>();
        if (raw.isEmpty()) {
            return ret;
        }
        String[] arr = raw.split(" ");
        for (int i = 0; i < arr.length; i++) {
            ret.add(Integer.parseInt(arr[i]) * m);
        }
        return ret;
    }

    public static void task9774(double m, double[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] *= m;
        }
    }

    public static List<String> task9711(String raw) {
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        ret.add(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<String> task3333(int s, String raw) {
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        int ds;
        if (s < 0) {
            ds = -s % arr.length;
        } else {
            ds = arr.length - s % arr.length;
        }
        for (int i = ds; i < arr.length; i++) {
            ret.add(arr[i]);
        }
        for (int i = 0; i < ds; i++) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static String task7085(int s, String raw) {
        String[] arr = raw.split(" ");
        if (s <= 0 || arr.length <= s) {
            throw new IllegalArgumentException("Количество позиций при сдвиге должно быть в интервале [0, длина массива)");
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < s; j++) {
            String t = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = t;
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
                sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static int task7290(int b, String raw) throws IllegalArgumentException {
        String[] arr = raw.split(" ");
        if (b < 0 || b >= arr.length) {
            throw new IllegalArgumentException("Число B должно быть в интервале [0, размер массива)");
        }
        int t = Integer.parseInt(arr[b]);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) < t) {
                count++;
            }
        }
        return count;
    }

    public static StringBuilder task5694(StringBuilder sb, String x) {
        String[] arr = "a b c d e f g h".split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (arr[i].equals(x)) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static StringBuilder task6806(StringBuilder sb, int x) {
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (arr[i] == x) {
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb;
    }

    public static String task8613(String fragmentsRaw, String indexesRaw){
        if (fragmentsRaw.isEmpty()){
            return "Отсутствуют данные о фрагментах";
        }
        if (indexesRaw.isEmpty()){
            return "Отсутствуют данные об индексах";
        }
        String[] fragments = fragmentsRaw.split(" ");
        String[] indexes = indexesRaw.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indexes.length; i++){
            int j = Integer.parseInt(indexes[i]);
            if (fragments.length > j){
                sb.append(fragments[j]);
            } else {
                sb.append("Фрагмент на индексе ");
                sb.append(j);
                sb.append(" отсутствует");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String task7534(String charsRaw, String amountsRaw){
        if (charsRaw.isEmpty()){
            return "Отсутствуют данные о символах";
        }
        if (amountsRaw.isEmpty()){
            return "Отсутствуют данные о количествах";
        }
        String[] chars = charsRaw.split(" ");
        String[] amounts = amountsRaw.split(" ");
        if (chars.length != amounts.length){
            return "Длины массивов не совпадают";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++){
            int amount = Integer.parseInt(amounts[i]);
            for (int j = 0; j < amount; j++){
                sb.append(chars[i]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String task2173(String data){
        if (data.isEmpty()){
            return "Исходная строка пуста";
        }
        if (!data.contains(";")){
            return "Значения отсортированы по возрастанию";
        }
        String[] parts = data.split(";");
        int prev = Integer.parseInt(parts[0]);
        for (int i = 1; i < parts.length; i++){
            int current =  Integer.parseInt(parts[i]);
            if(current < prev){
                return "Элемент со значением " + current + " на индексе " + i + " нарушает закономерность";
            }
            prev = current;
        }
        return "Значения отсортированы по возрастанию";
    }

    public static String task6492(String charsRaw, String amountsRaw){
        if (charsRaw.isEmpty()){
            return "Отсутствуют данные о символах";
        }
        if (amountsRaw.isEmpty()){
            return "Отсутствуют данные о количествах";
        }
        String[] chars = charsRaw.split(" ");
        String[] amountsStr = amountsRaw.split(" ");
        if (chars.length != amountsStr.length){
            return "Длины массивов не совпадают";
        }
        int[] amounts = new int[amountsStr.length];
        for (int i = 0; i < amountsStr.length; i++){
            amounts[i] = Integer.parseInt(amountsStr[i]);
        }
        int max = amounts[0];
        for (int i = 1; i < amounts.length; i++) {
            if (max < amounts[i]){
                max = amounts[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++){
            for (int j = 0; j < chars.length; j++){
                if (i < amounts[j]){
                    sb.append(chars[j]);
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String task7369(String leftRaw, String topRaw) {
        if (leftRaw.isEmpty()) {
            return "Данные слева отсутствуют";
        }
        if (topRaw.isEmpty()) {
            return "Данные сверху отсутствуют";
        }
        StringBuilder sb = new StringBuilder();
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        sb.append("  ");
        sb.append(topRaw);
        sb.append("\n");
        for (int i = 0; i < leftArr.length; i++) {
            sb.append(leftArr[i]);
            for (int j = 0; j < topArr.length; j++) {
                if (leftArr[i].equals(topArr[j])) {
                    sb.append(" +");
                } else {
                    sb.append("  ");
                }
            }
            sb.append("|\n");
        }
        sb.append(" ");
        for (int i = 0; i < topArr.length; i++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public static int task5894(String leftRaw, String topRaw) throws IllegalArgumentException {
        if (leftRaw.isEmpty()) {
            throw new IllegalArgumentException("Данные слева отсутствуют");
        }
        if (topRaw.isEmpty()) {
            throw new IllegalArgumentException("Данные сверху отсутствуют");
        }
        int count = 0;
        String[] leftArr = leftRaw.split(" ");
        String[] topArr = topRaw.split(" ");
        for (int i = 0; i < leftArr.length; i++) {
            for (int j = 0; j < topArr.length; j++) {
                if (leftArr[i].equals(topArr[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean task4515(String raw) {
        String[] arr = raw.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
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
        for (int i = 1; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            sb.append("\nСравниваю ");
            sb.append(min);
            sb.append(" и ");
            sb.append(current);
            if (current < min) {
                sb.append("\nЗаменяю");
                min = current;
            }
        }
        sb.append("\nВ массиве {");
        sb.append(raw);
        sb.append("} минимальный элемент это ");
        sb.append(min);
        return sb.toString();
    }

    public static List<Integer> task9271(String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        if (arr.length == 0) {
            return ret;
        }
        int min = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ret.add(Integer.parseInt(arr[i]) - min);
        }
        return ret;
    }

    public static void task9271(double[] arr){
        double min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] -= min;
        }
    }

    public static String task8769(int p, int q, String raw) throws IllegalArgumentException {
        String[] arr = raw.split(" ");
        int i, n;
        if (p < 0 || p >= arr.length) {
            throw new IllegalArgumentException("Число P должно быть в интервале [0, размер массива)");
        }
        if (q < 0 || q >= arr.length) {
            throw new IllegalArgumentException("Число Q должно быть в интервале [0, размер массива)");
        }
        if (p < q) {
            i = p;
            n = q;
        } else {
            i = q;
            n = p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Фрагмент массива:");
        int min = Integer.parseInt(arr[i]);
        while (i <= n) {
            sb.append(" ");
            sb.append(arr[i]);
            int current = Integer.parseInt(arr[i]);
            if (current < min) {
                min = current;
            }
            i++;
        }
        sb.append("\nМинимальное среди них: ");
        sb.append(min);
        return sb.toString();
    }

    public static List<Integer> task4497(int x, int y, String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int current = Integer.parseInt(arr[i]);
            if (current == x) {
                ret.add(y);
            } else {
                ret.add(current);
            }
        }
        return ret;
    }

    public static List<String> task8820(String raw) {
        String[] arr = raw.split(" ");
        List<String> ret = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            ret.add(arr[i]);
        }
        return ret;
    }

    public static List<Integer> task3218(String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        int[] data = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (data[j] < data[min]) {
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

    public static int task4283(int k, String raw) {
        String[] arr = raw.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == k) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> task7703(String raw) {
        String[] arr = raw.split(" ");
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])) {
                    count++;
                }
            }
            ret.add(count);
        }
        return ret;
    }

    public static Set<String> task5541(String raw) {
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }
        return data;
    }

    public static int task9182(String raw) {
        String[] arr = raw.split(" ");
        Set<String> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            data.add(arr[i]);
        }
        return data.size();
    }

    public static String task3095(String raw){
        if (raw.isEmpty()){
            throw new IllegalArgumentException("Исходная строка пуста");
        }
        String[] arr = raw.split(",");
        Set<String> data = new HashSet<>(Arrays.asList(arr));
        StringBuilder sb = new StringBuilder();
        data.toArray(arr);
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                sb.append(arr[i]);
                sb.append(arr[j]);
                sb.append("\n");
                sb.append(arr[j]);
                sb.append(arr[i]);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
