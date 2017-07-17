using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task3956
{
    public class Circle : Shape
    {
        private int cx;
        private int cy;
        private int r;

        public Circle(int cx, int cy, int r, String stroke, String fill, int strokeWidth)
            : base(stroke, strokeWidth, fill)
        {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public Circle(int cx, int cy, int r)
            : base("black", 0, "black")
        {
            this.cx = cx;
            this.cy = cy;
            this.r = r;
        }

        public override void slide(int dx, int dy)
        {
            cx += dx;
            cy += dy;
        }

        public override Point getCenter()
        {
            return new Point(cx, cy);
        }

        public override double area()
        {
            return Math.PI * r * r;
        }

        public override String ToString()
        {
            return "<circle cx='" + cx +
                "' cy='" + cy +
                "' r='" + r +
                "' stroke='" + getStroke() +
                "' stroke-width='" + getStrokeWidth() +
                "' fill='" + getFill() +
                "'/>";
        }
    }
}