using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.step3
{
    public class Point
    {
        private int x;
        private int y;
        private String color;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
            this.color = "white";
        }

        public Point(int x, int y, String color)
        {
            this.x = x;
            this.y = y;
            this.color = color;
        }

        public String Print()
        {
            return "(" + x + ";" + y + ";" + color + ")";
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
            result += 31 * y;
            return result;
        }
    }
}