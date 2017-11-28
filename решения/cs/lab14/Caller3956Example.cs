using Classes.Task3956example;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller3956Example
    {
        public static void Step1()
        {
            Shape s1 = new Rectangle(0, 0, 20, 20);
            Point center = s1.MakeCenter();
            Console.WriteLine(center.Print());
            Shape s2 = new Circle(100, 100, 15);
            Console.WriteLine(s2.MakeCenter().Print());
            if (center.Equals(s2.MakeCenter()))
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
            Console.WriteLine(s1.MakeCenter().Print());
            Shape s2 = new Circle(100, 100, 15);
            Console.WriteLine(s2.MakeCenter().Print());
            s1.Slide(90, 0);
            Console.WriteLine(s1.MakeCenter().Print());
            s2.Slide(0, -90);
            Console.WriteLine(s2.MakeCenter().Print());
            if (s1.MakeCenter().Equals(s2.MakeCenter()))
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
                areaSum += arr[i].Area;
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