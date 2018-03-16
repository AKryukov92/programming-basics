using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassesExample.Task3956
{
    public class Rectangle : Shape
    {
        private int x;
        private int y;
        private int w;
        private int h;

        public override double Area
        {
            get
            {
                return w * h;
            }
        }

        public Rectangle(int x, int y, int w, int h)
            : base("black", 0, "black")
        {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public Rectangle(int x, int y, int w, int h, String stroke, String fill, int strokeWidth)
            : base(stroke, strokeWidth, fill)
        {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public override void Slide(int dx, int dy)
        {
            x += dx;
            y += dy;
        }

        public override Point MakeCenter()
        {
            return new Point(x + w / 2, y + h / 2);
        }

        public override String ToString()
        {
            return "<rect x='" + x +
                "' y='" + y +
                "' w='" + w +
                "' h='" + h +
                "' stroke='" + Stroke +
                "' stroke-width='" + StrokeWidth +
                "' fill='" + Fill +
                "'/>";
        }
    }
}
