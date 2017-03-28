package ru.ominit;

/**
 * @author akryukov
 *         28.03.2017
 */
public class Lab02 {
    public static void main(String[] args) {
        System.out.println(lab2task4411(11.13) - 22.26);
        System.out.println(lab2task4411(-7919) - -15838);
        System.out.println(lab2task4411(0) - 0);
        System.out.println();
        int[] inputs9298 = {1, 5, 0, -2};
        for(int i = 0; i < inputs9298.length; i++){
            try {
                System.out.println(lab2task9298(inputs9298[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs3354 = {7, 11, 0, -3};
        for(int i = 0; i < inputs3354.length; i++){
            try {
                System.out.println(lab2task3354(inputs3354[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs5201 = {13, 17, 0, -5};
        double[] outs5201 = {81.6814, 106.8142,0,0};
        for (int i = 0; i < inputs5201.length; i++){
            try {
                System.out.printf("%.6f\n",lab2task5201(inputs5201[i]) - outs5201[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs2981 = {19, 23, 0, -7};
        double[] outs2981 = {28730.9120, 50965.0104,0,0};
        for (int i = 0; i < inputs2981.length; i++){
            try {
                System.out.printf("%.6f\n",lab2task2981(inputs2981[i]) - outs2981[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs4312a = {1,2,0,-2,3};
        int[] inputs4312h = {1,3,10,1,-4};
        double[] outs4312 = {0.5, 3};
        for (int i = 0; i < inputs4312a.length; i++){
            try {
                System.out.printf("%.6f\n", lab2task4312(inputs4312a[i], inputs4312h[i]) - outs4312[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.printf("%.6f\n", lab2task8428(45) - 0.7854);
        System.out.printf("%.6f\n", lab2task8428(1125) - 19.6350);
        System.out.printf("%.6f\n", lab2task8428(0));
        System.out.printf("%.6f\n", lab2task8428(360) - 6.2832);
        System.out.printf("%.6f\n", lab2task8428(90) - 1.5708);
        System.out.printf("%.6f\n", lab2task8428(2000) - 34.9066);
        System.out.println();

        int[] inputs2361t = {400, 103, 300, -800};
        int[] inputs2361l = {17, 29, -70, 20};
        for (int i = 0; i < inputs2361l.length;i++){
            try {
                lab2task2361(inputs2361t[i], inputs2361l[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }

    public static double lab2task4411(double x){
        return 2*x;
    }

    public static int lab2task9298(int a) throws Exception {
        if (a <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 6 * a * a;
    }

    public static int lab2task3354(int a) throws Exception {
        if (a <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return a * a * a;
    }

    public static double lab2task5201(int r) throws Exception {
        if (r <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 2 * Math.PI * r;
    }

    public static double lab2task2981(int r) throws Exception {
        if (r <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 4 * Math.PI * r * r * r / 3;
    }

    public static double lab2task4312(int a, int h) throws Exception{
        if (a <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (h <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        return (double)a*(double)h/2;
    }

    public static double lab2task8428(int a){
        return a*Math.PI/180;
    }

    public static void lab2task2361(int t, int l) throws Exception {
        if (t <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (l <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        System.out.println(t*100/l + " шт и " + t*100%l + " см");
    }
}
