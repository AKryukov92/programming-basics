using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task8403
{
    public class Point
    {
        public int x;
        public int y;

        public double DistanceTo(int px, int py)
        {
            int dx = px - x;
            int dy = py - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
    }
}
