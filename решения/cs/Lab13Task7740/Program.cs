using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab13Task7740
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                double x = Double.Parse(Console.ReadLine());
                double result = x + 7;
                Console.WriteLine("{0:F4}", result);
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удается считать число");
            }
        }
    }
}
