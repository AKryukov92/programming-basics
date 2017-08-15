using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task1457
{
    public class Comparator1457 : Comparer<Point>
    {
        public Point Target { private set; get; }
        public int Count { private set; get; }

        public Comparator1457(Point target)
        {
            if (target == null)
            {
                throw new ArgumentException("Целевая точка не инициализирована");
            }
            this.Target = target;
            this.Count = 0;
        }

        public override int Compare(Point o1, Point o2)
        {
            double d1 = Target.DistanceTo(o1);
            double d2 = Target.DistanceTo(o2);
            Count++;
            if (d1 > d2)
            {
                return 1;
            }
            else if (d1 == d2)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
    }
}
