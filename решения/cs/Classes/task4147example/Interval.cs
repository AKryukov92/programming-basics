using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Task4147example
{
    public class Interval
    {
        private int a;
        private int b;

        public Interval(int a, int b)
        {
            if (a > b)
            {
                throw new ArgumentException("Некорректный интервал");
            }
            this.a = a;
            this.b = b;
        }

        public int Length
        {
            get
            {
                return b - a;
            }
        }

        public int A
        {
            get
            {
                return a;
            }
        }

        public bool Intersects(Interval i)
        {
            return !(b <= i.a || i.b <= a);
        }
    }
}
