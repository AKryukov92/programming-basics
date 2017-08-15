using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task6876
{
    public class Comparator6876 : Comparer<Shape>
    {
        public override int Compare(Shape o1, Shape o2)
        {
            return (int)(o2.Area - o1.Area);
        }
    }
}
