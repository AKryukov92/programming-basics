import java.util.ArrayList;
import java.util.List;

/**
 * @author akryukov
 * 29.03.2017
 */
public class Lab05 {
    public static void main(String[] args) {
        step7323();
    }

    public static void step7323(){
        task7323(4, 3);
        task7323(10, 5);
        task7323(7, 0);
        task7323(7, -3);
        task7323(2, -2);
        task7323(0, 5);
        task7323(7, -11);
        task7323(-2, 4);
    }

    public static void step8718() {
        System.out.println();
        System.out.println("8718");
        task8718(80, 0, 450);
        task8718(80, 0, 700);
        task8718(80, 0, 2500);
        task8718(80, 0, 6000);
        task8718(80, 0, 10000);

        task8718(100, 0, 450);
        task8718(101, 0, 450);

        task8718(100, 0.50, 450);
        task8718(100, 7.50, 450);
        task8718(100, 100.68, 450);
        task8718(100, 15.99, 450);

        task8718(115, 0, 500);
        task8718(115, 0, 800);
        task8718(115, 0, 3000);
        task8718(115, 0, 5500);
        task8718(115, 0, 8500);

        task8718(500, 0, 550);
        task8718(501, 0, 550);

        task8718(1700, 0, 550);
        task8718(1700, 0, 600);
        task8718(1700, 0, 601);

        task8718(0, 0, 450);
        task8718(-50, 0, 450);
        task8718(80, 0, 0);
        task8718(80, 0, -100);
        task8718(80, -20, 450);
    }

    public static void taskX() {
        System.out.println();
        System.out.println("3072");
        System.out.println(task3072(173, 179).print());
        System.out.println(task3072(359, 271).print());
        System.out.println(task3072(439, -761).print());
        System.out.println(task3072(0, -15).print());
        System.out.println();
        System.out.println("5635");
        int[] in5635xt = {30, 120, 210, 50, 150, 200, 80, 160, 220, 100, 130, 190, 180, 100, 190, 100, 190, -10, 40};
        int[] in5635yt = {20, 30, 40, 120, 130, 150, 190, 180, 200, 110, 100, 140, 170, 100, 100, 170, 170, 30, -20};
        for (int i = 0; i < in5635xt.length; i++) {
            try {
                Point t = makePointByXY(in5635xt[i], in5635yt[i]);
                Rectangle r = makeRectangleByXYHW(100, 100, 70, 90);
                if (task5635(t, r)) {
                    System.out.println("точка внутри");
                } else {
                    System.out.println("точка снаружи");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("3878");
        int[] in3878xt = {2, 1, 0, 0, 1, 2, -1};
        int[] in3878yt = {2, 3, 0, 1, 1, 2, 1};
        int[] in3878xp1 = {1, 0, 1, 1, 1, 0, 1};
        int[] in3878yp1 = {1, 0, 1, 1, 1, 4, 1};
        int[] in3878xp2 = {3, 2, 2, 2, 2, 4, 2};
        int[] in3878yp2 = {3, 6, 2, 2, 2, 0, 2};
        for (int i = 0; i < in3878xt.length; i++) {
            try {
                Point t = makePointByXY(in3878xt[i], in3878yt[i]);
                Point p1 = makePointByXY(in3878xp1[i], in3878yp1[i]);
                Point p2 = makePointByXY(in3878xp2[i], in3878yp2[i]);
                if (task3878(t, p1, p2)) {
                    System.out.println("Точка принадлежит прямой");
                } else {
                    System.out.println("Точка не принадлежит прямой");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("4858");
        int[] in4858a1 = {2, 11, 23, 43, 5, 67, 79, 97};
        int[] in4858b1 = {3, 17, 37, 53, 15, 71, 73, 101};
        int[] in4858a2 = {5, 13, 29, 41, 0, 59, 83, 107};
        int[] in4858b2 = {7, 19, 31, 47, 30, 61, 89, 103};
        for (int i = 0; i < in4858a1.length; i++) {
            try {
                String value = task4858(in4858a1[i], in4858b1[i], in4858a2[i], in4858b2[i]);
                System.out.println(value);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println();
        System.out.println("1217");
        int[] in1217a1 = {2, 11, 23, 43, 5, 67, 79, 97};
        int[] in1217b1 = {3, 17, 37, 53, 15, 71, 73, 101};
        int[] in1217a2 = {5, 13, 29, 41, 0, 59, 83, 107};
        int[] in1217b2 = {7, 19, 31, 47, 30, 61, 89, 103};
        for (int i = 0; i < in1217a1.length; i++) {
            try {
                Interval i1 = makeIntervalByEnds(in1217a1[i], in1217b1[i]);
                Interval i2 = makeIntervalByEnds(in1217a2[i], in1217b2[i]);
                if (task1217check(i1, i2)) {
                    System.out.print("Пересекаются ");
                    Interval x = task1217intersection(i1, i2);
                    System.out.println("(" + x.a + "; " + x.b + ")");
                } else {
                    System.out.println("Не пересекаются");
                }
            } catch (IllegalArgumentException e) {
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
        for (int i = 0; i < in1438x1.length; i++) {
            try {
                Rectangle r1 = makeRectangleByXYHW(in1438x1[i], in1435y1[i], in1435h1[i], in1435w1[i]);
                Rectangle r2 = makeRectangleByXYHW(in1435x2[i], in1435y2[i], in1435h2[i], in1435w2[i]);
                if (task1438check(r1, r2)) {
                    System.out.print("Пересекаются");
                    Rectangle rx = task1438intersect(r1, r2);
                    System.out.printf("{\"x\":%d,\"y\":%d,\"w\":%d,\"h\":%d}\n", rx.x, rx.y, rx.w, rx.h);
                } else {
                    System.out.println("Не пересекаются");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("8867");
        int[] in8867a = {1, -4, -2, 0, 4, 4};
        int[] in8867b = {3, 5, 7, 5, 4, -2};
        int[] in8867x = {2, 0, -10, 7, 4, 3};
        for (int i = 0; i < in8867a.length; i++) {
            try {
                System.out.println(task8867(in8867a[i], in8867b[i], in8867x[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println();
        System.out.println("7865");
        int[] in7865 = {-5, -11, -3, 10, 5, 19, 0, -20, 20};
        for (int i = 0; i < in7865.length; i++) {
            System.out.println(task7865(in7865[i]));
        }
        System.out.println();
        System.out.println("8751");
        double[] in8751 = {-273, -10, -1, 0, 99, 100, 101, -274};
        for (int i = 0; i < in8751.length; i++) {
            try {
                System.out.println(task8751(in8751[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void task8718(int mass, double declaredValue, double distance) {
        if (mass <= 0) {
            System.out.println("Масса должна быть положительна");
            return;
        }
        if (declaredValue < 0) {
            System.out.println("Оценочная стоимость должна быть неотрицательна");
            return;
        }
        if (distance <= 0) {
            System.out.println("Дистанция должна быть положительна");
            return;
        }
        double cost = 40;
        if (mass >= 100) {
            double units = Math.ceil((mass - 100) / 20.0);
            cost = cost + units * 2.5;
        }
        cost = cost + Math.ceil(declaredValue) * 0.03;
        double units = Math.ceil(mass / 500.0);
        if (distance < 600) {
            cost = cost + units * 95;
        } else if (601 <= distance && distance <= 2000) {
            cost = cost + units * 105;
        } else if (2001 <= distance && distance <= 5000) {
            cost = cost + units * 120;
        } else if (5001 <= distance && distance <= 8000) {
            cost = cost + units * 135;
        } else {
            cost = cost + units * 150;
        }
        System.out.printf("Плата за посылку массой %d грамм с оценочной стоимостью %.2f рублей, которую отправили на расстояние %.0f км, составляет %.2f рублей\n", mass, declaredValue, distance, cost);
    }

    public static boolean task8878(int a, int b) {
        return a < b;
    }

    public static class class3072 {
        int max;
        int min;

        public class3072(int max, int min) {
            this.max = max;
            this.min = min;
        }

        public String print() {
            return "Максимальное " + max + ", минимальное " + min;
        }
    }

    public static class3072 task3072(int p, int q) {
        if (p > q) {
            return new class3072(p, q);
        } else {
            return new class3072(q, p);
        }
    }

    public static void task5980(double k) {
        if (k > 0) {
            System.out.printf("Корень из %.4f равен %.4f\n", k, Math.sqrt(k));
        } else {
            System.out.printf("Квадрат числа %.4f равен %.4f\n", k, k * k);
        }
    }

    public static int task8174(int a) {
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static void task7323(int a, int b) {
        System.out.println();
        if (a < 0) {
            System.out.println("Количество символов в первой строке должно быть неотрицательным");
        } else if (a + b < 0) {
            System.out.println("Количество символов во второй сроке должно быть неотрицательным");
        } else {
            int i = 0;
            while (i < a) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            i = 0;
            while (i < a + b) {
                System.out.print("*");
                i++;
            }
            System.out.println();
        }
    }

    public static void task4257(double roadKm, double lengthFeet) {
        if (roadKm <= 0) {
            System.out.println("Расстояние между деревнями должно быть положительно");
            return;
        }
        if (lengthFeet <= 0) {
            System.out.println("Длина кабеля должна быть положительна");
            return;
        }
        double roadFeet = roadKm * 1000 / 0.305;
        double lengthKm = lengthFeet * 0.305 / 1000;
        System.out.printf("Расстояние %.4f км это %.4f футов\n", roadKm, roadFeet);
        System.out.printf("Длина кабеля %.4f футов это %.4f км\n", lengthFeet, lengthKm);
        if (roadFeet < lengthFeet){
            System.out.println("Кабеля хватит. Расстояние меньше длины кабеля.");
        } else {
            System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния.");
        }
    }

    public static String task2291(double velocityInKmH, double velocityInMS) throws IllegalArgumentException {
        if (velocityInKmH < 0) {
            throw new IllegalArgumentException("Скорость корабля должна быть неотрицательна");
        }
        if (velocityInMS < 0) {
            throw new IllegalArgumentException("Скорость кометы должна быть неотрицательна");
        }
        double velocityInMS1 = velocityInKmH * 1000 / 60 / 60;
        if (velocityInMS1 < velocityInMS) {
            return String.format("Комета улетит от корабля. Скорость корабля %.2f км/ч меньше скорости кометы %.2f м/с", velocityInKmH, velocityInMS);
        } else {
            return String.format("Корабль догонит комету. Скорость кометы %.2f км/ч меньше скорости корабля %.2f м/с", velocityInMS, velocityInKmH);
        }
    }

    public static String task1763(double r, double a) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        if (a <= 0) {
            throw new IllegalArgumentException("Сторона квадрата должна быть положительна");
        }
        double areaSquare = a * a;
        double areaCircle = Math.PI * r * r;
        if (areaCircle < areaSquare) {
            return String.format("Площадь квадрата %.4f больше площади круга %.4f", areaSquare, areaCircle);
        } else {
            return String.format("Площадь круга %.4f больше площади квадрата %.4f", areaCircle, areaSquare);
        }
    }

    public static String task5662(int a, int b, int c) {
        if (a == 0) {
            return "Данное уравнение не является квадратным";
        }
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return "У уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 два вещественных корня";
        } else if (d == 0) {
            return "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень";
        } else {
            return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
        }
    }

    public static boolean task1945(double sc, double ss) throws IllegalArgumentException {
        if (sc <= 0) {
            throw new IllegalArgumentException("Площадь круга должна быть положительной");
        }
        if (ss <= 0) {
            throw new IllegalArgumentException("Площадь квадрата должна быть положительной");
        }
        double edge = Math.sqrt(ss);
        double diameter = Math.sqrt(sc / Math.PI) * 2;
        return diameter < edge;
    }

    public static double[] task1186(double x, double y, double z) {
        return new double[]{
                x > 0 ? x * x : x,
                y > 0 ? y * y : y,
                z > 0 ? z * z : z
        };
    }

    public static boolean task8715(int a, int b, int c) {
        return a < b && b < c;
    }

    public static StringBuilder task8518(StringBuilder builder, String x) {
        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
            if (chars[i].equals(x)) {
                builder.append("+");
            }
            builder.append("\n");
        }
        return builder;
    }

    public static boolean task4847(int x, int y, int z) {
        return x == y || y == z || x == z;
    }

    public static void task7991(int x, int y, int z){
        if (-11 < x && x < 13){
            System.out.print(x);
            System.out.print(' ');
        }
        if (-11 < y && y < 13){
            System.out.print(y);
            System.out.print(' ');
        }
        if (-11 < z && z < 13){
            System.out.print(z);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static List<Double> task7991(double x, double y, double z) {
        List<Double> ret = new ArrayList<>();
        if (-3 < x && x < 5) {
            ret.add(x);
        }
        if (-3 < y && y < 5) {
            ret.add(y);
        }
        if (-3 < z && z < 5) {
            ret.add(z);
        }
        return ret;
    }

    public static boolean task6291(int a, int b, int c) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Значение A должно быть неотрицательным");
        }
        if (b < 0) {
            throw new IllegalArgumentException("Значение B должно быть неотрицательным");
        }
        if (c < 0) {
            throw new IllegalArgumentException("Значение C должно быть неотрицательным");
        }
        return a == b || a == c || b == c;
    }

    public static int task3770(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        if (y > x && y > z) {
            return y;
        }
        return z;
    }

    public static class class7178 {
        int quotient;
        boolean empty;

        public class7178(int quotient) {
            this.quotient = quotient;
        }

        public class7178() {
            this.empty = true;
        }

        public String print() {
            if (empty) {
                return "M не делится нацело на P";
            } else {
                return Integer.toString(quotient);
            }
        }
    }

    public static class7178 task7178(int m, int p) throws IllegalArgumentException {
        if (p == 0) {
            throw new IllegalArgumentException("Значение P должно быть не равно нулю");
        }
        if (m % p == 0) {
            return new class7178(m / p);
        } else {
            return new class7178();
        }
    }

    public static boolean task3883(int a) throws IllegalArgumentException {
        if (a < 1000 || a > 9999) {
            throw new IllegalArgumentException("Значение A должно быть в интервале [1000, 9999]");
        }
        int hundreds = a / 100 % 10;
        int units = a % 10;
        return hundreds == units;
    }

    public static StringBuilder task1292(StringBuilder sb, String x) {
        String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h"};
        int i = 0;
        while (i < chars.length) {
            sb.append(chars[i]);
            if (chars[i].equals(x)) {
                break;
            }
            i++;
        }
        return sb;
    }

    public static String task4527(int a) throws IllegalArgumentException {
        if (a < -10 || a > 100) {
            throw new IllegalArgumentException("Значение A должно быть в интервале [-10, 100]");
        }
        if (a == 40) {
            return "40'ой";
        }
        if (a == 0) {
            return "0'ой";
        }
        int abs = a < 0 ? -a : a;
        if (abs % 10 == 1 || abs % 10 == 4 || abs % 10 == 5 || abs % 10 == 9 || a % 10 == 0
                || a == 12 || a == 13 || a == 16 || a == 17 || a == 18) {
            return a + "'ый";
        }
        if (abs % 10 == 2 || abs % 10 == 6 || abs % 10 == 7 || abs % 10 == 8) {
            return a + "'ой";
        }
        if (abs % 10 == 3) {
            return a + "'ий";
        }
        return Integer.toString(a);
    }

    public static boolean task6556(int a, int b, int c, int d) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Значение A должно быть неотрицательным");
        }
        if (b < 0) {
            throw new IllegalArgumentException("Значение B должно быть неотрицательным");
        }
        if (c < 0) {
            throw new IllegalArgumentException("Значение C должно быть неотрицательным");
        }
        if (d < 0) {
            throw new IllegalArgumentException("Значение D должно быть неотрицательным");
        }
        return a < c && b < d;
    }

    public static class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Rectangle {
        public final int x;
        public final int y;
        public final int h;
        public final int w;

        public Rectangle(int x, int y, int h, int w) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
        }
    }

    public static class Interval {
        public final int a;
        public final int b;

        public Interval(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static Point makePointByXY(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("Координата X должна быть неотрицательной");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Координата Y должна быть неотрицательной");
        }
        return new Point(x, y);
    }

    public static Rectangle makeRectangleByXYHW(int x, int y, int h, int w) {
        if (x < 0) {
            throw new IllegalArgumentException("Координата X должна быть неотрицательной");
        }
        if (y < 0) {
            throw new IllegalArgumentException("Координата Y должна быть неотрицательной");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("Высота должна быть положительна");
        }
        if (w <= 0) {
            throw new IllegalArgumentException("Ширина должна быть положительна");
        }
        return new Rectangle(x, y, h, w);
    }

    public static Interval makeIntervalByEnds(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("Значение A должно быть меньше значения B");
        }
        return new Interval(a, b);
    }

    public static boolean task5635(Point t, Rectangle r) {
        return r.x <= t.x &&
                t.x <= r.x + r.w &&
                r.y <= t.y &&
                t.y <= r.y + r.h;
    }

    public static boolean task3878(Point t, Point p1, Point p2) {
        return (t.x - p1.x) / (p2.x - p1.x) == (t.y - p1.y) / (p2.y - p1.y);
    }

    public static boolean task1217check(Interval i1, Interval i2) {
        return !(i1.b <= i2.a || i2.b <= i1.a);
    }

    public static Interval task1217intersection(Interval i1, Interval i2) {
        if (i1.a < i2.a && i2.a < i1.b) {
            if (i2.b > i1.b) {
                return new Interval(i2.a, i1.b);
            } else {
                return new Interval(i2.a, i2.b);
            }
        } else {
            if (i2.b > i1.b) {
                return new Interval(i1.a, i1.b);
            } else {
                return new Interval(i1.a, i2.b);
            }
        }
    }

    public static boolean task1438check(Rectangle r1, Rectangle r2) {
        Interval r1x = new Interval(r1.x, r1.x + r1.w);
        Interval r2x = new Interval(r2.x, r2.x + r2.w);
        Interval r1y = new Interval(r1.y, r1.y + r1.h);
        Interval r2y = new Interval(r2.y, r2.y + r2.h);
        return task1217check(r1x, r2x) && task1217check(r1y, r2y);
    }

    public static Rectangle task1438intersect(Rectangle r1, Rectangle r2) {
        Interval r1x = new Interval(r1.x, r1.x + r1.w);
        Interval r2x = new Interval(r2.x, r2.x + r2.w);
        Interval r1y = new Interval(r1.y, r1.y + r1.h);
        Interval r2y = new Interval(r2.y, r2.y + r2.h);

        Interval xx = task1217intersection(r1x, r2x);
        Interval xy = task1217intersection(r1y, r2y);
        return new Rectangle(xx.a, xy.a, xy.b - xy.a, xx.b - xx.a);
    }

    public static boolean task2153(int t) throws IllegalArgumentException {
        if (t < 0 || 60 <= t) {
            throw new IllegalArgumentException("Значение T должно быть в интервале [0, 59]");
        }
        return t % 5 < 3;
    }

    public static String task7937(int w, int h, int c, int d) throws IllegalArgumentException {
        if (w <= 0) {
            throw new IllegalArgumentException("Значение W должно быть положительным");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("Значение H должно быть положительным");
        }
        if (c <= 0) {
            throw new IllegalArgumentException("Значение C должно быть положительным");
        }
        if (d <= 0) {
            throw new IllegalArgumentException("Значение D должно быть положительным");
        }
        int cw = (w / c) * (h / d);
        int ch = (h / c) * (w / d);
        if (cw > ch) {
            return cw + " при C вдоль W";
        } else {
            return ch + " при C вдоль H";
        }
    }

    public static boolean task1999(int x, int y) {
        return x <= -2 && y >= 1;
    }

    public static boolean task4042(double x, double y) {
        return y <= 1.5 && y >= -2;
    }

    public static boolean task6351(double x, double y) {
        return y <= 4 && x >= 1 && x <= 2;
    }

    public static boolean task5382(double x, double y) {
        return y <= 4 && y >= 2 && x >= 1;
    }

    public static boolean task7088(double x, double y) {
        return (x >= 2 && y >= 0) || (x >= 1 && y <= -1);
    }

    public static boolean task7250(double x, double y) {
        return x >= 2 && (y >= 1 || y <= -1.5);
    }

    public static boolean task6740(double x, double y) {
        return x >= 1 && x <= 3 && y >= -2 && y <= -1;
    }

    public static boolean task9038(double x, double y) {
        return x >= 2 || (y <= 1.5 && y >= 0.5);
    }

    public static String task8867(int a, int b, int x) {
        if (a > b) {
            throw new IllegalArgumentException("Некорректный интервал. Левая граница должна быть меньше правой.");
        }
        if (a <= x && x <= b) {
            return x + " попадает в интервал от " + a + " до " + b;
        } else {
            return x + " за пределами интервала от " + a + " до " + b;
        }
    }

    public static String task7865(int x) {
        if (-11 <= x && x <= -3) {
            return "Красный";
        } else if (5 <= x && x <= 19) {
            return "Зеленый";
        } else {
            return "X не попадает ни в зеленый, ни в красный интервал";
        }
    }

    public static String task4858(int redA, int redB, int greenA, int greenB) {
        if (redA > redB) {
            throw new IllegalArgumentException("Интервал задан некорректно. Левая граница должна быть меньше правой.");
        }
        if (greenA > greenB) {
            throw new IllegalArgumentException("Интервал задан некорректно. Левая граница должна быть меньше правой.");
        }
        double redCenter = (redA + redB) / 2.0;
        double greenCenter = (greenA + greenB) / 2.0;
        if (redCenter < greenCenter) {
            return "Красный слева, зеленый справа";
        } else if (redCenter > greenCenter) {
            return "Зеленый слева, красный справа";
        } else {
            return "Середины интервалов совпадают";
        }
    }

    public static String task8751(double tC) {
        if (tC <= -273.15) {
            throw new IllegalArgumentException("Некорректная температура");
        }
        String result = "";
        double Q;
        double c = 4.2E3;
        double r = 2.26E6;
        double lambda = 3.3E5;
        double m = 17;
        double tK = tC + 273.15;
        if (tC <= 0) {
            result += "Агрегатное состояние: кристалл\n";
            Q = m * tK * c;
            result += String.format("Внутренняя энергия: %.2f Дж\n", Q);
        }
        if (0 <= tC && tC <= 100) {
            result += "Агрегатное состояние: жидкость\n";
            Q = m * (tK * c + r);
            result += String.format("Внутренняя энергия: %.2f Дж\n", Q);
        }
        if (100 <= tC) {
            result += "Агрегатное состояние: газ\n";
            Q = m * (tK * c + r + lambda);
            result += String.format("Внутренняя энергия: %.2f Дж\n", Q);
        }
        return result;
    }
}
