using ClassesExample.Task2809;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller2809Example
    {
        public static void Step1()
        {
            Point p = new Point();
            p.x = 127;
            p.y = 113;
            String str = p.Print();
            Console.WriteLine(str);
        }

        public static void Step2()
        {
            Point p = new Point()
            {
                x = 31,
                y = 37
            };
            Console.WriteLine(p.Print());
        }

        public static void Step3()
        {
            Point p = new Point();
            p.SetCoordinates(5, 7);
            Console.WriteLine(p.Print());
        }

        public static void Step4()
        {
            Point p1 = new Point();
            p1.SetCoordinates(23, 29);
            Console.WriteLine("Расстояние между {0} и (0;0) составляет {1:F4}", p1.Print(), p1.DistanceTo(0, 0));
        }

        public static void Step5()
        {
            Point p1 = new Point();
            p1.SetCoordinates(11, 13);
            Point p2 = new Point();
            p2.x = 17;
            p2.y = 19;
            Console.WriteLine(
                "Расстояние между {0} и {1} составляет {2:F4}",
                p1.Print(),
                p2.Print(),
                p1.DistanceTo(p2)
            );
        }
    }
}
