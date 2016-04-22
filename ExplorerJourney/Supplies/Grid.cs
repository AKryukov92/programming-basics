using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Supplies
{
    public partial class Grid
    {
        #region Поля
        protected int width;
        protected int height;
        protected int[,] grid;
        private int[,] expectedGrid;
        public static int WALL = 9;
        #endregion

        #region Конструкторы
        public Grid(int width, int height, bool empty)
        {
            assertSize(width, height);

            this.width = width;
            this.height = height;
            grid = new int[width, height];
            expectedGrid = new int[width, height];
            if (!empty)
            {
                fillDefault();
            }
        }
        
        public Grid(int width, int height)
        {
            assertSize(width, height);

            this.width = width;
            this.height = height;
            grid = new int[width, height];
            fillDefault();
        }
        #endregion

        #region Свойства
        public int Width { get { return this.width; } }
        public int Height { get { return this.height; } }
        #endregion

        #region Методы
        private void assertCoords(int x, int y)
        {
            if (x < 0 || x >= this.width)
            {
                throw new ArgumentException("Указанная координата не существует х = " + x);
            }
            if (y < 0 || y >= this.height)
            {
                throw new ArgumentException("Указанная координата не существует y = " + y);
            }
        }

        private void assertSize(int width, int height)
        {
            if (width <= 0)
            {
                throw new ArgumentException("Ширина должна быть положительной. width = " + width);
            }
            if (height <= 0)
            {
                throw new ArgumentException("Высота должна быть положительной. height = " + height);
            }
        }

        private void fillDefault()
        {
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

        public void Redraw()
        {
            Console.SetCursorPosition(0, 0);
            for (int j = 0; j < this.height; j++)
            {
                for (int i = 0; i < this.width; i++)
                {
                    UpdateTile(i, j);
                }
                Console.Write('\n');
            }
        }

        public void Increment(int x, int y)
        {
            assertCoords(x, y);
            grid[x, y] = (grid[x, y] + 1) % WALL;
        }

        public void Decrement(int x, int y)
        {
            assertCoords(x, y);
            grid[x, y] = (grid[x, y] - 1) % WALL;
        }

        public bool Validate()
        {
            if (expectedGrid == null)
            {
                return true;
            }

            for (int j = 0; j < this.height; j++)
            {
                for(int i = 0; i < this.width; i++)
                {
                    if (grid[i, j] != expectedGrid[i,j])
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        public void UpdateTile(int x, int y)
        {
            assertCoords(x, y);

            if (grid[x, y] == WALL)
            {
                Console.Write('#');
            }
            else if (grid[x, y] == 0)
            {
                Console.Write(' ');
            }
            else
            {
                Console.Write(grid[x, y] % 10);
            }
        }

        public int GetContent(int x, int y)
        {
            assertCoords(x, y);

            return this.grid[x, y];
        }
        #endregion
    }
}