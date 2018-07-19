using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab02
    {
        static void Main(string[] args)
        {
            Console.WriteLine();
            Console.WriteLine("2361");
            int[] in2361t = { 400, 103, 2, 300, -800 };
            int[] in2361l = { 17, 29, 313, -70, 20 };
            for (int i = 0; i < in2361l.Length; i++)
            {
                try
                {
                    class2361 result = Task2361(in2361t[i], in2361l[i]);
                    Console.WriteLine(result);
                }
                catch (ArgumentException e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("9622");
            Console.WriteLine(Task9622(7351, 7349, 7333).print());
            Console.WriteLine(Task9622(19, 23, 29).print());

            Console.WriteLine();
            Console.WriteLine("6522");
            int[] in6522v1 = { 1, 1, 5, -2, 4 };
            int[] in6522t1 = { 30, -20, 90, 10, 100 };
            int[] in6522v2 = { 3, 10, 1, 5, -10 };
            int[] in6522t2 = { 20, 20, -10, 50, 4 };
            for (int i = 0; i < in6522v1.Length; i++)
            {
                try
                {
                    class6522 result = Task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
                    Console.WriteLine(result);
                }
                catch (ArgumentException e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9622");
            int[] in9622m = { 7351, 19, -1, 2, 3 };
            int[] in9622v = { 7349, 23, 4, -5, 6 };
            int[] in9622h = { 7333, 29, 7, 8, -9 };
            for (int i = 0; i < in9622m.Length; i++)
            {
                try
                {
                    class9622 result = Task9622(in9622m[i], in9622v[i], in9622h[i]);
                    Console.WriteLine(result.print());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static double Task4411(double x)
        {
            return x + 7;
        }

        public static int Task9298(int a)
        {
            if (a <= 0)
            {
                throw new Exception("Значение A должно быть положительным");
            }
            return 6 * a * a;
        }

        public static int Task3354(int a)
        {
            if (a <= 0)
            {
                throw new Exception("Значение A должно быть положительным");
            }
            return a * a * a;
        }

        public static double Task5201(int r)
        {
            if (r <= 0)
            {
                throw new Exception("Значение R должно быть положительным");
            }
            return 2 * Math.PI * r;
        }

        public static double Task2981(int r)
        {
            if (r <= 0)
            {
                throw new Exception("Значение R должно быть положительным");
            }
            return 4 * Math.PI * r * r * r / 3;
        }

        public static double Task4312(int a, int h)
        {
            if (a <= 0)
            {
                throw new Exception("Длина основания треугольника должна быть положительна");
            }
            if (h <= 0)
            {
                throw new Exception("Высота треугольника должна быть положительна");
            }
            return (double)a * (double)h / 2;
        }

        public static double Task8428(int a)
        {
            return a * Math.PI / 180;
        }

        public class class2361
        {
            public int amount;
            public int deficit;

            public class2361(int amount, int deficit)
            {
                this.amount = amount;
                this.deficit = deficit;
            }

            public override String ToString()
            {
                return amount + " шт и " + deficit + " см";
            }
        }

        public static class2361 Task2361(int t, int l)
        {
            if (t <= 0)
            {
                throw new ArgumentException("Длина рулона должна быть положительна");
            }
            if (l <= 0)
            {
                throw new ArgumentException("Расход материала должен быть положительным");
            }
            if(t * 100 < l)
            {
                throw new ArgumentException("Материала не хватат даже на одно изделие");
            }
            return new class2361(t * 100 / l, t * 100 % l);
        }

        public static int Task5063(int a)
        {
            return a % 360;
        }

        public static double Task7711(int x)
        {
            return Math.Sin(x * Math.PI / 180);
        }

        public static double Task8833(int x)
        {
            if (x < 0)
            {
                throw new Exception("Значение X должно быть неотрицательным");
            }
            return Math.Sqrt(x);
        }

        public static double Task1262(int y)
        {
            return 5 * Math.Cos(y * Math.PI / 180);
        }

        public static double Task9020(int x)
        {
            if (x > 61)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательным");
            }
            return 3 * Math.Sqrt(61 - x);
        }

        public static double Task1934(int a, int b)
        {
            if (b > 0)
            {
                throw new Exception("Значение B должно быть не положительным");
            }
            return a * Math.Sqrt(-7 * b);
        }

        public static double Task7237(double t)
        {
            if (t < -273.15)
            {
                throw new Exception("Значение T должно быть не ниже абсолютного нуля");
            }
            return t * 1.8 + 32;
        }

        public static double Task3943(int x, int y)
        {
            if (y < 0)
            {
                throw new ArgumentException("Значение y должно быть неотрицательным");
            }
            if (x + Math.Sqrt(y) < 0)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательным");
            }
            return -5 * Math.Sqrt(x + Math.Sqrt(y));
        }

        public static double Task7619(int v1, int v2, int s)
        {
            if (v1 < 0 || v2 < 0)
            {
                throw new Exception("Скорость должна быть неотрицательна");
            }
            if (s < 0)
            {
                throw new Exception("Расстояние должно быть неотрицательно");
            }
            return (double)s / (v1 + v2);
        }

        public static int Task3832(int x1, int x2, int x3)
        {
            return x1 * x2 + x1 * x3 + x2 * x3;
        }

        public static double Task1346(long v, long t, long a)
        {
            if (v < 0)
            {
                throw new ArgumentException("Начальная скорость должно быть неотрицательна");
            }
            if (t <= 0)
            {
                throw new ArgumentException("Время должно быть положительным");
            }
            return v * t + a * t * t / 2.0;
        }

        public class class9622
        {
            public double t;
            public double wn;

            public class9622(double t, double wn)
            {
                this.t = t;
                this.wn = wn;
            }

            public String print()
            {
                return String.Format("t {0:F4} wn {0:F4}", t, wn);
            }
        }

        public static class9622 Task9622(int m, int v, int h)
        {
            if (m <= 0)
            {
                throw new Exception("Значение M должно быть положительным");
            }
            if (v <= 0)
            {
                throw new Exception("Значение V должно быть положительным");
            }
            if (h < 0)
            {
                throw new Exception("Значение H должно быть неотрицательным");
            }
            double g = 9.8067;
            return new class9622((double)m * v * v / 2, (double)m * g * h);
        }

        public static double Task8873(int r1, int r2)
        {
            if (r1 == 0)
            {
                throw new Exception("Значение r1 должно быть не равно нулю");
            }
            if (r2 == 0)
            {
                throw new Exception("Значение r2 должно быть не равно нулю");
            }
            return 1.0 / r1 + 1.0 / r2;
        }

        public static double Task7799(int m, int a)
        {
            if (m <= 0)
            {
                throw new ArgumentException("Масса должна быть положительной");
            }
            double g = 9.8067;
            if (a >= 90)
            {
                return 0;
            }
            return m * g * Math.Cos(a * Math.PI / 180);
        }

        public static double Task9354(int a, int b, int c)
        {
            if (a == 0)
            {
                throw new ArgumentException(String.Format("Уравнение y={0}x^2+{1}x+{2} не является квадратным", a, b, c));
            }
            return b * b - 4 * a * c;
        }

        public static double Task9130(int m1, int m2, int r)
        {
            if (r == 0)
            {
                throw new Exception("Значение r должно быть не равно нулю");
            }
            double g = 9.8067;
            return (double)g * m1 * m2 / r / r;
        }

        public static double Task5895(int a, int b, int c)
        {
            return Math.Sqrt(a * a + b * b - 2 * a * b * Math.Cos(c * Math.PI / 180));
        }

        public static double Task2461(int a, int b, int c, int d)
        {
            if (a == 0)
            {
                throw new Exception("Значение a должно быть не равно нулю");
            }
            if (d == 0)
            {
                throw new Exception("Значение d должно быть не равно нулю");
            }
            return (double)(a * d + b * c) / (a * d);
        }

        public static double Task2790(int x)
        {
            //return Math.Abs(Math.Cos(x * Math.PI / 180.0));
            double Sin = Math.Sin(x * Math.PI / 180.0);
            return Math.Sqrt(1.0 - Sin * Sin);
        }

        public static double Task2624(long a, long b, long c, long x)
        {
            if (a * x * x + b * x + c < 0)
            {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            double denominator = Math.Sqrt(a * x * x + b * x + c);
            if (denominator == 0)
            {
                throw new Exception("Знаменатель не может быть равен нулю");
            }
            return 1.0 / denominator;
        }

        public static double Task5871(double x)
        {
            if (x < 5)
            {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            return (Math.Sqrt(x + 5) + Math.Sqrt(x - 5)) / 2 / Math.Sqrt(x);
        }

        public static double Task9164(int a, int b)
        {
            double ar = a * Math.PI / 180;
            double br = b * Math.PI / 180;
            return Math.Sin(ar) * Math.Cos(br) + Math.Cos(ar) * Math.Sin(br);
        }

        public static double Task7457(int x)
        {
            return 7 * x * x - 3 * x + 6;
        }

        public static double Task9865(double a)
        {
            return 12 * a * a + 7 * a - 16;
        }

        public static double Task3591(int h)
        {
            if (h < 0)
            {
                throw new Exception("Высота над уровнем Земли должна быть неотрицательна");
            }
            double r = 6350;
            double c = r + h;
            return Math.Sqrt(c * c - r * r);
        }

        public static double Task3558(int a, int b)
        {
            double ar = 2 * a * Math.PI / 180;
            double br = 3 * b * Math.PI / 180;
            return 3 * Math.Sin(ar) * Math.Cos(br);
        }

        public static double Task4366(int x1, int x2)
        {
            return Math.Sqrt(x2 * x2 + x1 * x1);
        }

        public static double Task5789(int xa, int ya, int xb, int yb)
        {
            double dx = xb - xa;
            double dy = yb - ya;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public class class6522
        {
            public readonly double v;
            public readonly double t;

            public class6522(double v, double t)
            {
                this.v = v;
                this.t = t;
            }

            public override String ToString()
            {
                return String.Format("v {0:F4} t {1:F4}", v, t);
            }
        }

        public static String task5870(int timeInSeconds)
        {
            if (timeInSeconds < 0)
            {
                throw new ArgumentException("Количество времени должно быть неотрицательным");
            }
            int h = timeInSeconds / 3600;
            int m = timeInSeconds / 60 % 60;
            int s = timeInSeconds % 60;
            return String.Format("{0} часов {1} минут {2} секунд", h, m, s);
        }

        public static class6522 Task6522(int v1, int t1, int v2, int t2)
        {
            if (v1 < 0)
            {
                throw new ArgumentException("Объем должен быть неотрицательным");
            }
            if (v2 < 0)
            {
                throw new ArgumentException("Объем должен быть неотрицательным");
            }
            return new class6522(v1 + v2, (double)(t1 * v1 + t2 * v2) / (v1 + v2));
        }

        public static int Task3490(double yarnDiameterCm, int wireCoils)
        {
            if (yarnDiameterCm <= 0)
            {
                throw new ArgumentException("Длина проволоки должна быть неотрицательна");
            }
            if (wireCoils <= 0)
            {
                throw new ArgumentException("Количество витков должно быть неотрицательно");
            }
            return (int)Math.Floor(2 * yarnDiameterCm * Math.PI * wireCoils);
        }
    }
}
