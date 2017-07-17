using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task4147
{
    public class Rectangle
    {

        private int x;
        private int y;
        private int w;
        private int h;

        public Rectangle(int x, int y, int w, int h)
        {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public Rectangle(Point p, int w, int h)
        {
            this.x = p.GetX();
            this.y = p.GetY();
            this.w = w;
            this.h = h;
        }

        public Rectangle(Interval rangeX, Interval rangeY)
        {
            this.x = rangeX.GetA();
            this.w = rangeX.Length();
            this.y = rangeY.GetA();
            this.h = rangeY.Length();
        }

        public bool contains(Point p)
        {
            return x <= p.GetX() && p.GetX() <= x + w
                && y <= p.GetY() && p.GetY() <= y + h;
        }

        public double area()
        {
            return w * h;
        }

        public Interval getProjectionX()
        {
            return new Interval(x, x + w);
        }

        public Interval getProjectionY()
        {
            return new Interval(y, y + h);
        }

        public override String toString()
        {
            return "<rect x='" + x +
                "' y='" + y +
                "' w='" + w +
                "' h='" + h +
                "'/>";
        }
    }
}