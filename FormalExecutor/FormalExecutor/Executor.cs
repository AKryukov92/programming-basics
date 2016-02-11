using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace FormalExecutor
{
    class ExecutorScheme
    {
        private int x;
        private int y;
        private int delay;
        private char mark = 'O';
        private Grid grid;

        public ExecutorScheme() : this(1, 1, 1000, new RandomDottedGrid()) { }

        public ExecutorScheme(int x, int y, int delay) : this(x, y, delay, new Grid(10, 10)) { }

        public ExecutorScheme(int x, int y, int delay, Grid grid)
        {
            this.grid = grid;
            grid.Redraw();
            this.delay = delay;
            this.x = x;
            this.y = y;
            Console.SetCursorPosition(this.x, this.y);
            Console.Write(mark);
            SayMessage("Нажмите пробел чтобы начать работу");
            Console.ReadKey();
            ClearMessage();
        }

        public void StepUp()
        {
            Move(0, -1);
        }

        public void StepDown()
        {
            Move(0, 1);
        }

        public void StepRight()
        {
            Move(1, 0);
        }

        public void StepLeft()
        {
            Move(-1, 0);
        }

        private Boolean Move(int dx, int dy)
        {
            if (grid.GetContent(this.x + dx, this.y + dy) == Grid.WALL)
            {
                SayMessage("Не могу двигаться в данном направлении");
                Console.ReadKey();
                System.Environment.Exit(0);
                return false;
            }
            Console.SetCursorPosition(this.x, this.y);
            grid.UpdateTile(this.x, this.y);
            this.x += dx;
            this.y += dy;
            Console.SetCursorPosition(this.x, this.y);
            Console.Write(mark);
            Thread.Sleep(this.delay);
            return true;
        }
        
        private void ClearMessage()
        {
            Console.SetCursorPosition(0, grid.Height + 1);
            Console.WriteLine(new string(' ', Console.WindowWidth));
        }

        private void SayMessage(String message)
        {
            ClearMessage();
            Console.SetCursorPosition(0, grid.Height + 1);
            Console.WriteLine(message);
        }

        public int Examine()
        {
            int value = grid.GetContent(this.x, this.y);
            if (value == 0)
            {
                SayMessage("Поле с координатами (" + this.x + ":" + this.y + ") пустое");
            }
            else
            {
                SayMessage("Поле с координатами (" + this.x + ":" + this.y + ") содержит " + value);
            }
            Thread.Sleep(this.delay);
            return value;
        }
    }
}
