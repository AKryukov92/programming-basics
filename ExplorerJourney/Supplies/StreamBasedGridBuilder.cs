using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Supplies
{
    public partial class Grid
    {
        public static StreamBasedGridBuilder builder()
        {
            return new StreamBasedGridBuilder();
        }

        public sealed class StreamBasedGridBuilder
        {
            private int width = 0;
            private int height = 0;
            Random rnd = new Random();

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
                result.Redraw();
                Console.Write("\nНажмите пробел чтобы начать работу");
                Console.ReadKey();
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
                        int value = element - 48;
                        if (value == 3)
                        {
                            value = rnd.Next() % 2;
                        }
                        grid[x, y] = value;
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
