using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task6037
{
    public class Interval
    {
        public int a;
        public int b;
        public static bool HasIntersection(Interval i1, Interval i2)
        {
            if (i1 == null)
            {
                throw new ArgumentException("Левый интервал не инициализирован");
            }
            if (i2 == null)
            {
                throw new ArgumentException("Правый интервал не инициализирован");
            }
            if (i1.a > i1.b || i2.a > i2.b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            return !(i1.b <= i2.a || i2.b <= i1.a);
        }
    }
}
