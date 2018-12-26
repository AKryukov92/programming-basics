using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Comparator4061 : Comparer<int>
    {
        public override int Compare(int x, int y)
        {
            int absX = Math.Abs(x);
            int absY = Math.Abs(y);
            if (absX > absY)
            {
                return 1;
            } else if (absX < absY)
            {
                return -1;
            } else
            {
                if (x < 0 && y > 0)
                {
                    return -1;
                }
                else if (x > 0 && y < 0)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
}
