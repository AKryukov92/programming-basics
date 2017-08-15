using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task6876
{
    public class Rectangle : Shape
    {
        private int x;
        private int y;
        private int w;
        private int h;

        public Rectangle(int x, int y, int w, int h)
             : base("black", 1, "transparent")
        {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public override double Area
        {
            get
            {
                return w * h;
            }
        }

        public override String ToString()
        {
            return "<rect x='" + x +
                "' y='" + y +
                "' width='" + w +
                "' height='" + h +
                "' stroke='" + stroke +
                "' stroke-width='" + strokeWidth +
                "' fill='" + fill +
                "'/>";
        }
    }
}