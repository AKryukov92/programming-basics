using Classes.task2662;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab14
{
    public class Caller2662
    {

        public static void Step1()
        {
            Interval i1 = new Interval(0, 15);
            Interval i2 = new Interval(15, 30);
            if (i1.Equals(i2))
            {
                Console.WriteLine("Эквивалентны");
            }
            else {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step2()
        {
            Interval i1 = new Interval(10, 20);
            Interval i2 = i1;
            if (i1 == i2)
            {
                Console.WriteLine("Равны");
            }
            else {
                Console.WriteLine("Не равны");
            }
        }

        public static void Step3()
        {
            Interval i1 = new Interval(50, 100);
            Interval i2 = new Interval(50, 100);
            if (i1 == i2)
            {
                Console.WriteLine("Равны");
            }
            else {
                Console.WriteLine("Не равны");
            }
        }

        public static void Step4()
        {
            Interval i = new Interval(13, 17);
            if (i.Equals(i))
            {
                Console.WriteLine("Эквивалентны");
            }
            else {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step5()
        {
            Interval i = new Interval(40, 73);
            if (i.Equals(null))
            {
                Console.WriteLine("Эквивалентны");
            }
            else {
                Console.WriteLine("Не эквивалентны");
            }
        }

        public static void Step6()
        {
            Interval interval = new Interval(0, 1);
            if (interval.Equals(Math.PI))
            {
                Console.WriteLine("Эквивалентны");
            }
            else {
                Console.WriteLine("Не эквивалентны");
            }
        }
    }
}
