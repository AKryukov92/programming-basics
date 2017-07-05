﻿using System;
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
            int[] in2361t = { 400, 103, 300, -800 };
            int[] in2361l = { 17, 29, -70, 20 };
            for (int i = 0; i < in2361l.Length; i++)
            {
                try
                {
                    class2361 result = task2361(in2361t[i], in2361l[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("9622");
            Console.WriteLine(task9622(7351, 7349, 7333).print());
            Console.WriteLine(task9622(19, 23, 29).print());

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
                    class6522 result = task6522(in6522v1[i], in6522t1[i], in6522v2[i], in6522t2[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("7799");
            int[] in7799mass = { 5, 7297, 10, 7, 9, 0 };
            int[] in7799a = { 45, 30, 90, 91, 100, 30 };
            double[] outs7799 = { 34.671920, 61972.336135, 0, 0, 0, 0 };
            for (int i = 0; i < in7799mass.Length; i++)
            {
                try
                {
                    double result = task7799(in7799mass[i], in7799a[i]);
                    Console.WriteLine("{0:F6} ({1:F6})", result, outs7799[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9622");
            int[] in9622m = {7351,19,-1,2,3};
            int[] in9622v = {7349,23,4,-5,6};
            int[] in9622h = {7333,29,7,8,-9};
            for (int i = 0; i < in9622m.Length; i++)
            {
                try
                {
                    class9622 result = task9622(in9622m[i], in9622v[i], in9622h[i]);
                    Console.WriteLine(result.print());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static double task4411(double x)
        {
            return x + 7;
        }

        public static int task9298(int a)
        {
            if (a <= 0) {
                throw new Exception("Значение A должно быть положительным");
            }
            return 6 * a * a;
        }

        public static int task3354(int a)
        {
            if (a <= 0) {
                throw new Exception("Значение A должно быть положительным");
            }
            return a * a * a;
        }

        public static double task5201(int r)
        {
            if (r <= 0) {
                throw new Exception("Значение R должно быть положительным");
            }
            return 2 * Math.PI * r;
        }

        public static double task2981(int r)
        {
            if (r <= 0) {
                throw new Exception("Значение R должно быть положительным");
            }
            return 4 * Math.PI * r * r * r / 3;
        }

        public static double task4312(int a, int h)
        {
            if (a <= 0) {
                throw new Exception("Значение A должно быть положительным");
            }
            if (h <= 0) {
                throw new Exception("Значение H должно быть положительным");
            }
            return (double)a * (double)h / 2;
        }

        public static double task8428(int a)
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

        public static class2361 task2361(int t, int l)
        {
            if (t <= 0) {
                throw new Exception("Значение T должно быть положительным");
            }
            if (l <= 0) {
                throw new Exception("Значение L должно быть положительным");
            }
            return new class2361(t * 100 / l, t * 100 % l);
        }

        public static int task5063(int a)
        {
            return a % 360;
        }

        public static double task7711(int x)
        {
            return Math.Sin(x * Math.PI / 180);
        }

        public static double task8833(int x)
        {
            if (x < 0) {
                throw new Exception("Значение X должно быть неотрицательным");
            }
            return Math.Sqrt(x);
        }

        public static double task1262(int y)
        {
            return 5 * Math.Cos(y * Math.PI / 180);
        }

        public static double task9020(int x)
        {
            if (x > 61)
            {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            return 3 * Math.Sqrt(61 - x);
        }

        public static double task1934(int a, int b)
        {
            if (b > 0) {
                throw new Exception("Значение B должно быть не положительным");
            }
            return a * Math.Sqrt(-7 * b);
        }

        public static double task7237(double t)
        {
            if (t < -273.15) {
                throw new Exception("Значение T должно быть не ниже абсолютного нуля");
            }
            return t * 1.8 + 32;
        }

        public static double task3943(int x, int y)
        {
            if (y < 0) {
                throw new Exception("Значение y должно быть неотрицательным");
            }
            if (x + Math.Sqrt(y) < 0) {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            return -5 * Math.Sqrt(x + Math.Sqrt(y));
        }

        public static double task7619(int v1, int v2, int s)
        {
            if (v1 < 0) {
                throw new Exception("Значение v1 должно быть неотрицательным");
            }
            if (v2 < 0) {
                throw new Exception("Значение v2 должно быть неотрицательным");
            }
            return (double)s / (v1 + v2);
        }

        public static int task3832(int x1, int x2, int x3)
        {
            return x1 * x2 + x1 * x3 + x2 * x3;
        }

        public static double task1346(long v, long t, long a)
        {
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

        public static class9622 task9622(int m, int v, int h)
        {
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
            return new class9622((double)m * v * v / 2, (double)m * g * h);
        }

        public static double task8873(int r1, int r2)
        {
            if (r1 == 0) {
                throw new Exception("Значение r1 должно быть не равно нулю");
            }
            if (r2 == 0) {
                throw new Exception("Значение r2 должно быть не равно нулю");
            }
            return 1.0 / r1 + 1.0 / r2;
        }

        public static double task7799(int m, int a)
        {
            if (m <= 0)
            {
                throw new Exception("Масса должна быть положительной");
            }
            double g = 9.8067;
            if (a >= 90)
            {
                return 0;
            }
            return m * g * Math.Cos(a * Math.PI / 180);
        }

        public static double task9354(int a, int b, int c)
        {
            return b * b - 4 * a * c;
        }

        public static double task9130(int m1, int m2, int r)
        {
            if (r == 0) {
                throw new Exception("Значение r должно быть не равно нулю");
            }
            double g = 9.8067;
            return (double)g * m1 * m2 / r / r;
        }

        public static double task5895(int a, int b, int c)
        {
            return Math.Sqrt(a * a + b * b - 2 * a * b * Math.Cos(c * Math.PI / 180));
        }

        public static double task2461(int a, int b, int c, int d)
        {
            if (a == 0) {
                throw new Exception("Значение a должно быть не равно нулю");
            }
            if (d == 0) {
                throw new Exception("Значение d должно быть не равно нулю");
            }
            return (double)(a * d + b * c) / (a * d);
        }

        public static double task2790(int x)
        {
            double Sin = Math.Sin(x * Math.PI / 180.0);
            return Math.Sqrt(1.0 - Sin * Sin);
        }

        public static double task2624(long a, long b, long c, long x)
        {
            if (a * x * x + b * x + c < 0) {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            double denominator = Math.Sqrt(a * x * x + b * x + c);
            if (denominator == 0) {
                throw new Exception("Знаменатель не может быть равен нулю");
            }
            return 1.0 / denominator;
        }

        public static double task5871(double x)
        {
            if (x < 5) {
                throw new Exception("Подкоренное выражение должно быть неотрицательным");
            }
            return (Math.Sqrt(x + 5) + Math.Sqrt(x - 5)) / 2 / Math.Sqrt(x);
        }

        public static double task9164(int a, int b)
        {
            double ar = a * Math.PI / 180;
            double br = b * Math.PI / 180;
            return Math.Sin(ar) * Math.Cos(br) + Math.Cos(ar) * Math.Sin(br);
        }

        public static double task7457(int x)
        {
            return 7 * x * x - 3 * x + 6;
        }

        public static double task9865(double a)
        {
            return 12 * a * a + 7 * a - 16;
        }

        public static double task3591(int h)
        {
            if (h < 0)
            {
                throw new Exception("Высота над уровнем Земли должна быть неотрицательна");
            }
            double r = 6350;
            double c = r + h;
            return Math.Sqrt(c * c - r * r);
        }

        public static double task3558(int a, int b)
        {
            double ar = 2 * a * Math.PI / 180;
            double br = 3 * b * Math.PI / 180;
            return 3 * Math.Sin(ar) * Math.Cos(br);
        }

        public static double task4366(int x1, int x2)
        {
            return Math.Sqrt(x2 * x2 + x1 * x1);
        }

        public static double task5789(int xa, int ya, int xb, int yb)
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

        public static class6522 task6522(int v1, int t1, int v2, int t2)
        {
            if (v1 < 0) {
                throw new Exception("Значение v1 должно быть неотрицательным");
            }
            if (v2 < 0) {
                throw new Exception("Значение v2 должно быть неотрицательным");
            }
            return new class6522(v1 + v2, (double)(t1 * v1 + t2 * v2) / (v1 + v2));
        }
    }
}
