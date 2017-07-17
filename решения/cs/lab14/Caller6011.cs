using Classes.task6011;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller6011
    {
        public static void Step1()
        {
            Point p1 = new Point()
            {
                x = 109,
                y = 113
            };
            Point p2 = new Point();
            p2.x = 127;
            p2.y = 131;
            double dist = Point.distanceBetween(p1, p2);
            Console.WriteLine("{0:F4}", dist);
        }

        public static void Step2()
        {
            Point p1 = new Point();
            p1.x = 137;
            p1.y = 139;
            Point p2 = new Point()
            {
                x = 139,
                y = 149
            };
            Console.WriteLine("{0:F4}", Point.distanceBetween(p1, p2));
        }

        public static void Step3()
        {
            Point p1 = null;
            Point p2 = new Point()
            {
                x = 151,
                y = 157
            };
            try
            {
                double dist = Point.distanceBetween(p1, p2);
            }
            catch (ArgumentException e)
            {
                Console.WriteLine(e.Message);
            }
        }

        public static void Step4()
        {
            Point p1 = new Point();
            p1.x = 163;
            p1.y = 167;
            Point p2 = null;
            try
            {
                double dist = Point.distanceBetween(p1, p2);
            }
            catch (ArgumentException e)
            {
                Console.WriteLine(e.Message);
            }
        }

        public static void Step5()
        {
            Point p1 = null;
            Point p2 = null;
            try
            {
                double dist = Point.distanceBetween(p1, p2);
            }
            catch (ArgumentException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
