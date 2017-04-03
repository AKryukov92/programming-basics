package ru.ominit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Александр on 03.04.2017.
 */
public class Lab08 {
    public static void main(String[] args) {
        System.out.println("1223");
        String[] in1223 = {
            "1 2 3 4 1",
            "1 2 3 4 1 2 3 4 1 2",
            ""
        };
        String[] out1223 = {
            "1 4 3 2 1",
            "2 1 4 3 2 1 4 3 2 1",
            ""
        };
        for (int i = 0; i < in1223.length; i++){
            System.out.println(
                task1223(in1223[i])
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "))
                    .equals(out1223[i])
            );
        }
        System.out.println();
        System.out.println("3946");
        String[] in3946 = {
            "1 2 3 4 1",
            "1 2 3 4 1 3 4 4 4 4",
            ""
        };
        double[] out3946 = {2.2, 3, 0};
        for (int i = 0; i < in3946.length; i++){
            System.out.println(task3946(in3946[i]) - out3946[i]);
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
        String[] out3940 = {
            "2 6 12 4 2",
            "3 8 3 8 3 12 4 8 12 16",
            "", ""
        };
        for (int i = 0; i < in3940l.length; i++){
            try {
                System.out.println(
                    task3940(in3940l[i], in3940r[i])
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        .equals(out3940[i])
                );
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
        String[] out8311 = {
            "1 2 3 4",
            "4 1 2 3 4 1 2 3",
            "3",
            "3 4 1 2 3 4 1",
            "", "", ""
        };
        for (int i = 0; i < in8311b.length; i++){
            try {
                System.out.println(
                    task8311(in8311b[i], in8311e[i], in8311data[i])
                        .stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
                        .equals(out8311[i])
                );
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("3134");
        int[] in3134p = {0, 2, 4, -1, 2, 19, 1};
        int[] in3134q = {3, 5, 2, 5, 17, 2, -5};
        String in3134data = "1 2 3 4 1 2";
        String[] out3134 = {
            "4 2 3 1 1 2",
            "1 2 2 4 1 3",
            "1 2 1 4 3 2",
            "", "", "", ""
        };
        for (int i = 0; i < in3134p.length; i++){
            try {
                System.out.println(
                    task3134(in3134p[i], in3134q[i], in3134data)
                        .stream()
                        .collect(Collectors.joining(" "))
                        .equals(out3134[i])
                );
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9774");
        int[] in9774m = {31, -3};
        String in9774data = "1 2 3 4 1 2";
        String[] out9774 = {
            "62 31 124 93 62 31",
            "-6 -3 -12 -9 -6 -3"
        };
        for (int i = 0; i < in9774m.length; i++){
            System.out.println(
                task9774(in9774m[i], in9774data)
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "))
                    .equals(out9774[i])
            );
        }
        System.out.println();
        System.out.println("9711");
        String[] in9711 = {
            "1 2 3 4 1 2",
            "3 4 1 2 3 4 1 2 3 4"
        };
        String[] out9711 = {
            "2 1 2 3 4 1",
            "4 3 4 1 2 3 4 1 2 3"
        };
        for (int i = 0; i < in9711.length; i++){
            System.out.println(
                task9711(in9711[i])
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "))
                    .equals(out9711[i])
            );
        }
        System.out.println();
        System.out.println("3333");
        int[] in3333s = {1, 3, 6, 8, 99, -2, -9};
        String in3333data = "1 2 3 4 1 2";
        String[] out3333 = {
            "2 1 2 3 4 1",
            "4 1 2 1 2 3",
            "1 2 3 4 1 2",
            "1 2 1 2 3 4",
            "4 1 2 1 2 3",
            "3 4 1 2 1 2",
            "4 1 2 1 2 3"
        };
        for (int i = 0; i < in3333s.length; i++){
            System.out.println(
                task3333(in3333s[i], in3333data)
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "))
                    .equals(out3333[i])
            );
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
        for (int i = 0; i < in3333s.length; i++){
            try {
                System.out.println(task7290(in7290b[i], in7290data[i]) - out7290[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
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
        for (int i = 0; i < in5694.length; i++){
            try {
                System.out.println(task5694(in5694[i]).equals(out5694[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
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
        for (int i = 0; i < in6806.length; i++){
            System.out.println(task6806(in6806[i]).equals(out6806[i]));
        }
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
            throw new Exception("Сообщение об ошибке");
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
        if (b < 0 || b >= arr.length || e < 0 || e >= arr.length){
            throw new Exception("Сообщение об ошибке");
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
        if (p < 0 || p >= arr.length || q < 0 || q >= arr.length){
            throw new Exception("Сообщение об ошибке");
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
            throw new Exception("Сообщение об ошибке");
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

    public static String task5694(String x){
        String[] arr = "a b c d e f g h".split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (arr[i].equals(x)){
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String task6806(int x){
        int[] arr = {11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if (arr[i] == x){
                sb.append("+");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
