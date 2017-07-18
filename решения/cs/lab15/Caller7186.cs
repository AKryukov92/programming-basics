using Classes.task7186;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab15
{
    public class Caller7186
    {
        public static void Step1()
        {
            Comparator7186 comparator7186 = new Comparator7186(100);
            int result = comparator7186.Compare(99, 1);
            Console.WriteLine(result);
        }

        public static void Step2()
        {
            Comparator7186 comparator7186 = new Comparator7186(47);
            int result = comparator7186.Compare(9, 57);
            Console.WriteLine(result);
        }

        public static void Step3()
        {
            Comparator7186 comparator0000 = new Comparator7186(100);
            int[] arr = new int[] { 50, 60, 70, 80, 90, 99, 109, 118, 127, 136 };
            Array.Sort(arr, comparator0000);
            foreach (int item in arr)
            {
                Console.Write(item);
                Console.Write(" ");
            }
            Console.WriteLine();
        }

        public static void Step4()
        {
            Comparator7186 comparator7186 = new Comparator7186(-50);
            List<int> values = new List<int>{-49, -55, -60, -60, 15, -28, 22, -16,
                4, 61, 74, -39, -55, -14, -12, 66, 80, -47, 1, -65};
            values.Sort(comparator7186);
            Console.WriteLine(String.Join(", ", values));
        }

        public static void Step5()
        {
            Comparator7186 c1 = new Comparator7186(8);
            Comparator7186 c2 = new Comparator7186(11);
            List<int> values = new List<int> { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
            values.Sort(c1);
            foreach (int item in values)
            {
                Console.Write(item);
                Console.Write("\t");
            }
            Console.WriteLine();
            values.Sort(c2);
            foreach (int item in values)
            {
                Console.Write(item);
                Console.Write("\t");
            }
            Console.WriteLine();
        }
    }
}
