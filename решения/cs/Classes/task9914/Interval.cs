using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task9914
{
    public class Interval
    {
        public int a;
        public int b;

        public bool Intersects(Interval i)
        {
            if (i == null)
            {
                throw new ArgumentException("Данный интервал не инициализирован");
            }
            if (a > b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            if (i.a > i.b)
            {
                throw new ArgumentException("Некорректный интервал");
            }
            return !(b <= i.a || i.b <= a);
        }
    }
}
