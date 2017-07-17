using Classes.task3185;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller3185
    {
        public static void Step1()
        {
            Point p1 = new Point();
            p1.x = 0;
            p1.y = 0;
            Point p2 = new Point();
            p2.x = 4;
            p2.y = 3;
            double dist = p1.DistanceTo(p2);
            Console.WriteLine(dist);
        }

        public static void Step2()
        {
            Point p1 = new Point();
            p1.x = 0;
            p1.y = 0;
            Point p2 = new Point();
            p2.x = 0;
            p2.y = 0;
            Console.WriteLine(p1.DistanceTo(p2));
        }

        public static void Step3()
        {
            Point p1 = new Point();
            p1.x = 19;
            p1.y = 23;
            Point p2 = new Point();
            p2.x = 11;
            p2.y = 13;
            Console.WriteLine("{0:F4}", p1.DistanceTo(p2));
        }

        public static void Step4()
        {
            Point p1 = new Point()
            {
                x = 11,
                y = 23
            };
            Point p2 = new Point()
            {
                x = 11,
                y = 13
            };
            Console.WriteLine(p1.DistanceTo(p2));
        }

        public static void Step5()
        {
            Point p1 = new Point();
            p1.x = 11;
            p1.y = 23;
            Point p2 = null;
            try
            {
                Console.WriteLine(p1.DistanceTo(p2));
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
