using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12zadanie
{
    class Program
    {
        static void Main(string[ args)]
        {
            int b = int.Parse(Console.ReadLine());
            string t = Console.ReadLine();
            string[] arr = t.Split(' ');
            int[] num = new int[arr.Length];
            
            int i = 0;
            int j = 0;
            while (i<arr.Length)
            {
                num[i] = Convert.ToInt32(arr[i]);
                if ( b < num[i])
                {
                    j++;
                }
                i++;
            }
            Console.WriteLine(j);
        }
    }
}