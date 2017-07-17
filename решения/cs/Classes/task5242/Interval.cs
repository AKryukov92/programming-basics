using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task5242
{
    public class Interval
    {
        public int a;
        public int b;
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
