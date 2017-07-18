using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task4147
{
    public class Point
    {
        public int X { private set; get; }
        public int Y { private set; get; }

        public Point(int x, int y)
        {
            this.X = x;
            this.Y = y;
        }

        public String Print()
        {
            return "(" + X + ";" + X + ")";
        }
    }
}
