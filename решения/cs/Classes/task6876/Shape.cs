using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.task6876
{
    public abstract class Shape
    {
        protected String stroke;
        protected int strokeWidth;
        protected String fill;

        public Shape(String stroke, int strokeWidth, String fill)
        {
            this.stroke = stroke;
            this.strokeWidth = strokeWidth;
            this.fill = fill;
        }

        public abstract double Area();

        public static String GetHeader()
        {
            return "<svg width=\"150\" height=\"150\">";
        }

        public static String GetFooter()
        {
            return "</svg>";
        }
    }
}
