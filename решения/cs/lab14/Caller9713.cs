using Classes.task9713;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller9713
    {
        public static void Step1()
        {
            Interval range = new Interval();
            range.a = 829;
            range.b = 857;
            Console.WriteLine(range);
        }

        public static void Step2()
        {
            Interval range = new Interval()
            {
                a = 593,
                b = 607
            };
            Console.WriteLine(range);
        }

        public static void Step3()
        {
            Interval left = new Interval();
            left.a = 0;
            left.b = 15;
            Interval right = new Interval();
            right.a = 10;
            right.b = 20;
            String result;
            if (left.Intersects(right))
            {
                result = "пересекается";
            }
            else
            {
                result = "не пересекается";
            }
            Console.WriteLine("Интервал {0} {1} с интервалом {2}", left, result, right);
        }

        public static void Step4()
        {
            Interval left = new Interval(), right = new Interval();
            left.a = 100;
            left.b = 200;
            right.a = 400;
            right.b = 300;
            String layout;
            if (left.Intersects(right))
            {
                layout = "Интервал {0} пересекается с интервалом {1}";
            }
            else
            {
                layout = "Интервал {0} не пересекается с интервалом {1}";
            }
            Console.WriteLine(layout, left, right);
        }
    }
}
