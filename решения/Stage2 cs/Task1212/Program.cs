using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Task1212
{
    class Program
    {
        static void Main(string[] args)
        {
            String part = Console.ReadLine();
            String filename = "task1212/test" + part + ".csv";
            int i = 0;
            String row = "";
            try
            {
                StreamReader reader = new StreamReader(filename);
                int max = 0;
                while (!reader.EndOfStream)
                {
                    row = reader.ReadLine();
                    int area = getArea(row);
                    if (area > max)
                    {
                        max = area;
                    }
                    i++;
                }
                if (i > 0)
                {
                    Console.WriteLine("Максимальная площадь: " + max);
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
        }

        static int getArea(String row)
        {
            String[] parts = row.Split(';');
            int width = int.Parse(parts[2]);
            int height = int.Parse(parts[3]);
            return width * height;
        }
    }
}