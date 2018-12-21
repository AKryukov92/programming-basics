using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Point
    {
        private double x;
        private double y;
        private String color;

        public Point(double x, double y)
        {
            this.x = x;
            this.y = y;
            this.color = "white";
        }

        public double GetX()
        {
            return x;
        }

        public double GetY()
        {
            return y;
        }

        public static double DistanceBetween(double ax, double ay, double bx, double by)
        {
            double dx = ax - bx;
            double dy = ay - by;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public static double DistanceBetween(Point a, Point b)
        {
            double dx = a.x - b.x;
            double dy = a.y - b.y;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public double DistanceTo(double bx, double by)
        {
            return DistanceBetween(this.x, this.y, bx, by);
        }

        public double DistanceTo(Point dest)
        {
            return DistanceBetween(this.x, this.y, dest.x, dest.y);
        }

        public void SetCoordinates(double x, double y)
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