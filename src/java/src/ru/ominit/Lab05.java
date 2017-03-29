package ru.ominit;

import java.util.ArrayList;
import java.util.List;

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
}
