using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FormalExecutor
{
    class RandomDottedGrid : Grid
    {
        public RandomDottedGrid() : this(10, 10, 10) { }

        public RandomDottedGrid(int width, int height, int count) : base(width, height) {
            Random rnd = new Random();
            int i = 0;
            int x;
            int y;
            while(i < count)
            {
                x = rnd.Next() % width;
                y = rnd.Next() % height;
                if (grid[x, y] == 0)
                {
                    grid[x, y] = Grid.WALL;
                    i++;
                }
            }
        }

    }
}
