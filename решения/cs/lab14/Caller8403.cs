using Classes.task8403;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller8403
    {
        public static void Step1()
        {
            Point p = new Point();
            p.x = 0;
            p.y = 0;
            double dist = p.DistanceTo(4, 3);
            Console.WriteLine(dist);
        }

        public static void Step2()
        {
            Point p = new Point();
            p.x = 0;
            p.y = 0;
            Console.WriteLine(p.DistanceTo(0, 0));
        }

        public static void Step3()
        {
            Point p = new Point();
            p.x = 19;
            p.y = 23;
            Console.WriteLine("{0:F4}", p.DistanceTo(11, 13));
        }

        public static void Step4()
        {
            Point p = new Point()
            {
                x = 11,
                y = 23
            };
            Console.WriteLine(p.DistanceTo(11, 13));
        }
    }
}
