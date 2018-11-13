using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Methods
    {
        public static double Task1934(int a, int b)
        {
            if (b > 0)
            {
                throw new ArgumentException("Значение B должно быть не положительным");
            }
            return a * Math.Sqrt(-7 * b);
        }

        public static double Task3943(int x, int y)
        {
            if (y < 0)
            {
                throw new ArgumentException("Значение y должно быть неотрицательным");
            }
            if (x + Math.Sqrt(y) < 0)
            {
                throw new ArgumentException("Подкоренное выражение должно быть неотрицательным");
            }
            return -5 * Math.Sqrt(x + Math.Sqrt(y));
        }
    }
}
