using Classes.Task1953;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller1953
    {
        public static void Step1()
        {
            Circle c = new Circle(100, 200, 50);
            Console.WriteLine(c);
        }

        public static void Step2()
        {
            Circle c = new Circle(40, 50, 13);
            Console.WriteLine("{0:F4}", c.Area);
        }

        public static void Step3()
        {
            Circle c = new Circle(100, 120, 17);
            Interval px = c.MakeProjectionX();
            Interval py = c.MakeProjectionY();
            Console.WriteLine(px.Print());
            Console.WriteLine(py.Print());
        }

        public static void Step4()
        {
            Circle c = new Circle(100, 120, 31);
            Console.WriteLine(c.MakeProjectionX().Print());
            Console.WriteLine(c.MakeProjectionY().Print());
        }
    }
}