using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Задание_2
{
    class Program
    {
        static void Main(string[] args)
        {
            double a;
            double s;

            Console.WriteLine("введите длину ребра куба");
            a = double.Parse(Console.ReadLine());

            if(a<=0)
            {
                Console.WriteLine("Ошибка");
                return;
            }

            s = 6 * a * a;
            Console.WriteLine(s);
        }
    }
