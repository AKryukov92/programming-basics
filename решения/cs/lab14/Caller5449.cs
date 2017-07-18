using Classes.task5449;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller5449
    {
        public static void Step1()
        {
            Point a = new Point(0, 0);
            Point b = new Point(0, 0);
            if (a.Equals(b))
            {
                Console.WriteLine("Эквивалентны");
            }
            else
            {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step2()
        {
            Point c = new Point(15, 17);
            Point d = new Point(15, 17);
            if (d == c)
            {
                Console.WriteLine("Равны");
            }
            else
            {
                Console.WriteLine("Не равны");
            }
        }

        public static void Step3()
        {
            Point f = new Point(83, 61);
            Point h = f;
            if (f == h)
            {
                Console.WriteLine("Равны");
            }
            else
            {
                Console.WriteLine("Не равны");
            }
        }

        public static void Step4()
        {
            Point i = new Point(13, 13);
            if (i.Equals(null))
            {
                Console.WriteLine("Эквивалентны");
            }
            else
            {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step5()
        {
            Point j = new Point(59, 59);
            if (j.Equals("(59;59"))
            {
                Console.WriteLine("Эквивалентны");
            }
            else
            {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step6()
        {
            Point k = new Point(1097, 691);
            if (k.Equals(k))
            {
                Console.WriteLine("Эквивалентны");
            }
            else
            {
                Console.WriteLine("Не эквивалентны");
            }
        }
    }
}