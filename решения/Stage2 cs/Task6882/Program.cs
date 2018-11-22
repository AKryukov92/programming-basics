using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Task6882
{
    class Program
    {
        static void Main(string[] args)
        {
            String part = Console.ReadLine();
            String filename = "task6882/test" + part + ".txt";
            String row = "";
            int i = 0;
            try
            {
                StreamReader reader = new StreamReader(filename);
                if (reader.EndOfStream)
                {
                    Console.WriteLine("Файл пуст");
                    return;
                }
                row = reader.ReadLine();
                int min = int.Parse(row);
                i++;
                while (!reader.EndOfStream)
                {
                    row = reader.ReadLine();
                    int current = int.Parse(row);
                    if (current < min)
                    {
                        min = current;
                    }
                    i++;
                }
                Console.WriteLine("Минимальное число: " + min);
                Console.WriteLine("Всего чисел: " + i);
            }
            catch (DirectoryNotFoundException ex)
            {
                Console.WriteLine("Файл не существует " + Path.GetFullPath(filename));
            }
            catch (FileNotFoundException ex)
            {
                Console.WriteLine("Файл не существует " + Path.GetFullPath(filename));
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Не удалось преобразовать строку в число в строке " + i);
                Console.WriteLine(row);
            }
        }
    }
}
