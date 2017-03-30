package ru.ominit;

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
        int[] in9562a = {15, 25, 80, 3000};
        int[] in9562b = {27, 44, 100, 24};
        int[] outs9562 = {273, 690, 1890, 0};
        for (int i = 0; i < in9562a.length; i++){
            try {
                System.out.println(task9562(in9562a[i], in9562b[i]) - outs9562[i]);
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

    public static int task9562(int a, int b) throws Exception {
        if (a > b){
            throw new Exception("Сообщение об ошибке");
        }
        int sum = 0, i = a;
        while(i <= b){
            sum += i;
            i++;
        }
        return sum;
    }
}
