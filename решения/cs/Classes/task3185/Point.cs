using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task3185
{
    public class Point
    {
        public int x;
        public int y;

        public double DistanceTo(Point p)
        {
            if(p == null)
            {
                throw new ArgumentException("Конечная точка не инициализирована");
            }
            int dx = p.x - x;
            int dy = p.y - y;
            return Math.Sqrt(dx * dx + dy * dy);
        }
    }
}
