using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.FormulaCalculating
{
    public class Tasks31to40
    {

        public void task1_31a()
        {
            String temp;
            double l, r;
            double avg_s;
            temp = Console.ReadLine();
            l = double.Parse(temp);
            temp = Console.ReadLine();
            r = double.Parse(temp);
            avg_s = (l + r) / 2;
            Console.WriteLine("{0:F4}", avg_s);
        }

        public void task1_31b()
        {
            String temp;
            double l, r;
            double avg_g;
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
            avg_g = Math.Sqrt(l) * Math.Sqrt(r);
            Console.WriteLine("{0:F4}", avg_g);
        }

        public void task1_32()
        {
            String temp;
            double v, m;
            double d;
            temp = Console.ReadLine();
            v = double.Parse(temp);
            if (v <= 0)
            {
                Console.WriteLine("Объем должен быть положительным");
                return;
            }
            temp = Console.ReadLine();
            m = double.Parse(temp);
            if (m <= 0)
            {
                Console.WriteLine("Масса должна быть положительной");
                return;
            }
            d = m / v;
            Console.WriteLine("{0:F4}", d);
        }

        public void task1_33()
        {
            String temp;
            int q;
            double s;
            double d;
            temp = Console.ReadLine();
            q = int.Parse(temp);
            if (q <= 0)
            {
                Console.WriteLine("Количество должно быть положительным");
                return;
            }
            temp = Console.ReadLine();
            s = double.Parse(temp);
            if (s <= 0)
            {
                Console.WriteLine("Площадь должно быть положительным");
                return;
            }
            d = q / s;
            Console.WriteLine("{0:F4}", d);
        }

        public void task1_34()
        {
            String temp;
            double a, b;
            double x;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            if (a == 0)
            {
                Console.WriteLine("a не может быть равно нулю");
                return;
            }
            temp = Console.ReadLine();
            b = double.Parse(temp);
            x = (0 - b) / a;
            Console.WriteLine("{0:F4}", x);
        }

        public void task1_35()
        {
            String temp;
            double a, b;
            double c;
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
            c = Math.Sqrt(a * a + b * b);
            Console.WriteLine("{0:F4}", c);
        }

        public void task1_36()
        {
            String temp;
            double r1, r2;
            double s;
            temp = Console.ReadLine();
            r1 = double.Parse(temp);
            temp = Console.ReadLine();
            r2 = double.Parse(temp);
            s = Math.Abs(Math.PI * r1 * r1 - Math.PI * r2 * r2);
            Console.WriteLine("{0:F4}", s);
        }

        public void task1_37()
        {
            String temp;
            double a, b;
            double c, p;
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
            c = Math.Sqrt(a * a + b * b);
            p = a + b + c;
            Console.WriteLine("{0:F4}", p);
        }

        public void task1_38()
        {
            String temp;
            double a, b, h;
            double d, c;
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

        public void task1_39()
        {
            String temp;
            double x, y;
            double z, q;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            temp = Console.ReadLine();
            y = double.Parse(temp);
            z = y + 1 / Math.Sqrt(x * x + 10);
            if (z == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            z = (x + 2 + y / x * x) / z;

            q = 2.8 * Math.Sin(Math.PI / 180 * x) + Math.Abs(y);
            Console.WriteLine("{0:F4} {1:F4}", z, q);
        }

        public void task1_40()
        {
            String temp;
            double a, b;
            double x, y;
            temp = Console.ReadLine();
            a = double.Parse(temp);
            temp = Console.ReadLine();
            b = double.Parse(temp);
            if (b < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            x = Math.Sqrt(b) + (a + b) / 2;
            if (x == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            x = (2 / (a * a + 25) + b) / x;

            y = 5.5 * a;
            if (y == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            y = (Math.Abs(a) + 2 * Math.Sin(Math.PI / 180 * b)) / y;
            Console.WriteLine("{0:F4} {1:F4}", x, y);
        }
    }
}
