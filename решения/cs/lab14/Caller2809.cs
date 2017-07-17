using Classes.task2809;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller2809
    {
        public static void Step1()
        {
            Point p = new Point();
            p.x = 127;
            p.y = 113;
            String str = p.print();
            Console.WriteLine(str);
        }

        public static void Step2()
        {
            Point p = new Point()
            {
                x = 31,
                y = 37
            };
            Console.WriteLine(p.print());
        }

        public static void Step3()
        {
            Point p = new Point();
            p.setCoordinates(5, 7);
            Console.WriteLine(p.print());
        }

        public static void Step4()
        {
            Point p1 = new Point();
            p1.setCoordinates(23, 29);
            Console.WriteLine("Расстояние между {0} и (0;0) составляет {1:F4}", p1.print(), p1.distanceTo(0, 0));
        }

        public static void Step5()
        {
            Point p1 = new Point();
            p1.setCoordinates(11, 13);
            Point p2 = new Point();
            p2.x = 17;
            p2.y = 19;
            Console.WriteLine(
                "Расстояние между {0} и {1} составляет {2:F4}",
                p1.print(),
                p2.print(),
                p1.distanceTo(p2)
            );
        }
    }
}
