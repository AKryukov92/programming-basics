package ru.ominit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Александр on 31.03.2017.
 */
public class Lab06 {
    public static void main(String[] args) {
        System.out.println("8495");
        task8495();
        System.out.println();
        System.out.println("1315");
        task1315();
        System.out.println();
        System.out.println("6066");
        int[] in6066a = {8, 691, 3000};
        int[] in6066b = {13, 702, 24};
        for (int i = 0; i < in6066a.length; i++){
            try {
                task6066(in6066a[i], in6066b[i]);
                System.out.println();
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
                task2565(in2565a[i], in2565b[i]);
                System.out.println();
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
                task2594(in2594a[i], in2594b[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("2321");
        System.out.println(task2321(8, 13).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task2321(691, 702).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task2321(23, 11).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println();
        System.out.println("5053");
        System.out.println(task5053(8, 13).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task5053(691, 702).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println(task5053(27, 17).stream().map(Object::toString).collect(Collectors.joining(" ")));
        System.out.println();
        System.out.println("3762");
        task3762();
        System.out.println();
        System.out.println("3550");
        task3550();
        System.out.println();
        System.out.println("2475");
        System.out.println(task2475() - 120300);
        System.out.println();
        System.out.println("9180");
        int[] in9180 = {-100, 7, 368, 501, -101};
        int[] outs9180 = {120200, 125229, 57722, 0, 0};
        for (int i = 0; i < in9180.length; i++){
            try {
                System.out.println(task9180(in9180[i]) - outs9180[i]);
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
                System.out.println(task1544(in1544[i]) - outs1544[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
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
        System.out.println(task3669(50, 24));
        System.out.println();
        System.out.println("5951");
        System.out.println(task5951());
        System.out.println();
        System.out.println("2802");
        int[] in2802 = {4, 11, 19, -1, 0};
        double[] out2802 = {2.0833, 3.0198, 3.5477};
        for (int i = 0; i < in2802.length; i++){
            try {
                System.out.printf("%.6f\n", task2802(in2802[i]) - out2802[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("6580");
        System.out.println(task6580(15, 27) - 5915);
        System.out.println(task6580(25, 44) - 24470);
        System.out.println(task6580(80, 100) - 170870);
        System.out.println(task6580(3000, 24) - 414561584);
        System.out.println();
        System.out.println("7585");
        int[] in7585 = {10, 15, 20, 9, 21};
        for (int i = 0; i < in7585.length; i++){
            try {
                task7585(in7585[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("8770");
        int[] in8770 = {30, 37, 40, 8, 100};
        for (int i = 0; i < in7585.length; i++){
            try {
                task8770(in8770[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("4236");
        int[] in4236 = {3, 12, 15, -1, 16};
        for (int i = 0; i < in4236.length; i++){
            try {
                task4236(in4236[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5969");
        System.out.println(task5969(8, 13));
        System.out.println(task5969(25, 44) - 105);
        System.out.println(task5969(80, 100) - 273);
        System.out.println(task5969(300, 24) - 6279);
        System.out.println();
        System.out.println("8696");
        System.out.println(task8696());
        System.out.println();
        System.out.println("8418");
        int[] in8418 = {6, 385, -9};
        for (int i = 0; i < in8418.length; i++){
            try {
                System.out.println(task8418(in8418[i]).stream().map(Object::toString).collect(Collectors.joining(" ")));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5170");
        int[] in5170 = {6, 3219, 7, 2017, -10};
        for (int i = 0; i < in5170.length; i++){
            try {
                System.out.println(task5170(in5170[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("8395");
        int[] in8395 = {1, 13, -1, 21};
        for (int i = 0; i < in8395.length; i++){
            try {
                task8395(in8395[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5568");
        int[] in5568 = {1, 10, -2, 23};
        for (int i = 0; i < in5568.length; i++){
            try {
                task5568(in5568[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("2592");
        String[] in2592s = {"#", "?", "*", "=", "o", "!"};
        int[] in2592w = {5, 7, 90, 0, -2, 20};
        int[] in2592h = {3, 10, 0, 15, 8, -6};
        for (int i = 0; i < in2592s.length; i++){
            try {
                task2592(in2592s[i], in2592w[i], in2592h[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void task8495(){
        int i = 0;
        while (i < 13){
            System.out.print("!");
            i++;
        }
    }

    public static void task1315(){
        int a = 17;
        int b = 47;
        while (a <= b){
            System.out.print(a + " ");
            a++;
        }
    }

    public static void task6066(int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Сообщение об ошибке");
        }
        int i = a;
        while(i <= b){
            System.out.println(i);
            i++;
        }
    }

    public static void task2565(int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Сообщение об ошибке");
        }
        int i = b;
        while(i >= a){
            System.out.print(i + " ");
            i--;
        }
    }

    public static void task2594(int a, String b) throws Exception {
        if (a < 0){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 0;
        System.out.print("\"");
        while(i < a){
            System.out.print(b);
            i++;
        }
        System.out.println("\"");
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

    public static void task3762(){
        int i = 1;
        while (i <= 20){
            System.out.println(i + "\t" + i*453);
            i++;
        }
    }

    public static void task3550(){
        int i = 1;
        while (i <= 9){
            System.out.println(i + " x 7 = " + i*7);
            i++;
        }
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
            throw new Exception("Сообщение об ошибке");
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
            throw new Exception("Сообщение об ошибке");
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
            i = (long) Math.ceil(a);
            n = (long) Math.floor(b);
        } else {
            i = (long) Math.ceil(b);
            n = (long) Math.floor(a);
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
            throw new Exception("Сообщение об ошибке");
        }
        int i = 1;
        double sum = 0;
        while (i <= n){
            sum += 1.0/i;
            i++;
        }
        return sum;
    }

    public static int task6580(int a, int b){
        int i, n;
        int sum = 0;
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

    public static void task7585(int x) throws Exception {
        if (x > 20 || x < 10){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 10;
        while (i <= 20){
            System.out.print(i);
            if (i == x){
                System.out.print("+");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void task8770(int x) throws Exception {
        if (x > 40 || x < 30){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 30;
        while (i <= 40){
            System.out.print(i);
            if (i == x){
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void task4236(int y) throws Exception {
        if (y < 0 || y > 15){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 0;
        while (i < y){
            System.out.print("#");
            i++;
        }
        while (i < 15){
            System.out.print(".");
            i++;
        }
        System.out.println();
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
        while (i < n){
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
            throw new Exception("Сообщение об ошибке");
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

    public static String task5170(int y) throws Exception {
        if (y <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 2;
        while (i < y/2+1){
            if (y%i == 0){
                return "Число не простое";
            }
            i++;
        }
        return "Число простое";
    }

    public static void task8395(int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Сообщение об ошибке");
        }
        for (int i = 0; i < w; i++){
            System.out.print("a");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("b");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("c");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("d");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("e");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("f");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("g");
        }
        System.out.println();
        for (int i = 0; i < w; i++){
            System.out.print("h");
        }
        System.out.println();
    }

    public static void task5568(int w) throws Exception {
        if (w < 0 || w > 20){
            throw new Exception("Сообщение об ошибке");
        }
        int i = 0;
        while (i <= 9){
            int j = 0;
            while (j < w){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void task2592(String s, int w, int h) throws Exception {
        if (w < 0 || h < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (w == 0 || h == 0){
            return;
        }
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
