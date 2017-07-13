using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Methods
{
    public class Lab07
    {
        static void Main(string[] args)
        {
        }

        public static String STR = "abcdefwxyz";
        public static String STR2 = "abcdacadbacdaabaadc";

        public static int task9631(String s)
        {
            if (!STR.Contains(s))
            {
                throw new Exception("Значение S отсутствует в строке");
            }
            return STR.Length - STR.IndexOf(s) - 1;
        }

        public static int task9812(String a, String b)
        {
            if (!STR.Contains(a))
            {
                throw new Exception("Значение A отсутствует в строке");
            }
            if (!STR.Contains(b))
            {
                throw new Exception("Значение B отсутствует в строке");
            }
            int indexA = STR.IndexOf(a);
            int indexB = STR.IndexOf(b);
            if (indexA < indexB)
            {
                return indexB - indexA - 1;
            }
            else {
                return indexA - indexB - 1;
            }
        }

        public static IList<int> task9279(string x)
        {
            if (x.Length != 2)
            {
                throw new Exception("Вводимая строка должна содержать ровно 2 символа");
            }
            IList<int> ret = new List<int>();
            int i = STR2.IndexOf(x);
            while (i != -1)
            {
                ret.Add(i);
                i = STR2.IndexOf(x, i + 1);
            }
            return ret;

        }

        public static String task4845(int a, int b) {
            if (a < 0 || a >= STR.Length){
                throw new Exception("Значение A должно быть в интервале [0,длина строки)");
            }
            if (b < 0 || b >= STR.Length){
                throw new Exception("Значение B должно быть в интервале [0,длина строки)");
            }
            if (a > b)
            {
                return STR.Substring(b, a - b + 1);
            }
            else
            {
                return STR.Substring(a, b - a + 1);
            }
        }

        public static String task5728(String a, String b)
        {
            if (!STR.Contains(a))
            {
                throw new Exception("Значение A отсутствует в строке");
            }
            if (!STR.Contains(b))
            {
                throw new Exception("Значение B отсутствует в строке");
            }
            int indexA = STR.IndexOf(a);
            int indexB = STR.IndexOf(b);
            if (indexA < indexB)
            {
                return STR.Substring(indexA + 1, indexB - indexA - 1);
            }
            else {
                return STR.Substring(indexB + 1, indexA - indexB - 1);
            }
        }

        public static bool task7491(String x)
        {
            return STR.Contains(x);
        }

        public static String task7222(String code)
        {
            if (code.Length != 13)
            {
                throw new Exception("Некорректная длина штрих-кода");
            }
            String country = code.Substring(0, 2);
            String manufacturer = code.Substring(3, 3);
            String product = code.Substring(7, 4);
            String checksum = code.Substring(12, 1);
            return "Код страны: " + country +
                    "\nКод изготовителя: " + manufacturer +
                    "\nКод товара: " + product +
                    "\nКонтрольное число: " + checksum;
        }

        public static String task5923(int a, int b)
        {
            if (a < 0 || a >= STR.Length)
            {
                throw new Exception("Значение A должно быть в интервале [0, длина строки)");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательно");
            }
            if ((a + b) >= STR.Length)
            {
                throw new Exception("Сумма значений A и B должна быть меньше длины строки");
            }
            return STR.Substring(0, a) + STR.Substring(a + b);
        }

        public static String task4265(String s)
        {
            if (s.StartsWith("s"))
            {
                return s.ToLower();
            }
            else if (s.StartsWith("U"))
            {
                return s.ToUpper();
            }
            else {
                return s;
            }
        }

        public static String task2166(String s)
        {
            if (s.Length != 2)
            {
                throw new Exception("Вводимая строка должна содержать ровно 2 символа");
            }
            return STR2.Replace(s, " ");
        }

        public static String task9116(String s)
        {
            if (!s.StartsWith("\"") || !s.EndsWith("\""))
            {
                throw new Exception("Строка должна начинаться и заканчиваться кавычкой");
            }
            return s.Substring(1, s.Length - 2).Trim();
        }

        public static int task9925(String s)
        {
            return s.Split(',').Length;
        }

        public static void task1618(String line)
        {
            Console.WriteLine(line);
            int openIndex;
            int depth = 0;
            int closeIndex;
            int lastIndex = 0;
            while (lastIndex < line.Length)
            {
                closeIndex = line.IndexOf("}", lastIndex);
                openIndex = line.IndexOf("{", lastIndex);
                if (openIndex >= 0 && openIndex < closeIndex)
                {
                    depth++;
                    lastIndex = openIndex;
                }
                if (openIndex >= 0 && closeIndex < 0)
                {
                    depth++;
                    lastIndex = openIndex;
                }
                if (openIndex >= 0 && openIndex > closeIndex && closeIndex >= 0)
                {
                    depth--;
                    lastIndex = closeIndex;
                }
                if (openIndex < 0 && closeIndex >= 0)
                {
                    depth--;
                    lastIndex = closeIndex;
                }
                if (openIndex < 0 && closeIndex < 0)
                {
                    break;
                }
                if (depth < 0)
                {
                    throw new Exception("Неожиданный символ '}'");
                }
                Console.Write(depth);
                lastIndex++;
            }
            if (depth > 0)
            {
                throw new Exception("Неожиданный конец строки");
            }
            Console.WriteLine();
        }
    }
}