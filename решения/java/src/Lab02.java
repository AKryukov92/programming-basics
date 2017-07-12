/**
 * @author akryukov
 *         28.03.2017
 */
public class Lab02 {

    public static void task9701(){
        System.out.println();
        System.out.println("9298");
        int[] in9298 = {1, 5, 0, -2};
        int[] outs9298 = {6, 150, 0, 0};
        for(int i = 0; i < in9298.length; i++){
            try {
                int result = task9298(in9298[i]);
                System.out.printf("%d (%d)\n",result, outs9298[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("3354");
        int[] in3354 = {7, 11, 0, -3};
        int[] outs3354 = {343, 1331, 0, 0};
        for(int i = 0; i < in3354.length; i++){
            try {
                int result = task3354(in3354[i]);
                System.out.printf("%d (%d)\n",result, outs3354[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5201");
        int[] in5201 = {13, 17, 0, -5};
        double[] outs5201 = {81.6814, 106.8142,0,0};
        for (int i = 0; i < in5201.length; i++){
            try {
                double result = task5201(in5201[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5201[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2981");
        int[] in2981 = {19, 23, 0, -7};
        double[] outs2981 = {28730.9120, 50965.0104,0,0};
        for (int i = 0; i < in2981.length; i++){
            try {
                double result = task2981(in2981[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2981[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("4312");
        int[] in4312a = {1,2,0,-2,3};
        int[] in4312h = {1,3,10,1,-4};
        double[] outs4312 = {0.5, 3};
        for (int i = 0; i < in4312a.length; i++){
            try {
                double result = task4312(in4312a[i], in4312h[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs4312[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("8833");
        int[] in8833 = {7606, 9, 0, -7603};
        double[] outs8833 = {87.2124, 3.0000, 0, 0};
        for (int i = 0; i < in8833.length; i++){
            try {
                double result = task8833(in8833[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs8833[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("9020");
        int[] in9020 = {0, -9, 61, 60, 62, 7573, 75};
        double[] outs9020 = {23.4307, 25.0998, 0, 3, 0, 0, 0};
        for (int i = 0; i < in9020.length; i++){
            try {
                double result = task9020(in9020[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs9020[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("1934");
        int[] in1934a = {6047, -3, 0, 13, 6221};
        int[] in1934b = {-6011, -7, -50, 0, 6373};
        double[] outs1934 = {1240401.6995, -21.0000, 0.0000, 0.0000, 0};
        for (int i = 0; i < in1934a.length; i++){
            try {
                double result = task1934(in1934a[i],in1934b[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs1934[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("7237");
        double[] in7237 = { 0, 20.5, 691.9, -273.15, -300 };
        double[] outs7237 = { 32, 68.9, 1277.4200, -459.67, 0 };
        for (int i = 0; i < in7237.length; i++){
            try {
                double result = task7237(in7237[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7237[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("3943");
        int[] in3943x = {-5, 7507, 7489, -7481};
        int[] in3943y = {81, 7499, -7487, 7477};
        double[] outs3943 = {-10, -435.7062, 0, 0};
        for (int i = 0; i < in3943x.length; i++){
            try {
                double result = task3943(in3943x[i], in3943y[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs3943[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("7619");
        int[] in7619v1 = {31,0,-13,67};
        int[] in7619v2 = {47,7,11,-79};
        int[] in7619s = {6833, 6829, 200, 400};
        double[] outs7619 = {87.6026, 975.5714,0,0};
        for (int i = 0; i < in7619v1.length;i++){
            try {
                double result = task7619(
                        in7619v1[i], in7619v2[i], in7619s[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7619[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("8873");
        int[] in8873r1 = {7331, 3, 0, 7309};
        int[] in8873r2 = {7321, 5, 7307, 0};
        double[] outs8873 = {0.0003, 0.5333, 0, 0};
        for (int i = 0; i < in8873r1.length; i++){
            try {
                double result = task8873(in8873r1[i], in8873r2[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs8873[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("9130");
        int[] in9130m1 = {3, 7219, 7193, -5, 10};
        int[] in9130m2 = {7, 7213, 7187, 4, 0};
        int[] in9130r = {13, 7207, 0, 10, 15};
        double[] outs9130 = {9.8312, 1.2186, 0, 0, 0};
        for (int i = 0; i < in9130m1.length; i++){
            try {
                double result = task9130(
                        in9130m1[i], in9130m2[i], in9130r[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs9130[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2461");
        int[] in2461a = {7069, 0, 7019};
        int[] in2461b = {7043, 7043, 7043};
        int[] in2461c = {7039, 7039, 7001};
        int[] in2461d = {7057, 7027, 0};
        double[] outs2461 = {1.9938, 0, 0};
        for (int i = 0; i < in2461a.length; i++){
            try {
                double result = task2461(
                        in2461a[i], in2461b[i],
                        in2461c[i], in2461d[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2461[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2624");
        int[] in2624a = {6991, 11, -6959, 0};
        int[] in2624b = {6983, 13, 6949, 0};
        int[] in2624c = {6977, 17, 6947, 0};
        int[] in2624x = {6961, 19, 6917, 0};
        double[] outs2624 = {0.0, 0.0154, 0, 0};
        for (int i = 0; i < in2624a.length; i++){
            try {
                double result = task2624(
                        in2624a[i], in2624b[i],
                        in2624c[i], in2624x[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs2624[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("5871");
        double[] in5871 = { 6911, 5, 6, 2, 0, -4};
        double[] outs5871 = { 1.0, 0.707107, 0.881127, -1, -1, -1 };
        for (int i = 0; i < in5871.length; i++){
            try {
                double result = task5871(in5871[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs5871[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("3591");
        int[] in3591 = {0,200,6857, -500};
        double[] out3591 = {0, 1606.2378, 11580.2569, -1};
        for(int i = 0; i < in3591.length; i++){
            try {
                double result = task3591(in3591[i]);
                System.out.printf("%.6f (%.6f)\n",result, out3591[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        task9701();

        System.out.println();
        System.out.println("7799");
        int[] in7799mass = {5, 7297, 10, 7, 9, 0};
        int[] in7799a = {45, 30, 90, 91, 100, 30};
        double[] outs7799 = {34.671920, 61972.336135, 0, 0, 0, 0};
        for(int i = 0; i < in7799mass.length; i++){
            try {
                double result = task7799(in7799mass[i], in7799a[i]);
                System.out.printf("%.6f (%.6f)\n", result, outs7799[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("2361");
        int[] in2361t = {400, 103, 300, -800};
        int[] in2361l = {17, 29, -70, 20};
        for (int i = 0; i < in2361l.length;i++){
            try {
                class2361 result = task2361(in2361t[i], in2361l[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9622");
        int[] in9622m = {7351,19,-1,2,3};
        int[] in9622v = {7349,23,4,-5,6};
        int[] in9622h = {7333,29,7,8,-9};
        for (int i = 0; i < in9622m.length; i++){
            try {
                class9622 result = task9622(in9622m[i], in9622v[i], in9622h[i]);
                System.out.println(result.print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("6522");
        int[] in6522v1 = {1, 1, 5, -2, 4};
        int[] in6522t1 = {30, -20, 90, 10, 100};
        int[] in6522v2 = {3, 10, 1, 5, -10};
        int[] in6522t2 = {20, 20, -10, 50, 4};
        for (int i = 0; i < in6522v1.length; i++){
            try {
                class6522 result = task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double task4411(double x){
        return 2*x;
    }

    public static int task9298(int a) throws Exception {
        if (a <= 0){
            throw new Exception("Значение A должно быть положительным");
        }
        return 6 * a * a;
    }

    public static int task3354(int a) throws Exception {
        if (a <= 0){
            throw new Exception("Значение A должно быть положительным");
        }
        return a * a * a;
    }

    public static double task5201(int r) throws Exception {
        if (r <= 0){
            throw new Exception("Значение R должно быть положительным");
        }
        return 2 * Math.PI * r;
    }

    public static double task2981(int r) throws Exception {
        if (r <= 0){
            throw new Exception("Значение R должно быть положительным");
        }
        return 4 * Math.PI * r * r * r / 3;
    }

    public static double task4312(int a, int h) throws Exception{
        if (a <= 0){
            throw new Exception("Значение A должно быть положительным");
        }
        if (h <= 0){
            throw new Exception("Значение H должно быть положительным");
        }
        return (double)a*(double)h/2;
    }

    public static double task8428(int a){
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
        public String toString(){
            return amount + " шт и " + deficit + " см";
        }
    }

    public static class2361 task2361(int t, int l) throws Exception {
        if (t <= 0){
            throw new Exception("Значение T должно быть положительным");
        }
        if (l <= 0){
            throw new Exception("Значение L должно быть положительным");
        }
        return new class2361(t*100/l, t*100%l);
    }

    public static int task5063(int a){
        return a%360;
    }

    public static double task7711(int x){
        return Math.sin(x*Math.PI/180);
    }

    public static double task8833(int x) throws Exception {
        if (x < 0){
            throw new Exception("Значение X должно быть неотрицательным");
        }
        return Math.sqrt(x);
    }

    public static double task1262(int y){
        return 5 * Math.cos(y*Math.PI/180);
    }

    public static double task9020(int x) throws Exception {
        if (x > 61){
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return 3 * Math.sqrt(61-x);
    }

    public static double task1934(int a, int b) throws Exception {
        if (b > 0){
            throw new Exception("Значение B должно быть не положительным");
        }
        return a*Math.sqrt(-7*b);
    }

    public static double task7237(double t) throws Exception {
        if (t < -273.15){
            throw new Exception("Значение T должно быть не ниже абсолютного нуля");
        }
        return t*1.8+32;
    }

    public static double task3943(int x, int y) throws Exception {
        if (y < 0){
            throw new Exception("Значение y должно быть неотрицательным");
        }
        if (x+Math.sqrt(y) < 0){
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return -5 * Math.sqrt(x + Math.sqrt(y));
    }

    public static double task7619(int v1, int v2, int s) throws Exception {
        if (v1 < 0){
            throw new Exception("Значение v1 должно быть неотрицательным");
        }
        if (v2 < 0){
            throw new Exception("Значение v2 должно быть неотрицательным");
        }
        return (double)s / (v1+v2);
    }

    public static int task3832(int x1, int x2, int x3){
        return x1*x2+x1*x3+x2*x3;
    }

    public static double task1346(long v, long t, long a){
        return v*t+a*t*t/2.0;
    }

    public static class class9622 {
        public double t;
        public double wn;

        public class9622(double t, double wn){
            this.t = t;
            this.wn = wn;
        }

        public String print(){
            return String.format("t %.4f wn %.4f", t, wn);
        }
    }

    public static class9622 task9622(int m, int v, int h) throws Exception {
        if (m <= 0){
            throw new Exception("Значение M должно быть положительным");
        }
        if (v <= 0){
            throw new Exception("Значение V должно быть положительным");
        }
        if (h < 0){
            throw new Exception("Значение H должно быть неотрицательным");
        }
        double g = 9.8067;
        return new class9622((double)m*v*v/2, (double)m*g*h);
    }

    public static double task8873(int r1, int r2) throws Exception {
        if(r1 == 0){
            throw new Exception("Значение r1 должно быть не равно нулю");
        }
        if(r2 == 0){
            throw new Exception("Значение r2 должно быть не равно нулю");
        }
        return 1.0/r1 + 1.0/r2;
    }

    public static double task7799(int m, int a) throws Exception {
        if (m <= 0){
            throw new Exception("Масса должна быть положительной");
        }
        double g = 9.8067;
        if (a >= 90){
            return 0;
        }
        return m*g*Math.cos(a*Math.PI/180);
    }

    public static double task9354(int a, int b, int c){
        return b*b - 4*a*c;
    }

    public static double task9130(int m1, int m2, int distance) throws Exception {
        if(distance <= 0){
            throw new Exception("Значение distance должно быть положительным");
        }
        if(m1 <= 0 || m2 <= 0){
            throw new Exception("Значение mass должно быть положительным");
        }
        double g = 9.8067;
        return g*m1*m2/distance/distance;
    }

    public static double task5895(int a, int b, int c){
        return Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
    }

    public static double task2461(int a, int b, int c, int d) throws Exception {
        if (a == 0){
            throw new Exception("Значение a должно быть не равно нулю");
        }
        if (d == 0){
            throw new Exception("Значение d должно быть не равно нулю");
        }
        return (double)(a*d+b*c)/(a*d);
    }

    public static double task2790(int x){
        double sin = Math.sin(x*Math.PI/180.0);
        return Math.sqrt(1.0-sin*sin);
    }

    public static double task2624(long a, long b, long c, long x) throws Exception {
        if (a*x*x+b*x+c < 0){
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        double denominator = Math.sqrt(a*x*x+b*x+c);
        if (denominator == 0){
            throw new Exception("Знаменатель не может быть равен нулю");
        }
        return 1.0/denominator;
    }

    public static double task5871(double x) throws Exception {
        if (x < 5){
            throw new Exception("Подкоренное выражение должно быть неотрицательным");
        }
        return (Math.sqrt(x+5)+Math.sqrt(x-5))/2/Math.sqrt(x);
    }

    public static double task9164(int a, int b){
        double ar = a*Math.PI/180;
        double br = b*Math.PI/180;
        return Math.sin(ar)*Math.cos(br)+Math.cos(ar)*Math.sin(br);
    }

    public static double task7457(int x){
        return 7*x*x-3*x+6;
    }

    public static double task9865(double a){
        return 12*a*a+7*a-16;
    }

    public static double task3591(int h) throws Exception {
        if (h < 0){
            throw new Exception("Высота над уровнем Земли должна быть неотрицательна");
        }
        double r = 6350;
        double c = r+h;
        return Math.sqrt(c*c-r*r);
    }

    public static double task3558(int a, int b){
        double ar = 2*a*Math.PI/180;
        double br = 3*b*Math.PI/180;
        return 3*Math.sin(ar)*Math.cos(br);
    }

    public static double task4366(int x1, int x2){
        return Math.sqrt(x2*x2+x1*x1);
    }

    public static double task5789(int xa, int ya, int xb, int yb){
        double dx = xb - xa;
        double dy = yb - ya;
        return Math.sqrt(dx*dx+dy*dy);
    }

    public static class class6522 {
        final double v;
        final double t;

        public class6522(double v, double t){
            this.v = v;
            this.t = t;
        }
        @Override
        public String toString(){
            return String.format("v %.4f t %.4f", v, t);
        }
    }

    public static class6522 task6522(int v1, int t1, int v2, int t2) throws Exception {
        if(v1 < 0) {
            throw new Exception("Значение v1 должно быть неотрицательным");
        }
        if(v2 < 0) {
            throw new Exception("Значение v2 должно быть неотрицательным");
        }
        return new class6522(v1+v2, (double)(t1*v1+t2*v2)/(v1+v2));
    }
}
