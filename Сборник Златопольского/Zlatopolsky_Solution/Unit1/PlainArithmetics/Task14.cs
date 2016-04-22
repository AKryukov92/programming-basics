using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.PlainArithmetics
{
    public class Task14
    {
        public void task1_14a()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = 2 * x;
            Console.WriteLine(result);
        }

        public void task1_14b()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Sin(Math.PI / 180 * x);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14c()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            double result;
            result = a * a;
            Console.WriteLine(result);
        }

        public void task1_14d()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            if (x < 0)
            {
                Console.WriteLine("x не может быть отрицательным");
                return;
            }
            double result;
            result = Math.Sqrt(x);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14e()
        {
            string temp;
            temp = Console.ReadLine();
            double n = double.Parse(temp);
            double result;
            result = Math.Abs(n);
            Console.WriteLine(result);
        }

        public void task1_14f()
        {
            string temp = Console.ReadLine();
            double y = double.Parse(temp);
            double result;
            result = 5 * Math.Cos(Math.PI / 180 * y);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14g()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            double result;
            result = -7.5 * a * a;
            Console.WriteLine(result);
        }

        public void task1_14h()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            if (x < 0)
            {
                Console.WriteLine("x не может быть отрицательным");
                return;
            }
            double result;
            result = 3 * Math.Sqrt(x);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14i()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);

            a = Math.PI / 180 * a;
            b = Math.PI / 180 * b;
            double result;
            result = Math.Sin(a) * Math.Cos(b) + Math.Cos(a) * Math.Sin(b);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14j()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            if (b < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            double result;
            result = a * Math.Sqrt(2 * b);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14k()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            double result;
            result = 3 * Math.Sin(2 * Math.PI / 180 * a) * Math.Cos(3 * Math.PI / 180 * b);
            Console.WriteLine("{0:F4}", result);
        }

        public void task1_14l()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            temp = Console.ReadLine();
            double y = double.Parse(temp);
            if (y < 0)
            {
                Console.WriteLine("y не может быть отрицательным");
                return;
            }
            if (x + Math.Sqrt(y) < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            double result;
            result = -5 * Math.Sqrt(x + Math.Sqrt(y));
            Console.WriteLine("{0:F4}", result);
        }
    }
}
