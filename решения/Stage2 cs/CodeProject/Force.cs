using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CodeProject
{
    public class Force
    {
        private double x;
        private double y;
        private double value;

        public Force(double dirX, double dirY, double value)
        {
            if(value < 0)
            {
                throw new ArgumentException("Сила не может быть отрицательной");
            }
            this.x = dirX;
            this.y = dirY;
            this.value = value;
        }

        public double getValue()
        {
            return value;
        }

        public double getX()
        {
            return x;
        }

        public double getY()
        {
            return y;
        }

        public static Force Resultant(Force a, Force b)
        {
            Force result = new Force(
                a.x + b.x,
                a.y + b.y,
                Math.Sqrt(a.value * a.value + b.value * b.value + 2 * a.value * b.value * AngleCos(a, b))
                );
            return result;
        }

        private static double AngleCos(Force a, Force b)
        {
            double scalarProduct = b.x * a.x + a.y * b.y;
            return scalarProduct / (a.Module() * b.Module());
        }

        public double Module()
        {
            return Math.Sqrt(x * x + y * y);
        }

        public static double AngleDeg(Force a, Force b)
        {
            return Methods.ToDegrees(Math.Acos(AngleCos(a, b)));
        }
    }
}