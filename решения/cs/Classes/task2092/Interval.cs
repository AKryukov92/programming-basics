using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task2092
{
    public class Interval
    {
        public int a;
        public int b;
        public bool Contains(int value)
        {
            if(a > b)
            {
                throw new InvalidOperationException("Корректность интервала была нарушена");
            }
            return a <= value && value <= b;
        }
    }
}
