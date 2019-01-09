using Classes.Task1457;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab15
{
    public class Caller1457
    {
        public static List<Point> SetUp()
        {
            List<Point> points = new List<Point>();
            points.Add(new Point(6, 1));
            points.Add(new Point(1, 2));
            points.Add(new Point(3, 2));
            points.Add(new Point(7, 3));
            points.Add(new Point(5, 4));
            points.Add(new Point(2, 5));
            points.Add(new Point(3, 7));
            points.Add(new Point(8, 7));
            return points;
        }

        public static void Step1()
        {
            Console.WriteLine();
            Console.WriteLine("step1");
            List<Point> points = new List<Point>()
            {
                new Point(5, 7),
                new Point(5, 5),
                new Point(5, 9),
                new Point(5, 8),
                new Point(5, 6)
            };
            Comparator1457 comparator1457 = new Comparator1457(new Point(5, 4));
            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + comparator1457.Target);
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, comparator1457.Target.DistanceTo(p));
            }
        }

        public static void Step2()
        {
            Console.WriteLine();
            Console.WriteLine("step2");
            List<Point> points = new List<Point>()
            {
                new Point(7, 7),
                new Point(5, 7),
                new Point(4, 7),
                new Point(6, 7),
                new Point(3, 7)
            };
            Comparator1457 comparator1457 = new Comparator1457(new Point(2, 7));
            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + comparator1457.Target);
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, comparator1457.Target.DistanceTo(p));
            }
        }

        public static void Step3()
        {
            Console.WriteLine();
            Console.WriteLine("step3");
            List<Point> points = SetUp();
            Point target = new Point(0, 0);
            Comparator1457 comparator1457 = new Comparator1457(target);

            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + target);
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, target.DistanceTo(p));
            }
        }

        public static void Step4()
        {
            Console.WriteLine();
            Console.WriteLine("step4");
            List<Point> points = SetUp();
            Comparator1457 comparator1457 = new Comparator1457(new Point(5, 5));
            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + comparator1457.Target);
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, comparator1457.Target.DistanceTo(p));
            }
        }

        public static void Step5()
        {
            Console.WriteLine();
            Console.WriteLine("step5");
            List<Point> points = SetUp();
            try
            {
                points.Sort(new Comparator1457());
                foreach (Point p in points)
                {
                    Console.WriteLine(p);
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine("Целевая точка не указана");
            }
        }
    }
}
