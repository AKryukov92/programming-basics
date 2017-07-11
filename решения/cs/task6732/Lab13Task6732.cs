using Methods;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace task6732
{
    class Lab13Task6732
    {
        static void Main(string[] args)
        {
            Step2565();
            Step6066();
            Step2594();
            Step1483();
            Step3983();

            Step4236();
            Step8395();
            Step5568();
            Step2592();
            Step4075();

            Step7517();
            Step5448();
            Step5238();
            Step5171();
            Step1862();

            Step5683();
        }

        private static void Step5238()
        {
            Console.WriteLine();
            Console.WriteLine("5238");
            int[] in5238w = { 5, 4, 3, 0, 7, -11, 29 };
            int[] in5238h = { 5, 5, 5, 5, 0, 4, -2 };
            for (int i = 0; i < in5238w.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task5238(new StringBuilder(), in5238w[i], in5238h[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step5448()
        {
            Console.WriteLine();
            Console.WriteLine("5448");
            String[] in5448s = { "#", "\\", "^", "*", "56" };
            int[] in5448h = { 6, 3, 0, -2, -3 };
            for (int i = 0; i < in5448s.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task5448(new StringBuilder(), in5448s[i], in5448h[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step7517()
        {
            Console.WriteLine();
            Console.WriteLine("7517");
            int[] in7517w = { 1, 7, 5, 0, 23, -3, 7 };
            int[] in7517h = { 1, 3, 5, 17, 0, 11, -7 };
            String[] out7517 = {
                " 0\n0 |\n -",
                " 0123456\n0       |\n1       |\n2       |\n -------",
                " 01234\n0     |\n1     |\n2     |\n3     |\n" +
                        "4     |\n -----",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in7517w.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task7517(new StringBuilder(), in7517w[i], in7517h[i]);
                    if (out7517[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step4075()
        {
            Console.WriteLine();
            Console.WriteLine("4075");
            int[] in4075 = { 5, 15, 0, -2 };
            for (int i = 0; i < in4075.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task4075(new StringBuilder(), in4075[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step2592()
        {
            Console.WriteLine();
            Console.WriteLine("2592");
            String[] in2592s = { "#", "?", "*", "=", "o", "!" };
            int[] in2592w = { 5, 7, 90, 0, -2, 20 };
            int[] in2592h = { 3, 10, 0, 15, 8, -6 };
            String[] out2592 = {
                "#####\n#####\n#####\n",
                "???????\n???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n" +
                        "???????\n???????\n???????\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in2592s.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task2592(new StringBuilder(), in2592s[i], in2592w[i], in2592h[i]);
                    if (out2592[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step5568()
        {
            Console.WriteLine();
            Console.WriteLine("5568");
            int[] in5568 = { 1, 10, -2, 23 };
            for (int i = 0; i < in5568.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task5568(new StringBuilder(), in5568[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step8395()
        {
            Console.WriteLine();
            Console.WriteLine("8395");
            int[] in8395 = { 1, 13, -1, 21 };
            for (int i = 0; i < in8395.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task8395(new StringBuilder(), in8395[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step4236()
        {
            Console.WriteLine();
            Console.WriteLine("4236");
            int[] in4236 = { 3, 12, 15, -1, 16 };
            for (int i = 0; i < in4236.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task4236(new StringBuilder(), in4236[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step3983()
        {
            Console.WriteLine();
            Console.WriteLine("3983");
            int[] in3983 = { 5, 23, 51, 0, -7 };
            for (int i = 0; i < in3983.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task3983(new StringBuilder(), in3983[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step1483()
        {
            Console.WriteLine();
            Console.WriteLine("1483");
            int[] in1483 = { 4, 18, 42, 0, -9 };
            for (int i = 0; i < in1483.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task1483(new StringBuilder(), in1483[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step2594()
        {
            Console.WriteLine();
            Console.WriteLine("2594");
            int[] in2594a = { 8, 15, 0, -1 };
            String[] in2594b = { "#", " ", "?", "*" };
            for (int i = 0; i < in2594a.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task2594(new StringBuilder(),in2594a[i], in2594b[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step2565()
        {
            Console.WriteLine();
            Console.WriteLine("2565");
            int[] in2565a = { 8, 691, 3000 };
            int[] in2565b = { 13, 703, 24 };
            for (int i = 0; i < in2565a.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task2565(new StringBuilder(), in2565a[i], in2565b[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step6066()
        {
            Console.WriteLine();
            Console.WriteLine("6066");
            int[] in6066a = { 8, 691, 3000 };
            int[] in6066b = { 13, 702, 24 };
            String[] out6066 = {
                "8\n9\n10\n11\n12\n13\n",
                "691\n692\n693\n694\n695\n696\n697\n698\n699\n700\n701\n702\n",
                "ожидается исключение"};
            for (int i = 0; i < in6066a.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task6066(new StringBuilder(), in6066a[i], in6066b[i]);
                    if (out6066[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result);
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        static void Step5683()
        {
            Console.WriteLine();
            Console.WriteLine("5683");
            String[] in5683 = {
                "qw er ty",
                "qw er ty ui op",
                "asd fgh jkl",
                "",
                "q w e r a s d f z x c v"};
            for (int i = 0; i < in5683.Length; i++)
            {
                String str = Lab08.task5683(in5683[i]);
                Console.WriteLine(str);
            }
        }

        private static void Step1862()
        {
            Console.WriteLine();
            Console.WriteLine("1862");
            String[] in1862s1 = { "#", "?", "*", "=", "o", "!" };
            String[] in1862s2 = { "0", "-", "!", "+", "T", "." };
            int[] in1862w = { 5, 7, 90, 0, -2, 20 };
            int[] in1862h = { 3, 10, 0, 15, 8, -6 };
            String[] out1862 = {
                "#0#0#\n#0#0#\n#0#0#\n",
                "?-?-?-?\n?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                        "?-?-?-?\n?-?-?-?\n?-?-?-?\n" +
                        "?-?-?-?\n?-?-?-?\n?-?-?-?\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in1862s1.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task1862(new StringBuilder(), in1862s1[i], in1862s2[i], in1862w[i], in1862h[i]);
                    if (out1862[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step5171()
        {
            Console.WriteLine();
            Console.WriteLine("5171");
            String[] in5171s1 = { "#", "?", "*", "=", "o", "!" };
            String[] in5171s2 = { "0", "-", "!", "+", "T", "." };
            int[] in5171w = { 5, 7, 90, 0, -2, 20 };
            int[] in5171h = { 3, 10, 0, 15, 8, -6 };
            String[] out5171 = {
                "#####\n00000\n#####\n",
                "???????\n-------\n???????\n-------\n" +
                        "???????\n-------\n???????\n" +
                        "-------\n???????\n-------\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in5171w.Length; i++)
            {
                try
                {
                    StringBuilder result = Lab06.task5171(new StringBuilder(), in5171s1[i], in5171s2[i], in5171w[i], in5171h[i]);
                    if (out5171[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }
    }
}
