using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Methods;

namespace Task3784
{
    class Program
    {
        static void Main(string[] args)
        {
            Step5870();
            Step4257();
            Step2291();
            Step1763();
            Step1945();

            Step6291();
            Step3883();
            Step4527();
            Step6556();
            Step2153();

            Step5170();
            Step1703();
        }

        private static void Step4257()
        {
            Console.WriteLine();
            Console.WriteLine("4257");
            double[] in4257l = { 0.7, 0.3, 0.05, -2, 300 };
            double[] in4257p = { 2297, 983, 101, 15, -113 };
            for (int i = 0; i < in4257l.Length; i++)
            {
                try
                {
                    if (Lab05.Task4257(in4257l[i], in4257p[i]))
                    {
                        Console.WriteLine("Кабеля хватит. Расстояние меньше длины кабеля.");
                    }
                    else
                    {
                        Console.WriteLine("Кабеля не хватит. Длина кабеля меньше расстояния.");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step2291()
        {
            Console.WriteLine();
            Console.WriteLine("2291");
            double[] in2291v1 = { 60.5, 17950, 0, 200, -0.6, 0.1004 };
            double[] in2291v2 = { 16.8, 5000, 10, 0, 0.2, -0.028 };
            for (int i = 0; i < in2291v1.Length; i++)
            {
                try
                {
                    String result = Lab05.Task2291(in2291v1[i], in2291v2[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step1763()
        {
            Console.WriteLine();
            Console.WriteLine("1763");
            int[] in1763r = { 15, 29, -17, 37 };
            int[] in1763a = { 31, 41, 23, -5 };
            for (int i = 0; i < in1763r.Length; i++)
            {
                try
                {
                    String result = Lab05.Task1763(in1763r[i], in1763a[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step1945()
        {
            Console.WriteLine();
            Console.WriteLine("1945");
            int[] in1945sc = { 17, 13, 7854, 5808, -20, 300 };
            int[] in1945ss = { 19, 19, 8100, 8100, 4, -200 };
            for (int i = 0; i < in1945sc.Length; i++)
            {
                try
                {
                    if (Lab05.Task1945(in1945sc[i], in1945ss[i]))
                    {
                        Console.WriteLine("Круг уместится в квадрате");
                    }
                    else
                    {
                        Console.WriteLine("Круг не поместится в квадрате");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step6291()
        {
            Console.WriteLine();
            Console.WriteLine("6291");
            int[] in6291a = { 13, 21, 29, 61, 211, -151, 193, 101 };
            int[] in6291b = { 17, 21, 2, 47, 211, 239, -193, 83 };
            int[] in6291c = { 14, 37, 29, 47, 211, 239, 3, -101 };
            for (int i = 0; i < in6291a.Length; i++)
            {
                try
                {
                    if (Lab05.Task6291(in6291a[i], in6291b[i], in6291c[i]))
                    {
                        Console.Write("Треугольник является ");
                    }
                    else
                    {
                        Console.Write("Треугольник не является ");
                    }
                    Console.WriteLine("равнобедренным.");
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step3883()
        {
            Console.WriteLine();
            Console.WriteLine("3883");
            int[] in3883 = { 1234, 9171, 100, 98765 };
            for (int i = 0; i < in3883.Length; i++)
            {
                try
                {
                    if (Lab05.Task3883(in3883[i]))
                    {
                        Console.WriteLine("равно");
                    }
                    else
                    {
                        Console.WriteLine("не равно");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step4527()
        {
            Console.WriteLine();
            Console.WriteLine("4527");
            int[] in4527 = { 1, 2, 3, 8, -10, 26, 40, 100, -20, 300 };
            String[] out4527 = {"1'ый","2'ой","3'ий","8'ой",
                "-10'ый","26'ой","40'ой","100'ый"};
            for (int i = 0; i < in4527.Length; i++)
            {
                try
                {
                    String result = Lab05.Task4527(in4527[i]);
                    if (result.Equals(out4527[i]))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else
                    {
                        Console.WriteLine("Ошибка. Результат:" + result);
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step6556()
        {
            Console.WriteLine();
            Console.WriteLine("6556");
            int[] in6556a = { 3, 7, 2, 13, 23, -2, 3, 13, 6911 };
            int[] in6556b = { 5, 1, 13, 11, 3, 8, -4, 15, 5881 };
            int[] in6556c = { 7, 11, 5, 7, 9, 9, 5, -17, 3203 };
            int[] in6556d = { 9, 3, 19, 19, 11, 7, 6, 19, -4639 };
            for (int i = 0; i < in6556a.Length; i++)
            {
                try
                {
                    if (Lab05.Task6556(in6556a[i], in6556b[i], in6556c[i], in6556d[i]))
                    {
                        Console.WriteLine("Размещение возможно");
                    }
                    else
                    {
                        Console.WriteLine("Размещение невозможно");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step2153()
        {
            Console.WriteLine();
            Console.WriteLine("2153");
            int[] in2153t = { 0, 1, 2, 3, 4, 5, 13, 59, 60, 61 };
            for (int i = 0; i < in2153t.Length; i++)
            {
                try
                {
                    if (Lab05.Task2153(in2153t[i]))
                    {
                        Console.WriteLine("Зеленый");
                    }
                    else
                    {
                        Console.WriteLine("Красный");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        private static void Step5170()
        {
            Console.WriteLine();
            Console.WriteLine("5170");
            int[] in5170 = { 6, 3219, 7, 2017, -10 };
            for (int i = 0; i < in5170.Length; i++)
            {
                try
                {
                    if (Lab06.Task5170(in5170[i]))
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

        static void Step1703()
        {
            Console.WriteLine();
            Console.WriteLine("1703");
            String[] in1703 = {
                "x>3",
                "r >= 1000",
                "value <=-2",
                "y < 0",
                "x <",
                ">13",
                "y   0",
                "x+7",
                "a < b < c",
                "x < xA && x + w > xA",
                "x > y > z",
                "a x < 17",
                "y > 19 23"};
            String[] out1703 = {
                "Значение переменной x больше числа 3",
                "Значение переменной r больше либо равно числу 1000",
                "Значение переменной value меньше либо равно числу -2",
                "Значение переменной y меньше числа 0",
                "Справа от знака сравнения ожидается ограничение",
                "Слева от знака сравнения ожидается переменная",
                "Отсутствует знак сравнения",
                "Отсутствует знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "В выражении должен быть только один знак сравнения",
                "Неожиданное выражение \"a\" слева от переменной \"x\"",
                "Неожиданное выражение \"23\" справа от ограничения \"19\""};
            for (int i = 0; i < in1703.Length; i++)
            {
                try
                {
                    String result = Lab07.Task1703(in1703[i]);
                    Console.WriteLine("Получилось: " + result);
                    Console.WriteLine("Ожидалось : " + out1703[i]);
                }
                catch (Exception e)
                {
                    Console.WriteLine("Получилось: " + e.Message);
                    Console.WriteLine("Ожидалось : " + out1703[i]);
                }
                Console.WriteLine();
            }
        }

        public static void Step5870()
        {
            Console.WriteLine();
            Console.WriteLine("5870");
            int[] in5870 = { 4000, 3603, 3599, 3660, 59, 61, 0, -1, -20 };
            String[] out5870 = {
                "1 часов 6 минут 40 секунд",
                "1 часов 0 минут 3 секунд",
                "0 часов 59 минут 59 секунд",
                "1 часов 1 минут 0 секунд",
                "0 часов 0 минут 59 секунд",
                "0 часов 1 минут 1 секунд",
                "0 часов 0 минут 0 секунд",
                "Количество времени должно быть неотрицательным",
                "Количество времени должно быть неотрицательным"};
            for (int i = 0; i < in5870.Length; i++)
            {
                try
                {
                    String result = Lab02.task5870(in5870[i]);
                    Console.WriteLine("Получилось: " + result);
                    Console.WriteLine("Ожидалось : " + out5870[i]);
                }
                catch (ArgumentException e)
                {
                    Console.WriteLine("Получилось: " + e.Message);
                    Console.WriteLine("Ожидалось : " + out5870[i]);
                }
                Console.WriteLine();
            }
        }
    }
}
