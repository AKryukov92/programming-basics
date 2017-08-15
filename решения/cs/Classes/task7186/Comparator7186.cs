using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task7186
{
    public class Comparator7186 : Comparer<int>
    {
        private int root;
        public Comparator7186(int root)
        {
            this.root = root;
        }

        public override int Compare(int o1, int o2)
        {
            int d1 = Math.Abs(o1 - root);
            int d2 = Math.Abs(o2 - root);
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