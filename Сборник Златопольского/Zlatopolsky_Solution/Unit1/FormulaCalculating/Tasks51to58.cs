using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Unit1.FormulaCalculating
{
    public class Tasks51to58
    {

        public void task1_51()
        {
            String temp;
            double xa, ya, xb, yb, xc, yc, xd, yd;
            double dx, dy, ab, bc, cd, da, ac, p1, p2, s1, s2;
            double s;
            temp = Console.ReadLine();
            xa = double.Parse(temp);
            temp = Console.ReadLine();
            ya = double.Parse(temp);
            temp = Console.ReadLine();
            xb = double.Parse(temp);
            temp = Console.ReadLine();
            yb = double.Parse(temp);
            temp = Console.ReadLine();
            xc = double.Parse(temp);
            temp = Console.ReadLine();
            yc = double.Parse(temp);
            temp = Console.ReadLine();
            xd = double.Parse(temp);
            temp = Console.ReadLine();
            yd = double.Parse(temp);
            dx = xa - xb;
            dy = ya - yb;
            ab = Math.Sqrt(dx * dx + dy * dy);
            dx = xb - xc;
            dy = yb - yc;
            bc = Math.Sqrt(dx * dx + dy * dy);
            dx = xc - xd;
            dy = yc - yd;
            cd = Math.Sqrt(dx * dx + dy * dy);
            dx = xd - xa;
            dy = yd - ya;
            da = Math.Sqrt(dx * dx + dy * dy);
            dx = xa - xc;
            dy = ya - yc;
            ac = Math.Sqrt(dx * dx + dy * dy);
            p1 = (ab + bc + ac) / 2;
            s1 = Math.Sqrt(p1 * (p1 - ac) * (p1 - bc) * (p1 - cd));
            p2 = (cd + da + ac) / 2;
            s2 = Math.Sqrt(p2 * (p2 - cd) * (p2 - da) * (p1 - ac));
            s = s1 + s2;
            Console.WriteLine("{0:F4}", s);
        }

        public void task1_52()
        {
            String temp;
            double candyCost = 13, cookieCost = 17, appleCost = 19;
            double x, y, z;
            double total;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            temp = Console.ReadLine();
            y = double.Parse(temp);
            temp = Console.ReadLine();
            z = double.Parse(temp);
            temp = Console.ReadLine();
            total = candyCost * x + cookieCost * y + appleCost * z;
            Console.WriteLine("{0:F4}", total);
        }

        public void task1_53()
        {
            String temp;
            double displayCost = 13, pcCost = 17, keyboardCost = 19, mouseCost = 23;
            double n;
            double total, totalN;
            temp = Console.ReadLine();
            n = double.Parse(temp);
            if (n < 0)
            {
                Console.WriteLine("Количество должно быть неотрицательным");
                return;
            }
            total = 3 * (displayCost + pcCost + keyboardCost + mouseCost);
            totalN = n * (displayCost + pcCost + keyboardCost + mouseCost);
            Console.WriteLine("{0:F4} {1:F4}", total, totalN);
        }

        public void task1_54()
        {
            String temp;
            double x, y;
            double avg, dx, dy;
            temp = Console.ReadLine();
            x = double.Parse(temp);
            temp = Console.ReadLine();
            y = double.Parse(temp);
            if (x <= 0)
            {
                Console.WriteLine("Возраст должен быть положительным");
                return;
            }
            if (y <= 0)
            {
                Console.WriteLine("Возраст должен быть положительным");
                return;
            }
            avg = (x + y) / 2;
            dx = Math.Abs(x - avg);
            dy = Math.Abs(y - avg);
            Console.WriteLine("{0:F4} {1:F4} {2:F4}", avg, dx, dy);
        }

        public void task1_55()
        {
            String temp;
            double v1, v2, s;
            double t;
            temp = Console.ReadLine();
            v1 = double.Parse(temp);
            if (v1 < 0)
            {
                Console.WriteLine("Скорость не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            v2 = double.Parse(temp);
            if (v2 < 0)
            {
                Console.WriteLine("Скорость не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            s = double.Parse(temp);
            if (s <= 0)
            {
                Console.WriteLine("Расстояние должно быть положительным");
                return;
            }
            t = s / (v1 + v2);
            Console.WriteLine("{0:F4}", t);
        }

        public void task1_56()
        {
            String temp;
            double v1, v2, s, t = 30;
            double s1, s2;
            double ds;
            temp = Console.ReadLine();
            v1 = double.Parse(temp);
            if (v1 < 0)
            {
                Console.WriteLine("Скорость не может быть отрицательной");
                return;
            }
            temp = Console.ReadLine();
            v2 = double.Parse(temp);
            if (v2 < 0)
            {
                Console.WriteLine("Скорость не может быть отрицательной");
                return;
            }
            if (v2 >= v1)
            {
                Console.WriteLine("Скорость второго автомобиля должна быть меньше скорости первого");
                return;
            }
            temp = Console.ReadLine();
            s = double.Parse(temp);
            if (s <= 0)
            {
                Console.WriteLine("Расстояние должно быть положительным");
                return;
            }
            s1 = v1 * t;
            s2 = v2 * t;
            ds = s + (s2 - s1);
            Console.WriteLine("{0:F4}", ds);
        }

        public void task1_57a()
        {
            String temp;
            double tc, tf;
            temp = Console.ReadLine();
            tc = double.Parse(temp);
            if (tc < -273.15)
            {
                Console.WriteLine("Невозможное значение температуры");
                return;
            }
            tf = tc * 1.8 + 32;
            Console.WriteLine("{0:F4}", tf);
        }

        public void task1_57b()
        {
            String temp;
            double tc, tk;
            temp = Console.ReadLine();
            tc = double.Parse(temp);
            if (tc < -273.15)
            {
                Console.WriteLine("Невозможное значение температуры");
                return;
            }
            tk = tc + 273.15;
            Console.WriteLine("{0:F4}", tk);
        }

        public void task1_58()
        {
            double tf = 450, tc;
            tc = (tf - 32) / 1.8;
            Console.WriteLine("{0:F4}", tc);
        }
    }
}
