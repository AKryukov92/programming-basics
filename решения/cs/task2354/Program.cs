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
            Step13();
            Step14();
            Step15();
        }

        static void Step1()
        {
            Console.WriteLine(Lab02.task4411(11.13) - 18.3);
            Console.WriteLine(Lab02.task4411(-7919) - -7912);
            Console.WriteLine(Lab02.task4411(0) - 7);
        }

        static void Step2()
        {
            Console.WriteLine("{0:F6}", Lab02.task8428(45) - 0.7854);
            Console.WriteLine("{0:F6}", Lab02.task8428(1125) - 19.6350);
            Console.WriteLine("{0:F6}", Lab02.task8428(0));
            Console.WriteLine("{0:F6}", Lab02.task8428(360) - 6.2832);
            Console.WriteLine("{0:F6}", Lab02.task8428(90) - 1.5708);
            Console.WriteLine("{0:F6}", Lab02.task8428(2000) - 34.9066);
        }

        static void Step3()
        {
            Console.WriteLine("{0:F6}", Lab02.task1262(7583) - 4.6025);
            Console.WriteLine("{0:F6}", Lab02.task1262(200) - -4.6985);
            Console.WriteLine("{0:F6}", Lab02.task1262(360) - 5);
            Console.WriteLine("{0:F6}", Lab02.task1262(90) - 0);
        }

        static void Step4()
        {
            Console.WriteLine("{0:F6}", Lab02.task2790(6997) - 0.9205);
            Console.WriteLine("{0:F6}", Lab02.task2790(31) - 0.8572);
            Console.WriteLine("{0:F6}", Lab02.task2790(0) - 1.0000);
        }

        static void Step5()
        {
            Console.WriteLine("{0:F6}", Lab02.task9164(90, 90) - 0.0);
            Console.WriteLine("{0:F6}", Lab02.task9164(90, 0) - 1.0);
            Console.WriteLine("{0:F6}", Lab02.task9164(7559, 7549) - -0.2079);
        }

        static void Step6()
        {
            Console.WriteLine("{0:F6}", Lab02.task5789(1, 1, 3, 4) - 3.6055);
            Console.WriteLine("{0:F6}", Lab02.task5789(-2, 4, 8, -10) - 17.2046);
            Console.WriteLine("{0:F6}", Lab02.task5789(0, 0, -5, -7) - 8.6023);
            Console.WriteLine("{0:F6}", Lab02.task5789(0, 0, 0, 0) - 0);
            Console.WriteLine("{0:F6}", Lab02.task5789(-1, -3, 2, 9) - 12.3693);
        }

        static void Step7()
        {
            Console.WriteLine(Lab05.task5662(1, 2, 3));
            Console.WriteLine(Lab05.task5662(3, 17, 5));
            Console.WriteLine(Lab05.task5662(3, 6, 3));
            Console.WriteLine(Lab05.task5662(0, 7, 13));
        }

        static void Step8()
        {
            Console.WriteLine(Lab05.task3770(1, 2, 3) - 3);
            Console.WriteLine(Lab05.task3770(7, 4, -2) - 7);
            Console.WriteLine(Lab05.task3770(0, 5, -7) - 5);
        }

        static void Step9()
        {
            Console.WriteLine(Lab05.task3669(8, 13) - 1235520);
            Console.WriteLine(Lab05.task3669(159, 161) - 4095840);
            Console.WriteLine(Lab05.task3669(648, 648) - 648);
            Console.WriteLine(Lab05.task3669(-2, 600));
            Console.WriteLine(Lab05.task3669(50, 24) - 2421409269157986304L);
        }

        static void Step10()
        {
            Console.WriteLine(Lab06.task5969(8, 13));
            Console.WriteLine(Lab06.task5969(25, 44) - 105);
            Console.WriteLine(Lab06.task5969(80, 100) - 273);
            Console.WriteLine(Lab06.task5969(300, 24) - 6279);
        }

        static void Step11()
        {
            Console.WriteLine(Lab07.task4265("sABCD"));
            Console.WriteLine(Lab07.task4265("Uxyz"));
            Console.WriteLine(Lab07.task4265("s"));
            Console.WriteLine(Lab07.task4265("F123"));
            Console.WriteLine(Lab07.task4265("Sopqr"));
        }

        static void Step12()
        {
            String[] in3946 = {
                "1 2 3 4 1",
                "1 2 3 4 1 3 4 4 4 4",
                ""};
            double[] out3946 = { 2.2, 3, 0 };
            for (int i = 0; i < in3946.Length; i++)
            {
                double result = Lab08.task3946(in3946[i]);
                Console.WriteLine("{0:F6} ({0:F6})", result, out3946[i]);
            }
        }

        static void Step13()
        {
            String[] in7035 = {
                "1 2 3 4 5 6",
                "3 4 1 2 3 4 1 2 3 1 2",
                "4 2 3 4 3 2",
                "4 4 4 4 4 3 8 9",
                "4 4 4 4",
                "4 3"};
            int[] out7035 = { 1, 1, 2, 3, 4, 3 };
            for (int i = 0; i < in7035.Length; i++)
            {
                int result = Lab08.task7035(in7035[i]);
                Console.WriteLine("{0} ({1})", result, out7035[i]);
            }
        }

        static void Step14()
        {
            int[] in4283k = { 3, 5, 2, 1 };
            String[] in4283s = {
                "1 2 3 4 1 2",
                "1 2 3 4 1 2 3 4 1 2 3",
                "3 2 2 2 2 2",
                "4 4 4 4 4 4"};
            int[] out4283 = { 1, 0, 5, 0 };
            for (int i = 0; i < in4283k.Length; i++)
            {
                int result = Lab08.task4283(in4283k[i], in4283s[i]);
                Console.WriteLine("{0} ({1})", result, out4283[i]);
            }
        }

        static void Step15()
        {
            String[] in9182 = {
                "1 2 3 4 5 6",
                "1 2 3 1 2 6",
                "1 1 1 1 1 1"};
            int[] out9182 = { 6, 4, 1 };
            for (int i = 0; i < out9182.Length; i++)
            {
                int result = Lab08.task9182(in9182[i]);
                Console.WriteLine("{0} ({1})", result, out9182[i]);
            }
        }
    }
}
