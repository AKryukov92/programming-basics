using Classes.Task2401;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    class Caller2401
    {

        public static void Step1()
        {
            Interval range = new Interval()
            {
                a = 31,
                b = 37
            };
            try
            {
                range.Squeeze(2);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.Print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step2()
        {
            Interval range = new Interval()
            {
                a = 41,
                b = 43
            };
            try
            {
                range.Squeeze(19);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.Print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step3()
        {
            Interval range = new Interval();
            range.a = 101;
            range.b = 67;
            try
            {
                range.Squeeze(23);
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
            Interval range = new Interval()
            {
                a = 11,
                b = 107
            };
            try
            {
                range.Squeeze(17);
                Console.WriteLine("Интервал успешно изменен");
                range.b = 7;
                Console.WriteLine(range.Print());
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}