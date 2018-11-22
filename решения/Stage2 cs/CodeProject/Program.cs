using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    class Program
    {
        static void Main(string[] args)
        {
            Methods.Task1860("знаниям");
            Methods.Task1860("цели");
            Methods.Task1860("результату");

            Methods.Task4140("Джеймс", "Бонд");
            Methods.Task4140("капитан", "Джек Воробей");
            Methods.Task4140("Александр", "Крюков");

            Methods.Task2632(50, 50, 40, "yellow");
            Methods.Task2632(400, 300, 200, "green");
            Methods.Task2632(254, 356, 100, "#cc6600");

            Methods.Task7474(1, 2, 3);
            Methods.Task7474(-3, 0, 2);

            double result;
            result = Methods.Task4411(11.13);
            Console.WriteLine("{0:F4}", result);
            result = Methods.Task4411(-7919);
            Console.WriteLine("{0:F4}", result);
            result = Methods.Task4411(0);
            Console.WriteLine("{0:F4}", result);

            Point p = new Point(31, 37);
            p.SetColor("red");
            Console.WriteLine(p);
            Point p1, p2;
            p1 = new Point(11, 13);
            p2 = new Point(17, 19);
            Console.WriteLine("Расстояние между {0} и {1} составляет {2:F4}", p1, p2, p1.DistanceTo(p2));

            Range range = new Range(10, 60);
            Console.Write("Исходный интервал ");
            Console.WriteLine(range);
            range.Shift(70);
            Console.WriteLine("После сдвига {0}", range);
            range.Squeeze(40);
            Console.WriteLine("После сжатия {0}", range);
        }
    }
}
