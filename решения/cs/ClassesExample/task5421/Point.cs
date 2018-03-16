using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassesExample.Task5421
{
    public class Point
    {
        public int x;
        public int y;

        public double DistanceTo(Point p)
        {
            int dx = p.x - x;
            int dy = p.y - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public double DistanceTo(int px, int py)
        {
            int dx = px - x;
            int dy = py - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public void SetCoordinates(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public String Print()
        {
            return "(" + x + ";" + y + ")";
        }

        public override String ToString()
        {
            return "(" + x + ";" + y + ")";
        }
    }
}
