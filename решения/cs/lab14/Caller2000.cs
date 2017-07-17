using Classes.task2000;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller2000
    {
        public static void Step1()
        {
            try
            {
                Interval range = new Interval(23, 29);
                Console.WriteLine("Интервал инициализирован");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step2()
        {
            try
            {
                Interval range = new Interval(41, 29);
                Console.WriteLine("Интервал инициализирован");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step3()
        {
            try
            {
                Interval range = new Interval(5, 11);
                Console.WriteLine("Интервал инициализирован");
                range.slide(7);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step4()
        {
            try
            {
                Interval range = new Interval(41, 29);
                Console.WriteLine("Интервал инициализирован");
                range.slide(20);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step5()
        {
            try
            {
                Interval range = new Interval(211, 223);
                range.squeeze(23);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step6()
        {
            try
            {
                Interval range = new Interval(13, 151);
                range.squeeze(41);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step7()
        {
            try
            {
                Interval range = new Interval(13, 151);
                Console.WriteLine("Длина интервала: " + range.length());
                range.squeeze(41);
                Console.WriteLine("Интервал успешно изменен");
                Console.WriteLine("Длина интервала: " + range.length());
                Console.WriteLine(range.print());
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}