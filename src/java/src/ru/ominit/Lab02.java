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
                System.out.println(lab2task2361(inputs2361t[i], inputs2361l[i]));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println(lab2task5063(365));
        System.out.println(lab2task5063(45));
        System.out.println(lab2task5063(1125));
        System.out.println(lab2task5063(1500));
        System.out.println(lab2task5063(2000));
        System.out.println(lab2task5063(0));
        System.out.println(lab2task5063(360));
        System.out.println();
        System.out.printf("%.6f\n",lab2task7711(45) - 0.7071);
        System.out.printf("%.6f\n",lab2task7711(1125) - 0.7071);
        System.out.printf("%.6f\n",lab2task7711(7639) - 0.9816);
        System.out.printf("%.6f\n",lab2task7711(360) - 0.0000);
        System.out.printf("%.6f\n",lab2task7711(90) - 1.0000);
        System.out.println();
        int[] inputs8833 = {7606, 9, 0, -7603};
        double[] outs8833 = {87.2124, 3.0000, 0, 0};
        for (int i = 0; i < inputs8833.length; i++){
            try {
                System.out.printf("%.6f\n",lab2task8833(inputs8833[i]) - outs8833[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.printf("%.6f\n",lab2task1262(7583) - 4.6025);
        System.out.printf("%.6f\n",lab2task1262(200) - -4.6985);
        System.out.printf("%.6f\n",lab2task1262(360) - 5);
        System.out.printf("%.6f\n",lab2task1262(90) - 0);
        System.out.println();
        int[] inputs9020 = {7573, 75, 0, -9};
        double[] outs9020 = {261.0690, 25.9808, 0, 0};
        for (int i = 0; i < inputs9020.length; i++){
            try {
                System.out.printf("%.6f\n",lab2task9020(inputs9020[i]) - outs9020[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs1934a = {6047, -3, 0, 6221};
        int[] inputs1934b = {-6011, -7, -50, 6373};
        double[] outs1934 = {1240401.6995, -21.0000, 0.0000, 0};
        for (int i = 0; i < inputs1934a.length; i++){
            try {
                System.out.printf("%.6f\n",lab2task1934(inputs1934a[i],inputs1934b[i]) - outs1934[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        double[] inputs7237 = {0, 20, 40, -273.15, -300};
        double[] outs7237 = {32, 68, 104, -439.67, 0};
        for (int i = 0; i < inputs7237.length; i++){
            try {
                System.out.printf("%.6f\n", lab2task7237(inputs7237[i]) - outs7237[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs3943x = {-5, 7507, 7489, -7481};
        int[] inputs3943y = {81, 7499, -7487, 7477};
        double[] outs3943 = {-10, -435.7062, 0, 0};
        for (int i = 0; i < inputs3943x.length; i++){
            try {
                System.out.printf("%.6f\n", lab2task3943(inputs3943x[i], inputs3943y[i]) - outs3943[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        int[] inputs7619v1 = {31,0,-13,67};
        int[] inputs7619v2 = {47,7,11,-79};
        int[] inputs7619s = {6833, 6829, 200, 400};
        double[] outs7619 = {87.6026, 975.5714,0,0};
        for (int i = 0; i < inputs7619v1.length;i++){
            try {
                System.out.printf("%.6f\n", lab2task7619(inputs7619v1[i], inputs7619v2[i], inputs7619s[i]) - outs7619[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println(lab2task3832(7451, 7433, 7417) - 165777911);
        System.out.println(lab2task3832(3, 7, 11) - 131);
        System.out.println(lab2task3832(-2, -2029, 0) - 4058);
        System.out.println();
        System.out.printf("%.6f\n",lab2task1346(7411,7433,7417) - 204947815919.5);
        System.out.printf("%.6f\n",lab2task1346(3,7,1) - 290.5);
        System.out.println();
        System.out.println(lab2task9622(7351, 7349, 7333));
        System.out.println(lab2task9622(19, 23, 29));
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

    public static class class2361{
        public int amount;
        public int deficit;

        public class2361(int amount, int deficit){
            this.amount = amount;
            this.deficit = deficit;
        }

        @Override
        public String toString() {
            return amount + " шт и " + deficit + " см";
        }
    }

    public static class2361 lab2task2361(int t, int l) throws Exception {
        if (t <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (l <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        return new class2361(t*100/l, t*100%l);
    }

    public static int lab2task5063(int a){
        return a%360;
    }

    public static double lab2task7711(int x){
        return Math.sin(x*Math.PI/180);
    }

    public static double lab2task8833(int x) throws Exception {
        if (x < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return Math.sqrt(x);
    }

    public static double lab2task1262(int y){
        return 5 * Math.cos(y*Math.PI/180);
    }

    public static double lab2task9020(int x) throws Exception {
        if (x < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return 3 * Math.sqrt(x);
    }
    public static double lab2task1934(int a, int b) throws Exception {
        if (-7*b < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return a*Math.sqrt(-7*b);
    }

    public static double lab2task7237(double t) throws Exception {
        if (t <= -273.15){
            throw new Exception("Сообщение об ошибке");
        }
        return t*1.8+32;
    }

    public static double lab2task3943(int x, int y) throws Exception {
        if (y < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (x+Math.sqrt(y) < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return -5 * Math.sqrt(x + Math.sqrt(y));
    }

    public static double lab2task7619(int v1, int v2, int s) throws Exception {
        if (v1 < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (v2 < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return (double)s / (v1+v2);
    }

    public static int lab2task3832(int x1, int x2, int x3){
        return x1*x2+x1*x3+x2*x3;
    }

    public static double lab2task1346(int v, int t, int a){
        return v*t+a*t*t/2;
    }

    public static class class9622 {
        public double t;
        public double wn;

        public class9622(double t, double wn){
            this.t = t;
            this.wn = wn;
        }

        @Override
        public String toString() {
            return String.format("%.4f %.4f", t, wn);
        }
    }

    public static class9622 lab2task9622(int m, int v, int h){
        double g = 9.8067;
        return new class9622((double)m*v*v/2, (double)m*g*h);
    }
}
