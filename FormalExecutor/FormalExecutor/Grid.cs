using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FormalExecutor
{
    class Grid
    {
        protected int width;
        protected int height;
        protected int[,] grid;
        public static int WALL = 10;

        public Grid(int width, int height)
        {
            if (width <= 0)
            {
                throw new ArgumentException("Ширина должна быть положительной. width = " + width);
            }
            if (height <= 0)
            {
                throw new ArgumentException("Высота должна быть положительной. height = " + height);
            }
            this.width = width;
            this.height = height;
            grid = new int[width, height];
            for (int j = 0; j < this.height; j++)
            {
                grid[0, j] = WALL;
                grid[this.width - 1, j] = WALL;
            }
            for (int i = 0; i < this.width; i++)
            {
                grid[i, 0] = WALL;
                grid[i, this.height - 1] = WALL;
            }
        }

        public int Width { get { return this.width; } }
        public int Height { get { return this.height; } }

        public void Redraw()
        {
            for(int i = 0; i < this.width; i++)
            {
                for (int j = 0; j < this.height; j++)
                {
                    UpdateTile(i, j);
                }
                Console.Write('\n');
            }
        }

        public void UpdateTile(int x, int y)
        {
            if (x < 0 || x >= this.width)
            {
                throw new ArgumentException("Указанная координата не существует х = " + x);
            }
            if (y < 0 || y >= this.height)
            {
                throw new ArgumentException("Указанная координата не существует y = " + y);
            }
            if (grid[x, y] == WALL)
            {
                Console.Write('#');
            }
            else
            {
                Console.Write(' ');
            }
        }

        public int GetContent(int x, int y)
        {
            if (x < 0 || x >= this.width)
            {
                throw new ArgumentException("Указанная координата не существует х = " + x);
            }
            if (y < 0 || y >= this.height)
            {
                throw new ArgumentException("Указанная координата не существует y = " + y);
            }
            return this.grid[x, y];
        }
    }
}
