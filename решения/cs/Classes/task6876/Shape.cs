using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes.Task6876
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

        public abstract double Area { get; }

        public static String Header
        {
            get
            {
                return "<svg width=\"150\" height=\"150\">";
            }
        }

        public static String Footer
        {
            get
            {
                return "</svg>";
            }
        }
    }
}
