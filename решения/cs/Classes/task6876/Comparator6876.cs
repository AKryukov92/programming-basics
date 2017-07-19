using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.task6876
{
    public class Comparator6876 : Comparer<Shape>
    {
        public override int Compare(Shape o1, Shape o2)
        {
            double area1 = o1.Area();
            double area2 = o2.Area();

            return (int)(area2 - area1);
        }
    }
}
