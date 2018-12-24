using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Comparator7186 : Comparer<int>
    {
        private int x;
        public Comparator7186(int x)
        {
            this.x = x;
        }

        public override int Compare(int a, int b)
        {
            int d1 = Math.Abs(a - x);
            int d2 = Math.Abs(b - x);
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
