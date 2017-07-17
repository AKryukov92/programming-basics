using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task2809
{
    public class Point
    {
        public int x;
        public int y;
        public double distanceTo(Point p)
        {
            int dx = p.x - x;
            int dy = p.y - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
        public double distanceTo(int px, int py)
        {
            int dx = px - x;
            int dy = py - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
        public void setCoordinates(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public String print()
        {
            return "(" + x + ";" + y + ")";
        }
    }
}
