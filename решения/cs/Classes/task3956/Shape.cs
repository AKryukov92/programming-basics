using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.task3956
{
    public abstract class Shape
    {
        private String stroke;
        private int strokeWidth;
        private String fill;

        public Shape(String stroke, int strokeWidth, String fill)
        {
            this.stroke = stroke;
            this.strokeWidth = strokeWidth;
            this.fill = fill;
        }

        public String getStroke()
        {
            return stroke;
        }

        public int getStrokeWidth()
        {
            return strokeWidth;
        }

        public String getFill()
        {
            return fill;
        }

        public abstract void slide(int dx, int dy);

        public abstract Point getCenter();

        public abstract double area();
    }
}
