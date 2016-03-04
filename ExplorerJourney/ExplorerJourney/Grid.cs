using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExplorerJourney
{
    class Grid
    {
        protected int width;
        protected int height;
        protected int[,] grid;
        private int[,] expectedGrid;
        public static int WALL = 9;

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

        public int Width { get { return this.width; } }
        public int Height { get { return this.height; } }

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
            for (int j = 0; j < this.height; j++)
            {
                for (int i = 0; i < this.width; i++)
                {
                    UpdateTile(i, j);
                }
                Console.Write('\n');
            }
        }

        public void Mark(int x, int y, int mark)
        {
            if (mark >= WALL || mark < 0)
            {
                throw new ArgumentException("Illegal symbol");
            }
            assertCoords(x, y);
            grid[x, y] = mark;
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

        public static StreamBasedGridBuilder builder()
        {
            return new StreamBasedGridBuilder();
        }

        public sealed class StreamBasedGridBuilder
        {
            private int width = 0;
            private int height = 0;

            public Grid buildFromStream(String filename)
            {
                FileStream stream = new FileStream(filename, FileMode.Open, FileAccess.Read);
                StreamReader reader = new StreamReader(stream);
                return this.buildFromStream(reader);
            }

            public Grid buildFromStream(StreamReader reader)
            {
                width = Int32.Parse(reader.ReadLine());
                height = Int32.Parse(reader.ReadLine());
                Grid result = new Grid(width, height, true);

                fillGridByReader(reader, result.grid);
                reader.ReadLine();
                fillGridByReader(reader, result.expectedGrid);
                return result;
            }

            private void fillGridByReader(StreamReader reader, int[,] grid)
            {
                int x = 0;
                int y = 0;

                while (!reader.EndOfStream)
                {
                    if (y >= height)
                    {
                        break;
                    }
                    int element = reader.Read();
                    if (element == 10)
                    {
                        y++;
                        x = 0;
                        continue;
                    }
                    if (element >= 48 && element <= 57)
                    {
                        grid[x, y] = element - 48;
                        x++;
                        continue;
                    }
                    if (element == 13)
                    {
                        continue;
                    }
                    throw new FileLoadException("Неожиданный символ " + element);
                }
            }
        }
    }
}