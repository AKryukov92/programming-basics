using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Task1953
{
    public class Circle
    {
        private int cx;
        private int cy;
        private int r;

        public Circle(int cx, int cy, int r)
        {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public double Area
        {
            get { return Math.PI * r * r; }
        }

        public Interval MakeProjectionX()
        {
            return new Interval(cx - r, cx + r);
        }

        public Interval MakeProjectionY()
        {
            return new Interval(cy - r, cy + r);
        }

        public override String ToString()
        {
            return "<circle cx='" + cx +
                "' cy='" + cy +
                "' r='" + r +
                "'/>";
        }
    }
}