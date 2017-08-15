using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab05
    {
        static void Main(string[] args)
        {
            Console.WriteLine();
            Console.WriteLine("3072");
            Console.WriteLine(Task3072(173, 179).print());
            Console.WriteLine(Task3072(359, 271).print());
            Console.WriteLine(Task3072(439, -761).print());
            Console.WriteLine(Task3072(0, -15).print());
            Console.WriteLine();
            Console.WriteLine("7178");
            int[] in7178m = { 36, 41, 15 };
            int[] in7178p = { 2, 7, 0 };
            for (int i = 0; i < in7178m.Length; i++)
            {
                try
                {
                    class7178 result7178 = Task7178(in7178m[i], in7178p[i]);
                    Console.WriteLine(result7178.print());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("5635");
            int[] in5635xt = { 1, 5, 3, 3, 0, 1, 1, 1, 1 };
            int[] in5635yt = { 1, 5, 2, 1, -1, 1, 1, 1, 1 };
            int[] in5635xp = { 0, 0, 0, 0, 0, 2, 2, 2, 2 };
            int[] in5635yp = { 0, 0, 0, 0, 0, 2, 2, 2, 2 };
            int[] in5635h = { 2, 2, 2, 2, 1, 0, -1, 3, 3 };
            int[] in5635w = { 3, 3, 3, 3, 1, 3, 3, 0, -1 };
            for (int i = 0; i < in5635xt.Length; i++)
            {
                try
                {
                    Point t = MakePointByXY(in5635xt[i], in5635yt[i]);
                    Rectangle r = MakeRectangleByXYHW(in5635xp[i], in5635yp[i], in5635h[i], in5635w[i]);
                    if (Task5635(t, r))
                    {
                        Console.WriteLine("точка внутри");
                    }
                    else {
                        Console.WriteLine("точка не внутри");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("3878");
            int[] in3878xt = { 2, 1, 0, 0, 1, -1 };
            int[] in3878yt = { 2, 3, 0, 1, 1, 1 };
            int[] in3878xp1 = { 1, 0, 1, 1, 1, 1 };
            int[] in3878yp1 = { 1, 0, 1, 1, 1, 1 };
            int[] in3878xp2 = { 3, 2, 2, 2, 2, 2 };
            int[] in3878yp2 = { 3, 6, 2, 2, 2, 2 };
            for (int i = 0; i < in3878xt.Length; i++)
            {
                try
                {
                    Point t = MakePointByXY(in3878xt[i], in3878yt[i]);
                    Point p1 = MakePointByXY(in3878xp1[i], in3878yp1[i]);
                    Point p2 = MakePointByXY(in3878xp2[i], in3878yp2[i]);
                    if (Task3878(t, p1, p2))
                    {
                        Console.WriteLine("Точка принадлежит прямой");
                    }
                    else {
                        Console.WriteLine("Точка не принадлежит прямой");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("1217");
            int[] in1217a1 = { 2, 11, 23, 43, 5, 67, 79, 97 };
            int[] in1217b1 = { 3, 17, 37, 53, 15, 71, 73, 101 };
            int[] in1217a2 = { 5, 13, 29, 41, 0, 59, 83, 107 };
            int[] in1217b2 = { 7, 19, 31, 47, 30, 61, 89, 103 };
            for (int i = 0; i < in1217a1.Length; i++)
            {
                try
                {
                    Interval i1 = MakeIntervalByEnds(in1217a1[i], in1217b1[i]);
                    Interval i2 = MakeIntervalByEnds(in1217a2[i], in1217b2[i]);
                    if (Task1217check(i1, i2))
                    {
                        Console.Write("Пересекаются ");
                        Interval x = Task1217intersection(i1, i2);
                        Console.WriteLine("(" + x.a + "; " + x.b + ")");
                    }
                    else {
                        Console.WriteLine("Не пересекаются");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("1438");
            int[] in1438x1 = { 10, 25, 102, 500, 60, 100, 150, 100, 5, 105, 150, 0, 200, 125, 100 };
            int[] in1435y1 = { 10, 25, 200, 200, 70, 100, 150, 0, 0, 5, 150, 0, 200, 138, 100 };
            int[] in1435h1 = { 200, 200, 100, 100, 120, 200, 150, 100, 10, 10, 50, 802, 100, 0, 120 };
            int[] in1435w1 = { 100, 200, 200, 200, 200, 200, 300, 500, 10, 10, 300, 200, 100, 1, 220 };
            int[] in1435x2 = { 50, 225, 0, 10, 50, 200, 150, 0, 0, 100, 100, 0, 900, 205, 220 };
            int[] in1435y2 = { 50, 225, 500, 400, 50, 200, 150, 200, 5, 0, 100, 0, 200, 202, 100 };
            int[] in1435h2 = { 300, 200, 100, 100, 120, 50, 150, 700, 10, 10, 300, 610, 100, 61, 120 };
            int[] in1435w2 = { 350, 200, 120, 120, 200, 50, 300, 100, 10, 30, 200, 610, 10, 62, 220 };
            for (int i = 0; i < in1438x1.Length; i++)
            {
                try
                {
                    Rectangle r1 = MakeRectangleByXYHW(in1438x1[i], in1435y1[i], in1435h1[i], in1435w1[i]);
                    Rectangle r2 = MakeRectangleByXYHW(in1435x2[i], in1435y2[i], in1435h2[i], in1435w2[i]);
                    if (Task1438check(r1, r2))
                    {
                        Console.Write("Пересекаются");
                        Rectangle rx = Task1438intersect(r1, r2);
                        Console.WriteLine("{{\"x\":{0},\"y\":{1},\"w\":{2},\"h\":{3}}}", rx.x, rx.y, rx.w, rx.h);
                    }
                    else {
                        Console.WriteLine("Не пересекаются");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("1186");
            Console.WriteLine();
            double[] in1186x = { 6.35, 4.71, 19.99, -2.28, -18.71, 3.44, -0.09 };
            double[] in1186y = { 2.7, 5.59, -9.57, 16.92, -7.6, -14.98, -16.6 };
            double[] in1186z = { 5.08, -18.55, 12.75, 6.14, 6.27, -8.26, -1.84 };
            double[] result1186;
            for (int i = 0; i < in1186x.Length; i++)
            {
                result1186 = Task1186(in1186x[i], in1186y[i], in1186z[i]);
                foreach (double aResult in result1186)
                {
                    Console.Write("{0:F4};\t", aResult);
                }
                Console.WriteLine();
            }
        }

        public static bool Task8878(int a, int b)
        {
            return a < b;
        }

        public class class3072
        {
            int max;
            int min;
            public class3072(int max, int min)
            {
                this.max = max;
                this.min = min;
            }
            public String print()
            {
                return "Максимальное " + max + ", минимальное " + min;
            }
        }

        public static class3072 Task3072(int p, int q)
        {
            if (p > q)
            {
                return new class3072(p, q);
            }
            else {
                return new class3072(q, p);
            }
        }

        public static double Task5980(int k)
        {
            if (k > 0)
            {
                return Math.Sqrt(k);
            }
            else {
                return k * k;
            }
        }

        public static int Task8174(int a)
        {
            if (a > 0)
            {
                return a;
            }
            else {
                return -a;
            }
        }

        public static bool Task4257(double l, double p)
        {
            if (l < 0)
            {
                throw new Exception("Значение L должно быть неотрицательным");
            }
            if (p < 0)
            {
                throw new Exception("Значение P должно быть неотрицательным");
            }
            return l * 1000 < p * 0.305;
        }

        public static String Task2291(double velocityInKmH, double velocityInMS)
        {
            if (velocityInKmH < 0)
            {
                throw new Exception("Значение velocityInKmH должно быть неотрицательным");
            }
            if (velocityInMS < 0)
            {
                throw new Exception("Значение velocityInMS должно быть неотрицательным");
            }
            double velocityInMS1 = velocityInKmH * 1000 / 60 / 60;
            if (velocityInMS1 < velocityInMS)
            {
                return String.Format("{0:F2} км/ч меньше {0:F2} м/с", velocityInKmH, velocityInMS);
            }
            else {
                return String.Format("{0:F2} км/ч меньше {0:F2} м/с", velocityInMS, velocityInKmH);
            }
        }

        public static String Task1763(int r, int a)
        {
            if (r <= 0)
            {
                throw new Exception("Радиус должен быть положительным");
            }
            if (a <= 0)
            {
                throw new Exception("Сторона квадрата должна быть положительна");
            }
            double areaSquare = a * a;
            double areaCircle = Math.PI * r * r;
            if (areaCircle < areaSquare)
            {
                return String.Format("Площадь квадрата {0:F4} больше площади круга {1:F4}", areaSquare, areaCircle);
            }
            else {
                return String.Format("Площадь круга {0:F4} больше площади квадрата {1:F4}", areaCircle, areaSquare);
            }
        }

        public static String Task5662(int a, int b, int c)
        {
            if (a == 0)
            {
                return "Данное уравнение не является квадратным";
            }
            double d = b * b - 4 * a * c;
            if (d > 0)
            {
                return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
            }
            else if (d == 0)
            {
                return "У уравнения " + a + "x^2 + " + b + "x + " + c + " два вещественных корня";
            }
            else
            {
                return "Уравнение " + a + "x^2 + " + b + "x + " + c + " имеет один корень";
            }
        }

        public static bool Task1945(int sc, int ss)
        {
            if (sc <= 0)
            {
                throw new Exception("Площадь круга должна быть положительной");
            }
            if (ss <= 0)
            {
                throw new Exception("Площадь квадрата должна быть положительной");
            }
            return Math.Sqrt(sc / Math.PI) < Math.Sqrt(ss) / 2;
        }

        public static double[] Task1186(double x, double y, double z)
        {
            return new double[] {
            x > 0 ? x * x : x,
            y > 0 ? y * y : y,
            z > 0 ? z * z : z
        };
        }

        public static bool Task8715(int a, int b, int c)
        {
            return a < b && b < c;
        }

        public static StringBuilder Task8518(StringBuilder builder, String x)
        {
            String[] chars = { "a", "b", "c", "d", "e", "f", "g", "h" };
            for (int i = 0; i < chars.Length; i++)
            {
                builder.Append(chars[i]);
                if (chars[i].Equals(x))
                {
                    builder.Append("+");
                }
                builder.Append("\n");
            }
            return builder;
        }

        public static bool Task4847(int x, int y, int z)
        {
            return x == y || y == z || x == z;
        }

        public static IList<Double> Task7991(double x, double y, double z)
        {
            IList<Double> ret = new List<double>();
            if (-3 < x && x < 5)
            {
                ret.Add(x);
            }
            if (-3 < y && y < 5)
            {
                ret.Add(y);
            }
            if (-3 < z && z < 5)
            {
                ret.Add(z);
            }
            return ret;
        }

        public static bool Task6291(int a, int b, int c)
        {
            if (a < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательным");
            }
            if (c < 0)
            {
                throw new Exception("Значение C должно быть неотрицательным");
            }
            return a == b || a == c || b == c;
        }

        public static int Task3770(int x, int y, int z)
        {
            if (x > y && x > z)
            {
                return x;
            }
            if (y > x && y > z)
            {
                return y;
            }
            return z;
        }

        public class class7178
        {
            int quotient;
            bool empty;
            public class7178(int quotient)
            {
                this.quotient = quotient;
            }
            public class7178()
            {
                this.empty = true;
            }
            public String print()
            {
                if (empty)
                {
                    return "M не делится нацело на P";
                }
                else {
                    return quotient.ToString();
                }
            }
        }

        public static class7178 Task7178(int m, int p)
        {
            if (p == 0)
            {
                throw new Exception("Значение P должно быть не равно нулю");
            }
            if (m % p == 0)
            {
                return new class7178(m / p);
            }
            else {
                return new class7178();
            }
        }

        public static bool Task3883(int a)
        {
            if (a < 1000 || a > 9999)
            {
                throw new Exception("Значение A должно быть в интервале [1000, 9999]");
            }
            int hundreds = a / 100 % 10;
            int units = a % 10;
            return hundreds == units;
        }

        public static String Task4527(int a)
        {
            if (a < -10 || a > 100)
            {
                throw new Exception("Значение A должно быть в интервале [-10, 100]");
            }
            if (a == 40)
            {
                return "40'ой";
            }
            if (a == 0)
            {
                return "0'ой";
            }
            int abs = a < 0 ? -a : a;
            if (abs % 10 == 1 || abs % 10 == 4 || abs % 10 == 5 || abs % 10 == 9 || a % 10 == 0
                    || a == 12 || a == 13 || a == 16 || a == 17 || a == 18)
            {
                return a + "'ый";
            }
            if (abs % 10 == 2 || abs % 10 == 6 || abs % 10 == 7 || abs % 10 == 8)
            {
                return a + "'ой";
            }
            if (abs % 10 == 3)
            {
                return a + "'ий";
            }
            return a.ToString();
        }

        public static bool Task6556(int a, int b, int c, int d)
        {
            if (a < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательным");
            }
            if (c < 0)
            {
                throw new Exception("Значение C должно быть неотрицательным");
            }
            if (d < 0)
            {
                throw new Exception("Значение D должно быть неотрицательным");
            }
            return a < c && b < d;
        }

        public class Point
        {
            public readonly int x;
            public readonly int y;

            public Point(int x, int y)
            {
                this.x = x;
                this.y = y;
            }
        }

        public class Rectangle
        {
            public readonly int x;
            public readonly int y;
            public readonly int h;
            public readonly int w;

            public Rectangle(int x, int y, int h, int w)
            {
                this.x = x;
                this.y = y;
                this.h = h;
                this.w = w;
            }
        }

        public class Interval
        {
            public readonly int a;
            public readonly int b;

            public Interval(int a, int b)
            {
                this.a = a;
                this.b = b;
            }
        }

        public static Point MakePointByXY(int x, int y)
        {
            if (x < 0)
            {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            if (y < 0)
            {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            return new Point(x, y);
        }

        public static Rectangle MakeRectangleByXYHW(int x, int y, int h, int w)
        {
            if (x < 0)
            {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            if (y < 0)
            {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            if (h <= 0)
            {
                throw new Exception("Высота должна быть положительна");
            }
            if (w <= 0)
            {
                throw new Exception("Ширина должна быть положительна");
            }
            return new Rectangle(x, y, h, w);
        }

        public static Interval MakeIntervalByEnds(int a, int b)
        {
            if (a > b)
            {
                throw new Exception("Значение A должно быть меньше значения B");
            }
            return new Interval(a, b);
        }

        public static bool Task5635(Point t, Rectangle r)
        {
            return r.x < t.x &&
                    t.x < r.x + r.w &&
                    r.y < t.y &&
                    t.y < r.y + r.h;
        }

        public static bool Task3878(Point t, Point p1, Point p2)
        {
            return (t.x - p1.x) / (p2.x - p1.x) == (t.y - p1.y) / (p2.y - p1.y);
        }

        public static bool Task1217check(Interval i1, Interval i2)
        {
            return !(i1.b <= i2.a || i2.b <= i1.a);
        }

        public static Interval Task1217intersection(Interval i1, Interval i2)
        {
            if (i1.a < i2.a && i2.a < i1.b)
            {
                if (i2.b > i1.b)
                {
                    return new Interval(i2.a, i1.b);
                }
                else {
                    return new Interval(i2.a, i2.b);
                }
            }
            else {
                if (i2.b > i1.b)
                {
                    return new Interval(i1.a, i1.b);
                }
                else {
                    return new Interval(i1.a, i2.b);
                }
            }
        }

        public static bool Task1438check(Rectangle r1, Rectangle r2)
        {
            Interval r1x = new Interval(r1.x, r1.x + r1.w);
            Interval r2x = new Interval(r2.x, r2.x + r2.w);
            Interval r1y = new Interval(r1.y, r1.y + r1.h);
            Interval r2y = new Interval(r2.y, r2.y + r2.h);
            return Task1217check(r1x, r2x) && Task1217check(r1y, r2y);
        }

        public static Rectangle Task1438intersect(Rectangle r1, Rectangle r2)
        {
            Interval r1x = new Interval(r1.x, r1.x + r1.w);
            Interval r2x = new Interval(r2.x, r2.x + r2.w);
            Interval r1y = new Interval(r1.y, r1.y + r1.h);
            Interval r2y = new Interval(r2.y, r2.y + r2.h);

            Interval xx = Task1217intersection(r1x, r2x);
            Interval xy = Task1217intersection(r1y, r2y);
            return new Rectangle(xx.a, xy.a,  xy.b - xy.a, xx.b - xx.a);
        }

        public static bool Task2153(int t)
        {
            if (t < 0 || 60 <= t)
            {
                throw new Exception("Значение T должно быть в интервале [0, 59]");
            }
            return t % 5 < 3;
        }

        public static String Task7937(int w, int h, int c, int d)
        {
            if (w <= 0)
            {
                throw new Exception("Значение W должно быть положительным");
            }
            if (h <= 0)
            {
                throw new Exception("Значение H должно быть положительным");
            }
            if (c <= 0)
            {
                throw new Exception("Значение C должно быть положительным");
            }
            if (d <= 0)
            {
                throw new Exception("Значение D должно быть положительным");
            }
            int cw = (w / c) * (h / d);
            int ch = (h / c) * (w / d);
            if (cw > ch)
            {
                return cw + " при C вдоль W";
            }
            else {
                return ch + " при C вдоль H";
            }
        }

        public static bool Task1999(int x, int y)
        {
            return x <= -2 && y >= 1;
        }

        public static bool Task4042(double x, double y)
        {
            return y <= 1.5 && y >= -2;
        }

        public static bool Task6351(double x, double y)
        {
            return y <= 4 && x >= 1 && x <= 2;
        }

        public static bool Task5382(double x, double y)
        {
            return y <= 4 && y >= 2 && x >= 1;
        }

        public static bool Task7088(double x, double y)
        {
            return (x >= 2 && y >= 0) || (x >= 1 && y <= -1);
        }

        public static bool Task7250(double x, double y)
        {
            return x >= 2 && (y >= 1 || y <= -1.5);
        }

        public static bool Task6740(double x, double y)
        {
            return x >= 1 && x <= 3 && y >= -2 && y <= -1;
        }

        public static bool Task9038(double x, double y)
        {
            return x >= 2 || (y <= 1.5 && y >= 0.5);
        }
    }
}