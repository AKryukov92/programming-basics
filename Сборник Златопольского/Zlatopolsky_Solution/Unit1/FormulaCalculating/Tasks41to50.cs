using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.FormulaCalculating
{
    public class Tasks41to50
    {

        public void task1_41()
        {
            String temp;
            double e, f, g, h;
            double a, b, c;
            temp = Console.ReadLine();
            e = double.Parse(temp);
            temp = Console.ReadLine();
            f = double.Parse(temp);
            temp = Console.ReadLine();
            g = double.Parse(temp);
            temp = Console.ReadLine();
            h = double.Parse(temp);
            a = Math.Abs(e - 3 / f);
            a = a * a * a + g;
            if (a == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            a = Math.Sqrt(a);
            b = Math.Cos(Math.PI / 180 * h);
            b = Math.Sin(Math.PI / 180 * e) + b * b;
            c = e * f - 3;
            if (c == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            c = 33 * g / e;
            Console.WriteLine("{0:F4} {1:F4} {2:F4}", a, b, c);
        }

        public void task1_42()
        {
            String temp;
            double e, f, g, h;
            double a, b, c;
            temp = Console.ReadLine();
            e = double.Parse(temp);
            temp = Console.ReadLine();
            f = double.Parse(temp);
            temp = Console.ReadLine();
            g = double.Parse(temp);
            temp = Console.ReadLine();
            h = double.Parse(temp);

            a = (e + f / 2) / 3;
            b = Math.Abs(h * h - g);
            c = (g - h) * (g - h) - 3 * Math.Sin(Math.PI / 180 * e);
            if (c < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            c = Math.Sqrt(c);
            Console.WriteLine("{0:F4} {1:F4} {2:F4}", a, b, c);
        }

        public void task1_43()
        {
            String temp;
            double l, r;
            double avg_s, avg_g;
            temp = Console.ReadLine();
            l = double.Parse(temp);
            if (l < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            temp = Console.ReadLine();
            r = double.Parse(temp);
            if (r < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            avg_s = (Math.Abs(l) + Math.Abs(r)) / 2;
            avg_g = Math.Sqrt(Math.Abs(l)) * Math.Sqrt(Math.Abs(r));
            Console.WriteLine("{0:F4} {1:F4}", avg_s, avg_g);
        }

        public void task1_44()
        {
            String temp;
            double a, b;
            double p, l;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            b = double.Parse(temp);
            if (b <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            p = (a + b) * 2;
            l = Math.Sqrt(a * a + b * b);
            Console.WriteLine("{0:F4} {1:F4}", p, l);
        }

        public void task1_45()
        {
            String temp;
            double a, b;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            temp = Console.ReadLine();
            b = double.Parse(temp);
            if (b == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            Console.WriteLine("{0:F4} {1:F4} {2:F4} {3:F4}", a + b, a - b, a * b, a / b);
        }

        public void task1_46()
        {
            String temp;
            double a, b, c;
            double v, s;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            temp = Console.ReadLine();
            b = double.Parse(temp);
            temp = Console.ReadLine();
            c = double.Parse(temp);
            v = a * b * c;
            s = 2 * (a * b + b * c + a * c);
            Console.WriteLine("{0:F4} {1:F4}", v, s);
        }

        public void task1_47()
        {
            String temp;
            double x1, y1, x2, y2;
            double dx, dy;
            double d;
            temp = Console.ReadLine();
            x1 = double.Parse(temp);
            temp = Console.ReadLine();
            y1 = double.Parse(temp);
            temp = Console.ReadLine();
            x2 = double.Parse(temp);
            temp = Console.ReadLine();
            y2 = double.Parse(temp);
            dx = x1 - x2;
            dy = y1 - y2;
            d = Math.Sqrt(dx * dx + dy * dy);
            Console.WriteLine("{0:F4}", d);
        }

        public void task1_48()
        {
            String temp;
            double a, b, d, c, h;
            double p;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            b = double.Parse(temp);
            if (b <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            h = double.Parse(temp);
            if (h <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            d = Math.Abs(a - b) / 2;
            c = Math.Sqrt(h * h + d * d);
            p = a + b + c + c;
            Console.WriteLine("{0:F4}", p);
        }

        public void task1_49()
        {
            String temp;
            double a, b, alpha;
            double d, h, c;
            double p;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            b = double.Parse(temp);
            if (b <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            alpha = double.Parse(temp);
            if (alpha <= 0 || alpha > 90)
            {
                Console.WriteLine("Введен некорректный угол");
                return;
            }
            d = Math.Abs(a - b) / 2;
            c = Math.Cos(Math.PI / 180 * alpha) / d;
            p = a + b + c + c;
            Console.WriteLine("{0:F4}", p);
        }

        public void task1_50()
        {
            String temp;
            double x1, y1, x2, y2, x3, y3;
            double dx, dy;
            double from1to2, from1to3, from2to3;
            temp = Console.ReadLine();
            x1 = double.Parse(temp);
            temp = Console.ReadLine();
            y1 = double.Parse(temp);
            temp = Console.ReadLine();
            x2 = double.Parse(temp);
            temp = Console.ReadLine();
            y2 = double.Parse(temp);
            temp = Console.ReadLine();
            x3 = double.Parse(temp);
            temp = Console.ReadLine();
            y3 = double.Parse(temp);
            dx = x1 - x2;
            dy = y1 - y2;
            from1to2 = Math.Sqrt(dx * dx + dy * dy);
            dx = x1 - x3;
            dy = y1 - y3;
            from1to3 = Math.Sqrt(dx * dx + dy * dy);
            dx = x2 - x3;
            dy = y2 - y3;
            from2to3 = Math.Sqrt(dx * dx + dy * dy);
            Console.WriteLine("{0:F4} {1:F4} {2:F4}", from1to2, from1to3, from2to3);
        }
    }
}
