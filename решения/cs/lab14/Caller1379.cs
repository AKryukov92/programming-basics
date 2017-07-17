using Classes.task1379;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller1379
    {
        public static void Step1()
        {
            Interval range = new Interval();
            range.a = 5;
            range.b = 11;
            range.slide(7);
            Console.WriteLine("Интервал успешно изменен");
            Console.WriteLine(range.print());
        }

        public static void Step2()
        {
            Interval range = new Interval()
            {
                a = 17,
                b = 29
            };
            range.slide(-4);
            Console.WriteLine("Интервал успешно изменен");
            Console.WriteLine(range.print());
        }

        public static void Step3()
        {
            Interval range = new Interval()
            {
                a = 37,
                b = 31
            };
            try
            {
                range.slide(2);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.print());
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step4()
        {
            Interval range = new Interval();
            range.a = 41;
            range.b = 47;
            try
            {
                range.slide(-5);
                Console.WriteLine("Интервал успешно изменен");
                range.a = 53;
                Console.WriteLine(range.print());
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
