using Classes.task7297;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller7297
    {
        public static void Step1()
        {
            Interval l = new Interval();
            l.a = 11;
            l.b = 17;
            bool fact = l.contains(0);
            if (fact)
            {
                Console.WriteLine("Содержит");
            }
            else
            {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step2()
        {
            Interval interval = new Interval()
            {
                a = 31,
                b = 37
            };
            if (interval.contains(35))
            {
                Console.WriteLine("Содержит");
            }
            else
            {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step3()
        {
            Interval i = new Interval();
            i.a = 41;
            i.b = 43;
            Console.WriteLine(i.contains(50));
        }

        public static void Step4()
        {
            Interval range = new Interval()
            {
                a = 19,
                b = 17
            };
            try
            {
                if (range.contains(18))
                {
                    Console.WriteLine("Содержит");
                }
                else
                {
                    Console.WriteLine("Не содержит");
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}