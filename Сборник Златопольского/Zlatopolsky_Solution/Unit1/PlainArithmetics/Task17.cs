using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.PlainArithmetics
{
    public class Task17
    {
        public void task1_17a()
        {
            string temp;
            temp = Console.ReadLine();
            double x1 = double.Parse(temp);
            temp = Console.ReadLine();
            double x2 = double.Parse(temp);
            double result;
            result = x1 * x1 + x2 * x2;
            if (result < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            result = Math.Sqrt(result);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17b()
        {
            string temp;
            temp = Console.ReadLine();
            double x1 = double.Parse(temp);
            temp = Console.ReadLine();
            double x2 = double.Parse(temp);
            temp = Console.ReadLine();
            double x3 = double.Parse(temp);
            double result;
            result = x1 * x2 + x1 * x3 + x2 * x3;
            Console.WriteLine(result);
        }

        public void task1_17c()
        {
            string temp;
            temp = Console.ReadLine();
            double v0 = double.Parse(temp);
            temp = Console.ReadLine();
            double t = double.Parse(temp);
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            double result;
            result = v0 * t + a * t * t / 2;
            Console.WriteLine(result);
        }

        public void task1_17d()
        {
            string temp;
            temp = Console.ReadLine();
            double m = double.Parse(temp);
            temp = Console.ReadLine();
            double v = double.Parse(temp);
            double g = 9.8067d;
            temp = Console.ReadLine();
            double h = double.Parse(temp);
            double result;
            result = m * v * v / 2 + m * g * h;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17e()
        {
            string temp;
            temp = Console.ReadLine();
            double R1 = double.Parse(temp);
            if (R1 == 0)
            {
                Console.WriteLine("R1 не может быть равна нулю");
                return;
            }
            temp = Console.ReadLine();
            double R2 = double.Parse(temp);
            if (R2 == 0)
            {
                Console.WriteLine("R2 не может быть равна нулю");
                return;
            }
            double result;
            result = 1 / R1 + 1 / R2;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17f()
        {
            string temp;
            temp = Console.ReadLine();
            double m = double.Parse(temp);
            double g = 9.8067d;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            double result;
            result = m * g * Math.Cos(Math.PI / 180 * a);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17g()
        {
            string temp;
            temp = Console.ReadLine();
            double r = double.Parse(temp);
            double result;
            result = 2 * Math.PI * r;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17h()
        {
            string temp;
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            double result;
            result = b * b - 4 * a * c;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17i()
        {
            string temp;
            temp = Console.ReadLine();
            double m1 = double.Parse(temp);
            temp = Console.ReadLine();
            double m2 = double.Parse(temp);
            temp = Console.ReadLine();
            double y = double.Parse(temp);
            temp = Console.ReadLine();
            double r = double.Parse(temp);
            if (r == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            double result;
            result = y * m1 * m2 / (r * r);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17j()
        {
            string temp;
            temp = Console.ReadLine();
            double I = double.Parse(temp);
            temp = Console.ReadLine();
            double R = double.Parse(temp);
            double result;
            result = I * I * R;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17k()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            double result = a * b * Math.Sin(Math.PI / 180 * c);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17l()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            double result;
            result = a * a + b * b - 2 * a * b * Math.Cos(Math.PI / 180 * c);
            if (result < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            result = Math.Sqrt(result);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17m()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            temp = Console.ReadLine();
            double d = double.Parse(temp);
            double result;
            if (a == 0 || d == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            result = a * d + b * c / (a * d);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17n()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Sin(Math.PI / 180 * x);
            result = 1 - result * result;
            if (result < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            result = Math.Sqrt(result);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17o()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = a * x * x + b * x + c;
            if (result < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            result = Math.Sqrt(result);
            if (result == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            result = 1 / result;
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17p()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            if (x < 1)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            double result;
            result = (Math.Sqrt(x + 1) + Math.Sqrt(x - 1)) / (2 * Math.Sqrt(x));
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17q()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Abs(x) + Math.Abs(x + 1);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_17r()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Abs(1 - Math.Abs(x));
            Console.WriteLine("{0:F4}", result);
        }
    }
}
