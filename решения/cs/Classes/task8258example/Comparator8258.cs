using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task8258example
{
    public class Comparator8258 : Comparer<int>
    {
        public override int Compare(int x, int y)
        {
            int d1 = Math.Abs(x - 6);
            int d2 = Math.Abs(y - 6);
            if (d1 > d2)
            {
                return 1;
            }
            else if (d1 == d2)
            {
                return 0;
            }
            else {
                return -1;
            }
        }
    }
}
