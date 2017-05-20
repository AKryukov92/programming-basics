using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace tfa
{
    public class Lab07
    {
        static void Main(string[] args)
        {
            task2354();
            task2030();
            task9701();
        }
        public static void task2354()
        {
            Console.WriteLine();
            Console.WriteLine("4265");
            Console.WriteLine(task4265("sABCD"));
            Console.WriteLine(task4265("Uxyz"));
            Console.WriteLine(task4265("s"));
            Console.WriteLine(task4265("F123"));
            Console.WriteLine(task4265("Sopqr"));

            Console.WriteLine();
            Console.WriteLine("9925");
            int result9925 = task9925("один, два, три, четыре, пять");
            Console.WriteLine(result9925 - 5);
            Console.WriteLine(task9925("янв,фев,март") - 3);
            Console.WriteLine(task9925("один") - 1);
        }

        public static void task2030()
        {
            Console.WriteLine();
            Console.WriteLine("7491");
            String[] in7491 = { "bx", "fw", "123" };
            for (int i = 0; i < in7491.Length; i++)
            {
                if (task7491(in7491[i]))
                {
                    Console.WriteLine("Содержится");
                }
                else {
                    Console.WriteLine("Не содержится");
                }
            }
        }

        public static void task9701()
        {
            Console.WriteLine();
            Console.WriteLine("9631");
            String[] in9631 = { "z", "a", "g" };
            int[] out9631 = { 0, 9, 0 };
            for (int i = 0; i < in9631.Length; i++)
            {
                try
                {
                    int result = task9631(in9631[i]);
                    Console.WriteLine("{0} ({1})", result, out9631[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9812");
            String[] in9812a = { "a", "w", "g", "x" };
            String[] in9812b = { "x", "d", "z", "u" };
            int[] out9812 = { 6, 2, 0, 0 };
            for (int i = 0; i < in9812a.Length; i++)
            {
                try
                {
                    int result = task9812(in9812a[i], in9812b[i]);
                    Console.WriteLine("{0} ({1})", result, out9812[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9279");
            String[] in9279 = { "ab", "bc", "ac", "cde", "a" };
            for (int i = 0; i < in9279.Length; i++)
            {
                try
                {
                    StringBuilder sb = new StringBuilder();
                    IList<int> result = task9279(in9279[i]);
                    foreach (int item in result)
                    {
                        sb.Append(item);
                        sb.Append(" ");
                    }
                    Console.WriteLine(sb.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("4845");
            int[] in4845a = { 0, 5, 7, -1, 20, 5, 7 };
            int[] in4845b = { 3, 9, 2, 4, 4, -2, 17 };
            for (int i = 0; i < in4845a.Length; i++)
            {
                try
                {
                    Console.WriteLine(task4845(in4845a[i], in4845b[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("5728");
            String[] in5728a = { "a", "c", "y", "g", "a" };
            String[] in5728b = { "z", "d", "d", "z", "l" };
            for (int i = 0; i < in5728a.Length; i++)
            {
                try
                {
                    Console.WriteLine(task5728(in5728a[i], in5728b[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("5923");
            int[] in5923a = { 5, 6, 0, -1, 9, 5 };
            int[] in5923b = { 3, 0, 7, 1, 3, -2 };
            for (int i = 0; i < in5923a.Length; i++)
            {
                try
                {
                    Console.WriteLine(task5923(in5923a[i], in5923b[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("2166");
            String[] in2166 = { "cd", "aa", "xy", "abc", "f" };
            for (int i = 0; i < in2166.Length; i++)
            {
                try
                {
                    Console.WriteLine(task2166(in2166[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("9116");
            String[] in9116 = {"\"   12345\"",
                "\"abcdef    \"",
                "\"  xyz  \"",
                "\"  a b  \"",
                "\" pq\"rt \"",
                "asdf\"",
                "\"xyz",
                "p\"w\""};
            for (int i = 0; i < in9116.Length; i++)
            {
                try
                {
                    Console.WriteLine(task9116(in9116[i]));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("1618");
            String[] in1618 = {
                "{}",
                "{{}}",
                "{{}}{}",
                "{{}{}}",
                "{{{{}{}}{{}{{}}{}}}{{}{}}}",
                "{",
                "{{}",
                "{{}}{",
                "{{{}}{}{}}{{}{}{}",
                "}",
                "{}}",
                "{{{}{}}}{{}{}}{{}}}"};
            for (int i = 0; i < in1618.Length; i++)
            {
                try
                {
                    task1618(in1618[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.Read();
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

        private static IList<int> task9279(string x)
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

        private static String task4845(int a, int b) {
            if (a < 0 || a > STR.Length){
                throw new Exception("Значение A должно быть в интервале [0,длина строки)");
            }
            if (b < 0 || b > STR.Length){
                throw new Exception("Значение B должно быть в интервале [0,длина строки)");
            }
            if (a > b)
            {
                return STR.Substring(b, a + 1);
            }
            else
            {
                return STR.Substring(a, b + 1);
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