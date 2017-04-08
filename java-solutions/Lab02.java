/**
 * @author akryukov
 *         28.03.2017
 */
public class Lab02 {

    public static void task2354(){
        System.out.println("4411");
        System.out.println(task4411(11.13) - 22.26);
        System.out.println(task4411(-7919) - -15838);
        System.out.println(task4411(0) - 0);

        System.out.println();
        System.out.println("8428");
        System.out.printf("%.6f\n", task8428(45) - 0.7854);
        System.out.printf("%.6f\n", task8428(1125) - 19.6350);
        System.out.printf("%.6f\n", task8428(0));
        System.out.printf("%.6f\n", task8428(360) - 6.2832);
        System.out.printf("%.6f\n", task8428(90) - 1.5708);
        System.out.printf("%.6f\n", task8428(2000) - 34.9066);

        System.out.println();
        System.out.println("5063");
        System.out.println(task5063(365) - 5);
        System.out.println(task5063(45) - 45);
        System.out.println(task5063(1125) - 45);
        System.out.println(task5063(1500) - 60);
        System.out.println(task5063(2000) - 200);
        System.out.println(task5063(0));
        System.out.println(task5063(360));

        System.out.println();
        System.out.println("7711");
        System.out.printf("%.6f\n",task7711(45) - 0.7071);
        System.out.printf("%.6f\n",task7711(1125) - 0.7071);
        System.out.printf("%.6f\n",task7711(7639) - 0.9816);
        System.out.printf("%.6f\n",task7711(360) - 0.0000);
        System.out.printf("%.6f\n",task7711(90) - 1.0000);

        System.out.println();
        System.out.println("1262");
        System.out.printf("%.6f\n",task1262(7583) - 4.6025);
        System.out.printf("%.6f\n",task1262(200) - -4.6985);
        System.out.printf("%.6f\n",task1262(360) - 5);
        System.out.printf("%.6f\n",task1262(90) - 0);

        System.out.println();
        System.out.println("3832");
        System.out.println(task3832(7451, 7433, 7417) - 165777911);
        System.out.println(task3832(3, 7, 11) - 131);
        System.out.println(task3832(-2, -2029, 0) - 4058);

        System.out.println();
        System.out.println("1346");
        System.out.printf("%.6f\n",task1346(7411,7433,7417) - 204947815919.5);
        System.out.printf("%.6f\n",task1346(3,7,11) - 290.5);

        System.out.println();
        System.out.println("7799");
        System.out.printf("%.6f\n",task7799(7297, 7283) - 8720.9080);
        System.out.printf("%.6f\n",task7799(2659, 0) - 26076.0153);

        System.out.println();
        System.out.println("9354");
        System.out.println(task9354(7247,7243,7229) - -157093203);
        System.out.println(task9354(7,1,3) - -83);

        System.out.println();
        System.out.println("5895");
        System.out.printf("%.6f\n", task5895(7109,7103,7079) - 12369.4955);
        System.out.printf("%.6f\n", task5895(3,7,13) - 4.1324);

        System.out.println();
        System.out.println("2790");
        System.out.printf("%.6f\n", task2790(6997) - 0.9205);
        System.out.printf("%.6f\n", task2790(31) - 0.8572);
        System.out.printf("%.6f\n", task2790(0) - 1.0000);

        System.out.println();
        System.out.println("9164");
        System.out.printf("%.6f\n", task9164(90,90) - 0.0);
        System.out.printf("%.6f\n", task9164(90, 0) - 1.0);
        System.out.printf("%.6f\n", task9164(7559, 7549) - -0.2079);

        System.out.println();
        System.out.println("7457");
        System.out.println(task7457(6883) - 331609180);
        System.out.println(task7457(-6871) - 330495106);
        System.out.println(task7457(0) - 6);

        System.out.println();
        System.out.println("9865");
        System.out.printf("%.6f\n", task9865(6869) - 566245999.0000);
        System.out.printf("%.6f\n", task9865(-6863) - 565161171.0000);
        System.out.printf("%.6f\n", task9865(0) - -16.0000);
        System.out.printf("%.6f\n", task9865(-1.482634) - 0.0000);

        System.out.println();
        System.out.println("3591");
        System.out.printf("%.6f\n", task3591(0) - 0);
        System.out.printf("%.6f\n", task3591(200) - 1606.2378);
        System.out.printf("%.6f\n", task3591(6857) - 11580.2569);

        System.out.println();
        System.out.println("3558");
        System.out.printf("%.6f\n", task3558(45, 90) - 0.0);
        System.out.printf("%.6f\n", task3558(200, 45) - -1.3636);
        System.out.printf("%.6f\n", task3558(7523, 7517) - 1.8148);

        System.out.println();
        System.out.println("4366");
        System.out.printf("%.6f\n", task4366(7459, 7457) - 10547.2048);
        System.out.printf("%.6f\n", task4366(-3, -7) - 7.6158);
        System.out.printf("%.6f\n", task4366(0, 0) - 0.0);

        System.out.println();
        System.out.println("5789");
        System.out.printf("%.6f\n", task5789(1, 1, 3, 4) - 3.6055);
        System.out.printf("%.6f\n", task5789(-2, 4, 8, -10) - 17.2046);
        System.out.printf("%.6f\n", task5789(0, 0, -5, -7) - 8.6023);
        System.out.printf("%.6f\n", task5789(0, 0, 0, 0) - 0);
        System.out.printf("%.6f\n", task5789(-1, -3, 2, 9) - 12.3693);
    }

    public static void main(String[] args) {
        task2354();

        System.out.println();
        System.out.println("9298");
        int[] in9298 = {1, 5, 0, -2};
        int[] outs9298 = {6, 150, 0, 0};
        for(int i = 0; i < in9298.length; i++){
            try {
                System.out.println(task9298(in9298[i]) - outs9298[i]);
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
                System.out.println(task3354(in3354[i]) - outs3354[i]);
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
                System.out.printf("%.6f\n",task5201(in5201[i]) - outs5201[i]);
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
                System.out.printf("%.6f\n",task2981(in2981[i]) - outs2981[i]);
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
                System.out.printf("%.6f\n", task4312(in4312a[i], in4312h[i]) - outs4312[i]);
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
                System.out.println(task2361(in2361t[i], in2361l[i]).print());
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
                System.out.printf("%.6f\n", task8833(in8833[i]) - outs8833[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9020");
        int[] in9020 = {7573, 75, 0, -9};
        double[] outs9020 = {261.0690, 25.9808, 0, 0};
        for (int i = 0; i < in9020.length; i++){
            try {
                System.out.printf("%.6f\n", task9020(in9020[i]) - outs9020[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("1934");
        int[] in1934a = {6047, -3, 0, 6221};
        int[] in1934b = {-6011, -7, -50, 6373};
        double[] outs1934 = {1240401.6995, -21.0000, 0.0000, 0};
        for (int i = 0; i < in1934a.length; i++){
            try {
                System.out.printf("%.6f\n", task1934(in1934a[i],in1934b[i]) - outs1934[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("7237");
        double[] in7237 = {0, 20, 40, -273.15, -300};
        double[] outs7237 = {32, 68, 104, -439.67, 0};
        for (int i = 0; i < in7237.length; i++){
            try {
                System.out.printf("%.6f\n", task7237(in7237[i]) - outs7237[i]);
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
                System.out.printf("%.6f\n", task3943(in3943x[i], in3943y[i]) - outs3943[i]);
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
                System.out.printf("%.6f\n", task7619(in7619v1[i], in7619v2[i], in7619s[i]) - outs7619[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9622");
        System.out.println(task9622(7351, 7349, 7333).print());
        System.out.println(task9622(19, 23, 29).print());
        System.out.println();
        System.out.println("8873");
        int[] in8873r1 = {7331, 3, 0, 7309};
        int[] in8873r2 = {7321, 5, 7307, 0};
        double[] outs8873 = {0.0003, 0.5333, 0, 0};
        for (int i = 0; i < in8873r1.length; i++){
            try {
                System.out.printf("%.6f\n",task8873(in8873r1[i], in8873r2[i]) - outs8873[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("9130");
        int[] in9130y = {7211, 11, 7177};
        int[] in9130m1 = {7219, 3, 7193};
        int[] in9130m2 = {7213, 7, 7187};
        int[] in9130r = {7207, 13, 0};
        double[] outs9130 = {7229.0200, 1.3669, 0};
        for (int i = 0; i < in9130y.length; i++){
            try {
                System.out.printf("%.6f\n", task9130(in9130y[i], in9130m1[i], in9130m2[i], in9130r[i]) - outs9130[i]);
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
                System.out.printf("%.6f\n", task2461(in2461a[i], in2461b[i], in2461c[i], in2461d[i]) - outs2461[i]);
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
                System.out.printf("%.6f\n", task2624(in2624a[i], in2624b[i], in2624c[i], in2624x[i]) - outs2624[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("5871");
        double[] in5871 = {6911, 3, 0.9};
        double[] outs5871 = {1.0, 0.9856, 0};
        for (int i = 0; i < in5871.length; i++){
            try {
                System.out.printf("%.6f\n", task5871(in5871[i]) - outs5871[i]);
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
                System.out.println(task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]).print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double task4411(double x){
        return 2*x;
    }

    public static int task9298(int a) throws Exception {
        if (a <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 6 * a * a;
    }

    public static int task3354(int a) throws Exception {
        if (a <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return a * a * a;
    }

    public static double task5201(int r) throws Exception {
        if (r <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 2 * Math.PI * r;
    }

    public static double task2981(int r) throws Exception {
        if (r <=0){
            throw new Exception("Сообщение об ошибке");
        }
        return 4 * Math.PI * r * r * r / 3;
    }

    public static double task4312(int a, int h) throws Exception{
        if (a <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (h <= 0){
            throw new Exception("Сообщение об ошибке");
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

        public String print(){
            return amount + " шт и " + deficit + " см";
        }
    }

    public static class2361 task2361(int t, int l) throws Exception {
        if (t <= 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (l <= 0){
            throw new Exception("Сообщение об ошибке");
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
            throw new Exception("Сообщение об ошибке");
        }
        return Math.sqrt(x);
    }

    public static double task1262(int y){
        return 5 * Math.cos(y*Math.PI/180);
    }

    public static double task9020(int x) throws Exception {
        if (x < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return 3 * Math.sqrt(x);
    }
    public static double task1934(int a, int b) throws Exception {
        if (-7*b < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return a*Math.sqrt(-7*b);
    }

    public static double task7237(double t) throws Exception {
        if (t <= -273.15){
            throw new Exception("Сообщение об ошибке");
        }
        return t*1.8+32;
    }

    public static double task3943(int x, int y) throws Exception {
        if (y < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (x+Math.sqrt(y) < 0){
            throw new Exception("Сообщение об ошибке");
        }
        return -5 * Math.sqrt(x + Math.sqrt(y));
    }

    public static double task7619(int v1, int v2, int s) throws Exception {
        if (v1 < 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (v2 < 0){
            throw new Exception("Сообщение об ошибке");
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

    public static class9622 task9622(int m, int v, int h){
        double g = 9.8067;
        return new class9622((double)m*v*v/2, (double)m*g*h);
    }

    public static double task8873(int r1, int r2) throws Exception {
        if(r1 == 0){
            throw new Exception("Сообщение об ошибке");
        }
        if(r2 == 0){
            throw new Exception("Сообщение об ошибке");
        }
        return 1.0/r1 + 1.0/r2;
    }

    public static double task7799(int m, int a){
        double g = 9.8067;
        return m*g*Math.cos(a*Math.PI/180);
    }

    public static double task9354(int a, int b, int c){
        return b*b - 4*a*c;
    }

    public static double task9130(int y, int m1, int m2, int r) throws Exception {
        if(r == 0){
            throw new Exception("Сообщение об ошибке");
        }
        return y*m1*m2/r/r;
    }

    public static double task5895(int a, int b, int c){
        return Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
    }

    public static double task2461(int a, int b, int c, int d) throws Exception {
        if (a == 0){
            throw new Exception("Сообщение об ошибке");
        }
        if (d == 0){
            throw new Exception("Сообщение об ошибке");
        }
        return (double)(a*d+b*c)/(a*d);
    }

    public static double task2790(int x){
        double sin = Math.sin(x*Math.PI/180.0);
        return Math.sqrt(1.0-sin*sin);
    }

    public static double task2624(long a, long b, long c, long x) throws Exception {
        if (a*x*x+b*x+c < 0){
            throw new Exception("Сообщение об ошибке");
        }
        double denominator = Math.sqrt(a*x*x+b*x+c);
        if (denominator == 0){
            throw new Exception("Сообщение об ошибке");
        }
        return 1.0/denominator;
    }

    public static double task5871(double x) throws Exception {
        if (x < 1){
            throw new Exception("Сообщение об ошибке");
        }
        return (Math.sqrt(x+1)+Math.sqrt(x-1))/2/Math.sqrt(x);
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

    public static double task3591(int h){
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
        public String print(){
            return String.format("v %.4f t %.4f", v, t);
        }
    }

    public static class6522 task6522(int v1, int t1, int v2, int t2) throws Exception {
        if(v1 < 0) {
            throw new Exception("Сообщение об ошибке");
        }
        if(v2 < 0) {
            throw new Exception("Сообщение об ошибке");
        }
        return new class6522(v1+v2, (double)(t1*v1+t2*v2)/(v1+v2));
    }
}
