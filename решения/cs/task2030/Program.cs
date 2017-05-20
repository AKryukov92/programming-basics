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
        }

        static void Step1()
        {
            int[] in4847x = { 31, 19, 7, 67, 1 };
            int[] in4847y = { 59, 19, 11, -67, 1 };
            int[] in4847z = { 83, 41, 11, 67, 1 };
            for (int i = 0; i < in4847x.Length; i++)
            {
                if (Lab05.task4847(in4847x[i], in4847y[i], in4847z[i]))
                {
                    Console.WriteLine("Среди чисел есть равные");
                }
                else
                {
                    Console.WriteLine("Числа не равны друг другу");
                }
            }
        }

        static void Step2()
        {
            double[] in4042x = { 2, 1, 0, -1, -2 };
            double[] in4042y = { 2, 1.5, 0, -2, -3 };
            for (int i = 0; i < in4042x.Length; i++)
            {
                Console.Write("{" + in4042x[i] + ";" + in4042y[i]);
                if (Lab05.task4042(in4042x[i], in4042y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step3()
        {
            double[] in6351x = { 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3 };
            double[] in6351y = { 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2 };
            for (int i = 0; i < in6351x.Length; i++)
            {
                Console.Write("{" + in6351x[i] + ";" + in6351y[i]);
                if (Lab05.task6351(in6351x[i], in6351y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step4()
        {
            double[] in5382x = { 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0 };
            double[] in5382y = { 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1 };
            for (int i = 0; i < in5382x.Length; i++)
            {
                Console.Write("{" + in5382x[i] + ";" + in5382y[i]);
                if (Lab05.task5382(in5382x[i], in5382y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step5()
        {
            double[] in7250x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in7250y = { 2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2 };
            for (int i = 0; i < in7250x.Length; i++)
            {
                Console.Write("{" + in7250x[i] + ";" + in7250y[i]);
                if (Lab05.task7250(in7250x[i], in7250y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step6()
        {
            double[] in9038x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in9038y = { 2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0 };
            for (int i = 0; i < in9038x.Length; i++)
            {
                Console.Write("{" + in9038x[i] + ";" + in9038y[i]);
                if (Lab05.task9038(in9038x[i], in9038y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step7()
        {
            String[] in7491 = { "bx", "fw", "123" };
            for (int i = 0; i < in7491.Length; i++)
            {
                if (Lab07.task7491(in7491[i]))
                {
                    Console.WriteLine("Содержится");
                }
                else
                {
                    Console.WriteLine("Не содержится");
                }
            }
        }

        static void Step8()
        {
            String[] in4515 = {
                "9 8 7 6 5",
                "4 3 2 1 5 6 7 8 9 0",
                "1 2 3 1"};
            for (int i = 0; i < in4515.Length; i++)
            {
                if (Lab08.task4515(in4515[i]))
                {
                    Console.WriteLine("Повторения есть");
                }
                else
                {
                    Console.WriteLine("Повторений нет");
                }
            }
        }
    }
}
