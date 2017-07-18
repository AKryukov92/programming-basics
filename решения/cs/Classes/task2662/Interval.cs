using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.task2662
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

        public override bool Equals(Object o)
        {
            if (this == o) return true;
            if (o == null || GetType() != o.GetType()) return false;

            Interval interval = (Interval)o;

            if (a != interval.a) return false;
            return b == interval.b;

        }

        public override int GetHashCode()
        {
            int result = a;
            result = 31 * result + b;
            return result;
        }
    }
}
