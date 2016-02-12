using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExplorerJourney
{
    class RandomDottedBorderGrid : Grid
    {
        public RandomDottedBorderGrid() : this(10, 10, 25) { }

        public RandomDottedBorderGrid(int width, int height, int chance)
            : base(width, height)
        {
            Random rnd = new Random();
            for (int i = 0; i < this.width; i++)
            {
                if (rnd.Next() % 4 == 0)
                {
                    grid[i, 1] = Grid.WALL;
                }
            }
            for (int i = 0; i < this.width; i++)
            {
                if (rnd.Next() % 100 < chance)
                {
                    grid[i, this.height - 2] = Grid.WALL;
                }
            }
            for (int j = 0; j < this.width; j++)
            {
                if (rnd.Next() % 100 < chance)
                {
                    grid[1, j] = Grid.WALL;
                }
            }
            for (int j = 0; j < this.width; j++)
            {
                if (rnd.Next() % 100 < chance)
                {
                    grid[this.width - 2, j] = Grid.WALL;
                }
            }
            grid[1, 1] = 0;
        }
    }
}
