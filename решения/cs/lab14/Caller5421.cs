using Classes.task5421;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller5421
    {
        public static void Step1()
        {
            Point p = new Point()
            {
                x = 31,
                y = 37
            };
            Console.WriteLine(p);
        }

        public static void Step2()
        {
            Point p = new Point();
            p.setCoordinates(5, 7);
            Console.WriteLine(p);
        }

        public static void Step3()
        {
            Point p1 = new Point();
            p1.setCoordinates(23, 29);
            Console.WriteLine("Расстояние между {0} и (0;0) составляет {1:F4}", p1, p1.distanceTo(0, 0));
        }

        public static void Step4()
        {
            Point p1 = new Point();
            p1.setCoordinates(11, 13);
            Point p2 = new Point()
            {
                x = 17,
                y = 19
            };
            Console.WriteLine("Расстояние между {0} и {1} составляет {2:F4}", p1, p2, p1.distanceTo(p2));
        }
    }
}
