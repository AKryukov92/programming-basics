using Classes.task3956;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller3956
    {
        public static void Step1()
        {
            Shape s1 = new Rectangle(0, 0, 20, 20);
            Point center = s1.getCenter();
            Console.WriteLine(center.print());
            Shape s2 = new Circle(100, 100, 15);
            Console.WriteLine(s2.getCenter().print());
            if (s1.getCenter().Equals(s2.getCenter()))
            {
                Console.WriteLine("Совпадают");
            }
            else
            {
                Console.WriteLine("Различаются");
            }
        }

        public static void Step2()
        {
            Shape s1 = new Rectangle(0, 0, 20, 20);
            Console.WriteLine(s1.getCenter().print());
            Shape s2 = new Circle(100, 100, 15);
            Console.WriteLine(s2.getCenter().print());
            s1.slide(90, 0);
            Console.WriteLine(s1.getCenter().print());
            s2.slide(0, -90);
            Console.WriteLine(s2.getCenter().print());
            if (s1.getCenter().Equals(s2.getCenter()))
            {
                Console.WriteLine("Совпадают");
            }
            else
            {
                Console.WriteLine("Различаются");
            }
        }

        public static void Step3()
        {
            Shape[] arr = new Shape[] {
                new Rectangle(0,0,20,20),
                new Circle(100,100,15),
                new Rectangle(13,17,19,23),
                new Circle(73,79,83)
            };
            double areaSum = 0;
            for (int i = 0; i < arr.Length; i++)
            {
                areaSum += arr[i].area();
            }
            Console.WriteLine("{0:F4}", areaSum);
        }

        public static void Step4()
        {
            Shape r = new Rectangle(0, 0, 10, 10, "blue", "red", 5);
            Shape c = new Circle(50, 50, 40, "green", "yellow", 4);
            Console.WriteLine(r);
            Console.WriteLine(c);
        }
    }
}