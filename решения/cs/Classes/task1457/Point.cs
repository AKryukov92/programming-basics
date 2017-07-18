using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.task1457
{
    public class Point
    {
        private int x;
        private int y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        public double distanceTo(Point p)
        {
            if (p == null)
            {
                throw new ArgumentException("Конечная точка не инициализирована");
            }
            int dx = p.x - x;
            int dy = p.y - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }

        public override String ToString()
        {
            return "(" + x + ';' + y + ')';
        }
    }
}
