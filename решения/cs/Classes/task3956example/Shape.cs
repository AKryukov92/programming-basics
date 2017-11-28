using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Task3956example
{
    public abstract class Shape
    {
        public String Stroke { private set; get; }
        public int StrokeWidth { private set; get; }
        public String Fill { private set; get; }
        public abstract double Area { get; }

        public Shape(String stroke, int strokeWidth, String fill)
        {
            Stroke = stroke;
            StrokeWidth = strokeWidth;
            Fill = fill;
        }

        public abstract void Slide(int dx, int dy);

        public abstract Point MakeCenter();
    }
}
