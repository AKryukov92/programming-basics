using Classes.task7301;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller7301
    {
        public static void Step1()
        {
            Point p = new Point(53, 59);
            Console.WriteLine(p.print());
        }

        public static void Step2()
        {
            Point p1 = new Point(53, 59);
            Point p2 = new Point(61, 67);
            double distance = p1.distanceTo(p2);
            Console.WriteLine("Расстояние между {0} и {1} составляет {2:F4}",
                p1, p2, distance);
        }

        public static void Step3()
        {
            double distance = new Point(79, 83).distanceTo(new Point(89, 97));
            Console.WriteLine("{0:F4}", distance);
        }

        public static void Step4()
        {
            Point p = new Point(71, 73);
            Console.WriteLine("Расстояние между {0} и (0;0) составляет {1:F4}",
                p, p.distanceTo(0, 0));
        }

        public static void Step5()
        {
            Console.WriteLine("{0:F4}", new Point(79, 83).distanceTo(new Point(89, 97)));
        }

        public static void Step6()
        {
            double dist = Point.distanceBetween(
                new Point(151, 157),
                new Point(163, 167)
            );
            Console.WriteLine("{0:F4}", dist);
        }

        public static void Step7()
        {
            Console.WriteLine(
                "{0:F4}", 
                Point.distanceBetween(
                    new Point(173, 179),
                    new Point(181, 191)
                )
            );
        }
    }
}