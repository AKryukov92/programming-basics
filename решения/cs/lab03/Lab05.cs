using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace tfa
{
    public class Lab05
    {
        static void Main(string[] args)
        {
            task2354();
            task2030();
            task7649();
            task3784();
            task9701();
            task8787();

            Console.WriteLine();
            Console.WriteLine("3072");
            Console.WriteLine(task3072(173, 179).print());
            Console.WriteLine(task3072(359, 271).print());
            Console.WriteLine(task3072(439, -761).print());
            Console.WriteLine(task3072(0, -15).print());
            Console.WriteLine();
            Console.WriteLine("7178");
            int[] in7178m = { 36, 41, 15 };
            int[] in7178p = { 2, 7, 0 };
            for (int i = 0; i < in7178m.Length; i++)
            {
                try
                {
                    class7178 result7178 = task7178(in7178m[i], in7178p[i]);
                    Console.WriteLine(result7178.print());
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("5635");
            int[] in5635xt = { 1, 5, 3, 3, 0, 1, 1, 1, 1 };
            int[] in5635yt = { 1, 5, 2, 1, -1, 1, 1, 1, 1 };
            int[] in5635xp = { 0, 0, 0, 0, 0, 2, 2, 2, 2 };
            int[] in5635yp = { 0, 0, 0, 0, 0, 2, 2, 2, 2 };
            int[] in5635h = { 2, 2, 2, 2, 1, 0, -1, 3, 3 };
            int[] in5635w = { 3, 3, 3, 3, 1, 3, 3, 0, -1 };
            for (int i = 0; i < in5635xt.Length; i++)
            {
                try
                {
                    Point t = makePointByXY(in5635xt[i], in5635yt[i]);
                    Rectangle r = makeRectangleByXYHW(in5635xp[i], in5635yp[i], in5635h[i], in5635w[i]);
                    if (task5635(t, r))
                    {
                        Console.WriteLine("точка внутри");
                    }
                    else {
                        Console.WriteLine("точка не внутри");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("3878");
            int[] in3878xt = { 2, 1, 0, 0, 1, -1 };
            int[] in3878yt = { 2, 3, 0, 1, 1, 1 };
            int[] in3878xp1 = { 1, 0, 1, 1, 1, 1 };
            int[] in3878yp1 = { 1, 0, 1, 1, 1, 1 };
            int[] in3878xp2 = { 3, 2, 2, 2, 2, 2 };
            int[] in3878yp2 = { 3, 6, 2, 2, 2, 2 };
            for (int i = 0; i < in3878xt.Length; i++)
            {
                try
                {
                    Point t = makePointByXY(in3878xt[i], in3878yt[i]);
                    Point p1 = makePointByXY(in3878xp1[i], in3878yp1[i]);
                    Point p2 = makePointByXY(in3878xp2[i], in3878yp2[i]);
                    if (task3878(t, p1, p2))
                    {
                        Console.WriteLine("Точка принадлежит прямой");
                    }
                    else {
                        Console.WriteLine("Точка не принадлежит прямой");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("1217");
            int[] in1217a1 = { 2, 11, 23, 43, 5, 67, 79, 97 };
            int[] in1217b1 = { 3, 17, 37, 53, 15, 71, 73, 101 };
            int[] in1217a2 = { 5, 13, 29, 41, 0, 59, 83, 107 };
            int[] in1217b2 = { 7, 19, 31, 47, 30, 61, 89, 103 };
            for (int i = 0; i < in1217a1.Length; i++)
            {
                try
                {
                    Interval i1 = makeIntervalByEnds(in1217a1[i], in1217b1[i]);
                    Interval i2 = makeIntervalByEnds(in1217a2[i], in1217b2[i]);
                    if (task1217check(i1, i2))
                    {
                        Console.Write("Пересекаются ");
                        Interval x = task1217intersection(i1, i2);
                        Console.WriteLine("(" + x.a + "; " + x.b + ")");
                    }
                    else {
                        Console.WriteLine("Не пересекаются");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
            Console.WriteLine();
            Console.WriteLine("1438");
            int[] in1438x1 = { 10, 25, 102, 500, 60, 100, 150, 100, 5, 105, 150, 0, 200, 125, 100 };
            int[] in1435y1 = { 10, 25, 200, 200, 70, 100, 150, 0, 0, 5, 150, 0, 200, 138, 100 };
            int[] in1435h1 = { 200, 200, 100, 100, 120, 200, 150, 100, 10, 10, 50, 802, 100, 0, 120 };
            int[] in1435w1 = { 100, 200, 200, 200, 200, 200, 300, 500, 10, 10, 300, 200, 100, 1, 220 };
            int[] in1435x2 = { 50, 225, 0, 10, 50, 200, 150, 0, 0, 100, 100, 0, 900, 205, 220 };
            int[] in1435y2 = { 50, 225, 500, 400, 50, 200, 150, 200, 5, 0, 100, 0, 200, 202, 100 };
            int[] in1435h2 = { 300, 200, 100, 100, 120, 50, 150, 700, 10, 10, 300, 610, 100, 61, 120 };
            int[] in1435w2 = { 350, 200, 120, 120, 200, 50, 300, 100, 10, 30, 200, 610, 10, 62, 220 };
            for (int i = 0; i < in1438x1.Length; i++)
            {
                try
                {
                    Rectangle r1 = makeRectangleByXYHW(in1438x1[i], in1435y1[i], in1435h1[i], in1435w1[i]);
                    Rectangle r2 = makeRectangleByXYHW(in1435x2[i], in1435y2[i], in1435h2[i], in1435w2[i]);
                    if (task1438check(r1, r2))
                    {
                        Console.Write("Пересекаются");
                        Rectangle rx = task1438intersect(r1, r2);
                        Console.WriteLine("{{\"x\":{0},\"y\":{1},\"w\":{2},\"h\":{3}}}", rx.x, rx.y, rx.w, rx.h);
                    }
                    else {
                        Console.WriteLine("Не пересекаются");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static void task2354()
        {
            Console.WriteLine("5980");
            Console.WriteLine(task5980(9) - 3.0);
            Console.WriteLine(task5980(0) - 0.0);
            Console.WriteLine(task5980(-7) - 49.0);

            Console.WriteLine();
            Console.WriteLine("8174");
            Console.WriteLine(task8174(-5) - 5);
            Console.WriteLine(task8174(-11) - 11);
            Console.WriteLine(task8174(7) - 7);
            Console.WriteLine(task8174(13) - 13);
            Console.WriteLine(task8174(0));

            Console.WriteLine();
            Console.WriteLine("5662");
            Console.WriteLine(task5662(1, 2, 3));
            Console.WriteLine(task5662(3, 17, 5));
            Console.WriteLine(task5662(3, 6, 3));
            Console.WriteLine(task5662(0, 7, 13));

            Console.WriteLine();
            Console.WriteLine("3770");
            Console.WriteLine(task3770(1, 2, 3) - 3);
            Console.WriteLine(task3770(7, 4, -2) - 7);
            Console.WriteLine(task3770(0, 5, -7) - 5);
        }

        public static void task2030()
        {
            Console.WriteLine();
            Console.WriteLine("8878");
            int[] in8878a = { 5, 11, -2, -13 };
            int[] in8878b = { 6, 7, 3, -18 };
            for (int i = 0; i < in8878a.Length; i++)
            {
                if (task8878(in8878a[i], in8878b[i]))
                {
                    Console.WriteLine("Второе");
                }
                else {
                    Console.WriteLine("Первое");
                }
            }

            Console.WriteLine();
            Console.WriteLine("8715");
            int[] in8718a = { 1, -4, 7, 0, 4, -2, 10, 5 };
            int[] in8718b = { 2, 0, 4, 5, 4, 4, 3, 1 };
            int[] in8718c = { 3, 5, -2, -7, 4, 3, 5, 7 };
            for (int i = 0; i < in8718a.Length; i++)
            {
                if (task8715(in8718a[i], in8718b[i], in8718c[i]))
                {
                    Console.WriteLine("Выполняется");
                }
                else {
                    Console.WriteLine("Не выполняется");
                }
            }

            Console.WriteLine();
            Console.WriteLine("4847");
            int[] in4847x = { 31, 19, 7, 67, 1 };
            int[] in4847y = { 59, 19, 11, -67, 1 };
            int[] in4847z = { 83, 41, 11, 67, 1 };
            for (int i = 0; i < in4847x.Length; i++)
            {
                if (task4847(in4847x[i], in4847y[i], in4847z[i]))
                {
                    Console.WriteLine("Среди чисел есть равные");
                }
                else {
                    Console.WriteLine("Числа не равны друг другу");
                }
            }

            Console.WriteLine();
            Console.WriteLine("1186");
            Console.WriteLine();
            double[] in1186x = { 6.35, 4.71, 19.99, -2.28, -18.71, 3.44, -0.09 };
            double[] in1186y = { 2.7, 5.59, -9.57, 16.92, -7.6, -14.98, -16.6 };
            double[] in1186z = { 5.08, -18.55, 12.75, 6.14, 6.27, -8.26, -1.84 };
            double[] result1186;
            for (int i = 0; i < in1186x.Length; i++)
            {
                result1186 = task1186(in1186x[i], in1186y[i], in1186z[i]);
                foreach (double aResult in result1186)
                {
                    Console.Write("{0:F4};\t", aResult);
                }
                Console.WriteLine();
            }

            Console.WriteLine();
            Console.WriteLine("1999");
            int[] in1999x = { -3, -2, -1, -3, -2, -1, -3, -2, -1 };
            int[] in1999y = { 2, 2, 2, 1, 1, 1, 0, 0, 0 };
            for (int i = 0; i < in1999x.Length; i++)
            {
                Console.Write("{" + in1999x[i] + ";" + in1999y[i]);
                if (task1999(in1999x[i], in1999y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("4042");
            double[] in4042x = { 2, 1, 0, -1, -2 };
            double[] in4042y = { 2, 1.5, 0, -2, -3 };
            for (int i = 0; i < in4042x.Length; i++)
            {
                Console.Write("{" + in4042x[i] + ";" + in4042y[i]);
                if (task4042(in4042x[i], in4042y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("6351");
            double[] in6351x = { 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3, 0, 1, 1.5, 2, 3 };
            double[] in6351y = { 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 2, 2, 2, 2, 2 };
            for (int i = 0; i < in6351x.Length; i++)
            {
                Console.Write("{" + in6351x[i] + ";" + in6351y[i]);
                if (task6351(in6351x[i], in6351y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("5382");
            double[] in5382x = { 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0, 5, 1, 0 };
            double[] in5382y = { 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1 };
            for (int i = 0; i < in5382x.Length; i++)
            {
                Console.Write("{" + in5382x[i] + ";" + in5382y[i]);
                if (task5382(in5382x[i], in5382y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("7088");
            double[] in7088x = {0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1,
                1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5, 0, 1, 1.5, 2, 2.5};
            double[] in7088y = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, -0.5, -0.5,
                -0.5, -0.5, -0.5, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2};
            for (int i = 0; i < in7088x.Length; i++)
            {
                Console.Write("{" + in7088x[i] + ";" + in7088y[i]);
                if (task7088(in7088x[i], in7088y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("7250");
            double[] in7250x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in7250y = { 2, 2, 2, 1, 1, 1, 0, 0, 0, -1.5, -1.5, -1.5, -2, -2, -2 };
            for (int i = 0; i < in7250x.Length; i++)
            {
                Console.Write("{" + in7250x[i] + ";" + in7250y[i]);
                if (task7250(in7250x[i], in7250y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("6740");
            double[] in6740x = { 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 };
            double[] in6740y = { 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1.5, -1.5, -1.5, -1.5, -1.5, -2, -2, -2, -2, -2, -3, -3, -3, -3, -3 };
            for (int i = 0; i < in6740x.Length; i++)
            {
                Console.Write("{" + in6740x[i] + ";" + in6740y[i]);
                if (task6740(in6740x[i], in6740y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }

            Console.WriteLine();
            Console.WriteLine("9038");
            double[] in9038x = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3 };
            double[] in9038y = { 2, 2, 2, 1.5, 1.5, 1.5, 1, 1, 1, 0.5, 0.5, 0.5, 0, 0, 0 };
            for (int i = 0; i < in9038x.Length; i++)
            {
                Console.Write("{" + in9038x[i] + ";" + in9038y[i]);
                if (task9038(in9038x[i], in9038y[i]))
                {
                    Console.WriteLine("} принадлежит области");
                }
                else {
                    Console.WriteLine("} не принадлежит области");
                }
            }
        }

        public static void task8787()
        {
            Console.WriteLine();
            Console.WriteLine("7991");
            double[] in7991x = { 6.35, 4.71, 19.99, -2.28 };
            double[] in7991y = { 2.7, 2.59, -1.57, 16.92 };
            double[] in7991z = { 5.08, -18.55, 2.75, 6.14 };
            for (int i = 0; i < in7991x.Length; i++)
            {
                IList<double> result = task7991(in7991x[i], in7991y[i], in7991z[i]);
                Console.WriteLine(String.Join(" ", result));
            }
        }

        public static void task7649()
        {
            Console.WriteLine();
            Console.WriteLine("8518");
            String out8518 = "a+\nb\nc\nd\ne\nf\ng\nh\n\n" +
                    "a\nb\nc\nd+\ne\nf\ng\nh\n\n" +
                    "a\nb\nc\nd\ne\nf\ng\nh+\n\n" +
                    "a\nb\nc\nd\ne\nf\ng\nh\n\n";
            StringBuilder sb = new StringBuilder();
            task8518(sb, "a").Append("\n");
            task8518(sb, "d").Append("\n");
            task8518(sb, "h").Append("\n");
            task8518(sb, "i").Append("\n");
            if (out8518.Equals(sb.ToString()))
            {
                Console.WriteLine("Задача решена верно");
            }
            else {
                sb.Insert(0, "Неверно. Результат:\n");
                Console.WriteLine(sb.ToString());
            }
        }

        public static void task3784()
        {
            Console.WriteLine();
            Console.WriteLine("4257");
            double[] in4257l = { 0.7, 0.3, 0.05, -2, 300 };
            double[] in4257p = { 2297, 983, 101, 15, -113 };
            for (int i = 0; i < in4257l.Length; i++)
            {
                try
                {
                    if (task4257(in4257l[i], in4257p[i]))
                    {
                        Console.WriteLine("Расстояние в километрах меньше");
                    }
                    else {
                        Console.WriteLine("Расстояние в футах меньше");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("2291");
            double[] in2291v1 = { 60.5, 17950, -0.6, 0.1004 };
            double[] in2291v2 = { 16.8, 5000, 0.2, -0.028 };
            for (int i = 0; i < in2291v1.Length; i++)
            {
                try
                {
                    if (task2291(in2291v1[i], in2291v2[i]))
                    {
                        Console.WriteLine("V1 (км/ч) меньше V2 (м/с)");
                    }
                    else {
                        Console.WriteLine("V2 (м/с) меньше V1(км/ч)");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("1763");
            int[] in1763r = { 15, 29, -17, 37 };
            int[] in1763a = { 31, 41, 23, -5 };
            for (int i = 0; i < in1763r.Length; i++)
            {
                try
                {
                    Console.Write("Площадь ");
                    if (task1763(in1763r[i], in1763a[i]))
                    {
                        Console.WriteLine("квадрата больше площади круга");
                    }
                    else {
                        Console.WriteLine("круга больше площади квадрата");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("1945");
            int[] in1945sc = { 17, 13, 7854, 5808, -20, 300 };
            int[] in1945ss = { 19, 19, 8100, 8100, 4, -200 };
            for (int i = 0; i < in1945sc.Length; i++)
            {
                try {
                    if (task1945(in1945sc[i], in1945ss[i]))
                    {
                        Console.WriteLine("Круг уместится в квадрате");
                    }
                    else {
                        Console.WriteLine("Круг не поместится в квадрате");
                    }
                } catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("6291");
            int[] in6291a = { 13, 21, 29, 61, 211, -151, 193, 101 };
            int[] in6291b = { 17, 21, 2, 47, 211, 239, -193, 83 };
            int[] in6291c = { 14, 37, 29, 47, 211, 239, 3, -101 };
            for (int i = 0; i < in6291a.Length; i++)
            {
                try
                {
                    if (task6291(in6291a[i], in6291b[i], in6291c[i]))
                    {
                        Console.Write("Треугольник является ");
                    }
                    else {
                        Console.Write("Треугольник не является");
                    }
                    Console.WriteLine("равнобедренным.");
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("3883");
            int[] in3883 = { 1234, 9171, 100, 98765 };
            for (int i = 0; i < in3883.Length; i++)
            {
                try
                {
                    if (task3883(in3883[i]))
                    {
                        Console.WriteLine("равно");
                    }
                    else {
                        Console.WriteLine("не равно");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("4527");
            int[] in4527 = { 1, 2, 3, 8, -10, 26, 40, 100, -20, 300 };
            String[] out4527 = {"1'ый","2'ой","3'ий","8'ой",
                "-10'ый","26'ой","40'ой","100'ый"};
            for (int i = 0; i < in4527.Length; i++)
            {
                try
                {
                    String result = task4527(in4527[i]);
                    if (result.Equals(out4527[i]))
                    {
                        Console.WriteLine("Задача решена верно");
                    }
                    else {
                        Console.WriteLine("Ошибка. Результат:" + result);
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }

            Console.WriteLine();
            Console.WriteLine("6556");
            int[] in6556a = { 3, 13, 23, -2, 3, 13, 6911 };
            int[] in6556b = { 5, 11, 3, 8, -4, 15, 5881 };
            int[] in6556c = { 7, 7, 9, 9, 5, -17, 3203 };
            int[] in6556d = { 9, 19, 11, 7, 6, 19, -4639 };
            for (int i = 0; i < in6556a.Length; i++)
            {
                try
                {
                    if (task6556(in6556a[i], in6556b[i],
                            in6556c[i], in6556d[i]))
                    {
                        Console.WriteLine("Размещение возможно");
                    }
                    else {
                        Console.WriteLine("Размещение невозможно");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }


            Console.WriteLine();
            Console.WriteLine("2153");
            int[] in2153t = { 13, 44, 60, 0, 61 };
            for (int i = 0; i < in2153t.Length; i++)
            {
                try
                {
                    if (task2153(in2153t[i]))
                    {
                        Console.WriteLine("Зеленый");
                    }
                    else {
                        Console.WriteLine("Красный");
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static void task9701()
        {
            Console.WriteLine();
            Console.WriteLine("7937");
            int[] in7937w = { 1721, 2473, 0, 877, 1181, 491 };
            int[] in7937h = { 661, 449, 1879, 0, 1033, 3533 };
            int[] in7937c = { 11, 23, 1163, 7, 0, 1297 };
            int[] in7937d = { 7, 11, 109, 19, 127, 0 };
            for (int i = 0; i < in7937w.Length; i++)
            {
                try
                {
                    String result = task7937(in7937w[i], in7937h[i],
                            in7937c[i], in7937d[i]);
                    Console.WriteLine(result);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            }
        }

        public static bool task8878(int a, int b)
        {
            return a < b;
        }

        public class class3072
        {
            int max;
            int min;
            public class3072(int max, int min)
            {
                this.max = max;
                this.min = min;
            }
            public String print()
            {
                return "Максимальное " + max + ", минимальное " + min;
            }
        }

        public static class3072 task3072(int p, int q)
        {
            if (p > q)
            {
                return new class3072(p, q);
            }
            else {
                return new class3072(q, p);
            }
        }

        public static double task5980(int k)
        {
            if (k > 0)
            {
                return Math.Sqrt(k);
            }
            else {
                return k * k;
            }
        }

        public static int task8174(int a)
        {
            if (a > 0)
            {
                return a;
            }
            else {
                return -a;
            }
        }

        public static bool task4257(double l, double p)
        {
            if (l < 0)
            {
                throw new Exception("Значение L должно быть неотрицательным");
            }
            if (p < 0)
            {
                throw new Exception("Значение P должно быть неотрицательным");
            }
            return l * 1000 < p * 0.305;
        }

        public static bool task2291(double v1, double v2)
        {
            if (v1 < 0)
            {
                throw new Exception("Значение V1 должно быть неотрицательным");
            }
            if (v2 < 0)
            {
                throw new Exception("Значение V2 должно быть неотрицательным");
            }
            return v1 * 1000 / 60 / 60 < v2;
        }

        public static bool task1763(int r, int a)
        {
            if (r < 0)
            {
                throw new Exception("Значение R должно быть неотрицательным");
            }
            if (a < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            return Math.PI * r * r < a * a;
        }

        public static String task5662(int a, int b, int c)
        {
            if (a == 0)
            {
                return "Данное уравнение не является квадратным";
            }
            double d = b * b - 4 * a * c;
            if (d > 0)
            {
                return "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
            }
            else if (d == 0)
            {
                return "У уравнения " + a + "x^2 + " + b + "x + " + c + " два вещественных корня";
            }
            else
            {
                return "Уравнение " + a + "x^2 + " + b + "x + " + c + " имеет один корень";
            }
        }

        public static bool task1945(int sc, int ss)
        {
            if (sc <= 0)
            {
                throw new Exception("Площадь круга должна быть положительной");
            }
            if (ss <= 0)
            {
                throw new Exception("Площадь квадрата должна быть положительной");
            }
            return Math.Sqrt(sc / Math.PI) < Math.Sqrt(ss) / 2;
        }

        public static double[] task1186(double x, double y, double z)
        {
            return new double[] {
            x > 0 ? x * x : x,
            y > 0 ? y * y : y,
            z > 0 ? z * z : z
        };
        }

        public static bool task8715(int a, int b, int c)
        {
            return a < b && b < c;
        }

        public static StringBuilder task8518(StringBuilder builder, String x)
        {
            String[] chars = { "a", "b", "c", "d", "e", "f", "g", "h" };
            for (int i = 0; i < chars.Length; i++)
            {
                builder.Append(chars[i]);
                if (chars[i].Equals(x))
                {
                    builder.Append("+");
                }
                builder.Append("\n");
            }
            return builder;
        }

        public static bool task4847(int x, int y, int z)
        {
            return x == y || y == z || x == z;
        }

        public static IList<Double> task7991(double x, double y, double z)
        {
            IList<Double> ret = new List<double>();
            if (-3 < x && x < 5)
            {
                ret.Add(x);
            }
            if (-3 < y && y < 5)
            {
                ret.Add(y);
            }
            if (-3 < z && z < 5)
            {
                ret.Add(z);
            }
            return ret;
        }

        public static bool task6291(int a, int b, int c)
        {
            if (a < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательным");
            }
            if (c < 0)
            {
                throw new Exception("Значение C должно быть неотрицательным");
            }
            return a == b || a == c || b == c;
        }

        public static int task3770(int x, int y, int z)
        {
            if (x > y && x > z)
            {
                return x;
            }
            if (y > x && y > z)
            {
                return y;
            }
            return z;
        }

        public class class7178
        {
            int quotient;
            bool empty;
            public class7178(int quotient)
            {
                this.quotient = quotient;
            }
            public class7178()
            {
                this.empty = true;
            }
            public String print()
            {
                if (empty)
                {
                    return "M не делится нацело на P";
                }
                else {
                    return quotient.ToString();
                }
            }
        }

        public static class7178 task7178(int m, int p)
        {
            if (p == 0)
            {
                throw new Exception("Значение P должно быть не равно нулю");
            }
            if (m % p == 0)
            {
                return new class7178(m / p);
            }
            else {
                return new class7178();
            }
        }

        public static bool task3883(int a)
        {
            if (a < 1000 || a > 9999)
            {
                throw new Exception("Значение A должно быть в интервале [1000, 9999]");
            }
            int hundreds = a / 100 % 10;
            int units = a % 10;
            return hundreds == units;
        }

        public static String task4527(int a)
        {
            if (a < -10 || a > 100)
            {
                throw new Exception("Значение A должно быть в интервале [-10, 100]");
            }
            if (a == 40)
            {
                return "40'ой";
            }
            if (a == 0)
            {
                return "0'ой";
            }
            int abs = a < 0 ? -a : a;
            if (abs % 10 == 1 || abs % 10 == 4 || abs % 10 == 5 || abs % 10 == 9 || a % 10 == 0
                    || a == 12 || a == 13 || a == 16 || a == 17 || a == 18)
            {
                return a + "'ый";
            }
            if (abs % 10 == 2 || abs % 10 == 6 || abs % 10 == 7 || abs % 10 == 8)
            {
                return a + "'ой";
            }
            if (abs % 10 == 3)
            {
                return a + "'ий";
            }
            return a.ToString();
        }

        public static bool task6556(int a, int b, int c, int d)
        {
            if (a < 0)
            {
                throw new Exception("Значение A должно быть неотрицательным");
            }
            if (b < 0)
            {
                throw new Exception("Значение B должно быть неотрицательным");
            }
            if (c < 0)
            {
                throw new Exception("Значение C должно быть неотрицательным");
            }
            if (d < 0)
            {
                throw new Exception("Значение D должно быть неотрицательным");
            }
            return a < c && b < d;
        }

        public class Point
        {
            public readonly int x;
            public readonly int y;

            public Point(int x, int y)
            {
                this.x = x;
                this.y = y;
            }
        }

        public class Rectangle
        {
            public readonly int x;
            public readonly int y;
            public readonly int h;
            public readonly int w;

            public Rectangle(int x, int y, int h, int w)
            {
                this.x = x;
                this.y = y;
                this.h = h;
                this.w = w;
            }
        }

        public class Interval
        {
            public readonly int a;
            public readonly int b;

            public Interval(int a, int b)
            {
                this.a = a;
                this.b = b;
            }
        }

        public static Point makePointByXY(int x, int y)
        {
            if (x < 0)
            {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            if (y < 0)
            {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            return new Point(x, y);
        }

        public static Rectangle makeRectangleByXYHW(int x, int y, int h, int w)
        {
            if (x < 0)
            {
                throw new Exception("Координата X должна быть неотрицательной");
            }
            if (y < 0)
            {
                throw new Exception("Координата Y должна быть неотрицательной");
            }
            if (h <= 0)
            {
                throw new Exception("Высота должна быть положительна");
            }
            if (w <= 0)
            {
                throw new Exception("Ширина должна быть положительна");
            }
            return new Rectangle(x, y, h, w);
        }

        public static Interval makeIntervalByEnds(int a, int b)
        {
            if (a > b)
            {
                throw new Exception("Значение A должно быть меньше значения B");
            }
            return new Interval(a, b);
        }

        public static bool task5635(Point t, Rectangle r)
        {
            return r.x < t.x &&
                    t.x < r.x + r.w &&
                    r.y < t.y &&
                    t.y < r.y + r.h;
        }

        public static bool task3878(Point t, Point p1, Point p2)
        {
            return (t.x - p1.x) / (p2.x - p1.x) == (t.y - p1.y) / (p2.y - p1.y);
        }

        public static bool task1217check(Interval i1, Interval i2)
        {
            return !(i1.b <= i2.a || i2.b <= i1.a);
        }

        public static Interval task1217intersection(Interval i1, Interval i2)
        {
            if (i1.a < i2.a && i2.a < i1.b)
            {
                if (i2.b > i1.b)
                {
                    return new Interval(i2.a, i1.b);
                }
                else {
                    return new Interval(i2.a, i2.b);
                }
            }
            else {
                if (i2.b > i1.b)
                {
                    return new Interval(i1.a, i1.b);
                }
                else {
                    return new Interval(i1.a, i2.b);
                }
            }
        }

        public static bool task1438check(Rectangle r1, Rectangle r2)
        {
            Interval r1x = new Interval(r1.x, r1.x + r1.w);
            Interval r2x = new Interval(r2.x, r2.x + r2.w);
            Interval r1y = new Interval(r1.y, r1.y + r1.h);
            Interval r2y = new Interval(r2.y, r2.y + r2.h);
            return task1217check(r1x, r2x) && task1217check(r1y, r2y);
        }

        public static Rectangle task1438intersect(Rectangle r1, Rectangle r2)
        {
            Interval r1x = new Interval(r1.x, r1.x + r1.w);
            Interval r2x = new Interval(r2.x, r2.x + r2.w);
            Interval r1y = new Interval(r1.y, r1.y + r1.h);
            Interval r2y = new Interval(r2.y, r2.y + r2.h);

            Interval xx = task1217intersection(r1x, r2x);
            Interval xy = task1217intersection(r1y, r2y);
            return new Rectangle(xx.a, xy.a,  xy.b - xy.a, xx.b - xx.a);
        }

        public static bool task2153(int t)
        {
            if (t > 60 || t <= 0)
            {
                throw new Exception("Значение T должно быть в интервале [0, 59]");
            }
            return (t - 1) % 5 < 3;
        }

        public static String task7937(int w, int h, int c, int d)
        {
            if (w <= 0)
            {
                throw new Exception("Значение W должно быть положительным");
            }
            if (h <= 0)
            {
                throw new Exception("Значение H должно быть положительным");
            }
            if (c <= 0)
            {
                throw new Exception("Значение C должно быть положительным");
            }
            if (d <= 0)
            {
                throw new Exception("Значение D должно быть положительным");
            }
            int cw = (w / c) * (h / d);
            int ch = (h / c) * (w / d);
            if (cw > ch)
            {
                return cw + " при C вдоль W";
            }
            else {
                return ch + " при C вдоль H";
            }
        }

        public static bool task1999(int x, int y)
        {
            return x <= -2 && y >= 1;
        }

        public static bool task4042(double x, double y)
        {
            return y <= 1.5 && y >= -2;
        }

        public static bool task6351(double x, double y)
        {
            return y <= 4 && x >= 1 && x <= 2;
        }

        public static bool task5382(double x, double y)
        {
            return y <= 4 && y >= 2 && x >= 1;
        }

        public static bool task7088(double x, double y)
        {
            return (x >= 2 && y >= 0) || (x >= 1 && y <= -1);
        }

        public static bool task7250(double x, double y)
        {
            return x >= 2 && (y >= 1 || y <= -1.5);
        }

        public static bool task6740(double x, double y)
        {
            return x >= 1 && x <= 3 && y >= -2 && y <= -1;
        }

        public static bool task9038(double x, double y)
        {
            return x >= 2 || (y <= 1.5 && y >= 0.5);
        }
    }
}