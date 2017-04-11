using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab06
{
    class Lab06
    {
        static void Main(string[] args)
        {
            task2354();
            task7649();
            task9701();
            task6732();
            task8787();
            task3784();
        }

        public static void task3784()
        {
            Console.WriteLine();
            Console.WriteLine("5170");
            int[] in5170 = { 6, 3219, 7, 2017, -10 };
            for (int i = 0; i < in5170.Length; i++)
            {
                try
                {
                    if (task5170(in5170[i]))
                    {
                        Console.WriteLine("Число простое");
                    }
                    else
                    {
                        Console.WriteLine("Число не простое");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static void task8787()
        {
            Console.WriteLine();
            Console.WriteLine("2321");
            Console.WriteLine(String.Join(" ", task2321(8, 13)));
            Console.WriteLine(String.Join(" ", task2321(691, 702)));
            Console.WriteLine(String.Join(" ", task2321(23, 11)));
            Console.WriteLine();
            Console.WriteLine("5053");
            Console.WriteLine(String.Join(" ", task5053(8, 13)));
            Console.WriteLine(String.Join(" ", task5053(691, 702)));
            Console.WriteLine(String.Join(" ", task5053(27, 17)));

            Console.WriteLine();
            Console.WriteLine("8418");
            int[] in8418 = { 6, 385, -9 };
            for (int i = 0; i < in8418.Length; i++)
            {
                try
                {
                    var result = task8418(in8418[i]);
                    Console.WriteLine(String.Join(" ", result));
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static void task2354()
        {
            Console.WriteLine();
            Console.WriteLine("2475");
            Console.WriteLine(task2475() - 120300);

            Console.WriteLine();
            Console.WriteLine("9562");
            Console.WriteLine(task9562(15, 27) - 273);
            Console.WriteLine(task9562(25, 44) - 690);
            Console.WriteLine(task9562(80, 100) - 1890);
            Console.WriteLine(task9562(3000, 24) - 4501224);

            Console.WriteLine();
            Console.WriteLine("3669");
            Console.WriteLine(task3669(8, 13) - 1235520);
            Console.WriteLine(task3669(159, 161) - 4095840);
            Console.WriteLine(task3669(648, 648) - 648);
            Console.WriteLine(task3669(-2, 600));
            Console.WriteLine(task3669(50, 24) - 2421409269157986304L);

            Console.WriteLine();
            Console.WriteLine("5951");
            Console.WriteLine(task5951() - 630);

            Console.WriteLine();
            Console.WriteLine("6580");
            Console.WriteLine(task6580(15, 27) - 5915);
            Console.WriteLine(task6580(25, 44) - 24470);
            Console.WriteLine(task6580(80, 100) - 170870);
            Console.WriteLine(task6580(3000, 24) - 414561584);

            Console.WriteLine();
            Console.WriteLine("5969");
            Console.WriteLine(task5969(8, 13));
            Console.WriteLine(task5969(25, 44) - 105);
            Console.WriteLine(task5969(80, 100) - 273);
            Console.WriteLine(task5969(300, 24) - 6279);

            Console.WriteLine();
            Console.WriteLine("8696");
            Console.WriteLine(task8696() - 69);
        }

        public static void task7649()
        {
            Console.WriteLine("8495");
            StringBuilder sb8495 = new StringBuilder();
            sb8495 = sb8495.Append("@");
            sb8495 = task8495(sb8495);
            sb8495 = sb8495.Append("#");
            Console.WriteLine(sb8495.ToString());

            Console.WriteLine();
            Console.WriteLine("1315");
            StringBuilder sb1315 = new StringBuilder();
            sb1315.Append("@");
            task1315(sb1315);
            sb1315.Append("#");
            Console.WriteLine(sb1315);

            Console.WriteLine();
            Console.WriteLine("3762");
            String result3762 = task3762(new StringBuilder()).ToString();
            Console.WriteLine(result3762);

            Console.WriteLine();
            Console.WriteLine("3550");
            StringBuilder sb3550 = task3550(
                    new StringBuilder()
                            .Append("@"))
                    .Append("#");
            Console.WriteLine(sb3550.ToString());

            Console.WriteLine();
            Console.WriteLine("6572");
            StringBuilder sb6572 = new StringBuilder();
            task6572(sb6572, 8, 13);
            task6572(sb6572, 691, 703);
            task6572(sb6572, 19, 3);
            Console.WriteLine(sb6572);

            Console.WriteLine();
            Console.WriteLine("2084");
            String result2084;
            result2084 = task2084(new StringBuilder(), 20, 30).Append("\n")
                    .Append(task2084(new StringBuilder(), 8, 13)).Append("\n")
                    .Append(task2084(new StringBuilder(), 571, 580)).Append("\n")
                    .Append(task2084(new StringBuilder(), 691, 703)).Append("\n")
                    .Append(task2084(new StringBuilder(), -71, -90)).Append("\n")
                    .Append(task2084(new StringBuilder(), 64, 58)).Append("\n")
                    .Append(task2084(new StringBuilder(), 19, 7)).Append("\n")
                    .Append(task2084(new StringBuilder(), 401, 390)).Append("\n")
                    .Append(task2084(new StringBuilder(), 800, 785)).Append("\n")
                    .ToString();
            Console.WriteLine(result2084);

            Console.WriteLine();
            Console.WriteLine("5411");
            String result5411 = task5411(
                    task5411(
                            task5411(new StringBuilder(), 7, 11)
                                    .Append("\n")
                            , 211, 223).Append("\n")
                    , 37, 29).Append("\n")
                    .ToString();
            Console.WriteLine(result5411);

            Console.WriteLine();
            Console.WriteLine("7585");
            int[] in7585 = { 10, 15, 20, 9, 21 };
            String[] out7585 = {
                "10+\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15+\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20+\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n"};
            for (int i = 0; i < in7585.Length; i++)
            {
                StringBuilder result = task7585(new StringBuilder(), in7585[i]);
                if (out7585[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result);
                }
            }

            Console.WriteLine();
            Console.WriteLine("8770");
            int[] in8770 = { 30, 37, 40, 8, 100 };
            String[] out8770 = {
                "30+\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37+\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40+\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n"};
            for (int i = 0; i < in8770.Length; i++)
            {
                StringBuilder result = task8770(new StringBuilder(), in8770[i]);
                if (out8770[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result.ToString());
                }
            }
        }

        public static void task9701()
        {
            Console.WriteLine();
            Console.WriteLine("9180");
            int[] in9180 = { -100, 7, 368, 501, -101 };
            int[] outs9180 = { 120200, 125229, 57722, 0, 0 };
            for (int i = 0; i < in9180.Length; i++)
            {
                try
                {
                    int result = task9180(in9180[i]);
                    Console.WriteLine("{0} ({1})", result, outs9180[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("1544");
            int[] in1544 = { 12, 70, 368, 10000, -11, 10001 };
            int[] outs1544 = { 23, 2430, 67841, 50004945, 0, 0 };
            for (int i = 0; i < in1544.Length; i++)
            {
                try
                {
                    int result = task1544(in1544[i]);
                    Console.WriteLine("{0} ({1})", result, outs1544[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("2802");
            int[] in2802 = { 4, 11, 19, -1, 0 };
            double[] out2802 = { 2.0833, 3.0198, 3.5477 };
            for (int i = 0; i < in2802.Length; i++)
            {
                try
                {
                    double result = task2802(in2802[i]);
                    Console.WriteLine("{0:F6} ({1:F6})", result, out2802[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static void task6732()
        {
            Console.WriteLine();
            Console.WriteLine("6066");
            int[] in6066a = { 8, 691, 3000 };
            int[] in6066b = { 13, 702, 24 };
            String[] out6066 = {
                "8\n9\n10\n11\n12\n13\n",
                "691\n692\n693\n694\n695\n696\n"+
                        "697\n698\n699\n700\n701\n702\n",
                "ожидается исключение"};
            for (int i = 0; i < in6066a.Length; i++)
            {
                try
                {
                    StringBuilder result = task6066(new StringBuilder(),
                            in6066a[i], in6066b[i]);
                    if (out6066[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result);
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("2565");
            int[] in2565a = { 8, 691, 3000 };
            int[] in2565b = { 13, 703, 24 };
            for (int i = 0; i < in2565a.Length; i++)
            {
                try
                {
                    StringBuilder result = task2565(new StringBuilder(),
                            in2565a[i], in2565b[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("2594");
            int[] in2594a = { 8, 15, 0, -1 };
            String[] in2594b = { "#", " ", "?", "*" };
            for (int i = 0; i < in2594a.Length; i++)
            {
                try
                {
                    StringBuilder result = task2594(new StringBuilder(),
                            in2594a[i], in2594b[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("3983");
            int[] in3983 = { 5, 23, 51, 0, -7 };
            for (int i = 0; i < in3983.Length; i++)
            {
                try
                {
                    StringBuilder result = task3983(
                            new StringBuilder(), in3983[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("4236");
            int[] in4236 = { 3, 12, 15, -1, 16 };
            for (int i = 0; i < in4236.Length; i++)
            {
                try
                {
                    StringBuilder result = task4236(
                            new StringBuilder(), in4236[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("8395");
            int[] in8395 = { 1, 13, -1, 21 };
            for (int i = 0; i < in8395.Length; i++)
            {
                try
                {
                    StringBuilder result = task8395(
                            new StringBuilder(), in8395[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("5568");
            int[] in5568 = { 1, 10, -2, 23 };
            for (int i = 0; i < in5568.Length; i++)
            {
                try
                {
                    StringBuilder result = task5568(
                            new StringBuilder(), in5568[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

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
                    StringBuilder result = task2592(new StringBuilder(),
                            in2592s[i],in2592w[i],in2592h[i]);
                    if (out2592[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("4075");
            int[] in4075 = { 5, 15, 0, -2 };
            for (int i = 0; i < in4075.Length; i++)
            {
                try
                {
                    StringBuilder result = task4075(
                            new StringBuilder(), in4075[i]);
                    Console.WriteLine(result.ToString());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

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
                    StringBuilder result = task7517(new StringBuilder(),
                            in7517w[i], in7517h[i]);
                    if (out7517[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("5448");
            String[] in5448s = { "#", "\\", "^", "*", "56" };
            int[] in5448h = { 6, 3, 0, -2, -3 };
            String[] out5448 = {
                "#\n##\n###\n####\n#####\n######\n",
                "\\\n\\\\\n\\\\\\\n",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in5448s.Length; i++)
            {
                try
                {
                    StringBuilder result = task5448(new StringBuilder(), in5448s[i], in5448h[i]);
                    if (out5448[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("5238");
            int[] in5238w = { 5, 4, 0, 7, -11, 29 };
            int[] in5238h = { 5, 5, 5, 0, 4, -2 };
            String[] out5238 = {
                "+++++\n++++#\n+++##\n++###\n+####\n",
                "++++\n+++#\n++##\n+###\n####\n",
                "",
                "",
                "ожидается исключение",
                "ожидается исключение"};
            for (int i = 0; i < in5238w.Length; i++)
            {
                try
                {
                    StringBuilder result = task5238(new StringBuilder(), in5238w[i], in5238h[i]);
                    if (out5238[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

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
                    StringBuilder result = task5171(new StringBuilder(),
                            in5171s1[i], in5171s2[i], in5171w[i], in5171h[i]);
                    if (out5171[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        result.Insert(0, "Неверно. Результат:\n");
                        Console.WriteLine(result.ToString());
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

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
                    StringBuilder result = task1862(new StringBuilder(),
                            in1862s1[i], in1862s2[i], in1862w[i], in1862h[i]);
                    if (out1862[i].Equals(result.ToString()))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
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
        
        public static StringBuilder task8495(StringBuilder sb)
        {
            int i = 0;
            while (i < 13)
            {
                sb.Append("!");
                i++;
            }
            return sb;
        }

        public static StringBuilder task1315(StringBuilder sb)
        {
            int a = 17;
            int b = 47;
            while (a <= b)
            {
                sb.Append(a);
                sb.Append(" ");
                a++;
            }
            return sb;
        }

        public static StringBuilder task6066(StringBuilder sb, int a, int b)
        {
            if (a > b) {
                throw new Exception("Значение A должно быть не больше значения B");
            }
            int i = a;
            while (i <= b) {
                sb.Append(i);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder task2565(StringBuilder sb, int a, int b)
        {
            if (a > b) {
                throw new Exception("Значение A должно быть не больше значения B");
            }
            int i = b;
            while (i >= a) {
                sb.Append(i);
                sb.Append(" ");
                i--;
            }
            return sb;
        }

        public static StringBuilder task2594(StringBuilder sb, int a, String b)
        {
            if (a < 0) {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            int i = 0;
            sb.Append("\"");
            while (i < a) {
                sb.Append(b);
                i++;
            }
            sb.Append("\"");
            return sb;
        }

        public static IList<int> task2321(int a, int b)
        {
            int i, n;
            IList<int> ret = new List<int>();
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                ret.Add(i);
                i++;
            }
            return ret;
        }

        public static IList<int> task5053(int a, int b)
        {
            IList<int> ret = new List<int>();
            if (a < b)
            {
                while (a <= b)
                {
                    ret.Add(a);
                    a++;
                }
            }
            else {
                while (b <= a)
                {
                    ret.Add(a);
                    a--;
                }
            }
            return ret;
        }

        public static StringBuilder task3762(StringBuilder sb)
        {
            int i = 1;
            while (i <= 20)
            {
                sb.Append(i);
                sb.Append(" ");
                sb.Append(i * 453);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder task3550(StringBuilder sb)
        {
            int i = 1;
            while (i <= 9)
            {
                sb.Append(i);
                sb.Append(" x 7 = ");
                sb.Append(i * 7);
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static int task2475()
        {
            int a = 100, b = 500, sum = 0;
            while (a <= b)
            {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int task9180(int a)
        {
            if (a < -100 || a > 500) {
                throw new Exception("Значение A должно быть в интервале [-100, 500]");
            }
            int b = 500, sum = 0;
            while (a <= b) {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int task1544(int b)
        {
            if (b < -10 || b > 10000) {
                throw new Exception("Значение b должно быть в интервале [-10,10000]");
            }
            int a = -10, sum = 0;
            while (a <= b) {
                sum += a;
                a++;
            }
            return sum;
        }

        public static int task9562(int a, int b)
        {
            int n;
            int i;
            if (a > b)
            {
                i = b;
                n = a;
            }
            else {
                i = a;
                n = b;
            }
            int sum = 0;
            while (i <= n)
            {
                sum += i;
                i++;
            }
            return sum;
        }

        public static long task3669(int a, int b)
        {
            long mul = 1;
            long i, n;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                mul *= i;
                i++;
            }
            return mul;
        }

        public static int task5951()
        {
            int i = 20;
            int n = 40;
            int sum = 0;
            while (i <= n)
            {
                sum += i;
                i++;
            }
            return sum;
        }

        public static double task2802(int n)
        {
            if (n <= 0) {
                throw new Exception("Значение N должно быть положительным");
            }
            int i = 1;
            double sum = 0;
            while (i <= n) {
                sum += 1.0 / i;
                i++;
            }
            return sum;
        }

        public static int task6580(int a, int b)
        {
            int i, n;
            int sum = 0;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            while (i <= n)
            {
                sum += i * i;
                i++;
            }
            return sum;
        }

        public static StringBuilder task7585(StringBuilder sb, int x)
        {
            int i = 10;
            while (i <= 20)
            {
                sb.Append(i);
                if (i == x)
                {
                    sb.Append("+");
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder task3983(StringBuilder sb, int n)
        {
            if (n < 0) {
                throw new Exception("Значение N должно быть неотрицательным");
            }
            int i = 1;
            while (i <= n) {
                sb.Append("#");
                if (i % 20 == 0)
                {
                    sb.Append("\n");
                }
                i++;
            }
            return sb;
        }

        public static StringBuilder task8770(StringBuilder sb, int x)
        {
            int i = 30;
            while (i <= 40)
            {
                sb.Append(i);
                if (i == x)
                {
                    sb.Append("+");
                }
                else {
                    sb.Append("-");
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder task4236(StringBuilder sb, int y)
        {
            if (y < 0 || y > 15) {
                throw new Exception("Значение Y должно быть в интервале [0, 15]");
            }
            int i = 0;
            while (i < y) {
                sb.Append("#");
                i++;
            }
            while (i < 15) {
                sb.Append(".");
                i++;
            }
            return sb;
        }

        public static int task5969(int a, int b)
        {
            int i, n;
            if (a < b)
            {
                i = a;
                n = b;
            }
            else {
                i = b;
                n = a;
            }
            int sum = 0;
            while (i < n)
            {
                if (i % 7 == 0)
                {
                    sum += i;
                }
                i++;
            }
            return sum;
        }

        public static int task8696()
        {
            int i = 100, n = 1000;
            int count = 0;
            while (i <= n)
            {
                if (i % 13 == 0)
                {
                    count++;
                }
                i++;
            }
            return count;
        }

        public static IList<int> task8418(int x)
        {
            if (x <= 0) {
                throw new Exception("Значение X должно быть положительным");
            }
            int i = 1;
            IList<int> ret = new List<int>();
            while (i < x / 2 + 1) {
                if (x % i == 0) {
                    ret.Add(i);
                }
                i++;
            }
            return ret;
        }

        public static bool task5170(int y)
        {
            if (y <= 0) {
                throw new Exception("Значение Y должно быть положительным");
            }
            int i = 2;
            while (i < y / 2 + 1) {
                if (y % i == 0)
                {
                    return false;
                }
                i++;
            }
            return true;
        }

        public static StringBuilder task8395(StringBuilder sb, int w)
        {
            if (w < 0 || w > 20) {
                throw new Exception("Значение W должно быть в интервале [0, 20]");
            }
            for (int i = 0; i < w; i++) {
                sb.Append("a");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("b");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("c");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("d");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("e");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("f");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("g");
            }
            sb.Append("\n");
            for (int i = 0; i < w; i++) {
                sb.Append("h");
            }
            return sb;
        }

        public static StringBuilder task5568(StringBuilder sb, int w)
        {
            if (w < 0 || w > 20) {
                throw new Exception("Значение W должно быть в интервале [0, 20]");
            }
            int i = 0;
            while (i <= 9) {
                int j = 0;
                while (j < w)
                {
                    sb.Append(i);
                    j++;
                }
                sb.Append("\n");
                i++;
            }
            return sb;
        }

        public static StringBuilder task2592(StringBuilder sb, String s, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    sb.Append(s);
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder task4075(StringBuilder sb, int w)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (w < 2) {
                return sb.Append("\n\n");
            }
            sb.Append("+");
            for (int i = 1; i < w - 1; i++) {
                sb.Append("-");
            }
            sb.Append("+\n|");
            for (int i = 1; i < w - 1; i++) {
                sb.Append(".");
            }
            sb.Append("|\n+");
            for (int i = 1; i < w - 1; i++) {
                sb.Append("-");
            }
            sb.Append("+");
            return sb;
        }

        public static StringBuilder task7517(StringBuilder sb, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            sb.Append(" ");
            for (int i = 0; i < w; i++) {
                sb.Append(i);
            }
            sb.Append("\n");
            for (int j = 0; j < h; j++) {
                sb.Append(j);
                for (int i = 0; i < w; i++)
                {
                    sb.Append(" ");
                }
                sb.Append("|\n");
            }
            sb.Append(" ");
            for (int i = 0; i < w; i++) {
                sb.Append("-");
            }
            return sb;
        }

        public static StringBuilder task5448(StringBuilder sb, String s, int h)
        {
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 0; j < i; j++)
                {
                    sb.Append(s);
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder task6572(StringBuilder sb, int a, int b)
        {
            int i = 0, n, min;
            if (a < b)
            {
                n = b - a;
                min = a;
            }
            else {
                n = a - b;
                min = b;
            }
            if (min % 2 == 0)
            {
                min++;
            }
            while (i <= n)
            {
                for (int j = 0; j < i / 2; j++)
                {
                    sb.Append(".");
                }
                sb.Append(i + min);
                sb.Append("\n");
                i += 2;
            }
            return sb;
        }

        public static StringBuilder task5238(StringBuilder sb, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                int j = 0;
                while (j < w - i)
                {
                    sb.Append("+");
                    j++;
                }
                while (j < w)
                {
                    sb.Append("#");
                    j++;
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder task2084(StringBuilder sb, int a, int b)
        {
            if (a == b)
            {
                return sb.Append(a);
            }
            else if (a < b)
            {
                int i = a + 2;
                if (a % 2 == 0)
                {
                    sb.Append(a + 1);
                    i++;
                }
                else {
                    sb.Append(a);
                }
                while (i <= b)
                {
                    sb.Append(", ");
                    sb.Append(i);
                    i += 2;
                }
                return sb;
            }
            else {
                int i = a - 2;
                if (a % 2 == 0)
                {
                    sb.Append(a - 1);
                    i--;
                }
                else {
                    sb.Append(a);
                }
                while (i >= b)
                {
                    sb.Append(", ");
                    sb.Append(i);
                    i -= 2;
                }
                return sb;
            }
        }

        public static StringBuilder task5411(StringBuilder sb, int p, int q)
        {
            int i = 1, n, min;
            if (p < q)
            {
                min = p;
                n = q - p;
            }
            else {
                min = q;
                n = p - q;
            }
            sb.Append(min);
            while (i <= n / 2)
            {
                sb.Append("&lt;");
                sb.Append(i + min);
                i++;
            }
            while (i <= n)
            {
                sb.Append("&gt;");
                sb.Append(i + min);
                i++;
            }
            return sb;
        }

        public static StringBuilder task5171(StringBuilder sb, String s1, String s2, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    if (i % 2 == 0)
                    {
                        sb.Append(s1);
                    }
                    else {
                        sb.Append(s2);
                    }
                }
                sb.Append("\n");
            }
            return sb;
        }

        public static StringBuilder task1862(StringBuilder sb, String s1, String s2, int w, int h)
        {
            if (w < 0) {
                throw new Exception("Значение W должно быть неотрицательно");
            }
            if (h < 0) {
                throw new Exception("Значение H должно быть неотрицательно");
            }
            if (w == 0 || h == 0) {
                return sb;
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++)
                {
                    if (j % 2 == 0)
                    {
                        sb.Append(s1);
                    }
                    else {
                        sb.Append(s2);
                    }
                }
                sb.Append("\n");
            }
            return sb;
        }
    }
}

