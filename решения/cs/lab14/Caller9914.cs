using Classes.task9914;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab14
{
    public class Caller9914
    {
        public static void Step1()
        {
            Interval l = new Interval();
            l.a = 2;
            l.b = 3;
            Interval r = new Interval()
            {
                a = 5,
                b = 7
            };
            bool fact = l.Intersects(r);
            if (fact)
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }

        public static void Step2()
        {
            Interval l = new Interval()
            {
                a = 11,
                b = 17
            };
            Interval r = new Interval();
            r.a = 13;
            r.b = 19;
            if (r.Intersects(l))
            {
                Console.WriteLine("Пересекаются");
            }
            else
            {
                Console.WriteLine("Не пересекаются");
            }
        }

        public static void Step3()
        {
            Interval l = new Interval();
            l.a = 5;
            l.b = 15;
            Interval r = new Interval()
            {
                a = 0,
                b = 30
            };
            Console.WriteLine(l.Intersects(r));
        }

        public static void Step4()
        {
            Interval l = new Interval()
            {
                a = 67,
                b = 71
            };
            Interval r = new Interval()
            {
                a = 59,
                b = 61
            };
            Console.WriteLine(l.Intersects(r));
        }

        public static void Step5()
        {
            Interval l = new Interval();
            l.a = 79;
            l.b = 73;
            Interval r = new Interval()
            {
                a = 83,
                b = 89
            };
            try
            {
                if (l.Intersects(r))
                {
                    Console.WriteLine("Пересекаются");
                }
                else
                {
                    Console.WriteLine("Не пересекаются");
                }
            }
            catch (InvalidOperationException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step6()
        {
            Interval l = new Interval();
            l.a = 97;
            l.b = 101;
            Interval r = new Interval()
            {
                a = 107,
                b = 103
            };
            try
            {
                if (l.Intersects(r))
                {
                    Console.WriteLine("Пересекаются");
                }
                else
                {
                    Console.WriteLine("Не пересекаются");
                }
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        public static void Step7()
        {
            Interval l = new Interval();
            l.a = 127;
            l.b = 131;
            Interval r = null;
            try
            {
                if (l.Intersects(r))
                {
                    Console.WriteLine("Пересекаются");
                }
                else
                {
                    Console.WriteLine("Не пересекаются");
                }
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
