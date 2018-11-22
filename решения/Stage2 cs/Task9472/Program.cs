using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Task9472
{
    class Program
    {
        static void Main(string[] args)
        {
            String part = Console.ReadLine();
            String filename = "task9472/test" + part + ".csv";
            int i = 0;
            String row = "";
            try
            {
                StreamReader reader = new StreamReader(filename);
                double max = 0;
                while (!reader.EndOfStream)
                {
                    row = reader.ReadLine();
                    double area = getArea(row);
                    if (area > max)
                    {
                        max = area;
                    }
                    i++;
                }
                if (i > 0)
                {
                    Console.WriteLine("Максимальная площадь: {0:F4}", max);
                    Console.WriteLine("Всего записей: " + i);
                }
                else
                {
                    Console.WriteLine("Файл пуст");
                }
            }
            catch (FileNotFoundException ex)
            {
                Console.WriteLine("Файл не существует " + Path.GetFullPath(filename));
            }
            catch (DirectoryNotFoundException ex)
            {
                Console.WriteLine("Файл не существует " + Path.GetFullPath(filename));
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удалось преобразовать строку в число в строке " + i);
                Console.WriteLine(row);
            }
            catch (IndexOutOfRangeException ex)
            {
                Console.WriteLine("Некорректный формат данных в строке " + i);
                Console.WriteLine(row);
            }
            catch (ArgumentException ex)
            {
                Console.WriteLine("Некорректный формат данных в стркое " + i);
                Console.WriteLine(row);
            }
        }

        static double getArea(String row)
        {
            String[] parts = row.Split(';');
            if (parts[0] == "rect")
            {
                int width = int.Parse(parts[3]);
                int height = int.Parse(parts[4]);
                return width * height;
            } else if (parts[0] == "circle")
            {
                int r = int.Parse(parts[3]);
                return Math.PI * r * r;
            }
            throw new ArgumentException("Некорректный формат данных");
        }
    }
}
