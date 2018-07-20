using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Task5449
{
    public class Point
    {
        private int x;
        private int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public String Print()
        {
            return "(" + x + ";" + y + ")";
        }
        
        public override bool Equals(Object other)
        {
            if (other == null) return false;
            if (this == other) return true;
            if (GetType() != other.GetType()) return false;
            Point point = (Point) other;
            if (x == point.x && y == point.y) return true;
            return false;
        }
        
        public override int GetHashCode()
        {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}