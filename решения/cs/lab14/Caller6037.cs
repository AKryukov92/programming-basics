using Classes.task6037;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller6037
    {
        public static void Step1()
        {
            Interval l = new Interval();
            l.a = 2;
            l.b = 3;
            Interval r = new Interval()
            {
                a = 5,
                b = 7
            };
            bool found = Interval.HasIntersection(l, r);
            if (found)
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }

        public static void Step2()
        {
            Interval l = new Interval()
            {
                a = 11,
                b = 17
            };
            Interval r = new Interval();
            r.a = 13;
            r.b = 19;
            if (Interval.HasIntersection(l, r))
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }

        public static void Step3()
        {
            Interval l = new Interval()
            {
                a = 79,
                b = 73
            };
            Interval r = new Interval()
            {
                a = 83,
                b = 89
            };
            try
            {
                if (Interval.HasIntersection(l, r))
                {
                    Console.WriteLine("Пересекаются");
                }
                else
                {
                    Console.WriteLine("Не пересекаются");
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step4()
        {
            Interval l = new Interval()
            {
                a = 97,
                b = 101
            };
            Interval r = new Interval()
            {
                a = 107,
                b = 103
            };
            try
            {
                bool found = Interval.HasIntersection(l, r);
                if (found)
                {
                    Console.WriteLine("Пересекаются");
                }
                else
                {
                    Console.WriteLine("Не пересекаются");
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
