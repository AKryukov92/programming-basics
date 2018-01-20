using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionExample
{
    public struct Point
    {
        public Point(int x, int y)
        {
            this.X = x;
            this.Y = y;
        }

        public int X { private set; get; }
        public int Y { private set; get; }

        public override string ToString()
        {
            return "{" + X + ";" + Y + "}";
        }
    }
}
