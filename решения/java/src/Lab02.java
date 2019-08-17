/**
 * @author akryukov
 * 28.03.2017
 */
public class Lab02 {

    public static void main(String[] args) {
        step2801();
    }

    public static void step2801() {
        System.out.println();
        System.out.println("2801");
        task2801(1234, 11);
        task2801(5, 13);
        task2801(17, 17);
        task2801(0, 23);
        task2801(4, 0);
    }

    public static void step2361() {
        System.out.println();
        System.out.println("2361");
        int[] in2361t = {400, 103, 2, 2, 300, -800};
        int[] in2361l = {17, 29, 12, 313, -70, 20};
        for (int i = 0; i < in2361l.length; i++) {
            try {
                class2361 result = task2361(in2361t[i], in2361l[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void step9622() {
        System.out.println();
        System.out.println("9622");
        int[] in9622m = {7351, 19, -1, 2, 3};
        int[] in9622v = {7349, 23, 4, -5, 6};
        int[] in9622h = {7333, 29, 7, 8, -9};
        for (int i = 0; i < in9622m.length; i++) {
            try {
                class9622 result = task9622(in9622m[i], in9622v[i], in9622h[i]);
                System.out.println(result.print());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void step6522() {
        System.out.println();
        System.out.println("6522");
        int[] in6522v1 = {1, 1, 5, -2, 4};
        int[] in6522t1 = {30, -20, 90, 10, 100};
        int[] in6522v2 = {3, 10, 1, 5, -10};
        int[] in6522t2 = {20, 20, -10, 50, 4};
        for (int i = 0; i < in6522v1.length; i++) {
            try {
                class6522 result = task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String task5870(int timeInSeconds) {
        if (timeInSeconds < 0) {
            throw new IllegalArgumentException("Количество времени должно быть неотрицательным");
        }
        int h = timeInSeconds / 3600;
        int m = timeInSeconds / 60 % 60;
        int s = timeInSeconds % 60;
        return String.format("%d часов %d минут %d секунд", h, m, s);
    }

    public static double task4411(double x) {
        return x + 7;
    }

    public static int task9298(int a) throws IllegalArgumentException {
        if (a <= 0) {
            throw new IllegalArgumentException("Значение A должно быть положительным");
        }
        return 6 * a * a;
    }

    public static int task3354(int a) throws IllegalArgumentException {
        if (a <= 0) {
            throw new IllegalArgumentException("Значение A должно быть положительным");
        }
        return a * a * a;
    }

    public static double task5201(int r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Значение R должно быть положительным");
        }
        return 2 * Math.PI * r;
    }

    public static double task2981(int r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Значение R должно быть положительным");
        }
        return 4 * Math.PI * r * r * r / 3;
    }

    public static double task4312(int a, int h) throws IllegalArgumentException {
        if (a <= 0) {
            throw new IllegalArgumentException("Длина основания треугольника должна быть положительна");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("Высота треугольника должна быть положительна");
        }
        return (double) a * (double) h / 2;
    }

    public static double task8428(int a) {
        return a * Math.PI / 180;
    }

    public static class class2361 {
        public int amount;
        public int deficit;

        public class2361(int amount, int deficit) {
            this.amount = amount;
            this.deficit = deficit;
        }

        @Override
        public String toString() {
            return amount + " шт и " + deficit + " см";
        }
    }

    public static void task2801(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Делитель не может быть равен 0");
            return;
        }
        System.out.printf("Делимое %d, делитель %d, частное %d, остаток %d\n", dividend, divider, dividend / divider, dividend % divider);
    }

    public static class2361 task2361(int t, int l) throws IllegalArgumentException {
        if (t <= 0) {
            throw new IllegalArgumentException("Длина рулона должна быть положительна");
        }
        if (l <= 0) {
            throw new IllegalArgumentException("Расход материала должен быть положительным");
        }
        if (t * 100 < l) {
            throw new IllegalArgumentException("Материала не хватат даже на одно изделие");
        }
        return new class2361(t * 100 / l, t * 100 % l);
    }

    public static int task5063(int a) {
        return a % 360;
    }

    public static double task7711(int x) {
        return Math.sin(x * Math.PI / 180);
    }

    public static double task8833(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Значение X должно быть неотрицательным");
        }
        return Math.sqrt(x);
    }

    public static double task1262(int y) {
        return 5 * Math.cos(y * Math.PI / 180);
    }

    public static double task9020(int x) {
        if (x > 61) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным");
        }
        return 3 * Math.sqrt(61 - x);
    }

    public static double task1934(int a, int b) throws IllegalArgumentException {
        if (b > 0) {
            throw new IllegalArgumentException("Значение B должно быть не положительным");
        }
        return a * Math.sqrt(-7 * b);
    }

    public static double task7237(double t) throws IllegalArgumentException {
        if (t < -273.15) {
            throw new IllegalArgumentException("Значение T должно быть не ниже абсолютного нуля");
        }
        return t * 1.8 + 32;
    }

    public static double task3943(int x, int y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("Значение y должно быть неотрицательным");
        }
        if (x + Math.sqrt(y) < 0) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным");
        }
        return -5 * Math.sqrt(x + Math.sqrt(y));
    }

    public static double task7619(int v1, int v2, int s) throws IllegalArgumentException {
        if (v1 < 0 || v2 < 0) {
            throw new IllegalArgumentException("Скорость должна быть неотрицательна");
        }
        if (s < 0) {
            throw new IllegalArgumentException("Расстояние должно быть неотрицательным");
        }
        return (double) s / (v1 + v2);
    }

    public static int task3832(int x1, int x2, int x3) {
        return x1 * x2 + x1 * x3 + x2 * x3;
    }

    public static double task1346(long v, long t, long a) {
        if (v < 0) {
            throw new IllegalArgumentException("Начальная скорость должно быть неотрицательна");
        }
        if (t <= 0) {
            throw new IllegalArgumentException("Время должно быть положительным");
        }
        return v * t + a * t * t / 2.0;
    }

    public static class class9622 {
        public double t;
        public double wn;

        public class9622(double t, double wn) {
            this.t = t;
            this.wn = wn;
        }

        public String print() {
            return String.format("t %.4f wn %.4f", t, wn);
        }
    }

    public static class9622 task9622(int m, int v, int h) throws IllegalArgumentException {
        if (m <= 0) {
            throw new IllegalArgumentException("Значение M должно быть положительным");
        }
        if (v <= 0) {
            throw new IllegalArgumentException("Значение V должно быть положительным");
        }
        if (h < 0) {
            throw new IllegalArgumentException("Значение H должно быть неотрицательным");
        }
        double g = 9.8067;
        return new class9622((double) m * v * v / 2, (double) m * g * h);
    }

    public static double task8873(int r1, int r2) throws IllegalArgumentException {
        if (r1 == 0) {
            throw new IllegalArgumentException("Значение r1 должно быть не равно нулю");
        }
        if (r2 == 0) {
            throw new IllegalArgumentException("Значение r2 должно быть не равно нулю");
        }
        return 1.0 / r1 + 1.0 / r2;
    }

    public static double task7799(int m, int a) throws IllegalArgumentException {
        if (m <= 0) {
            throw new IllegalArgumentException("Масса должна быть положительной");
        }
        double g = 9.8067;
        if (a >= 90) {
            return 0;
        }
        return m * g * Math.cos(a * Math.PI / 180);
    }

    public static double task9354(int a, int b, int c) {
        if (a == 0) {
            throw new IllegalArgumentException(String.format("Уравнение y=%dx^2+%dx+%d не является квадратным", a, b, c));
        }
        return b * b - 4 * a * c;
    }

    public static double task9130(int m1, int m2, int distance) throws IllegalArgumentException {
        if (distance <= 0) {
            throw new IllegalArgumentException("Значение distance должно быть положительным");
        }
        if (m1 <= 0 || m2 <= 0) {
            throw new IllegalArgumentException("Значение mass должно быть положительным");
        }
        double g = 9.8067;
        return g * m1 * m2 / distance / distance;
    }

    public static double task5895(int a, int b, int c) {
        return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c * Math.PI / 180));
    }

    public static double task2461(int a, int b, int c, int d) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("Значение a должно быть не равно нулю");
        }
        if (d == 0) {
            throw new IllegalArgumentException("Значение d должно быть не равно нулю");
        }
        return (double) (a * d + b * c) / (a * d);
    }

    public static double task2790(int x) {
        double sin = Math.sin(x * Math.PI / 180.0);
        return Math.sqrt(1.0 - sin * sin);
    }

    public static double task2624(long a, long b, long c, long x) throws IllegalArgumentException {
        if (a * x * x + b * x + c < 0) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным");
        }
        double denominator = Math.sqrt(a * x * x + b * x + c);
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        return 1.0 / denominator;
    }

    public static double task5871(double x) throws IllegalArgumentException {
        if (x < 5) {
            throw new IllegalArgumentException("Подкоренное выражение должно быть неотрицательным");
        }
        return (Math.sqrt(x + 5) + Math.sqrt(x - 5)) / 2 / Math.sqrt(x);
    }

    public static double task9164(int a, int b) {
        double ar = a * Math.PI / 180;
        double br = b * Math.PI / 180;
        return Math.sin(ar) * Math.cos(br) + Math.cos(ar) * Math.sin(br);
    }

    public static double task7457(int x) {
        return 7 * x * x - 3 * x + 6;
    }

    public static double task9865(double a) {
        return 12 * a * a + 7 * a - 16;
    }

    public static double task3591(int h) throws IllegalArgumentException {
        if (h < 0) {
            throw new IllegalArgumentException("Высота над уровнем Земли должна быть неотрицательна");
        }
        double r = 6350;
        double c = r + h;
        return Math.sqrt(c * c - r * r);
    }

    public static double task3558(int a, int b) {
        double ar = 2 * a * Math.PI / 180;
        double br = 3 * b * Math.PI / 180;
        return 3 * Math.sin(ar) * Math.cos(br);
    }

    public static double task4366(int x1, int x2) {
        return Math.sqrt(x2 * x2 + x1 * x1);
    }

    public static double task5789(int xa, int ya, int xb, int yb) {
        double dx = xb - xa;
        double dy = yb - ya;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static class class6522 {
        final double v;
        final double t;

        public class6522(double v, double t) {
            this.v = v;
            this.t = t;
        }

        @Override
        public String toString() {
            return String.format("v %.4f t %.4f", v, t);
        }
    }

    public static class6522 task6522(int v1, int t1, int v2, int t2) throws IllegalArgumentException {
        if (v1 < 0) {
            throw new IllegalArgumentException("Объем должен быть неотрицательным");
        }
        if (v2 < 0) {
            throw new IllegalArgumentException("Объем должен быть неотрицательным");
        }
        return new class6522(v1 + v2, (double) (t1 * v1 + t2 * v2) / (v1 + v2));
    }

    public static int task3490(double yarnDiameterCm, int wireCoils) {
        if (yarnDiameterCm <= 0) {
            throw new IllegalArgumentException("Длина проволоки должна быть неотрицательна");
        }
        if (wireCoils <= 0) {
            throw new IllegalArgumentException("Количество витков должно быть неотрицательно");
        }
        return (int) Math.floor(yarnDiameterCm * Math.PI * wireCoils);
    }

    public static String task6924(double ax, double ay, double bx, double by) {
        System.out.println(ax + " " + ay + " " + bx + " " + by);
        String result;
        double aModule = Math.sqrt(ax * ax + ay * ay);
        double bModule = Math.sqrt(bx * bx + by * by);
        result = String.format("Модуль вектора a = %.4f\n", aModule);
        result += String.format("Модуль вектора b = %.4f\n", bModule);
        double scalarProduct = ax * bx + ay * by;
        result += String.format("Скалярное произведение векторов равно %.4f\n", scalarProduct);
        double angleRad = Math.acos(scalarProduct / aModule / bModule);
        double angleDeg = angleRad * 180 / Math.PI;
        result += String.format("Угол между векторами составляет %.4f градусов", angleDeg);
        return result;
    }
}
