using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.FormulaCalculating
{
    public class Tasks22to30
    {
        public void task1_22a()
        {
            String temp;
            double x;
            double y;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            y = 7 * x * x - 3 * x + 6;
            Console.WriteLine("{0:F4}", y);
        }

        public void task1_22b()
        {
            String temp;
            double a;
            double x;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            x = 12 * a * a + 7 * a - 16;
            Console.WriteLine("{0:F4}", x);
        }

        public void task1_23()
        {
            String temp;
            double a;
            double y;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            y = (a * a + 10) / Math.Sqrt(a * a + 1);
            Console.WriteLine("{0:F4}", y);
        }

        public void task1_24a()
        {
            String temp;
            double a;
            double x;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            x = 2 * a + Math.Sin(Math.PI * 180 / Math.Abs(3 * a)) / 3.56;
            if (x < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            x = Math.Sqrt(x);
            Console.WriteLine(x);
        }

        public void task1_24b()
        {
            String temp;
            double x;
            double y;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            y = 1 + x;
            if (x < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            y = Math.Sin(3.2 + y / Math.Abs(5 * x));
            Console.WriteLine("{0:F4}", y);
        }

        public void task1_25()
        {
            String temp;
            double a;
            double p;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            p = a * 4;
            Console.WriteLine("{0:F4}", p);
        }

        public void task1_26()
        {
            String temp;
            double r;
            double d;
            temp = Console.ReadLine();
            r = double.Parse(temp);
            if (r <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            d = r * 2;
            Console.WriteLine("{0:F4}", d);
        }

        public void task1_27()
        {
            String temp;
            double h, r = 6350;
            double l;
            temp = Console.ReadLine();
            h = double.Parse(temp);
            if (h <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            l = Math.Sqrt((h + r) * (h + r) - r * r);
            Console.WriteLine("{0:F4}", l);
        }

        public void task1_28()
        {
            String temp;
            double a;
            double v, s;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            v = a * a * a;
            s = a * a * 6;
            Console.WriteLine("{0:F4} {1:F4}", v, s);
        }

        public void task1_29()
        {
            String temp;
            double r;
            double c, l;
            temp = Console.ReadLine();
            r = double.Parse(temp);
            if (r <= 0)
            {
                Console.WriteLine("Длина отрезка не может быть отрицательной");
                return;
            }
            c = 2 * Math.PI * r;
            l = Math.PI * r * r;
            Console.WriteLine("{0:F4} {1:F4}", c, l);
        }

        public void task1_30a()
        {
            String temp;
            double x, y;
            double z;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            temp = Console.ReadLine();
            y = double.Parse(temp);
            z = x * x * x - 2.5 * x * y + 1.78 * x * x - 2.5 * y + 1;
            Console.WriteLine("{0:F4}", z);
        }

        public void task1_30b()
        {
            String temp;
            double a, b;
            double x;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            temp = Console.ReadLine();
            b = double.Parse(temp);
            x = 3.56 * a + b * b * b - 5.8 * b * b + 3.8 * a - 1.5;
            Console.WriteLine("{0:F4}", x);
        }
    }
}
