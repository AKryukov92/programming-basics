/**
 * @author akryukov
 * 28.03.2017
 */
public class Lab02 {

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

    public static void task9130(double planetMass, double satelliteMass, double radius){
        if (radius <= 0){
            System.out.println("Радиус планеты должен быть положительным");
            return;
        }
        if (planetMass <=0){
            System.out.println("Масса планеты должна быть положительна");
            return;
        }
        if (satelliteMass <= 0){
            System.out.println("Масса спутника должна быть положительна");
            return;
        }
        double g = 9.8067;
        double result = g * planetMass * satelliteMass / radius / radius;
        System.out.printf("На спутник действует сила тяжести %e Ньютон\n", result);
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
