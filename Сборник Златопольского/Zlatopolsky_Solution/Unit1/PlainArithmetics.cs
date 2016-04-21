using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1
{
    public class PlainArithmetics
    {
        public void task1_1_printPi()
        {
            Console.Write("{0:F2}", Math.PI);
        }

        public void task1_2_printExp()
        {
            Console.Write("{0:F1}", Math.E);
        }

        public void task1_3_printInputPrefix()
        {
            Console.Write("Вы ввели число " + Console.ReadLine());
        }

        public void task1_4_printInputPostfix()
        {
            Console.Write(Console.ReadLine() + " - вот какое число Вы ввели");
        }

        public void task1_5_printNumbersSingleSpace()
        {
            Console.Write("1 13 49");
        }

        public void task1_6_printNumbersDoubleSpace()
        {
            Console.Write("7  15  100");
        }

        public void task1_7_print3NumbersDoubleSpace()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();

            Console.Write(first + "  " + second + "  " + third);
        }

        public void task1_8_print4NumbersSingleSpace()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();
            String fourth = Console.ReadLine();

            Console.Write(first + " " + second + " " + third + " " + fourth);
        }

        public void task1_9_print50and10Column()
        {
            Console.Write("50\n10");
        }

        public void task1_10_print5and10and21Column()
        {
            Console.WriteLine("5");
            Console.WriteLine("10");
            Console.WriteLine("21");
        }

        public void task1_11_print4NumbersColumn()
        {
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            String third = Console.ReadLine();
            String fourth = Console.ReadLine();
            Console.WriteLine(first);
            Console.WriteLine(second);
            Console.WriteLine(third);
            Console.WriteLine(fourth);
        }

        public void task1_12a_printText()
        {
            Console.WriteLine("5 10");
            Console.WriteLine("5 см");
        }

        public void task1_12b_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int t;
            Boolean success;
            success = int.TryParse(temp, out t);
            if (success != true)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int v;
            success = int.TryParse(temp, out v);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine("100 " + t);
            Console.WriteLine("1949 " + v);
        }

        public void task1_12c_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int x;
            Boolean success;
            success = int.TryParse(temp, out x);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int y;
            success = int.TryParse(temp, out y);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine(x + " 25");
            Console.WriteLine(x + " " + y);
        }

        public void task1_13a_printText()
        {
            Console.WriteLine("2 кг");
            Console.WriteLine("13 17");
        }

        public void task1_13b_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int a;
            Boolean success;
            success = int.TryParse(temp, out a);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int b;
            success = int.TryParse(temp, out b);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine(a + " 1");
            Console.WriteLine("19 " + b);
        }

        public void task1_13c_printText()
        {
            string temp;
            temp = Console.ReadLine();
            int x;
            Boolean success;
            success = int.TryParse(temp, out x);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            temp = Console.ReadLine();
            int y;
            success = int.TryParse(temp, out y);
            if (success == false)
            {
                Console.WriteLine("Не удалось преобразовать строку '" + temp + "' в целое число");
                return;
            }
            Console.WriteLine(x + " " + y);
            Console.WriteLine("5 " + y);
        }

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
            Console.WriteLine("{0:F4}",result);
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
            Console.WriteLine("{0:F4}",result);
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
            Console.WriteLine("{0:F4}",result);
        }

        public void task1_14i()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            double result;
            result = Math.Sin(Math.PI / 180 * a) * Math.Cos(Math.PI / 180 * b) + Math.Cos(Math.PI / 180 * a) * Math.Sin(Math.PI / 180 * b);
            Console.WriteLine(result);
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
                Console.WriteLine();
            }
            double result;
            result = a * Math.Sqrt(2 * b);
            Console.WriteLine(result);
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
            Console.WriteLine(result);
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
            Console.WriteLine(result);
        }

        public void task1_16a()
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
            Console.WriteLine(result);
        }

        public void task1_16b()
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

        public void task1_16c()
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

        public void task1_16d()
        {
            string temp;
            temp = Console.ReadLine();
            double m = double.Parse(temp);
            temp = Console.ReadLine();
            double v = double.Parse(temp);
            double g = 9.81d;
            temp = Console.ReadLine();
            double h = double.Parse(temp);
            double result;
            result = m * v * v / 2 + m * g * h;
            Console.WriteLine(result);
        }

        public void task1_16e()
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
            Console.WriteLine(result);
        }

        public void task1_16f()
        {
            string temp;
            temp = Console.ReadLine();
            double m = double.Parse(temp);
            temp = Console.ReadLine();
            double g = 9.81d;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            double result;
            result = m * g * Math.Cos(Math.PI / 180 * a);
            Console.WriteLine(result);
        }

        public void task1_16g()
        {
            string temp;
            temp = Console.ReadLine();
            double r = double.Parse(temp);
            double result;
            result = 2 * Math.PI * r;
            Console.WriteLine(result);
        }

        public void task1_16h()
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
            Console.WriteLine(result);
        }

        public void task1_16i()
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
            double result;
            result = y * m1 * m2 / (r * r);
            Console.WriteLine(result);
        }

        public void task1_16j()
        {
            string temp;
            temp = Console.ReadLine();
            double I = double.Parse(temp);
            temp = Console.ReadLine();
            double R = double.Parse(temp);
            double result;
            result = I * I * R;
            Console.WriteLine(result);
        }

        public void task1_16k()
        {
            string temp;
            temp = Console.ReadLine();
            double a = double.Parse(temp);
            temp = Console.ReadLine();
            double b = double.Parse(temp);
            temp = Console.ReadLine();
            double c = double.Parse(temp);
            double result = a * b * Math.Sin(Math.PI / 180 * c);
            Console.WriteLine(result);
        }

        public void task1_16l()
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
            Console.WriteLine(result);
        }

        public void task1_16m()
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
            result = a * d + b * c / (a * d);
            Console.WriteLine(result);
        }

        public void task1_16n()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Sin(Math.PI /180 * x);
            result = 1 - result * result;
            if (result < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            result = Math.Sqrt(result);
            Console.WriteLine(result);
        }

        public void task1_16o()
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
            Console.WriteLine(result);
        }

        public void task1_16p()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            if (x+1 < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            if (x - 1 < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            if (x < 0)
            {
                Console.WriteLine("При данных значениях, подкоренное выражение отрицательно");
                return;
            }
            if (x == 0)
            {
                Console.WriteLine("При данных значениях, знаменатель равен нулю");
                return;
            }
            double result;
            result = Math.Sqrt(x + 1) + Math.Sqrt(x - 1) / (2 * Math.Sqrt(x));
            Console.WriteLine(result);
        }

        public void task1_16q()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Abs(x) + Math.Abs(x + 1);
            Console.WriteLine(result);
        }

        public void task1_16r()
        {
            string temp;
            temp = Console.ReadLine();
            double x = double.Parse(temp);
            double result;
            result = Math.Abs(1 - Math.Abs(x));
            Console.WriteLine(result);
        }
    }

}
