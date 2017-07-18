using Classes.task1457;
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
            List<Point> points = SetUp();
            Console.WriteLine();
            Console.WriteLine("step1");
            Point target = new Point(0, 0);
            Comparator1457 comparator1457 = new Comparator1457(target);

            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + target);
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, target.distanceTo(p));
            }
            Console.WriteLine("Произведено " + comparator1457.getCount() + " сравнений");
        }

        public static void Step2()
        {
            List<Point> points = SetUp();
            Console.WriteLine();
            Console.WriteLine("step2");
            Comparator1457 comparator1457 = new Comparator1457(new Point(5, 5));
            points.Sort(comparator1457);
            Console.WriteLine("Целевая точка " + comparator1457.getTarget());
            foreach (Point p in points)
            {
                Console.WriteLine("{0} {1:F4}", p, comparator1457.getTarget().distanceTo(p));
            }
            Console.WriteLine("Произведено " + comparator1457.getCount() + " сравнений");
        }

        public static void Step3()
        {
            List<Point> points = SetUp();
            Console.WriteLine();
            Console.WriteLine("step3");
            try
            {
                Comparator1457 comparator1457 = new Comparator1457(null);
                points.Sort(comparator1457);
                foreach (Point p in points)
                {
                    Console.WriteLine("{0} {1:F4}", p, comparator1457.getTarget().distanceTo(p));
                }
                Console.WriteLine("Произведено " + comparator1457.getCount() + " сравнений");
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step4()
        {
            try
            {
                Console.WriteLine();
                Console.WriteLine("step4");
                Comparator1457 comparator1457 = new Comparator1457(new Point(0, 0));
                int result = comparator1457.Compare(new Point(1, 1), null);
                Console.WriteLine(result);
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step5()
        {
            try
            {
                Console.WriteLine();
                Console.WriteLine("step5");
                Comparator1457 comparator1457 = new Comparator1457(new Point(0, 0));
                int result = comparator1457.Compare(null, new Point(1, 1));
                Console.WriteLine(result);
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step6()
        {
            List<Point> points = SetUp();
            points.Add(null);
            try
            {
                Console.WriteLine();
                Console.WriteLine("step6");
                points.Sort(new Comparator1457(new Point(0, 0)));
                foreach (Point p in points)
                {
                    Console.WriteLine(p);
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.InnerException.Message);
            }
        }
    }
}