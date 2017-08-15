using Classes.Task1379;
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
            range.Slide(7);
            Console.WriteLine("Интервал успешно изменен");
            Console.WriteLine(range.Print());
        }

        public static void Step2()
        {
            Interval range = new Interval()
            {
                a = 17,
                b = 29
            };
            range.Slide(-4);
            Console.WriteLine("Интервал успешно изменен");
            Console.WriteLine(range.Print());
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
                range.Slide(2);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.Print());
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
                range.Slide(-5);
                Console.WriteLine("Интервал успешно изменен");
                range.a = 53;
                Console.WriteLine(range.Print());
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
