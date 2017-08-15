using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Task2000
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

        public void Slide(int value)
        {
            this.a += value;
            this.b += value;
        }

        public void Squeeze(int value)
        {
            if (a > b - value)
            {
                throw new ArgumentException("Невозможно уменьшить интервал на указанную длину");
            }
            this.b -= value;
        }

        public int Length
        {
            get { return b - a; }
        }

        public String Print()
        {
            return "[" + a + ";" + b + "]";
        }
    }
}
