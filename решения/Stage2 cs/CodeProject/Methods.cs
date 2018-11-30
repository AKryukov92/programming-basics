using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Methods
    {
        public static void Task1860(String a)
        {
            Console.WriteLine("Мы стремимся к " + a);
        }

        public static void Task4140(String firstName, String lastName)
        {
            Console.WriteLine("Меня зовут " + lastName + ", " + firstName + " " + lastName);
        }

        public static void Task2632(int cx, int cy, int r, String fill)
        {
            Console.WriteLine("<circle cx=\"{0}\" cy=\"{1}\" r=\"{2}\" fill=\"{3}\"/>", cx, cy, r, fill);
        }

        public static void Task7474(int a, int b, int c)
        {
            Console.WriteLine($"Квадратное уравнение {a}*x*x + {b}*x + {c} = 0.\n" +
                $"Его дискриминант вычисляется по формуле: d = {b}*{b} - 4*{a}*{c}");
        }

        public static double Task4411(double x)
        {
            double result;
            result = x + 7;
            return result;
        }

        public static double Task2790(double xDeg)
        {
            double result;
            //double sin = Math.Sin(xDeg * Math.PI / 180);
            //result = Math.Sqrt(1 - sin * sin);
            result = Math.Abs(Math.Cos(xDeg * Math.PI / 180));
            return result;
        }

        public static String Task5662(double a, double b, double c)
        {
            if (a == 0)
            {
                return "Данное уравнение не является квадратным";
            }
            double d = b * b - 4 * a * c;
            String equation = a + "x^2 + " + b + "x + " + c + " = 0";
            if (d == 0)
            {
                return "Уравнение " + equation + " имеет один корень";
            }
            else if (d < 0)
            {
                return "Вещественных корней уравнения " + equation + " нет";
            }
            else
            {
                return "У уравнения " + equation + " два вещественных корня";
            }
        }

        public static long Task3669(int a, int b)
        {
            int from, to;
            if (a < b)
            {
                from = a;
                to = b;
            }
            else
            {
                from = b;
                to = a;
            }
            long result = 1;
            while (from <= to)
            {
                result *= from;
                from++;
            }
            return result;
        }

        public static String Task1292(char x)
        {
            String str = "abcdefgh";
            if (str.Contains(x))
            {
                return str.Substring(0, str.IndexOf(x)+1);
            }
            else
            {
                return str;
            }
        }

        public static double Task3946(int[] data)
        {
            if (data.Length == 0)
            {
                return 0;
            }
            double sum = 0;
            int i = 0;
            while (i < data.Length)
            {
                sum += data[i];
                i++;
            }
            return sum / data.Length;
        }

        public static int Task4283(int m, int[] data)
        {
            int count = 0;
            int i = 0;
            while (i < data.Length)
            {
                if (data[i] == m)
                {
                    count++;
                }
                i++;
            }
            return count;
        }

        public static double[] Task6497(int[] data)
        {
            double[] result = new double[data.Length];
            if (data.Length == 0)
            {
                return result;
            }
            double sum = 0;
            int i = 0;
            while (i < data.Length)
            {
                sum += data[i];
                i++;
            }
            double avg = sum / data.Length;
            i = 0;
            while (i < data.Length)
            {
                result[i] = Math.Abs(data[i] - avg);
                i++;
            }
            return result;
        }

        public static void Task9774(double m, double[] data)
        {
            int i = 0;
            while (i < data.Length)
            {
                data[i] = data[i] * m;
                i++;
            }
        }

        public static void Task9271(double[] data)
        {
            double min = data.Min();
            int i = 0;
            while (i < data.Length)
            {
                data[i] = data[i] - min;
                i++;
            }
        }

        public static bool Task4847(int a, int b, int c)
        {
            bool result;
            result = a == b && b == c && c == a;
            return result;
        }

        public static bool Task6740(int x, int y)
        {
            return 1 <= x && x <= 3 && -2 <= y && y <= -1;
        }

        public static double Task1934(int a, int b)
        {
            if (b > 0)
            {
                ArgumentException exception = new ArgumentException("Подкоренное выражение должно быть неотрицательно");
                throw exception;
            }
            double result;
            result = a * Math.Sqrt(-7 * b);
            return result;
        }

        public static double Task3943(int x, int y)
        {
            if (y < 0)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательно");
            }
            if (x + Math.Sqrt(y) < 0)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательно");
            }
            double result = -5 * Math.Sqrt(x + Math.Sqrt(y));
            return result;
        }
        
        public static double Task9020(int x)
        {
            if (x > 61)
            {
                ArgumentException exception = new ArgumentException("Подкоренное выражение должно быть неотрицательным");
                throw exception;
            }
            double result = 3 * Math.Sqrt(61 - x);
            return result;
        }

        public static double Task5871(int x)
        {
            if (x < 5)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательным");
            }
            double result = (Math.Sqrt(x + 5) + Math.Sqrt(x - 5)) / 2 / Math.Sqrt(x);
            return result;
        }

        public static double Task7799(int mass, int aDeg)
        {
            if (mass <= 0)
            {
                throw new ArgumentException("Масса должна быть положительной");
            }
            if (aDeg >= 90)
            {
                return 0;
            }
            double aRad = Math.PI * aDeg / 180;
            double result = mass * 9.8067 * Math.Cos(aRad);
            return result;
        }

        public static double Task9354(int a, int b, int c)
        {
            if (a == 0)
            {
                String message = String.Format("Уравнение y={0}x^2+{1}x+{2} не является квадратным", a, b, c);
                throw new ArgumentException(message);
            }
            return b * b - 4 * a * c;
        }

        public static bool Task5170(int y)
        {
            if (y < 0)
            {
                throw new ArgumentException("Значение Y должно быть положительным");
            }
            int i = 2;
            while (i < y / 2)
            {
                if (y%i == 0)
                {
                    return false;
                }
                i++;
            }
            return true;
        } 
    }
}