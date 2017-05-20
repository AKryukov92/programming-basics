using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace tfa
{
    class Program
    {
        static void Main(string[] args)
        {
            Step1();
            Step2();
            Step3();
            Step4();
            Step5();
            Step6();
            Step7();
            Step8();
            Step9();
            Step10();
            Step11();
            Step12();
        }

        static void Step1()
        {
            String out8518 = "a+\nb\nc\nd\ne\nf\ng\nh\n\n" +
                "a\nb\nc\nd+\ne\nf\ng\nh\n\n" +
                "a\nb\nc\nd\ne\nf\ng\nh+\n\n" +
                "a\nb\nc\nd\ne\nf\ng\nh\n\n";
            StringBuilder sb = new StringBuilder();
            Lab05.task8518(sb, "a").Append("\n");
            Lab05.task8518(sb, "d").Append("\n");
            Lab05.task8518(sb, "h").Append("\n");
            Lab05.task8518(sb, "i").Append("\n");
            if (out8518.Equals(sb.ToString()))
            {
                Console.WriteLine("Задача решена верно");
            }
            else
            {
                sb.Insert(0, "Неверно. Результат:\n");
                Console.WriteLine(sb.ToString());
            }
        }

        static void Step2()
        {
            StringBuilder sb8495 = new StringBuilder();
            sb8495 = sb8495.Append("@");
            sb8495 = Lab06.task8495(sb8495);
            sb8495 = sb8495.Append("#");
            Console.WriteLine(sb8495.ToString());
        }

        static void Step3()
        {
            StringBuilder sb1315 = new StringBuilder();
            sb1315.Append("@");
            Lab06.task1315(sb1315);
            sb1315.Append("#");
            Console.WriteLine(sb1315);
        }

        static void Step4()
        {
            String result3762 = Lab06.task3762(new StringBuilder()).ToString();
            Console.WriteLine(result3762);
        }

        static void Step5()
        {
            StringBuilder sb3550 = Lab06.task3550(
                new StringBuilder()
                .Append("@"))
                .Append("#");
            Console.WriteLine(sb3550.ToString());
        }

        static void Step6()
        {
            StringBuilder sb6572 = new StringBuilder();
            Lab06.task6572(sb6572, 8, 13);
            Lab06.task6572(sb6572, 691, 703);
            Lab06.task6572(sb6572, 19, 3);
            Console.WriteLine(sb6572);
        }

        static void Step7()
        {
            String result2084;
            result2084 = Lab06.task2084(new StringBuilder(), 20, 30).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 8, 13)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 571, 580)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 691, 703)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), -71, -90)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 64, 58)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 19, 7)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 401, 390)).Append("\n")
                .Append(Lab06.task2084(new StringBuilder(), 800, 785)).Append("\n")
                .ToString();
            Console.WriteLine(result2084);
        }

        static void Step8()
        {
            String result5411 = Lab06.task5411(
                Lab06.task5411(
                    Lab06.task5411(new StringBuilder(), 7, 11)
                        .Append("\n")
                    , 211, 223).Append("\n")
                , 37, 29).Append("\n")
                .ToString();
            Console.WriteLine(result5411);
        }

        static void Step9()
        {
            int[] in7585 = { 10, 15, 20, 9, 21 };
            String[] out7585 = {
                "10+\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15+\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20+\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",
                "10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n"};
            for (int i = 0; i < in7585.Length; i++)
            {
                StringBuilder result = Lab06.task7585(
                    new StringBuilder(), in7585[i]);
                if (out7585[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else
                {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result);
                }
            }
        }

        static void Step10()
        {
            int[] in8770 = { 30, 37, 40, 8, 100 };
            String[] out8770 = {
                "30+\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37+\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40+\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n",
                "30-\n31-\n32-\n33-\n34-\n35-\n36-\n37-\n38-\n39-\n40-\n"};
            for (int i = 0; i < in8770.Length; i++)
            {
                var result = Lab06.task8770(new StringBuilder(), in8770[i]);
                if (out8770[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else
                {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result.ToString());
                }
            }
        }

        static void Step11()
        {
            String[] in5694 = { "a", "d", "h", "i", "z" };
            String[] out5694 = {
                "a+\nb\nc\nd\ne\nf\ng\nh\n",
                "a\nb\nc\nd+\ne\nf\ng\nh\n",
                "a\nb\nc\nd\ne\nf\ng\nh+\n",
                "a\nb\nc\nd\ne\nf\ng\nh\n",
                "a\nb\nc\nd\ne\nf\ng\nh\n"};
            for (int i = 0; i < in5694.Length; i++)
            {
                var result = Lab08.task5694(new StringBuilder(), in5694[i]);
                if (out5694[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else
                {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result.ToString());
                }
            }
        }

        static void Step12()
        {
            int[] in6806 = { 10, 15, 20, 9, 23 };
            String[] out6806 = {
                "11\n13\n17\n19\n10+\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15+\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20+\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n",
                "11\n13\n17\n19\n10\n12\n14\n15\n16\n18\n20\n"};
            for (int i = 0; i < in6806.Length; i++)
            {
                var result = Lab08.task6806(new StringBuilder(), in6806[i]);
                if (out6806[i].Equals(result.ToString()))
                {
                    Console.WriteLine("Задача решена верно");
                }
                else
                {
                    result.Insert(0, "Неверно. Результат:\n");
                    Console.WriteLine(result.ToString());
                }
            }
        }
    }
}
