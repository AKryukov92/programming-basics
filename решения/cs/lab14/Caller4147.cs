using Classes.task4147;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    class Caller4147
    {
        public static void Step1()
        {
            Rectangle r = new Rectangle(5, 5, 20, 20);
            Point p = new Point(30, 30);
            if (r.contains(p))
            {
                Console.WriteLine("Содержит");
            }
            else
            {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step2()
        {
            Point corner = new Point(10, 10);
            Rectangle r = new Rectangle(corner, 20, 20);
            Point p = new Point(30, 30);
            if (r.contains(p))
            {
                Console.WriteLine("Содержит");
            }
            else
            {
                Console.WriteLine("Не содержит");
            }
        }

        public static void Step3()
        {
            Point corner = new Point(10, 10);
            Rectangle r = new Rectangle(corner, 20, 20);
            Console.WriteLine(r.area());
        }

        public static void Step4()
        {
            Interval projectionX = new Interval(15, 30);
            Interval projectionY = new Interval(20, 35);
            Rectangle r = new Rectangle(projectionX, projectionY);
            Console.WriteLine(r.area());
        }

        public static void Step5()
        {
            Rectangle r = new Rectangle(100, 200, 300, 400);
            Interval i = new Interval(50, 75);
            if (r.getProjectionX().Intersects(i))
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }

        public static void Step6()
        {
            Rectangle r = new Rectangle(100, 200, 300, 400);
            Interval i = new Interval(100, 300);
            if (r.getProjectionY().Intersects(i))
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }
    }
}