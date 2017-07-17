using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task6011
{
    public class Point
    {
        public int x;
        public int y;
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
    }
}
