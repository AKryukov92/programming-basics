using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Methods;

namespace tfa
{
    class Lab12Task2030
    {
        static void Main(string[] args)
        {
            Step8878();
            Step8715();
            Step4847();
            Step1999();
            Step4042();

            Step6351();
            Step5382();
            Step7088();
            Step7250();
            Step6740();

            Step9038();
            Step7491();
            Step4515();
        }

        static void Step8878()
        {
            Console.WriteLine();
            Console.WriteLine("8878");
            if (Lab05.Task8878(5, 6))
            {
                Console.WriteLine("Второе");
            }
            else
            {
                Console.WriteLine("Первое");
            }

            if (Lab05.Task8878(11, 7))
            {
                Console.WriteLine("Второе");
            }
            else
            {
                Console.WriteLine("Первое");
            }

            if (Lab05.Task8878(-2, 3))
            {
                Console.WriteLine("Второе");
            }
            else
            {
                Console.WriteLine("Первое");
            }

            if (Lab05.Task8878(-13, -18))
            {
                Console.WriteLine("Второе");
            }
            else
            {
                Console.WriteLine("Первое");
            }
        }

        static void Step8715()
        {
            Console.WriteLine();
            Console.WriteLine("8715");
            int[] in8718a = { 1, -4, 7, 0, 4, -2, 10, 5 };
            int[] in8718b = { 2, 0, 4, 5, 4, 4, 3, 1 };
            int[] in8718c = { 3, 5, -2, -7, 4, 3, 5, 7 };
            for (int i = 0; i < in8718a.Length; i++)
            {
                if (Lab05.Task8715(in8718a[i], in8718b[i], in8718c[i]))
                {
                    Console.WriteLine("Выполняется");
                }
                else
                {
                    Console.WriteLine("Не выполняется");
                }
            }
        }

        static void Step4847()
        {
            Console.WriteLine();
            Console.WriteLine("4847");
            int[] in4847x = { 31, 19, 7, 67, 1 };
            int[] in4847y = { 59, 19, 11, -67, 1 };
            int[] in4847z = { 83, 41, 11, 67, 1 };
            for (int i = 0; i < in4847x.Length; i++)
            {
                if (Lab05.Task4847(in4847x[i], in4847y[i], in4847z[i]))
                {
                    Console.WriteLine("Среди чисел есть равные");
                }
                else
                {
                    Console.WriteLine("Числа не равны друг другу");
                }
            }
        }

        static void Step1999()
        {
            Console.WriteLine();
            Console.WriteLine("1999");
            int[] in1999x = { -3, -2, -1, -3, -2, -1, -3, -2, -1 };
            int[] in1999y = { 2, 2, 2, 1, 1, 1, 0, 0, 0 };
            for (int i = 0; i < in1999x.Length; i++)
            {
                Console.Write("{" + in1999x[i] + ";" + in1999y[i] + "} ");
                if (Lab05.Task1999(in1999x[i], in1999y[i]))
                {
                    Console.WriteLine("принадлежит области");
                }
                else
                {
                    Console.WriteLine("не принадлежит области");
                }
            }
        }

        static void Step4042()
        {
            Console.WriteLine();
            Console.WriteLine("4042");
            double[] in4042x = { 2, 1, 0, -1, -2 };
            double[] in4042y = { 2, 1.5, 0, -2, -3 };
            String positivePattern = "{{{0};{1}}} принадлежит области";
            String negativePattern = "{{{0};{1}}} не принадлежит области";
            for (int i = 0; i < in4042x.Length; i++)
            {
                if (Lab05.Task4042(in4042x[i], in4042y[i]))
                {
                    Console.WriteLine(positivePattern, in4042x[i], in4042y[i]);
                }
                else
                {
                    Console.WriteLine(negativePattern, in4042x[i], in4042y[i]);
                }
            }
        }

        static void Step6351()
        {
            Console.WriteLine();
            Console.WriteLine("6351");
            double[] in6351x = { 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3 };
            double[] in6351y = { 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2 };
            String positivePattern = "{{{0};{1}}} принадлежит области";
            String negativePattern = "{{{0};{1}}} не принадлежит области";
            for (int i = 0; i < in6351x.Length; i++)
            {
                String currentPattern;
                if (Lab05.Task6351(in6351x[i], in6351y[i]))
                {
                    currentPattern = positivePattern;
                }
                else
                {
                    currentPattern = negativePattern;
                }
                Console.WriteLine(currentPattern, in6351x[i], in6351y[i]);
            }
        }

        static void Step5382()
        {
            Console.WriteLine();
            Console.WriteLine("5382");
            double[] in5382x = { 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0 };
            double[] in5382y = { 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1 };
            String positivePattern = "{{{0};{1}}} принадлежит области";
            String negativePattern = "{{{0};{1}}} не принадлежит области";
            for (int i = 0; i < in5382x.Length; i++)
            {
                String currentPattern = Lab05.Task5382(in5382x[i], in5382y[i]) ? positivePattern : negativePattern;
                Console.WriteLine(currentPattern, in5382x[i], in5382y[i]);
            }
        }

        static String getPattern(bool condition)
        {
            String positivePattern = "{{{0};{1}}} принадлежит области";
            String negativePattern = "{{{0};{1}}} не принадлежит области";
            if (condition)
            {
                return positivePattern;
            }
            else
            {
                return negativePattern;
            }
        }

        static void Step7088()
        {
            Console.WriteLine();
            Console.WriteLine("7088");
            double[] in7088x = {0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1,
                1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5};
            double[] in7088y = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, -0.5, -0.5,
                -0.5, -0.5, -0.5, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2};
            for (int i = 0; i < in7088x.Length; i++)
            {
                String currentPattern = getPattern(Lab05.Task7088(in7088x[i], in7088y[i]));
                Console.WriteLine(currentPattern, in7088x[i], in7088y[i]);
            }
        }

        static void Step7250()
        {
            Console.WriteLine();
            Console.WriteLine("7250");
            double[] in7250x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in7250y = { 2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2 };
            for (int i = 0; i < in7250x.Length; i++)
            {
                Console.Write("{" + in7250x[i] + ";" + in7250y[i]);
                if (Lab05.Task7250(in7250x[i], in7250y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step6740()
        {
            Console.WriteLine();
            Console.WriteLine("6740");
            double[] in6740x = { 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 };
            double[] in6740y = { 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1.5, -1.5, -1.5, -1.5, -1.5, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3 };
            for (int i = 0; i < in6740x.Length; i++)
            {
                Console.Write("{" + in6740x[i] + ";" + in6740y[i]);
                if (Lab05.Task6740(in6740x[i], in6740y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }

        }

        static void Step9038()
        {
            Console.WriteLine();
            Console.WriteLine("9038");
            double[] in9038x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in9038y = { 2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0 };
            for (int i = 0; i < in9038x.Length; i++)
            {
                Console.Write("{" + in9038x[i] + ";" + in9038y[i]);
                if (Lab05.Task9038(in9038x[i], in9038y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else
                {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        static void Step7491()
        {
            Console.WriteLine();
            Console.WriteLine("7491");
            String[] in7491 = { "bx", "fw", "123" };
            for (int i = 0; i < in7491.Length; i++)
            {
                if (Lab08.Task7491(in7491[i]))
                {
                    Console.WriteLine("Содержится");
                }
                else
                {
                    Console.WriteLine("Не содержится");
                }
            }
        }

        static void Step4515()
        {
            Console.WriteLine();
            Console.WriteLine("4515");
            String[] in4515 = {
                "q w e r",
                "q w q r",
                "q w e q",
                "q w e w",
                "r r r r",
                "a b c d q w e r"};
            for (int i = 0; i < in4515.Length; i++)
            {
                if (Lab07.Task4515(in4515[i]))
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
