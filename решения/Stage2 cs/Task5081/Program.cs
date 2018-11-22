using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Task5081
{
    class Program
    {
        static void Main(string[] args)
        {
            String part = Console.ReadLine();
            String filename = "task5081/test" + part + ".txt";
            int i = 0;
            String row = "";
            try
            {
                StreamReader reader = new StreamReader(filename);
                while (!reader.EndOfStream)
                {
                    row = reader.ReadLine();
                    if (String.IsNullOrEmpty(row))
                    {
                        Console.WriteLine("Строка пуста");
                        continue;
                    }
                    int sum = 0;
                    try
                    {
                        String[] arr = row.Split(',');
                        for (int j = 0; j < arr.Length; j++)
                        {
                            sum += int.Parse(arr[j]);
                        }
                        Console.WriteLine(sum);
                        i++;
                    }
                    catch (FormatException ex)
                    {
                        Console.WriteLine("Не удалось преобразовать строку в число");
                    }
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
        }
    }
}
