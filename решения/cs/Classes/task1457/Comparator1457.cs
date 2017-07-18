using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.task1457
{
    public class Comparator1457 : Comparer<Point>
    {
        private Point target;
        private int count;

        public Comparator1457(Point target)
        {
            if (target == null)
            {
                throw new ArgumentException("Целевая точка не инициализирована");
            }
            this.target = target;
            this.count = 0;
        }

        public int getCount()
        {
            return count;
        }

        public Point getTarget()
        {
            return target;
        }

        public override int Compare(Point o1, Point o2)
        {
            double d1 = target.distanceTo(o1);
            double d2 = target.distanceTo(o2);
            count++;
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
