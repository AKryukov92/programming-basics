package ru.ominit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akryukov
 *         29.03.2017
 */
public class Lab05 {
    public static void main(String[] args) {
        System.out.println("8878");
        System.out.println(task8878(5, 6));
        System.out.println(task8878(11, 7));
        System.out.println(task8878(-2, 3));
        System.out.println(task8878(-13, -18));
        System.out.println();
        System.out.println("3072");
        System.out.println(task3072(173, 179).print());
        System.out.println(task3072(359, 271).print());
        System.out.println(task3072(439, -761).print());
        System.out.println(task3072(0, -15).print());
        System.out.println();
        System.out.println("5980");
        System.out.println(task5980(9) - 3.0);
        System.out.println(task5980(0) - 0.0);
        System.out.println(task5980(-7) - 49.0);
        System.out.println();
        System.out.println("8174");
        System.out.println(task8174(-5) - 5);
        System.out.println(task8174(-11) - 11);
        System.out.println(task8174(7) - 7);
        System.out.println(task8174(13) - 13);
        System.out.println(task8174(0));
        System.out.println();
        double[] in4257l = {0.7, 0.3, 0.05, -2, 300};
        double[] in4257p = {2297, 983, 101, 15, -113};
        for (int i = 0; i < in4257l.length; i++){
            try {
                System.out.println(task4257(in4257l[i], in4257p[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("2291");
        double[] in2291v1 = {0.004, 0.0013, -0.0006, 0.1004};
        int[] in2291v2 = {13000, 5000, 3989, -2891};
        for (int i = 0; i < in2291v1.length; i++){
            try {
                System.out.println(task2291(in2291v1[i], in2291v2[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1763");
        int[] in1763r = {15, 29, -17, 37};
        int[] in1763a = {31, 41, 23, -5};
        for (int i = 0; i < in1763r.length; i++){
            try {
                System.out.println(task1763(in1763r[i], in1763a[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5662");
        System.out.println(task5662(1, 2, 3));
        System.out.println(task5662(3, 17, 5));
        System.out.println(task5662(3, 6, 3));
        System.out.println(task5662(0, 7, 13));
        System.out.println();
        System.out.println("1945");
        System.out.println(task1945(17, 19));
        System.out.println(task1945(13, 19));
        System.out.println(task1945(-20, 4));
        System.out.println(task1945(300, -200));
        System.out.println();
        System.out.println("1186");
        System.out.println();
        double[] in1186x = {6.35, 4.71, 19.99, -2.28, -18.71, 3.44, -0.09};
        double[] in1186y = {2.7, 5.59, -9.57, 16.92, -7.6, -14.98, -16.6};
        double[] in1186z = {5.08, -18.55, 12.75, 6.14, 6.27, -8.26, -1.84};
        double[] result;
        for (int i = 0; i < in1186x.length; i++){
            result = task1186(in1186x[i], in1186y[i], in1186z[i]);
            for (double aResult : result) {
                System.out.printf("%.4f;\t", aResult);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("8715");
        System.out.println(task8715(1, 2, 3));
        System.out.println(task8715(-4, 0, 5));
        System.out.println(task8715(7, 4, -2));
        System.out.println(task8715(0, 5, -7));
        System.out.println(task8715(4, 4, 4));
        System.out.println(task8715(-2, 4, 3));
        System.out.println(task8715(10, 3, 5));
        System.out.println(task8715(5, 1, 7));
        System.out.println();
        System.out.println("8518");
        System.out.println(task8518("a"));
        System.out.println(task8518("d"));
        System.out.println(task8518("h"));
        System.out.println(task8518("i"));
        System.out.println();
        System.out.println("4847");
        System.out.println(task4847(31, 59, 83));
        System.out.println(task4847(19, 19, 41));
        System.out.println(task4847(7, 11, 11));
        System.out.println(task4847(67, -67, 67));
        System.out.println(task4847(1, 1, 1));
        System.out.println();
        System.out.println("7991");
        System.out.println(task7991(6.35, 2.7, 5.08).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task7991(4.71, 2.59, -18.55).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task7991(19.99, -1.57, 2.75).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task7991(-2.28, 16.92, 6.14).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println();
        System.out.println("6291");
        int[] in6291a = {13, 21, 29, 61, 211, -151, 193, -101};
        int[] in6291b = {17, 21, 2, 47, 211, 239, 193, 83};
        int[] in6291c = {14, 37, 29, 47, 211, 239, -3, -101};
        for (int i = 0; i < in6291a.length; i++){
            try {
                System.out.println(task6291(in6291a[i], in6291b[i], in6291c[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("3770");
        System.out.println(task3770(1, 2, 3));
        System.out.println(task3770(7, 4, -2));
        System.out.println(task3770(0, 5, -7));
        System.out.println();
        System.out.println("7178");
        int[] in7178m = {36, 41, 15};
        int[] in7178p = {2, 7, 0};
        for (int i = 0; i < in7178m.length; i++){
            try {
                System.out.println(task7178(in7178m[i],in7178p[i]).print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("3883");
        int[] in3883 = {1234, 9171, 100, 98765};
        for (int i = 0; i < in3883.length; i++){
            try {
                System.out.println(task3883(in3883[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("4527");
        int[] in4527 = {1, 2, 3, 8, -10, 26, 40, 100, -20, 300};
        for (int i = 0; i < in4527.length; i++){
            try {
                System.out.println(task4527(in4527[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("6556");
        int[] in6556a = {3, 13, 23, -2, 3, 13, 6911};
        int[] in6556b = {5, 11, 3, 8, -4, 15, 5881};
        int[] in6556c = {7, 7, 9, 9, 5, -17, 3203};
        int[] in6556d = {9, 19, 11, 7, 6, 19, -4639};
        for (int i = 0; i < in6556a.length; i++){
            try {
                System.out.println(task6556(in6556a[i], in6556b[i], in6556c[i], in6556d[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5635");
        int[] in5635xt = {1, 5, 3, 3, 0, 1, 1, 1, 1};
        int[] in5635yt = {1, 5, 2, 1, -1, 1, 1, 1, 1};
        int[] in5635xp = {0, 0, 0, 0, 0, 2, 2, 2, 2};
        int[] in5635yp = {0, 0, 0, 0, 0, 2, 2, 2, 2};
        int[] in5635h = {2, 2, 2, 2, 1, 0, -1, 3, 3};
        int[] in5635w = {3, 3, 3, 3, 1, 3, 3, 0, -1};
        for (int i = 0; i < in5635xt.length; i++){
            try {
                System.out.println(task5635(in5635xt[i], in5635yt[i], in5635xp[i], in5635yp[i], in5635h[i], in5635w[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("3878");
        int[] in3878xt = {2, 1, 0, 0, 1, -1};
        int[] in3878yt = {2, 3, 0, 1, 1, 1};
        int[] in3878xp1 = {1, 0, 1, 1, 1, 1};
        int[] in3878yp1 = {1, 0, 1, 1, 1, 1};
        int[] in3878xp2 = {3, 2, 2, 2, 2, 2};
        int[] in3878yp2 = {3, 6, 2, 2, 2, 2};
        for (int i = 0; i < in3878xt.length; i++){
            try {
                System.out.println(task3878(in3878xt[i], in3878yt[i], in3878xp1[i], in3878yp1[i], in3878xp2[i], in3878yp2[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1217");
        int[] in1217a1 = {2, 11, 23, 43, 5, 67, 79, 97};
        int[] in1217b1 = {3, 17, 37, 53, 15, 71, 73, 101};
        int[] in1217a2 = {5, 13, 29, 41, 0, 59, 83, 107};
        int[] in1217b2 = {7, 19, 31, 47, 30, 61, 89, 103};
        for (int i = 0; i < in1217a1.length; i++){
            try {
                System.out.println(task1217(in1217a1[i], in1217b1[i], in1217a2[i], in1217b2[i]).print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1438");
        int[] in1438x1 = {10, 25, 102, 500, 60, 100, 150, 100, 5, 105, 150, 0, 200, 125, 100};
        int[] in1435y1 = {10, 25, 200, 200, 70, 100, 150, 0, 0, 5, 150, 0, 200, 138, 100};
        int[] in1435h1 = {200, 200, 100, 100, 120, 200, 150, 100, 10, 10, 50, 802, 100, 0, 120};
        int[] in1435w1 = {100, 200, 200, 200, 200, 200, 300, 500, 10, 10, 300, 200, 100, 1, 220};
        int[] in1435x2 = {50, 225, 0, 10, 50, 200, 150, 0, 0, 100, 100, 0, 900, 205, 220};
        int[] in1435y2 = {50, 225, 500, 400, 50, 200, 150, 200, 5, 0, 100, 0, 200, 202, 100};
        int[] in1435h2 = {300, 200, 100, 100, 120, 50, 150, 700, 10, 10, 300, 610, 100, 61, 120};
        int[] in1435w2 = {350, 200, 120, 120, 200, 50, 300, 100, 10, 30, 200, 610, 10, 62, 220};
        for (int i = 0; i < in1438x1.length; i++){
            try {
                System.out.println(task1438(in1438x1[i], in1435y1[i], in1435h1[i], in1435w1[i], in1435x2[i], in1435y2[i], in1435h2[i], in1435w2[i]).print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("2153");
        int[] in2153t = {13, 44, 60, 0, 61};
        for (int i = 0; i < in2153t.length; i++){
            try {
                System.out.println(task2153(in2153t[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("7937");
        int[] in7937w = {1721, 2473, 0, 877, 1181, 491};
        int[] in7937h = {661, 449, 1879, 0, 1033, 3533};
        int[] in7937c = {11, 23, 1163, 7, 0, 1297};
        int[] in7937d = {7, 11, 109, 19, 127, 0};
        for (int i = 0; i < in2153t.length; i++){
            try {
                System.out.println(task7937(in7937w[i], in7937h[i], in7937c[i], in7937d[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1999");
        int[] in1999x = {-3, -2, -1, -3, -2, -1, -3, -2, -1};
        int[] in1999y = {2, 2, 2, 1, 1, 1, 0, 0, 0};
        for (int i = 0; i < in1999x.length; i++){
            System.out.println(task1999(in1999x[i], in1999y[i]));
        }
        System.out.println();
        System.out.println("4042");
        double[] in4042x = {2, 1, 0, -1, -2};
        double[] in4042y = {2, 1.5, 0, -2, -3};
        for (int i = 0; i < in4042x.length; i++){
            System.out.println(task4042(in4042x[i], in4042y[i]));
        }
        System.out.println();
        System.out.println("6351");
        double[] in6351x = {0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3};
        double[] in6351y = {5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2};
        for (int i = 0; i < in6351x.length; i++){
            System.out.println(task6351(in6351x[i], in6351y[i]));
        }
        System.out.println();
        System.out.println("5382");
        double[] in5382x = {5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0};
        double[] in5382y = {5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        for (int i = 0; i < in5382x.length; i++){
            System.out.println(task5382(in5382x[i], in5382y[i]));
        }
        System.out.println();
        System.out.println("7088");
        double[] in7088x = {0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5};
        double[] in7088y = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, -0.5, -0.5, -0.5, -0.5, -0.5, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2};
        for (int i = 0; i < in7088x.length; i++){
            System.out.println(task7088(in7088x[i], in7088y[i]));
        }
        System.out.println();
        System.out.println("7250");
        double[] in7250x = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        double[] in7250y = {2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2};
        for (int i = 0; i < in7250x.length; i++){
            System.out.println(task7250(in7250x[i], in7250y[i]));
        }
        System.out.println();
        System.out.println("6740");
        double[] in6740x = {0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
        double[] in6740y = {0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1.5, -1.5, -1.5, -1.5, -1.5, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3};
        for (int i = 0; i < in6740x.length; i++){
            System.out.println(task6740(in6740x[i], in6740y[i]));
        }
        System.out.println();
        System.out.println("9038");
        double[] in9038x = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3};
        double[] in9038y = {2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0};
        for (int i = 0; i < in9038x.length; i++){
            System.out.println(task9038(in9038x[i], in9038y[i]));
        }
    }

    public static String task8878(int a, int b){
        if(a < b){
            return "Второе";
        } else {
            return "Первое";
        }
    }

    public static class class3072{
        int max;
        int min;
        public class3072(int max, int min){
            this.max = max;
            this.min = min;
        }
        public String print(){
            return "Максимальное " + max + ", минимальное " + min;
        }
    }

    public static class3072 task3072(int p, int q){
        if (p > q){
            return new class3072(p, q);
        } else {
            return new class3072(q, p);
        }
    }

    public static double task5980(int k){
        if(k > 0){
            return Math.sqrt(k);
        } else {
            return k*k;
        }
    }

    public static int task8174(int a){
        if (a>0){
            return a;
        } else {
            return -a;
        }
    }

    public static String task4257(double l, double p) throws Exception {
        if(l < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if(p < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (l*1000<p*0.305){
            return "Расстояние в километрах меньше";
        } else {
            return "Расстояние в футах меньше";
        }
    }

    public static String task2291(double v1, double v2) throws Exception {
        if (v1 < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (v2 < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (v1*1000*60>v2){
            return "V1 (км/ч) меньше V2 (м/с)";
        } else {
            return "V2 (м/с) меньше V1(км/ч)";
        }
    }

    public static String task1763(int r, int a) throws Exception {
        if (r < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (a < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (Math.PI*r*r < a*a){
            return "Площадь квадрата больше площади круга";
        } else {
            return "Площадь круга больше площади квадрата";
        }
    }

    public static String task5662(int a, int b, int c){
        if (a == 0){
            return "Данное уравнение не является квадратным";
        }
        double d = b*b - 4*a*c;
        if(d > 0){
            return "Вещественных корней уравнения "+ a + "x^2 + " + b + "x + " + c + " = 0 нет";
        } else if (d == 0){
            return "У уравнения "+ a + "x^2 + " + b + "x + " + c + " два вещественных корня";
        } else {
            return "Уравнение 3x^2 + 6x + 3 = 0 имеет один корень";
        }
    }

    public static String task1945(int sc, int ss){
        if (Math.sqrt(sc/Math.PI) < Math.sqrt(ss)/2){
            return "Круг уместится в квадрате";
        } else {
            return "Круг не поместится в квадрате";
        }
    }

    public static double[] task1186(double x, double y, double z){
        return new double[] {
            x > 0 ? x * x : x,
            y > 0 ? y * y : y,
            z > 0 ? z * z : z
        };
    }

    public static String task8715(int a, int b, int c){
        if (a < b && b < c){
            return "Выполняется";
        } else {
            return "Не выполняется";
        }
    }

    public static String task8518(String x){
        String[] chars = {"a","b","c","d","e","f","g","h"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++){
            builder.append(chars[i]);
            if(chars[i].equals(x)){
                builder.append("+");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String task4847(int x, int y, int z){
        if (x == y || y == z || x == z){
            return "Среди чисел есть равные";
        } else {
            return "Числа не равны друг другу";
        }
    }

    public static List<Double> task7991(double x, double y, double z){
        List<Double> ret = new ArrayList<>();
        if (-3 < x && x < 5){
            ret.add(x);
        }
        if (-3 < y && y < 5){
            ret.add(y);
        }
        if (-3 < z && z < 5){
            ret.add(z);
        }
        return ret;
    }

    public static String task6291(int a, int b, int c) throws Exception {
        if (a < 0 || b < 0 || c < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (a == b || a == c || b == c){
            return "Треугольник является равнобедренным.";
        } else {
            return "Треугольник не является равнобедренным.";
        }
    }

    public static int task3770(int x, int y, int z){
        if (x > y && x > z){
            return x;
        }
        if (y > x && y > z){
            return y;
        }
        return z;
    }

    public static class class7178 {
        int quotient;
        boolean empty;
        public class7178(int quotient){
            this.quotient = quotient;
        }
        public class7178(){
            this.empty = true;
        }
        public String print(){
            if (empty){
                return "M не делится нацело на P";
            } else {
                return Integer.toString(quotient);
            }
        }
    }

    public static class7178 task7178 (int m, int p) throws Exception {
        if (p == 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (m%p == 0){
            return new class7178(m/p);
        } else {
            return new class7178();
        }
    }

    public static String task3883(int a) throws Exception {
        if (a < 1000 || a > 9999){
            throw new Exception("Сообщение об ошибке");
        }
        int hundreds = a / 100 % 10;
        int units = a % 10;
        if (hundreds == units){
            return "равно";
        } else {
            return "не равно";
        }
    }

    public static String task4527(int a) throws Exception {
        if (a < -10 || a > 100){
            throw new Exception("Сообщение об ошибке");
        }
        if (a == 40){
            return "40'ой";
        }
        if (a == 0){
            return "0'ой";
        }
        int abs = a < 0 ? -a : a;
        if (abs%10 == 1 || abs%10 == 4 || abs%10 == 5 || abs%10 == 9 || a%10 == 0
                || a == 12 || a == 13 || a == 16 || a == 17 || a == 18){
            return a + "'ый";
        }
        if (abs%10 == 2 || abs%10 == 6 || abs%10 == 7 || abs%10 == 8){
            return a +"'ой";
        }
        if (abs%10 == 3){
            return a + "'ий";
        }
        return Integer.toString(a);
    }

    public static String task6556(int a, int b, int c, int d) throws Exception {
        if (a < 0 || b < 0 || c < 0 || d < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (a < c && b < d){
            return "Размещение возможно";
        } else {
            return "Размещение невозможно";
        }
    }

    public static String task5635(int xt, int yt, int xp, int yp, int h, int w) throws Exception {
        if (h <= 0 || w <= 0 || xt < 0 || yt < 0 || xp < 0 || yp < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (xp < xt && xt < xp+w && yp < yt && yt < yp+w){
            return "точка внутри";
        } else {
            return "точка не внутри";
        }
    }

    public static String task3878(int xt, int yt, int xp1, int yp1, int xp2, int yp2) throws Exception {
        if (xt < 0 || yt < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if ((xt - xp1) / (xp2 - xp1) == (yt - yp1) / (yp2 - yp1)){
            return "Точка принадлежит прямой";
        } else {
            return "Точка не принадлежит прямой";
        }
    }

    public static class class1217{
        int a;
        int b;
        boolean empty = false;

        public class1217(){
            this.empty = true;
        }
        public class1217(int a, int b){
            this.a = a;
            this.b = b;
        }
        public String print(){
            if (this.empty){
                return "не пересекаются";
            } else {
                return "пересекаются (" + a + "; " + b + ")";
            }
        }
    }

    public static class1217 task1217(int a1, int b1, int a2, int b2) throws Exception {
        if (a1 > b1 || a2 > b2){
            throw new Exception("Сообщение об ошибке");
        }
        if (b1 <= a2 || b2 <= a1){
            return new class1217();
        }
        if (a1 < a2 && a2 < b1){
            if (b2 > b1){
                return new class1217(a2, b1);
            } else {
                return new class1217(a2, b2);
            }
        } else {
            if (b2 > b1){
                return new class1217(a1, b1);
            } else {
                return new class1217(a1, b2);
            }
        }
    }

    public static class class1438{
        public final int x;
        public final int y;
        public final int h;
        public final int w;
        public final boolean empty;
        public class1438(int x, int y, int h, int w){
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
            this.empty = false;
        }
        public class1438(){
            this.x = 0;
            this.y = 0;
            this.h = 0;
            this.w = 0;
            empty = true;
        }
        public String print(){
            if (empty){
                return "не пересекаются";
            } else {
                return String.format("{\"x\":%d,\"y\":%d,\"w\":%d,\"h\":%d}", x, y, w, h);
            }
        }
    }

    public static class1438 task1438(int x1, int y1, int h1, int w1, int x2, int y2, int h2, int w2) throws Exception {
        class1217 horizontal = task1217(x1, x1+w1, x2, x2+w2);
        class1217 vertical = task1217(y1, y1+h1, y2, y2+h2);
        if (horizontal.empty || vertical.empty){
            return new class1438();
        }
        return new class1438(horizontal.a, vertical.a, vertical.b - vertical.a, horizontal.b - horizontal.a);
    }

    public static String task2153(int t) throws Exception {
        if (t > 60 || t <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if ((t-1)%5 < 3){
            return "Зеленый";
        } else {
            return "Красный";
        }
    }

    public static String task7937(int w, int h, int c, int d) throws Exception {
        if (w <=0 || h <= 0 || c <= 0 || d <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        int cw = (w/c)*(h/d);
        int ch = (h/c)*(w/d);
        if (cw > ch){
            return cw + " при C вдоль W";
        } else {
            return ch + " при C вдоль H";
        }
    }

    public static boolean task1999(int x, int y){
        return x <= -2 && y >= 1;
    }

    public static boolean task4042(double x, double y){
        return y <= 1.5 && y >= -2;
    }

    public static boolean task6351(double x, double y){
        return y <= 4 && x >= 1 && x <= 2;
    }

    public static boolean task5382(double x, double y){
        return y <= 4 && y >= 2 && x >= 1;
    }

    public static boolean task7088(double x, double y){
        return (x >= 2 && y >= 0) || (x >= 1 && y <= -1);
    }

    public static boolean task7250(double x, double y){
        return x >= 2 && (y >= 1 || y <= -1.5);
    }

    public static boolean task6740(double x, double y){
        return x >= 1 && x <= 3 && y >= -2 && y <= -1;
    }

    public static boolean task9038(double x, double y){
        return x >= 2 || (y <= 1.5 && y >= 0.5);
    }
}
