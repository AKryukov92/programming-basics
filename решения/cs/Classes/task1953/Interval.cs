using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task1953
{
    public class Interval
    {
        private int a;
        private int b;
        public Interval(int a, int b)
        {
            this.a = a;
            this.b = b;
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
