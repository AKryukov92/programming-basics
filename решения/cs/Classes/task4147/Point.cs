using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task4147
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
        
        public override bool Equals(Object o)
        {
            if (this == o) return true;
            if (o == null || this.GetType() != o.GetType()) return false;

            Point point = (Point)o;

            if (x != point.x) return false;
            return y == point.y;
        }

        public int GetX()
        {
            return x;
        }

        public int GetY()
        {
            return y;
        }


        public override int GetHashCode()
        {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}
