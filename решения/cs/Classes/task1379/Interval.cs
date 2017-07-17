using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task1379
{
    public class Interval
    {
        public int a;
        public int b;

        public void slide(int value)
        {
            if (a > b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            this.a += value;
            this.b += value;
        }

        public String print()
        {
            if (a > b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            return "[" + a + ";" + b + "]";
        }
    }
}
