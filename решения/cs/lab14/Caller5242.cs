using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Classes.task5242;

namespace lab14
{
    public class Caller5242
    {
        public static void Step1()
        {
            Interval range = new Interval()
            {
                a = 23,
                b = 29
            };
            Console.WriteLine(range.print());
        }

        public static void Step2()
        {
            Interval range = new Interval();
            range.a = 31;
            range.b = 29;
            try
            {
                Console.WriteLine(range.print());
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}