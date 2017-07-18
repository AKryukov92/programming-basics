using Classes.task8258;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab15
{
    public class Caller8258
    {
        public static void Step1()
        {
            Comparator8258 comparator8258 = new Comparator8258();
            int result = comparator8258.Compare(5, 10);
            Console.WriteLine(result);
        }

        public static void Step2()
        {
            Comparator8258 comparator8258 = new Comparator8258();
            int result = comparator8258.Compare(1000, 3);
            Console.WriteLine(result);
        }

        public static void Step3()
        {
            Comparator8258 comparator8258 = new Comparator8258();
            int result = comparator8258.Compare(17, -5);
            Console.WriteLine(result);
        }

        public static void Step4()
        {
            List<int> integers = new List<int>();
            integers.Add(1);
            integers.Add(10);
            integers.Add(3);
            integers.Add(7);
            Comparator8258 comparator8258 = new Comparator8258();
            integers.Sort(comparator8258);
            Console.WriteLine(String.Join(", ", integers));
        }

        public static void Step5()
        {
            List<int> integers = new List<int>() { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            Comparator8258 comparator8258 = new Comparator8258();
            integers.Sort(comparator8258);
            Console.WriteLine(String.Join(", ", integers));
        }
    }
}
