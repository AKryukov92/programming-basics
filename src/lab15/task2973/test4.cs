using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace task10
{
    class Program
    {
        static void Main(string[] args)
        {
            String d = Console.ReadLine();
            int x = int.Parse(d);
            String a = Console.ReadLine();
            String[] aa;
            aa = a.Split(' ');
            int c = aa.Length - 1;
            String b;
            while (x >= 0)
            {
                c = 0;
                b = aa[c];

                while (c > 0)
                {
                    aa[c( = aa[c - 1];
                    --c;
                }
                aa[c] = b;

                --x;
            }

            while (c < aa.Length)
            {
                Console.Write(aa[c] + " ");
                c++;

            }
        }
    }
}