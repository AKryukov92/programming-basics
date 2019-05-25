using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Drawing;

namespace PaintingApp
{
    public class PenTool
    {
        private int x;
        private int y;
        private Boolean draw;
        private Graphics graphics;
        private static readonly int PIXELS_IN_STEP = 20;
        private static readonly int WINDOW_WIDTH = 800;
        private static readonly int WINDOW_HEIGHT = 600;
        private List<Point> points = new List<Point>();
        private List<Boolean> draws = new List<bool>();
        private Pen pen;

        public static PenTool prepare(Form frm)
        {
            Graphics g = frm.CreateGraphics();
            PenTool tool = new PenTool(g);
            frm.Paint += tool.Frm_Paint;
            return tool;
        }

        private void Frm_Paint(object sender, PaintEventArgs e)
        {
            if (points.Count == 0)
            {
                return;
            }
            for (int i = 1; i < points.Count; i++)
            {
                if (draws[i])
                {
                    Point prev = points[i - 1];
                    Point current = points[i];
                    graphics.DrawLine(pen, prev, current);
                }
            }
        }

        private PenTool(Graphics graphics)
        {
            this.graphics = graphics;
            x = 0;
            y = 0;
            draw = false;
            pen = new Pen(Color.Red, 3);
        }

        public void left()
        {
            if (this.x - PIXELS_IN_STEP < 0)
            {
                Console.WriteLine("Ручка вышла за границу окна слева на шаге " + points.Count);
            }
            this.x -= PIXELS_IN_STEP;
            points.Add(new Point(x, y));
            draws.Add(draw);
        }

        public void right()
        {
            if (this.x + PIXELS_IN_STEP > WINDOW_WIDTH)
            {
                Console.WriteLine("Ручка вышла за границу окна справа на шаге " + points.Count);
            }
            this.x += PIXELS_IN_STEP;
            points.Add(new Point(x, y));
            draws.Add(draw);
        }

        public void up()
        {
            if (this.y - PIXELS_IN_STEP < 0)
            {
                Console.WriteLine("Ручка вышла за границу окна сверху на шаге " + points.Count);
            }
            this.y -= PIXELS_IN_STEP;
            points.Add(new Point(x, y));
            draws.Add(draw);
        }

        public void down()
        {
            if (this.y + PIXELS_IN_STEP > WINDOW_HEIGHT)
            {
                Console.WriteLine("Ручка вышла за границу окна снизу на шаге " + points.Count);
            }
            this.y += PIXELS_IN_STEP;
            points.Add(new Point(x, y));
            draws.Add(draw);
        }

        public void startLine()
        {
            this.draw = true;
        }

        public void endLine()
        {
            this.draw = false;
        }
    }
}
