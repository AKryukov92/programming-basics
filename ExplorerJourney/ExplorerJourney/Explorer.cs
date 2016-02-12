using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ExplorerJourney
{
    class Explorer
    {
        private int x;
        private int y;
        private int delay;
        private char mark = 'O';
        private Grid grid;
        private bool ignoreCommands = false;

        private Explorer(int x, int y, int delay, Grid grid)
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
            if (ignoreCommands)
            {
                return false;
            }
            if (grid.GetContent(this.x + dx, this.y + dy) == Grid.WALL)
            {
                SayMessage("Не могу двигаться в данном направлении");
                ignoreCommands = true;
                return false;
            }
            Console.SetCursorPosition(this.x, this.y);
            grid.UpdateTile(this.x, this.y);
            this.x += dx;
            this.y += dy;
            Console.SetCursorPosition(this.x, this.y);
            Console.Write(mark);
            Console.SetCursorPosition(0, grid.Height + 2);
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
            if (ignoreCommands)
            {
                return value;
            }
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

        public static Builder builder()
        {
            return new Builder();
        }

        public class Builder
        {
            private int x;
            private int y;
            private Grid grid;

            private int delay = 1000;
            private char mark = 'O';

            public Builder withPosition(int posX, int posY)
            {
                this.x = posX;
                this.y = posY;
                return this;
            }

            public Builder withDelay(int delay)
            {
                this.delay = delay;
                return this;
            }

            public Builder withMark(char value)
            {
                this.mark = value;
                return this;
            }

            public Builder withGrid(Grid value)
            {
                this.grid = value;
                return this;
            }

            public Explorer build()
            {
                if (grid == null)
                {
                    grid = new Grid(10, 10);
                }
                return new Explorer(x, y, delay, grid);
            }
        }
    }
}
