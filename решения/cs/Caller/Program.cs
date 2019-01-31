using Methods;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Caller
{
    class Program
    {
        static void Main(string[] args)
        {
            Step8867();
            Step7865();
        }

        public static void Step6924()
        {
            Console.WriteLine(Lab02.Task6924(-50, -86.6025, 60, 0));
            Console.WriteLine(Lab02.Task6924(10, 0, 0, 10));
            Console.WriteLine(Lab02.Task6924(11, 13, 7, 17));
            Console.WriteLine(Lab02.Task6924(-70.7106, 50, 60, 0));
            Console.WriteLine(Lab02.Task6924(-86.6025, 50, 60, 0));
            Console.WriteLine(Lab02.Task6924(3, 4, 4, 3));
        }
        public static void Step8867()
        {
            Console.WriteLine();
            Console.WriteLine("8867");
            int[] in8867a = { 1, -4, -2, 0, 4, 4 };
            int[] in8867b = { 3, 5, 7, 5, 4, -2 };
            int[] in8867x = { 2, 0, -10, 7, 4, 3 };
            for (int i = 0; i < in8867a.Length; i++)
            {
                try
                {
                    Console.WriteLine(Lab05.Task8867(in8867a[i], in8867b[i], in8867x[i]));
                }
                catch (ArgumentException ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }
        public static void Step7865() { 
            Console.WriteLine();
            Console.WriteLine("7865");
            int[] in7865 = { -5, -11, -3, 10, 5, 19, 0, -20, 20 };
            for (int i = 0; i < in7865.Length; i++)
            {
                Console.WriteLine(Lab05.Task7865(in7865[i]));
            }
        }
    }
}
