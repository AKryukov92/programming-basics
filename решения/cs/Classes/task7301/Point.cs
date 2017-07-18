using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task7301
{
    public class Point
    {
        public int x;
        public int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public double distanceTo(Point p)
        {
            int dx = p.x - x;
            int dy = p.y - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
        public double distanceTo(int px, int py)
        {
            int dx = px - x;
            int dy = py - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
        public void setCoordinates(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public static double distanceBetween(Point p1, Point p2)
        {
            if (p1 == null)
            {
                throw new ArgumentException("Начальная точка не инициализирована");
            }
            if (p2 == null)
            {
                throw new ArgumentException("Конечная точка не инициализирована");
            }
            int dx = p1.x - p2.x;
            int dy = p1.y - p2.y;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public String print()
        {
            return "(" + x + ";" + y + ")";
        }


        public override String ToString()
        {
            return "(" + x + ";" + y + ")";
        }
    }
}
