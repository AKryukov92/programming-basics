using Classes.task6876;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace lab15
{
    public class Caller6876
    {
        public static void Step1()
        {
            List<Circle> circles = new List<Circle>();
            circles.Add(new Circle(40, 30, 10));
            circles.Add(new Circle(50, 80, 20));
            circles.Add(new Circle(70, 50, 40));
            Comparator6876 comparator = new Comparator6876();
            circles.Sort(comparator);
            Console.WriteLine(Circle.GetHeader());
            foreach (Circle item in circles)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine(Circle.GetFooter());
        }

        public static void Step2()
        {
            Rectangle[] figures = new Rectangle[]{
                new Rectangle(30, 0, 10, 40),
                new Rectangle(50, 10, 30, 10),
                new Rectangle(10, 50, 20, 10),
                new Rectangle(50, 30, 40, 40)
            };
            Array.Sort(figures, new Comparator6876());
            Console.WriteLine(Rectangle.GetHeader());
            foreach (Rectangle item in figures)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine(Rectangle.GetFooter());
        }

        public static void Step3()
        {
            List<Shape> items = new List<Shape>();
            items.Add(new Circle(20, 30, 10));
            items.Add(new Rectangle(40, 20, 10, 30));
            items.Add(new Circle(80, 30, 20));
            items.Add(new Rectangle(10, 60, 30, 20));
            items.Add(new Rectangle(50, 60, 20, 10));
            items.Sort(new Comparator6876());
            Console.WriteLine(Shape.GetHeader());
            foreach (Shape item in items)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine(Shape.GetFooter());
        }
    }
}