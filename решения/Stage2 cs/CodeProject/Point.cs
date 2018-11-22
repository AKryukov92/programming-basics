using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
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

        public static double DistanceBetween(int ax, int ay, int bx, int by)
        {
            int dx = ax - bx;
            int dy = ay - by;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public static double DistanceBetween(Point a, Point b)
        {
            return DistanceBetween(a.x, a.y, b.x, b.y);
        }

        public double DistanceTo(int bx, int by)
        {
            return DistanceBetween(this.x, this.y, bx, by);
        }

        public double DistanceTo(Point dest)
        {
            return DistanceBetween(this.x, this.y, dest.x, dest.y);
        }

        public void SetCoordinates(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public void SetColor(String value)
        {
            this.color = value;
        }

        public override bool Equals(object other)
        {
            if (other == null) return false;
            if (this == other) return true;
            if (GetType() != other.GetType()) return false;
            Point point = (Point)other;
            if (x == point.x && y == point.y && color.Equals(point.color)) return true;
            return false;
        }

        public override string ToString()
        {
            return String.Format("({0};{1};{2})", x, y, color);
        }
    }
}