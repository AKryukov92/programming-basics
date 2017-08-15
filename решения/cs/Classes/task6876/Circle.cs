using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task6876
{
    public class Circle : Shape
    {
        private int cx;
        private int cy;
        private int r;

        public Circle(int cx, int cy, int r)
            : base("black", 1, "transparent")
        {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public override double Area
        {
            get
            {
                return Math.PI * r * r;
            }
        }

        public override String ToString()
        {
            return "<circle cx='" + cx +
                "' cy='" + cy +
                "' r='" + r +
                "' stroke='" + stroke +
                "' stroke-width='" + strokeWidth +
                "' fill='" + fill +
                "'/>";
        }
    }
}
