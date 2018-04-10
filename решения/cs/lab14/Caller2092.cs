using Classes.task2092;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    class Caller2092
    {
        public static void Step1()
        {
            Interval interval = new Interval();
            interval.a = 0;
            interval.b = 10;
            bool fact = interval.Contains(5);
            if (fact)
            {
                Console.WriteLine("Содержит");
            }
            else {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step2()
        {
            Interval interval = new Interval();
            interval.a = 100;
            interval.b = 1000;
            if (interval.Contains(100))
            {
                Console.WriteLine("Содержит");
            }
            else {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step3()
        {
            Interval interval = new Interval();
            interval.a = 13;
            interval.b = 17;
            if (interval.Contains(17))
            {
                Console.WriteLine("Содержит");
            }
            else {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step4()
        {
            Interval interval = new Interval();
            interval.a = 23;
            interval.b = 29;
            if (interval.Contains(0))
            {
                Console.WriteLine("Содержит");
            }
            else {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step5()
        {
            Interval interval = new Interval();
            interval.a = 31;
            interval.b = 43;
            if (interval.Contains(50))
            {
                Console.WriteLine("Содержит");
            }
            else {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step6()
        {
            Interval interval = new Interval();
            interval.a = 100;
            interval.b = 0;
            try
            {
                interval.Contains(10);
            }
            catch (InvalidOperationException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
