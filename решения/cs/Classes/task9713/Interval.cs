using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task9713
{
    public class Interval
    {
        public int a;
        public int b;
        
        public bool Intersects(Interval i)
        {
            return !(b <= i.a || i.b <= a);
        }

        public override string ToString()
        {
            if(a > b)
            {
                return "[Некорректный интервал " + a + ";" + b + "]";
            }
            return "[" + a + ";" + b + "]";
        }
    }
}
